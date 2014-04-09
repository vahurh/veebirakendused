<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<title>Sisse logimine</title>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
	</head>
	<body>
		<div class = "loginWrap">
			<div class = "loginForm-wrap">
				<div class = "loginForm">
					<form method="POST" action="${resource(file: 'j_spring_security_check')}">
						<div class="loginInput">
							<p>Kasutajanimi: </p>
							<g:textField required="true" placeholder="Kasutajanimi" name="j_username"/>
						</div>
						<div class="loginInput">
							<p>Salasõna: </p>
							<input placeholder="Salasõna" name="j_password"	type = "password"/>
						</div>
						<g:submitButton name="login" value="Logi sisse"/>        
					</form>
				</div>
			</div>
		</div>
	</body>
</html>

