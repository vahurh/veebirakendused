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
	
	def create() {
		if(request.method == 'POST') {
			def a = new Article()
			a.properties['title', 'intro', 'content', 'priority', 'category'] = params
			def f = request.getFile('myFile')
			if (f.empty) {
				flash.message = 'file cannot be empty'
				return [article:a]
			}
			def okContentTypes = ['image/png', 'image/jpeg', 'image/jpg', 'image/gif']
			if (!okContentTypes.contains(f.getContentType())) {
				flash.message = 'file has to have an extension .jpg ; .png ; .jpeg ; .gif'
				return [article:a]
			}
			a.photo = f.bytes
			a.author = User.findByLogin("autor")
			if(a.save()) {
				redirect controller:"news"
			} else {
				return [article:a]
			}
		}	
	}
	

		
}
