package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void overdueTest() {
        when:"A book has been created"
	def course1=new Course(title:'Comp Sci',
				code:'comp212',
				leader:'Harry',
				department:'computing',
				description:'computers and stuff',
				studymode: 'Full Time')

	def student1=new Student(name:'Bob Jenkins',
				email:'bjenks@email.com',
				username:'bjenks',
				password:'pw123',
				studentId:'3312',
				course:course1)

	def ParryHotter=new Book(title:'Parry Hotter',
				subject:'Fiction',
				author:'R.J.Kowling',
				isbn:'312132',
				dateBorrowed:new Date('21/06/17'),
				student:student1,
				overdue:true)

	then:"This will check if it is overdue"
	ParryHotter.isOverdue() == true
		
    }
}
