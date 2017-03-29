package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void reviewTest() {
        when:"A review has been created"
	
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

	def ParryHotter=new Book(title:'Parry Hotter',
				subject:'Fiction',
				author:'R.J.Kowling',
				isbn:'312132',
				dateBorrowed:new Date('21/06/17'),
				student:student1,
				overdue:true)
	def review1=new BookReview(book: ParryHotter,
					createdDate: new Date('29/03/17'),
					student:student1,
					review:'A subtle and nuanced look into the deepest depths of human philosophy')

	then:"this will test to see if a review has been entered"
	review1.returnReview() != null
    }
}
