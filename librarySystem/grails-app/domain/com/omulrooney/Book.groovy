package com.omulrooney

class Book {

	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Student student
	Boolean overdue


    static constraints = {

	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false
	dateBorrowed blank:false, nullable:false
	student blank:false, nullable:false
	overdue blank:false, nullable:false

    }
}
