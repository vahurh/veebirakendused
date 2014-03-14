<div class = "articleView-wrap">

	<div id = "articleViewTime"><g:formatDate format = "yyyy-MM-dd HH:mm" date = "${article.dateCreated}"/></div>
	<div id = "articleView-content"><p>${article.author.login}</p></div>
	<div id = "articleView-title"><h2>${article.title}</h2></div>
	<div id = "articleView-photo"><img class="articleViewPhoto" src="${createLink(controller:'article', action:'displayImage', id: article.id ) }" /></div>
	<div id = "articleView-intro"><p>${article.intro}</p></div>
	<div id = "articleView-content"><p>${article.content}</p></div>

</div>