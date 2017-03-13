package com.omulrooney

class Librarian {

	String name
	String email
	String office
	String username
	String password
	String telephone
	String library

    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false
	username blank:false, nullable:false
	password blank:false, nullable:false, password:true
	telephone blank:false, nullable:false
	library blank:false, nullable:false

    }
}
