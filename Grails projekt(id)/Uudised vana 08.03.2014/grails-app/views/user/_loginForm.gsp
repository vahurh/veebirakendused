<g:form name="loginForm" url="[controller:'user',action:'login']" class="form">
	<div class="input">
		<g:textField required="true"
					placeholder="Kasutajanimi"
					name="login"
					value="${fieldValue(bean:loginCmd, field:'login')}" />
		<g:hasErrors bean="${loginCmd}" field="login">
		<p class="error"><g:fieldError bean="${loginCmd}" field="login" /></p>
		</g:hasErrors>
	</div>
	<div class="input">
		<g:passwordField required="true"
						placeholder="Salasõna"
						name="password" />
		<g:hasErrors bean="${loginCmd}" field="password">
		<p class="error">
			<g:fieldError bean="${loginCmd}" field="password" />
		</p>
		</g:hasErrors>
	</div>
	<div class="submit">
		<input type="submit" value="Logi sisse" class="btn" />
	</div>
</g:form>