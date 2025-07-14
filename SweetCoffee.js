function sumArray(numbers) {
    let sum = 0;
    for (const number of numbers) {
      sum += number;
    }
    return sum;
  }

  function getAllValues(arrayOfObjects) {
    const allValues = [];
    for (const obj of arrayOfObjects) {
      for (const value of Object.values(obj)) {
        allValues.push(value);
      }
    }
    return allValues;
  }

  function swapCoordinates(point) {
    const { x, y, ...rest } = point;
    return { ...rest, x: y, y: x };
  }

const person = { name: "John", age: 30, city: "London", country: "UK" };
const { name, age, city } = person;
console.log(name , age, city);

function filterUnrepeatedWords(sentence) {
    const words = sentence.split(' ');
    const unrepeatedWord = [];
    for (const word of words) {
      if (words.indexOf(word) === words.lastIndexOf(word)) {
        unrepeatedWord.push(word);
      }
    }
    
    return unrepeatedWord;
  }

  function findNestedKey(obj, key) {
    if (obj.hasOwnProperty(key)) {
      return obj[key];
    }
    for (const check in obj) {
      if (typeof obj[check] === 'object' && obj[check] !== null) {
        const result = findNestedKey(obj[check], key);
        if (result !== undefined) {
          return result;
        }
      }
    }
    return undefined;
  }

  function getKeysAndValues(obj) {
    return Object.entries(obj);
  }

  function getTopPerformers(users) {
    return Object.values(users)
      .filter(user => 
        user.scores.math > 80 && 
        user.scores.english > 80
      )
      .map(user => user.name);
  }
  

  module.exports = {sumArray,
  getAllValues,
  swapCoordinates,
  filterUnrepeatedWords,
  findNestedKey,
  getKeysAndValues,
  getTopPerformers};