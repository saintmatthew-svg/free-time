const {sumArray,getAllValues,swapCoordinates,filterUnrepeatedWords,findNestedKey,getKeysAndValues,getTopPerformers} = require('./SweetCoffee.js');

test('test sumArray adds numbers correctly', () => {
    expect(sumArray([1, 2, 3])).toBe(6);
    expect(sumArray([])).toBe(0);
  });

  test('test getAllValues extracts all values', () => {
    expect(getAllValues([{a: 1}, {b: 2}])).toEqual([1, 2]);
  });

  test('test swapCoordinates swaps x and y', () => {
    expect(swapCoordinates({x: 5, y: 10})).toEqual({x: 10, y: 5});
  });

  test('test filterUnrepeatedWords filters correctly', () => {
    expect(filterUnrepeatedWords("hello world hello")).toEqual(["world"]);
  });

  test('test findNestedKey finds nested keys', () => {
    const nestedObj = { a: 1, b: { c: 2, d: { e: 3 } } };
    expect(findNestedKey(nestedObj, 'e')).toBe(3);
    expect(findNestedKey(nestedObj, 'a')).toBe(1);
    expect(findNestedKey(nestedObj, 'c')).toBe(2);
  });
  test('test getKeysAndValues return keys and value pairs', () => {
    const obj = {name: "sam", name2: "john"};
    expect(getKeysAndValues(obj)).toEqual([["name", "sam"], ["name2", "john"]]);
  });
  
  test('returns names of users who scored above 80 in both subjects', () => {
    const testData = {
      user1: { name: "Tom", scores: { math: 70, english: 80 } },
      user2: { name: "Jerry", scores: { math: 90, english: 60 } },
      user3: { name: "Spike", scores: { math: 85, english: 88 } }
    };
    expect(getTopPerformers(testData)).toEqual(["Spike"]);
  });

console.log("All tests passed!");