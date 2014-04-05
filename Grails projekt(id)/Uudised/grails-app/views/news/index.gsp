
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<meta name="layout" content="main">
		<title>Uudised</title>
		<g:javascript library="jquery" />
	</head>
	<body>
		<sec:ifLoggedIn>
			<div id="createPanel">
				<g:link controller="article" action="create">Create article</g:link>
			</div>
		</sec:ifLoggedIn>

		<div class="row highlight-ads">
			<div class="col-sm-12 col-md-7">
				<div id="myCarousel" class="carousel slide">

					<div class="carousel-inner">
						<div class="item active">
							<div class="activehighlight">Highlights</div>
							<div class="carousel-caption">
								<h1>Päevauudised</h1>
							</div>
						</div>
						<g:render template="highlights" collection="${highlights}" var = "article" />
					</div>

					%{-- <ol class="carousel-indicators">
					    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					    <li data-target="#myCarousel" data-slide-to="1"></li>
					    <li data-target="#myCarousel" data-slide-to="2"></li>
					</ol> --}%

					<!-- Controls -->
				    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
				    	<span class="icon-prev"></span>
				    </a>
				    <a class="right carousel-control" href="#myCarousel" data-slide="next">
				    	<span class="icon-next"></span>
				    </a>
				</div>
			</div>

			<div class="col-md-5 hidden-sm hidden-xs">
				<div class="ad">
					<img class="img-responsive ad-image" src="images/reklaam.jpg">
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-8">
				<g:render template="bigPanel" model ="[articles: bigPanelNew]" />

				<div class="row">
					<div class="col-sm-6">
						<div class="well poliitika-well">Poliitika</div>
					</div>	
					<div class="col-sm-6">
						<div class="well sport-well"> Sport</div>
					</div>
				</div>
			</div>

			<div class="col-sm-4 hidden-xs">
				<div class="category-header">
					<h4 class="category">Populaarsed</h4>
					<hr class="separator"></hr>
				</div>

				<div class="popular tabbable">
					<ul id="popTab" class="nav nav-tabs">
						<li class="active"><a href="#poptäna" data-toggle="tab">Täna</a></li>
						<li><a href="#popkuul" data-toggle="tab">Sel kuul</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="poptäna">
							<g:render template="bigPanel" model ="[articles: bigPanelNew]" />
						</div>
						<div class="tab-pane" id="popkuul">Sisu1</div>
					</div>
				</div>
				
				<div class="recom tabbable">
					<ul id="myTab" class="nav nav-tabs">
						<li class="active"><a href="#soovitused" data-toggle="tab">Soov</a></li>
						<li><a href="#mingitab" data-toggle="tab">Tab</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="soovitused">Sisu</div>
						<div class="tab-pane" id="mingitab">Sisu1</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>




%{-- 		<div class = "highlights">
			<g:render template="highlights" collection="${highlights}" var = "article" />
		</div>
		
		<div class = "bigPanelNew">
			<g:render template="bigPanel" model ="[articles: bigPanelNew]" />
		</div> --}%


		%{-- <sec:ifLoggedIn>
			<div id="createPanel"><g:link controller="article" action="create">Create article</g:link></div>
		</sec:ifLoggedIn>
		
		<sec:ifNotGranted roles="ROLE_USER">
			<facebookAuth:connect />
		</sec:ifNotGranted>
		
		<sec:ifLoggedIn roles="ROLE_USER, ROLE_FACEBOOK">
			Welcome <sec:username/>! (<g:link uri="/j_spring_security_logout">Logout</g:link>)
		</sec:ifLoggedIn>
				
		<div class = "highlights">
			<g:render template="highlights" collection="${highlights}" var = "article" />
		</div>
		
		<div class = "bigPanelNew">
			<g:render template="bigPanel" model ="[articles: bigPanelNew]" />
		</div>
		 --}%
		

