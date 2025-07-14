const {filterScore, increaseScoreByFive, SquareOfEachNumber, DistributeBooks, AfternoonClasses, calculateExpenses, letterGrade, filterHealthyItems} = require("./Arraymethods1");

test("scores above 70 is filtered", () => {
    const testScores = [85, 62, 90, 74, 58, 99, 47, 81, 70, 66];
    const expected = [85,90,74,99,81,70];
    expect(filterScore(testScores)).toEqual(expected);
})

test("scores increase by five", () => {
    const scores = [85, 92, 78, 88, 95];
    const expected = [90, 97, 83, 93, 100];
    expect(increaseScoreByFive(scores)).toEqual(expected);
})

test("square of each numbers", () => {
    const numbers =  [2, 4, 6, 8, 10];
    const expected = [4,16,36,64,100];
    expect( SquareOfEachNumber(numbers)).toEqual(expected);
})

test("Each member receives the correct book", () => {
    const members = ["Emily", "Jack", "Sophia", "Daniel"];
    const books = ["Pride and Prejudice", "1984", "To Kill a Mockingbird", "The Great Gatsby"];
    const expected = [
        "Emily receives the book Pride and Prejudice",
        "Jack receives the book 1984",
        "Sophia receives the book To Kill a Mockingbird",
        "Daniel receives the book The Great Gatsby"
    ];
    expect(DistributeBooks(members, books)).toEqual(expected);
});

test("classes offered in the afternoon", () => {
    const time = ["9:00AM", "11:00AM", "1:00PM", "3:00PM", "5:00PM"];
    const expected = ["1:00PM", "3:00PM", "5:00PM"];
    expect(AfternoonClasses(time)).toEqual(expected);
})

test("total expenses", () => {
    const expenses = { 
        "groceries": 150, 
        "dining out": 100, 
        "transportation": 50, 
        "entertainment": 80 
    };
    expect(calculateExpenses(expenses)).toBe(380)
})

test("letter grade",() => {
    const studentScores = [95, 78, 85, 60, 45, 92];
    expect(letterGrade(studentScores)).toEqual(["A","C","B","D","F","A"])
})

test("Handles items with missing isHealthy property", () => {
    const shoppingList = [
        { name: "Apples", category: "Fruits", },
        { name: "Carrots", category: "Vegetables", isHealthy: true }
    ];
    expect(filterHealthyItems(shoppingList)).toEqual(["Carrots"]);
});