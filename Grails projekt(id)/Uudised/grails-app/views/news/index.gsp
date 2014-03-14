
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<meta name="layout" content="main">
		<title>Uudised</title>
		<g:javascript library="jquery" />
	</head>
	<body>
		
		<div class = "highlights">
			<g:render template="highlights" collection="${highlights}" var = "article" />
		</div>
		
		<div class = "bigPanelNew">
			<g:render template="bigPanel" model ="[articles: bigPanelNew]" />
		</div>
		
		
		
		<g:if test="${!session?.user}">
		
	        <div class="colset clearfix">
	            <div id="loginBox">
	                <g:render template="/user/loginBox"/>
	            </div>
	        </div>
	   </g:if>


	<r:script>
		$(function() {
		    $('#loginForm').ajaxForm(function(result) {
		        $('#loginBox').html(result);
		    });
		});
	</r:script>		
		
	</body>
</html>
