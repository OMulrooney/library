package com.omulrooney

class BootStrap {

    def init = { servletContext ->

	def computersci = new Course(title:'Comp Sci',
				code:'comp212',
				leader:'Harry',
				department:'computing',
				description:'computers and stuff',
				studyMode: 'Full Time').save()

	def useless = new Course (title:'Geopgraphy',
				code:'useless212',
				leader:'Jeff',
				department:'useless studies',
				description:'rivers and stuff',
				studyMode: 'Full Time').save()

	def student1=new Student(name:'Bob Jenkins',
				email:'bjenks@email.com',
				username:'bjenks',
				password:'pw123',
				studentId:'3312',
				course:computersci).save()

	def student2=new Student(name:'Jon Benkins',
				email:'jbenks@email.com',
				username:'bjenks',
				password:'pw321',
				studentId:'3313',
				course:useless).save()

	def ParryHotter=new Book(title:'Parry Hotter',
				subject:'Fiction',
				author:'R.J.Kowling',
				isbn:'312132',
				dateBorrowed:new Date('21/06/17'),
				student:student1,
				overdue:true).save()

	def BordoftheLings=new Book(title:'Bord of the Lings',
				subject:'Fantasy',
				author:'R.T.J.Rolkein',
				isbn:'573749',
				dateBorrowed:new Date('16/08/17'),
				student:student2,
				overdue:false).save()

	def library1 = new Library(building: 'Cantor',
				address: '123 Placeholder road',
				openingHours: '09:00 - 20:00',
				location: 'Sheffield',
				studySpaces:50).save()

	def library2 = new Library(building: 'Owen',
				address: '321 Thing road',
				openingHours: '09:00 - 20:00',
				location: 'Sheffield',
				studySpaces:60).save()
	
	def librarian1 = new Librarian(name:'Leroy Jenkins',
					email:'LJ@chicken.com',
					office:'123',
					username:'LJenks',
					telephone:'01145769230',
					password:'supersecret',
					library:library1).save()

	def librarian2 = new Librarian(name:'Bob Sanchez',
					email:'BS@email.com',
					office:'321',
					username:'BSanch',
					telephone:'01143724268',
					password:'supersecret',
					library:library2).save()

	def review1=new BookReview(book: ParryHotter,
					createdDate: new Date('29/03/17'),
					student:student1,
					review:'A subtle and nuanced look into the deepest depths of human philosophy').save()

	def review2=new BookReview(book: BordoftheLings,
					createdDate: new Date('22/03/17'),
					student:student2,
					review:'What a load of tripe').save()


    }
    def destroy = {
    }
}
