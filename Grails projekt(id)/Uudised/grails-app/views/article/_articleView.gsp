<div class = "articleView-wrap">
<div class="col-md-8 col-md-offset-2 col-xs-12">
	<div class="row article-row">
		<div id = "articleView-photo">
			<img class="articleViewPhoto img-responsive" src="${createLink(controller:'article', action:'displayImage', id: article.id ) }" />
		</div>

		<div class="article-title">
			<h1>${article.title}</h1>
		</div>

		<div id = "articleView-author">
			<p>${article.author.username}</p>
			<hr></hr>
		</div>

		<div id = "articleView-intro">
			<h4>${article.intro}</h4>
		</div>

		<div id = "articleView-content">
			<p>${article.content}</p>
		</div>
	</div>

</div>

%{-- <div class="col-md-3">
	<div class="recom tabbable">
		<ul id="myTab" class="nav nav-tabs">
			<li class="active"><a href="#soovitused" data-toggle="tab">Soov</a></li>
			<li><a href="#mingitab" data-toggle="tab">Tab</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane active" id="soovitused">
				<g:render template="popularPanel" model ="[articles: popularArticles]" />
			</div>
			<div class="tab-pane" id="mingitab">Sisu1</div>
		</div>
	</div>
</div> --}%

</div>
	%{-- <div id = "articleViewTime">
		<g:formatDate format = "yyyy-MM-dd HH:mm" date = "${article.dateCreated}"/>
	</div>

	<div id = "articleView-author"><p>${article.author.username}</p></div>
	<div id = "articleView-title"><h2>${article.title}</h2></div>
	<div id = "articleView-photo"><img class="articleViewPhoto" src="${createLink(controller:'article', action:'displayImage', id: article.id ) }" /></div>
	<div id = "articleView-intro"><p>${article.intro}</p></div>
	<div id = "articleView-content"><p>${article.content}</p></div> --}%