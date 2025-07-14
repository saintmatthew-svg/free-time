//(1)

let student = {
    name: "John Doe",
    age: 22,
    courses: ["Math","Physics","Computer Science"],
    address: {
        city: "New York",
        zip: 10001,
    },
    
    getDetails: function(){
        return `${student.name} is ${student.age} years old and has a GPA of ${student.GPA}`;
    }
};

console.log(`The student's name is: ${student.name}`);
console.log(`The student's second course is: ${student.courses[1]}`);
console.log(`The zip code for the address is: ${student.address.zip}`);

//(2)

student.age = 23;
student.GPA = 3.8;

student.getDetails();
module.exports = {student};
