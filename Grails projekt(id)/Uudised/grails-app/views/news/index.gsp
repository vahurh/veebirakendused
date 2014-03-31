
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<meta name="layout" content="main">
		<title>Uudised</title>
		<g:javascript library="jquery" />
	</head>
	<body>
		
		<sec:ifLoggedIn>
			<div id="createPanel"><g:link controller="article" action="create">Create article</g:link></div>
		</sec:ifLoggedIn>
		


		<div class="row">
			<div class="col-sm-12 col-md-7">
				<div id="myCarousel" class="carousel slide">
					<ol class="carousel-indicators">
					    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					    <li data-target="#myCarousel" data-slide-to="1"></li>
					    <li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>

					<div class="carousel-inner">
						<div class="item active">
							<div class="activehighlight">Highlights</div>
							<div class="carousel-caption">
								<h1>Päevauudised</h1>
							</div>
						</div>
						<g:render template="highlights" collection="${highlights}" var = "article" />
					</div>

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
					<img class="img-responsive" src="images/reklaam.jpg">
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-8">
				<div class="bigpanel-well">
					<g:render template="bigPanel" model ="[articles: bigPanelNew]" />
				</div>
			</div>

			<div class="col-sm-4 hidden-xs">
				<div class="well popular-well">Popular Tab system</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-8">
				<div class="well bigpanel-well">Big News</div>

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
				<div class="well reccomendations-well">Reccomendations</div>
			</div>
		</div>






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
		
	</body>
</html>
