<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'mobile.css')}" type="text/css">

		<!-- Bootstrap -->
    	<link rel="stylesheet" href="${resource(dir: 'css', file: 'bootstrap.min.css')}" type="text/css">


    	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
   		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   		
   		<!--[if lt IE 9]>
     		<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      		<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
   		
   		<![endif]-->

   		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    	<!-- Include all compiled plugins (below), or include individual files as needed -->
   		<script src="js/bootstrap.min.js"></script>

		<g:layoutHead/>
		<g:javascript library="application"/>		
		<r:layoutResources />
	</head>
	
	<body class = "application">
		
		<div class = "header-wrap"> 
			<div class = "header">
				<div class="header-logo">
					<a id="logo" href="${createLink(uri: '/')}">Uudised</a>
				</div>

				<div class="header-register">
						<sec:ifLoggedIn>
							<g:link controller="user" action="favorites">Minu lemmikud</g:link>
							<g:link controller="Logout">Logi välja</g:link>
						</sec:ifLoggedIn>
						<sec:ifNotLoggedIn>						
								<g:link elementId ="ifNotLoggedIn" controller="user" action="register">Registreeri</g:link>
								<g:link elementId ="ifNotLoggedIn" controller="Login">Logi sisse</g:link>
						</sec:ifNotLoggedIn>
				</div>
			</div>
		</div>


		<!-- BOOTSTRAPI KATSETUS -->

		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="well">
						Column
					</div>
				</div>

				<div class="col-lg-6">
					<div class="well">
						Column
					</div>
				</div>
				
			</div>
		</div>
		
		<div class = "nav-wrap">
			<div class= "nav">
				<div class = "nav-inner">
					<ul id = "nav-list"> 
						<li><a id="nav-avaleht" href="${createLink(uri: '/')}">Avaleht</a></li>
						<li><a id="nav-eesti" href="${createLink(uri: '/eesti')}">Eesti</a></li>
						<li><a id="nav-valismaa" href="${createLink(uri: '/valismaa')}">Välismaa</a></li>
						<li><a id="nav-poliitika" href="${createLink(uri: '/poliitika')}">Poliitika</a></li>
						<li><a id="nav-sport" href="${createLink(uri: '/sport')}">Sport</a></li>
						<li><a id="nav-kultuur" href="${createLink(uri: '/kultuur')}">Kultuur</a></li>	
						<li><a id="nav-kultuur" href=""></li>					
					</ul>
				</div>	
			</div>
		</div>
		
		<div class = "main-wrap">
			<div class = main>
		        <div id="spinner" class="spinner" style="display:none;">
		            <img src="${createLinkTo(dir:'images',file:'spinner.gif')}" alt="Spinner" />
		        </div>
		        <div id="main">
		            <g:if test="${session?.user}">
		                <g:render template="/user/welcomeMessage"/>
		            </g:if>
		            <g:javascript library="application"/>
		        </div>
			<g:layoutBody/>
			</div>
		</div>
		
		<div class="footer-wrap">
			<div class = "footer">
				@ Uudised 2016
			</div>
		</div>
		<r:layoutResources />
	</body>
</html>
