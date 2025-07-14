const person = {
	firstName: 'Onyekachi',
	lastName: 'Matthew',
	fullName: function(person){
		return this.firstName + " " + this.lastName;
	}
};

console.log(person.fullName());