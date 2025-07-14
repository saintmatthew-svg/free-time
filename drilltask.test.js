const {calculateArea, convertToFahrenheit, isEven, isLeapYear, countVowels} = require("./drilltask.js")

test("calculate area of a rectangle", ()=>{
	let width = 5;
	let height = 10;
	const result = calculateArea(width, height);
	let answer = 50;
	expect(result).toBe(answer)
})

test("convert temperature to fehrenheit", ()=>{
	let temperature = 16;
	const result = convertToFahrenheit(temperature);
	let answer = 60.8;
	expect(result).toBe(answer)
})

test("check if number is even or odd", ()=>{
	expect(isEven(2)).toBe(true)
})

test("check if year is a leap year", ()=>{
	expect(isLeapYear(2024)).toBe(true)
})

test("count number of vowels", ()=>{
	expect(countVowels("boy")).toBe(1)
})