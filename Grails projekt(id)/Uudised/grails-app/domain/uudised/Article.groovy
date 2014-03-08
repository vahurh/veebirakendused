package uudised

class Article {
	String title
	String descriptionShort
	String descriptionLong
	String content
	User author
	String priority
	int views
	Date dateCreated = new Date()
	

    static constraints = {
		title blank:false
		descriptionShort(maxSize: 5000)
		descriptionLong(maxSize: 5000)
		content(maxSize: 5000)
		
    }
}
