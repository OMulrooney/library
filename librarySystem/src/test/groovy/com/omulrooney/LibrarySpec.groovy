package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void spaceTest() {
        when: "A library has been created"
	
	def library1 = new Library(building: 'Cantor',
				address: '123 Placeholder road',
				openingHours: '09:00 - 20:00',
				location: 'Sheffield',
				studySpaces:50)
	then: "This will check if the library has more than 40 study spaces"
	library1.studySpacesValue() > 40
    }
}
