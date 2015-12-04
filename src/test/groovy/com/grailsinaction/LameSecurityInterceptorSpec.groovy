package com.grailsinaction


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LameSecurityInterceptor)
class LameSecurityInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test lameSecurity interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"post", action: 'addPost')

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
    
    void "Test lameSecurity interceptor not matching"() {
        when:"A request is made to the home action"
            withRequest(controller:"post", action: 'home')

        then:"The interceptor does not match"
            !interceptor.doesMatch()
    }
    
}
