<header id="header">
	<h1 id="logo"><a href="${createLink(uri: '/')}">Uudised</a></h1>
	<g:if test="${session?.user}">
		<div id="quickaccess"><a href="#">${session?.user?.firstName}</a>, <g:link controller="user" action="logout">Logi välja</g:link></div>
		<nav id="navigation" class="clearfix">
			<ul>
				<li class="separator"><g:link controller="user" action="favorites">Sinu artiklid</g:link></li>
				<li><g:link controller="news" action="main">Pealeht</g:link></li>
			</ul>
		</nav>
	</g:if>
</header>
<div id="message notice">
	<div style="margin-top:20px">
		Teretulemast 
		<span id="userFirstName">${session?.user?.firstName}!</span>
		<br><br>
		Oled teinud (${session.user.articlesPublished?.size() ?: 0}) artiklit .
		<br>
	</div>
</div>