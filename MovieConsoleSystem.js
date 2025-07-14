const prompt = require('prompt-sync')()
const menu = "\n1. add a movie\n 2. rate a movie\n 3. view average rating\n 4. exiting\n"
 console.log(menu)
 
let movies = []
let ratings = {}
 
 function main(){
	 let choice;
	 do{
		 choice =  parseInt(prompt("select an option: "))
		 console.log();
		 if(choice < 1 || choice > 4 || isNaN(choice)){
			console.log("invalid input please try again")
			console.log(menu);
			continue;
		 }
		 
	 switch(choice){
		 case 1:
			addMovie();
			break;
	 
	 	 case 2:
			rateMovie();
			break;
		 
		 case 3:
			viewAverageRating();
			break;
			
		 case 4:
			console.log("Exiting..... Goodbye!");
			break;
	 }
}while(choice !== 4);
	 
}
 
function addMovie() {
	const movieName = prompt("ADD A MOVIE: ")
	const currentDateTime = new Date();
	if (movies.includes(movieName)) {
		console.log("movie already exists");
	} else if(!movieName || movieName.trim() === ""){
		console.log("invalid input");
		console.log();
	}else{
		movies.push(movieName);
		ratings[movieName] = [];
		console.log(`${movieName} added SUCCESSFULLY on ${currentDateTime}`);
		console.log();
	}
}

function rateMovie(){
	if(movies.length === 0){
		console.log("no movies available");
		console.log();
		return;
	}
	console.log("Available Movies: ", movies.join(" - "));
	const movieName = prompt("enter name of movie to rate: ");
	if(!movies.includes(movieName)){
		console.log("movie not found");
		console.log();
		return;
	}
	let rating = parseFloat(prompt(`enter your rating (1 - 5) for ${movieName}: `));
	if(rating < 1 || rating > 5 || isNaN(rating)){
		console.log("invalid rating");
		console.log();
		return;
	}
	ratings[movieName].push(rating);
	console.log(`rating of ${rating},  added for ${movieName}. `)
	console.log();
}

function viewAverageRating(){
	if(movies.length === 0){
		console.log("no movies available");
		console.log();
		return;
	}
	console.log("Available Movies: ", movies.join(" - "));
	const movieName = prompt("enter name of movie to view it`s rating: ")
	if(!movies.includes(movieName)){
		console.log("movie not found")
		console.log();
		return;
	}
	if(ratings[movieName].length === 0){
		console.log(`${movieName} has no rating yet`)
		console.log()
		return;
	}
	let total = 0;
	for(let rating of ratings[movieName]){
		total += rating;
	}
	const average = total / ratings[movieName].length;
	console.log(`Average rating for ${movieName} is ${average.toFixed(2)}.`);
	console.log();
}

main();