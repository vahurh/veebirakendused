package uudised
import uudised.Article
import uudised.User
import grails.plugin.springsecurity.annotation.Secured


class NewsController {

	@Secured(['permitAll'])
	def index() {
		def highlights = highlightedArticles()
		def bigPanelNew = bigPanelNewArticles()
		def popularArticles = popularArticles()
		/*def monthlyPopular = monthlyPopularArticles()*/
		return [highlights: highlights, bigPanelNew:bigPanelNew, popularArticles:popularArticles]
	}
	
	def ajaxlogin() {
		
	}
	
	private highlightedArticles() {
		
		def c = Article.createCriteria()
		def highlights = c.list {
			eq('priority', '3')			
			maxResults(3)
			order("dateCreated", "desc")
		}
		highlights
	}
	
	private bigPanelNewArticles() {
		def c = Article.createCriteria()
		def bigPanelNew = c.list {
			maxResults(4)
			order("dateCreated", "desc")
		}
		bigPanelNew
	}

/*	private monthlyPopularArticles(){
		def c = Article.createCriteria()
		def monthlyPopular = c.list {
			maxResults(3)
			order("views", "asc")
		}
		monthlyPopular
	}*/
}
