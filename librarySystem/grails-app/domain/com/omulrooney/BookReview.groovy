package com.omulrooney

class BookReview {

	String book
	Date dateCreated
	String student
	String review

    static constraints = {

	book blank:false, nullable:false
	date blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, widget:'textarea'
	
    }
}
