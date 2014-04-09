
<div class="row eesti-uudised">
	<div class="category-header">
		<h4 class="category">Eesti</h4>
		<hr class="separator"></hr>
	</div>

	<div class="row eesti-suured">
		<div class = "bigHighlight col-sm-6">
			<div class = "bigHighlight-photo">
				<g:link controller="article" action="show" params =  "[id:articles[0].id]">
					<img class="bigHighlight-img img-responsive" src="${createLink(controller:'article', action:'displayImage', id: articles[0].id ) }" />
				</g:link>
			</div>

			<div id = "bigHighlight-title">
				<g:link controller="article" action="show" params =  "[id:articles[0].id]">
					<strong>${articles[0].title}</strong>
				</g:link>
			</div>

			<div id = "bigHighlight-intro">
				<p>${articles[0].intro}</p>
			</div>
		</div>

		<div class = "bigMedium col-sm-6">

			<div class = "bigMedium-photo">
				<g:link controller="article" action="show" params =  "[id:articles[1].id]">
					<img class="bigMedium-img img-responsive" src="${createLink(controller:'article', action:'displayImage', id: articles[1].id ) }" />
				</g:link>
			</div>

			<div id = "bigMedium-title">
				<g:link controller="article" action="show" params =  "[id:articles[1].id]">
					<strong>${articles[1].title}</strong>
				</g:link>
			</div>

			<div id = "bigMedium-intro">
				<p>${articles[1].intro}</p>
			</div>	
		</div>
	</div>

	<div class="row eesti-titles">

		<div id = "bigTitles">
			<div class= "bigTitles-title col-sm-6">
				<g:link controller="article" action="show" params =  "[id:articles[2].id]">
					<strong>${articles[2].title}</strong>
				</g:link>
			</div>

			<div class= "bigTitles-title col-sm-6">
				<g:link controller="article" action="show" params =  "[id:articles[3].id]">
					<strong>${articles[3].title}</strong>
				</g:link>
			</div>
		</div>
	</div>
</div>

<div class="row valismaa-uudised">
	<div class="category-header">
		<h4 class="category">Välismaa</h4>
		<hr class="separator"></hr>
	</div>

	<div class="row valismaa-suured">
		<div class = "bigHighlight col-sm-6">
			<div class = "bigHighlight-photo">
				<g:link controller="article" action="show" params =  "[id:articles[2].id]">
					<img class="bigHighlight-img img-responsive" src="${createLink(controller:'article', action:'displayImage', id: articles[2].id ) }" />
				</g:link>
			</div>

			<div id = "bigHighlight-title">
				<g:link controller="article" action="show" params =  "[id:articles[2].id]">
					<strong>${articles[2].title}</strong>
				</g:link>
			</div>

			<div id = "bigHighlight-intro">
				<p>${articles[2].intro}</p>
			</div>
		</div>

		<div class = "bigMedium col-sm-6">

			<div class = "bigMedium-photo">
				<g:link controller="article" action="show" params =  "[id:articles[3].id]">
					<img class="bigMedium-img img-responsive" src="${createLink(controller:'article', action:'displayImage', id: articles[3].id ) }" />
				</g:link>
			</div>

			<div id = "bigMedium-title">
				<g:link controller="article" action="show" params =  "[id:articles[3].id]">
					<strong>${articles[3].title}</strong>
				</g:link>
			</div>

			<div id = "bigMedium-intro">
				<p>${articles[3].intro}</p>
			</div>	
		</div>
	</div>

</div>
