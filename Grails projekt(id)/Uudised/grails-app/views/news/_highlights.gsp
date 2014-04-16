<g:if test="${listNumber == 1}">
	<div class="item active">
</g:if>
<g:else>
	<div class = "item">
</g:else>
<g:set var="listNumber" value="${listNumber + 1}" />
	<div id ="highlight-photo">
		<g:link controller="article" action="show" params = "[id:article.id]">
			<img class="highlightPhoto img-responsive" src="${createLink(controller:'article', action:'displayImage', id: article.id ) }" />
		</g:link>
	</div>
	<div class= "highlight-title">
		<g:link controller="article" action="show" params =  "[id:article.id]">
			<strong>${article.title}</strong>
		</g:link>
	</div>
	<p class = "article-intro">${article.intro}</p>
</div>