
<%@ page import="uudised.Article" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-article" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-article" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="article.author.label" default="Author" /></th>
					
						<g:sortableColumn property="content" title="${message(code: 'article.content.label', default: 'Content')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'article.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="descriptionLong" title="${message(code: 'article.descriptionLong.label', default: 'Description Long')}" />
					
						<g:sortableColumn property="descriptionShort" title="${message(code: 'article.descriptionShort.label', default: 'Description Short')}" />
					
						<g:sortableColumn property="introduction" title="${message(code: 'article.introduction.label', default: 'Introduction')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${articleInstanceList}" status="i" var="articleInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${articleInstance.id}">${fieldValue(bean: articleInstance, field: "author")}</g:link></td>
					
						<td>${fieldValue(bean: articleInstance, field: "content")}</td>
					
						<td><g:formatDate date="${articleInstance.date}" /></td>
					
						<td>${fieldValue(bean: articleInstance, field: "descriptionLong")}</td>
					
						<td>${fieldValue(bean: articleInstance, field: "descriptionShort")}</td>
					
						<td>${fieldValue(bean: articleInstance, field: "introduction")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${articleInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
