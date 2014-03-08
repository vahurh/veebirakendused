package uudised
import uudised.Article
import uudised.User


class NewsController {

	def index() {
		def highlights = highlightedArticles()
		return [highlights: highlights]
	}
	
	private highlightedArticles() {
		
				def c = Article.createCriteria()
				def highlights = c.list {
					eq('priority', '3')
					
					maxResults(3)
				}
				highlights
			}
}
