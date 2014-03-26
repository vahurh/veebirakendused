
<div class="item">
	<div id ="highlight-photo">
		<g:link controller="article" action="show" params = "[id:article.id]">
			<img class="highlightPhoto" src="${createLink(controller:'article', action:'displayImage', id: article.id ) }" />
		</g:link>
	</div>
	<div id = "highlight-title">
		<g:link controller="article" action="show" params =  "[id:article.id]">
			<strong>${article.title}</strong>
		</g:link>
	</div>
	<p>${article.intro}</p>
	
	<div class = "articleTime">
		<p>Created: <g:formatDate format = "yyyy-MM-dd HH:mm" date = "${article.dateCreated}"/> </p>
	</div>
</div>