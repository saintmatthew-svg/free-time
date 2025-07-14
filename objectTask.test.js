const {student} = require("./objectTask.js");

describe('default student', () => {
    beforeEach(() => {
        student.age = 22;
		student.name = "John Doe";
		student.zip = 10001;
		student.city = "New York";
    });

    test('return student name if needed', () => {
        expect(student.name).toBe("John Doe");
    });
	
	 test('default age', () => {
        expect(student.age).toBe(22);
    });
	
	test('return updated name if needed', () => {
        expect(student.name = "Matthew").toBe("Matthew");
    });

    test('test that updated student age is updated correctly', () => {
        expect(student.age = 23).toBe(23);
    });

    test('test default GPA result', () => {
        expect(student.GPA).toBe(3.8);
    });
	
	test('test updated GPA result', () => {
        expect(student.GPA = 4.0).toBe(4.0);
    });

    test('display correct course if needed', () => {
        expect(student.courses[1]).toBe("Physics");
        expect(student.courses[2]).toBe("Computer Science");
        expect(student.courses[0]).toBe("Math");
    });
	
	test('display correct updated course if needed', () => {
        expect(student.courses[0] = "English").toBe("English");
        expect(student.courses[2] = "Software Engineering").toBe("Software Engineering");
        expect(student.courses[1]).toBe("Physics");
    });

    test('display correct city address', () => {
        expect(student.address.city).toBe("New York");
        expect(student.address.zip).toBe(10001);
    });
	
	test('if address updates properly', () => {
        expect(student.address.city = "Nigeria").toBe("Nigeria");
        expect(student.address.zip = 57200).toBe(57200);
    });
	
	test('test get details', () => {
		student.age = 22;
		student.name = "John Doe";
		student.zip = 10001;
		student.city = "New York";
		student.GPA = 3.8;
        expect(student.getDetails()).toBe("John Doe is 22 years old and has a GPA of 3.8")
    });
	
	test('test updated get details', () => {
		student.age = 23;
		student.name = "Matthew";
		student.zip = 57200;
		student.city = "Nigeria";
		student.GPA = 4.6;
        expect(student.getDetails()).toBe("Matthew is 23 years old and has a GPA of 4.6")
    });


});  