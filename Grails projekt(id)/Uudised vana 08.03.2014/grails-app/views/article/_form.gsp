<%@ page import="uudised.Article" %>



<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'author', 'error')} required">
	<label for="author">
		<g:message code="article.author.label" default="Author" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="author" name="author.id" from="${uudised.User.list()}" optionKey="id" required="" value="${articleInstance?.author?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'content', 'error')} ">
	<label for="content">
		<g:message code="article.content.label" default="Content" />
		
	</label>
	<g:textField name="content" value="${articleInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="article.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${articleInstance?.date}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'descriptionLong', 'error')} ">
	<label for="descriptionLong">
		<g:message code="article.descriptionLong.label" default="Description Long" />
		
	</label>
	<g:textField name="descriptionLong" value="${articleInstance?.descriptionLong}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'descriptionShort', 'error')} ">
	<label for="descriptionShort">
		<g:message code="article.descriptionShort.label" default="Description Short" />
		
	</label>
	<g:textField name="descriptionShort" value="${articleInstance?.descriptionShort}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'introduction', 'error')} ">
	<label for="introduction">
		<g:message code="article.introduction.label" default="Introduction" />
		
	</label>
	<g:textField name="introduction" value="${articleInstance?.introduction}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="article.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="priority" type="number" value="${articleInstance.priority}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="article.title.label" default="Title" />
		
	</label>
	<g:textField name="title" value="${articleInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: articleInstance, field: 'views', 'error')} required">
	<label for="views">
		<g:message code="article.views.label" default="Views" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="views" type="number" value="${articleInstance.views}" required=""/>

</div>

