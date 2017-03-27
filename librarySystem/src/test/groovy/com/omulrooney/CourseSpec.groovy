package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void studyModeTest() {
        when:"A Course Has Been Created"
	def course1=new Course(title:'Comp Sci',
				code:'comp212',
				leader:'Harry',
				department:'computing',
				description:'computers and stuff',
				studyMode: 'Full Time')
	then:"This will check to see if the course is full time"
	course1.isFullTime() == 'Full Time'
    }
}
