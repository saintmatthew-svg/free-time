const {inventory} = require("./objectTask2");

describe('default student', () => {
    beforeEach(() => {
        inventory.apple = 10;
        inventory.banana = 5;
        inventory.orange = 8;
        inventory.mango = 12;
    });

    test("default quantities are correct", () => {
        expect(inventory.apple).toBe(10);
		expect(inventory.banana).toBe(5);
		expect(inventory.orange).toBe(8);
		expect(inventory.mango).toBe(12);
    });

    test("get Food Name And Quantities returns correct output", () => {
        inventory.apple = 10;
        inventory.banana = 5;
        inventory.orange = 8;
        inventory.mango = 12;
        const expected = [
            "apple: 10",
            "banana: 5",
            "orange: 8",
            "mango: 12"
        ];
        expect(inventory.getFoodNameAndQuantities()).toEqual(expected);
    });

    test("Display total amount of goods", () => {
        inventory.apple = 10;
        inventory.banana = 5;
        inventory.orange = 8;
        inventory.mango = 12;
        expect(inventory.getTotalAmountOfFruits()).toBe(35);
    });
	
	test("updated quantities are correct and check updated total amount", () => {
        inventory.apple = 10;
        inventory.banana = 5;
        inventory.orange = 8;
        inventory.mango = 12;
        expect(inventory.apple).toBe(10);
		expect(inventory.banana).toBe(5);
		expect(inventory.orange).toBe(8);
		expect(inventory.mango).toBe(12);
        inventory.apple = 18;
        inventory.banana = 3;
        inventory.orange = 2;
        inventory.mango = 100;
        expect(inventory.apple).toBe(18);
		expect(inventory.banana).toBe(3);
		expect(inventory.orange).toBe(2);
		expect(inventory.mango).toBe(100);
        expect(inventory.getTotalAmountOfFruits()).toBe(123);
    });

});