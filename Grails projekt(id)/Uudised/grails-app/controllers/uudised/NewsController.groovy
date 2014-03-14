package uudised
import uudised.Article
import uudised.User


class NewsController {

	def index() {
		def highlights = highlightedArticles()
		def bigPanelNew = bigPanelNewArticles() 
		return [highlights: highlights, bigPanelNew:bigPanelNew]
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
}
