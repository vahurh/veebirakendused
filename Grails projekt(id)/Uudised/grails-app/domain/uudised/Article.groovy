package uudised

class Article {
	String title
	String intro
	String content
	String priority
	String category
	Date dateCreated = new Date()
	byte[] photo
	int views
	
	static hasOne = [author: User]

    static constraints = {
		author nullable:true
		title blank:false
		intro(maxSize: 5000)
		content(maxSize: 5000)
		photo(maxSize: 1024 * 1024, nullable:true)
    }
}

