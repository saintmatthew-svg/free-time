const person = {
	firstName: 'Onyekachi',
	lastName: 'Matthew',
	Age: 27
};

function getPersonFullInformation(person){
return `"First Name: ${person.firstName}, Last Name: ${person.lastName}, Age: ${person.Age}"`
}

console.log(getPersonFullInformation(person));