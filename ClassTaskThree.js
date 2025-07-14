let counter = {
	count: 1,
	step: 2,
	
	increment: function(){
		counter.count += counter.step;
	}
};

counter.increment();
console.log(counter.count);