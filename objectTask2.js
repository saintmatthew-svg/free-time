//(4)

let inventory = {
    apple: 10,
    banana: 5,
    orange: 8,
    mango: 12,
    getFoodNameAndQuantities: function(){
        let result = [];
        for(const count in inventory){
			if(typeof inventory[count] === 'number') {
				console.log(count + ": " + inventory[count]);
				result.push(`${count}: ${inventory[count]}`);
			}
        }return result;
    },
    getTotalAmountOfFruits: function(){
        let total = 0;
        for(const count in inventory){
			if(typeof inventory[count] === 'number') {
				total += inventory[count];
			}	
        } return total;
    }
};

inventory.getFoodNameAndQuantities();
inventory.getTotalAmountOfFruits();

module.exports = { inventory };