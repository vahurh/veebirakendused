
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
		

	<r:script>
		$(function() {
		    $('#loginForm').ajaxForm(function(result) {
		        $('#loginBox').html(result);
		    });
		});
	</r:script>		
		
	</body>
</html>
