function filterScore(testScores) {
return testScores.filter(score => score >= 70);
}

function increaseScoreByFive(scores){
return scores.map(score => score + 5);
}

function SquareOfEachNumber(numbers){
    return numbers.map(num => num * num);
}

function DistributeBooks(members, books){
    let index = 0;
    const assignments = [];
    for (const member of members) {
        assignments.push(`${member} receives the book ${books[index]}`);
        index++;
    }
    return assignments;
}

function AfternoonClasses(array){
    return array.filter(period => period.includes("PM"));
}

function calculateExpenses(expenses) {
    let totalExpenses = 0;
    for (let key in expenses) {
        totalExpenses += expenses[key];
    }
    return totalExpenses;
}

function letterGrade(grades) {
    return grades.map(grade => {
        if (grade >= 90 && grade <= 100) return "A";
        if (grade >= 80 && grade <= 89) return "B";
        if (grade >= 70 && grade <= 79) return "C";
        if (grade >= 60 && grade <= 69) return "D";
        return "F";
    });
}

function filterHealthyItems(shoppingList) {
    return shoppingList.filter(item => item.isHealthy === true).map(item => item.name);
}


console.log(filterScore([85, 62, 90, 74, 58, 99, 47, 81, 70, 66]));
console.log(increaseScoreByFive([85, 92, 78, 88, 95]));
console.log(SquareOfEachNumber([2, 4, 6, 8, 10]));
console.log(DistributeBooks(["Emily", "Jack", "Sophia", "Daniel"], ["Pride and Prejudice", "1984", "To Kill a Mockingbird", "The Great Gatsby"]));
console.log(AfternoonClasses(["9:00AM", "11:00AM", "1:00PM", "3:00PM", "5:00PM"]));
console.log(calculateExpenses({ 
    "groceries": 150, 
    "dining out": 100, 
    "transportation": 50, 
    "entertainment": 80 
}));
console.log(letterGrade([95, 78, 85, 60, 45, 92]));
console.log(filterHealthyItems([
     { name: 'Apples', category: 'Fruits', isHealthy: true },
     { name: 'Potato Chips', category: 'Snacks', isHealthy: false },
     { name: 'Carrots', category: 'Vegetables', isHealthy: true },
     { name: 'Chocolate Bars', category: 'Sweets', isHealthy: false },
     { name: 'Greek Yogurt', category: 'Dairy', isHealthy: true },
     { name: 'Soda', category: 'Beverages', isHealthy: false }
    ]));

module.exports = {filterScore, increaseScoreByFive, SquareOfEachNumber, DistributeBooks, AfternoonClasses, calculateExpenses, letterGrade, filterHealthyItems};