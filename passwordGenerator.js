const prompt = require('prompt-sync')()
const passwordLength = parseInt(prompt("Enter password length: "));
const includeUppercase = prompt(" Include uppercase letters? (y/n): ").toLowerCase() === "y";
const includeLowercase = prompt(" Include lowercase letters? (y/n): ").toLowerCase() === "y";
const includeNumbers = prompt(" Include numbers? (y/n): ").toLowerCase() === "y";
const includeSpecialCharacters = prompt(" Include special characters? (y/n): ").toLowerCase() === "y";

const uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWSYZ";
const lowercaseletters = "abcdefghijklmnopqrstuvwxyz";
const numbers = "1234567890";
const specialcharacters = "/:^-|\';*&%$#@!+=";

let characterspool = "";
if(includeUppercase) characterspool += uppercaseLetters;
if(includeLowercase) characterspool += lowercaseletters;
if(includeNumbers) characterspool += numbers;
if(specialcharacters) characterspool += specialcharacters;

let password = "";
for(let count = 0; count < passwordLength; count++){
	const randomIndex = Math.floor(Math.random() * characterspool.length);
	password += characterspool[randomIndex]; 
}

console.log("Your password: " + password);