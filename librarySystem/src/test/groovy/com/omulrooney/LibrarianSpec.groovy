package com.omulrooney

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void telephoneLengthTest() {
        when: "A Librarian Has Been Created"
	def library1 = new Library(building: 'Cantor',
				address: '123 Placeholder road',
				openingHours: '09:00 - 20:00',
				location: 'Sheffield',
				studySpaces:50)
	def librarian1 = new Librarian(name:'Leroy Jenkins',
					email:'LJ@chicken.com',
					office:'123',
					username:'LJenks',
					telephone:'01145769230',
					password:'supersecret',
					library:library1)
	then:"This will check if the phone number is the right length"
	librarian1.telephoneTest() == 11
    }
}
