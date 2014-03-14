package uudised

class ArticleController {
	
	def index() { }
	
	def displayImage() {
		
		def article = Article.get(params.id)
		byte[] image = article.photo
		response.outputStream << image
		
		}
	
	
	def show(){ 
		
		[article: Article.get(params.id)]
	}
	
		
}
