//(3)

let  bankAccount = {
    owner: "Alice",
    balance: 500,
    depositAmount: function(deposit){
        this.balance += deposit;
        return this.balance;
    },
    withdrawAmount: function(withdraw){
        if(withdraw > this.balance){
            return `${withdraw} is more than available balance`;
        }else {
            this.balance -= withdraw;
            return `${withdraw} withdrawal successful`;
        }
        
    } 
};

bankAccount.depositAmount();
bankAccount.withdrawAmount();


module.exports = { bankAccount };

