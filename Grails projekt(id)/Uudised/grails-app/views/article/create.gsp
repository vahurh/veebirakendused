<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="main">
		<title>Lisa artikkel</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body id="body">
		
        <div class="instructions">
            <h1>Artikli lisamine</h1>
            <p>Palun täitke allolevad väljad, et lisada artikkel andmebaasi!</p>
        </div>
		<g:form action="create" name="createForm" enctype="multipart/form-data">
			<div class="input clearfix">
				<label for="title">Title <span class="required">*</span></label>
				<div id = "titleField"><g:textField required="true" name="title" value="${article?.title}" /></div>
                <g:hasErrors  bean="${article}" field="title">
                    <p class="error"><g:fieldError bean="${article}" field="title" /></p>
                </g:hasErrors>
			</div>
			<div class="input clearfix">
				<label for="intro">Intro <span class="required">*</span></label>
				<div id = "introField"><g:textArea required="true" name="intro" rows="5" cols="80" value="${article?.intro}" /></div>
                <g:hasErrors  bean="${article}" field="intro">
                    <p class="error"><g:fieldError bean="${article}" field="intro" /></p>
                </g:hasErrors>
			</div>
			<div class="input clearfix">
				<label for="content">Content <span class="required">*</span></label>
				<div id = "contentField"><g:textArea required="true" name="content" rows="5" cols="80" value="${article?.content}" /></div>
                <g:hasErrors  bean="${article}" field="content">
                    <p class="error"><g:fieldError bean="${article}" field="content" /></p>
                </g:hasErrors>
			</div>
			<div class="input clearfix">
				<label for="priority">Priority <span class="required">*</span></label>
				<div id = "priorityField"><g:textField required="true" name="priority" value="${article?.priority}" /></div>
                <g:hasErrors  bean="${article}" field="priority">
                    <p class="error"><g:fieldError bean="${article}" field="priority" /></p>
                </g:hasErrors>
			</div>
			<div class="input clearfix">
				<label for="category">Category <span class="required">*</span></label>
				<div id = "categoryField"><g:textField required="true" name="category" value="${article?.category}" /></div>
                <g:hasErrors  bean="${article}" field="category">
                    <p class="error"><g:fieldError bean="${article}" field="category" /></p>
                </g:hasErrors>
			</div>
			<div class="input clearfix">
				<label for="image">Image <span class="required">*</span></label>
		        <input type="file" name="myFile" />
                <g:hasErrors  bean="${article}" field="image">
                    <p class="error"><g:fieldError bean="${article}" field="image" /></p>
                </g:hasErrors>
				<g:if test="${flash.message}">
				  <div class="fileErrorMessage">${flash.message}</div>
				</g:if>
			</div>
	           <div class="submit">
                <g:submitButton class="btn" name="create" value="Create" />
            </div>
		</g:form>
	</body>
	
</html>
