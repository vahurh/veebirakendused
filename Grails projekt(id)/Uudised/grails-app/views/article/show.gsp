
<%@ page import="uudised.Article" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-article" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-article" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list article">
			
				<g:if test="${articleInstance?.author}">
				<li class="fieldcontain">
					<span id="author-label" class="property-label"><g:message code="article.author.label" default="Author" /></span>
					
						<span class="property-value" aria-labelledby="author-label"><g:link controller="user" action="show" id="${articleInstance?.author?.id}">${articleInstance?.author?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="article.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${articleInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="article.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${articleInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.descriptionLong}">
				<li class="fieldcontain">
					<span id="descriptionLong-label" class="property-label"><g:message code="article.descriptionLong.label" default="Description Long" /></span>
					
						<span class="property-value" aria-labelledby="descriptionLong-label"><g:fieldValue bean="${articleInstance}" field="descriptionLong"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.descriptionShort}">
				<li class="fieldcontain">
					<span id="descriptionShort-label" class="property-label"><g:message code="article.descriptionShort.label" default="Description Short" /></span>
					
						<span class="property-value" aria-labelledby="descriptionShort-label"><g:fieldValue bean="${articleInstance}" field="descriptionShort"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.introduction}">
				<li class="fieldcontain">
					<span id="introduction-label" class="property-label"><g:message code="article.introduction.label" default="Introduction" /></span>
					
						<span class="property-value" aria-labelledby="introduction-label"><g:fieldValue bean="${articleInstance}" field="introduction"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.priority}">
				<li class="fieldcontain">
					<span id="priority-label" class="property-label"><g:message code="article.priority.label" default="Priority" /></span>
					
						<span class="property-value" aria-labelledby="priority-label"><g:fieldValue bean="${articleInstance}" field="priority"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="article.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${articleInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${articleInstance?.views}">
				<li class="fieldcontain">
					<span id="views-label" class="property-label"><g:message code="article.views.label" default="Views" /></span>
					
						<span class="property-value" aria-labelledby="views-label"><g:fieldValue bean="${articleInstance}" field="views"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:articleInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${articleInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
