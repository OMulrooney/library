package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void passwordTest() {
	when:"A Student Has Been Created"

	def course1=new Course(title:'Comp Sci',
				code:'comp212',
				leader:'Harry',
				department:'computing',
				description:'computers and stuff',
				studyMode: 'Full Time')

	def student1=new Student(name:'Bob Jenkins',
				email:'bjenks@email.com',
				username:'bjenks',
				password:'pw123',
				studentId:'3312',
				course:course1)

	then:"This will check to see if user has a password"

	student1.hasPassword() != null
    }
}
