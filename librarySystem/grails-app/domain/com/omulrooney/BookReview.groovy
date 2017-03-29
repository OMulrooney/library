package com.omulrooney

class BookReview {

	Book book
	Date createdDate
	Student student
	String review

	String returnReview(){
		return review
	}

    static constraints = {

	book blank:false, nullable:false
	createdDate blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, widget:'textarea'
	
    }
}
