const { findProducts, findExpensiveProducts } = require("./objectTask4");


    test("find expensive products function", () => {
        const products = [
            { id: 1, name: "Laptop", price: 1200 },
            { id: 2, name: "Phone", price: 800 },
            { id: 3, name: "Tablet", price: 500 },
            { id: 4, name: "Desktop", price: 700 }
         ];
         const threshold = 1200;
         const expected = { id: 1, name: "Laptop", price: 1200 };
        expect(expected.findExpensiveProducts(threshold)).toBe(products[0]);
    });

    // please my last file(this) is not yet working as intended 
    // i wll push the right one once done thanks