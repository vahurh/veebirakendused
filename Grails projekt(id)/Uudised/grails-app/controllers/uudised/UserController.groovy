package uudised
import uudised.SecUserSecRole
import uudised.SecRole


class UserController {

	def login(LoginCommand cmd) {
		if(request.method == 'POST') {
			if(!cmd.hasErrors()) {
				session.user = cmd.getUser()
				render template: '/user/welcomeMessage'
			} else {
				render template: 'loginBox', model: [loginCmd: cmd]
			}
		} else {
			render template:'loginBox'
		}
	}
	
	def register() {
		if(request.method == 'POST') {
			def u = new User()
			u.properties['username', 'password', 'firstName', 'lastName'] = params
			def userRole = SecRole.findByAuthority('ROLE_USER')
			if(u.password != params.confirm) {
				u.errors.rejectValue("password", "user.password.dontmatch")
				return [user:u]
			} else if(u.save()) {
				SecUserSecRole.create(u, userRole)
				redirect controller:"news"
			} else {
				return [user:u]
			}
		}
	}
	
	def logout() {
		session.invalidate()
		redirect controller:"news"
	}		
}

class LoginCommand {
	String login
	String password
	private u
	User getUser() {
					if(!u && login) {
						u = User.findByLogin(login, [fetch:[purchasedSongs:'join']])
					}
					return u
	}
	static constraints = {
				login blank:false, validator:{ val, obj ->
					if(!obj.user)
						return "user.not.found"
				}
				password blank:false, validator:{ val, obj ->
					if(obj.user && obj.user.password != val)
						return "user.password.invalid"
				}
	}
}
