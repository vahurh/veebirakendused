package uudised

import com.the6hours.grails.springsecurity.facebook.FacebookAuthToken
import org.springframework.social.facebook.api.Facebook
import org.springframework.social.facebook.api.FacebookProfile
import org.springframework.social.facebook.api.impl.FacebookTemplate
import org.springframework.security.core.AuthenticationException
import org.springframework.security.core.GrantedAuthority
import uudised.User


class FacebookAuthService {

	void onCreate(FacebookUser user, FacebookAuthToken token) {

	}
	
	void afterCreate(FacebookUser user, FacebookAuthToken token) {
	}
	

	SecUser createAppUser(FacebookUser user, FacebookAuthToken token) {

		Facebook facebook = new FacebookTemplate(token.accessToken.accessToken)
		FacebookProfile fbProfile = facebook.userOperations().userProfile
		String email = fbProfile.email
		String username = fbProfile.username
		String firstName = fbProfile.firstName
		String lastName = fbProfile.lastName
		SecUser person = new SecUser(
				username: "facebook_$username",
				firstName: firstName,
				lastName: lastName,
				enabled: true,
				accountExpired: false,
				accountLocked: false,
				passwordExpired: false
		)
		person.save(failOnError: true)
		return person
		
	}

}
