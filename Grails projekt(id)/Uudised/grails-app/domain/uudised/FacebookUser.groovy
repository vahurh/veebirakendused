package uudised



class FacebookUser {

	long uid
  String accessToken
  Date accessTokenExpires

	static belongsTo = [user: SecUser]

	static constraints = {
		uid unique: true
	}
}
