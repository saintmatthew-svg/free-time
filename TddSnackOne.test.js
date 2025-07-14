const {AirConditioner, TurnOn, TurnOff, Increase, Decrease} = require("./TddSnackOne.js");

describe("default", () => {
    beforeEach(() => {
        Temperature = 16;
    });

    test("Ac is on", () => {
        expect(TurnOn()).toBe(true);
    });

    test("Ac is off", () => {
        expect(TurnOff()).toBe(false);
    });

    test("Ac can increase above 16", () => {   
        expect(Increase(Temperature)).toBe(17);
    });

    test("Ac can decrease below 30", () => {
        let Temperature = 30;
        expect(Decrease(Temperature)).toBe(29)
    });

    test("Ac does not go below 16", () => {
        Decrease(Temperature);
        expect(Decrease(Temperature)).toBe(16);
        Decrease(Temperature);
        expect(Decrease(Temperature)).toBe(16);
    });

    test("Ac does not go above 30", () => {
        let Temperature = 30;
        Increase(Temperature);
        expect(Increase(Temperature)).toBe(30);
        Increase(Temperature);
        expect(Increase(Temperature)).toBe(30);
    });

});