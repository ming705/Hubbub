package com.grailsinaction


class LameSecurityInterceptor {
	// use constructor to limit interceptor to the addPost action of the PostController
	public LameSecurityInterceptor() {
		match controller: 'post', action: 'addPost'
	}

    boolean before() { 
		if (params.impersonateId) {
			session.user = User.findByLoginId(params.impersonateId)
		}

		if (!session.user) {
			log.debug 'Redirecting to login page'
			redirect(controller: 'login', action: 'form')
			return false
		} 
		true
	}

    boolean after() { true }

    void afterView() {
        log.debug "Finished running ${controllerName} - ${actionName}"
    }
}
