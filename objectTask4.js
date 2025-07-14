
//(6)

function findProducts(threshold, callBackFunction){
    return callBackFunction(threshold);
};

const products = [
    { id: 1, name: "Laptop", price: 1200 },
    { id: 2, name: "Phone", price: 800 },
    { id: 3, name: "Tablet", price: 500 },
    { id: 4, name: "Desktop", price: 700 }
 ];

 function findExpensiveProducts(threshold){
    let file = [];
    for(const count in products){
        if(threshold < products[count].price){
            file.push(`name: ${products[count].name}, price: ${products[count].price}`);
         };
         return file;
    };
};    

findExpensiveProducts(products);

module.exports = { findProducts, findExpensiveProducts };


    // please my last file(this) is not yet working as intended 
    // i wll push the right one once done thanks