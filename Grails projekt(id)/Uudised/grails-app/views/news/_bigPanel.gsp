<div class = "bigPanel">
	
	<div id = "bigHighlight">
		<div id = "bigHighlight-photo"><g:link controller="article" action="show" params =  "[id:articles[0].id]"><img class="bigHighlight-img" src="${createLink(controller:'article', action:'displayImage', id: articles[0].id ) }" /></g:link></div>
		<div id = "bigHighlight-title"><g:link controller="article" action="show" params =  "[id:articles[0].id]"><strong>${articles[0].title}</strong></g:link></div>
		<div id = "bigHighlight-intro"><p>${articles[0].intro}</p></div>
	</div>
	
	<div id = "bigMedium">
		<div id = "bigMedium-photo"><g:link controller="article" action="show" params =  "[id:articles[1].id]"><img class="bigMedium-img" src="${createLink(controller:'article', action:'displayImage', id: articles[1].id ) }" /></g:link></div>
		<div id = "bigMedium-title"><g:link controller="article" action="show" params =  "[id:articles[1].id]"><strong>${articles[1].title}</strong></g:link></div>
		<div id = "bigMedium-intro"><p>${articles[1].intro}</p></div>		
	</div>
	
	<div id = "bigTitles">
		<div id = "bigTitles-title"><g:link controller="article" action="show" params =  "[id:articles[2].id]"><strong>${articles[2].title}</strong></g:link></div>
		<div id = "bigTitles-title"><g:link controller="article" action="show" params =  "[id:articles[3].id]"><strong>${articles[3].title}</strong></g:link></div>
	</div>
	
</div>