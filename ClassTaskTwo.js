 const car = {
	make: 'Toyota',    
	model: 'Camry', 
	year: 2021 
};

function loopThroughItsProperties(car){
	for(const properties in car){
		console.log(properties + ": " + car[properties]);
	}
}

loopThroughItsProperties(car);
