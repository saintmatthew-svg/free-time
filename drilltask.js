
function calculateArea(width, height){
	let result = height * width;
	return result;
};

function convertToFahrenheit(temperature){
	let result = temperature * 9/5 + 32;
	return result;
};

function isEven(number){
	if(number % 2 === 0){
		return true;
	}else {
		return false;
	}
}

function isLeapYear(year){
	if(year % 4 === 0){
		return true;
	}else {
		return false;
	}
}

function countVowels(word){
	const vowels = "aeiouAEIOU";
	let count = 0;
	for(letters of word){
		if(vowels.includes(letters)){
			count++;
		}
	}
	return count;
}

module.exports = {calculateArea, convertToFahrenheit, isEven, isLeapYear, countVowels}