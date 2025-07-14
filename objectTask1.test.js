const { bankAccount } = require("./objectTask1.js");

describe('Bank Account', () => {
  beforeEach(() => {
    bankAccount.balance = 500;
  });

  test('deposit increases balance', () => {
    expect(bankAccount.depositAmount(200)).toBe(700);
    expect(bankAccount.balance).toBe(700);
  });

  test('withdraw decreases balance when enough funds', () => {
    bankAccount.depositAmount(200); 
    expect(bankAccount.withdrawAmount(300)).toBe('300 withdrawal successful');
    expect(bankAccount.balance).toBe(400);
  });

  test('cannot withdraw more than balance', () => {
    expect(bankAccount.withdrawAmount(600)).toBe('600 is more than available balance');
    expect(bankAccount.balance).toBe(500); 
  });

  test('can withdraw entire balance', () => {
    expect(bankAccount.withdrawAmount(500)).toBe('500 withdrawal successful');
    expect(bankAccount.balance).toBe(0);
  });
});