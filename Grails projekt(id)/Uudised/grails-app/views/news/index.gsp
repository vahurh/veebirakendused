
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="main">
		<title>Uudised</title>
		<g:javascript library="jquery" />
	</head>
	<body id="body">
		<h1>Värskeimad uudised Delfi kommentaariumist!</h1>
		<p>Kes on USA mõjuagent? Kes oleks võinud majast väljatulemise asemel end põlema panna? Kõik ja rohkem veel siit!</p>
		
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
