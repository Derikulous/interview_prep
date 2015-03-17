var fs = require('fs');
// var array = ["Chris", "NotChris", "", " ", "?", "Your Mom", " fuck"]
var array = fs.readFileSync("/usr/share/dict/words", "utf8").split("\n")
var displayArray = ["A", "C", "N", "S"]
var countArray = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];

function shouldShow(letter){
  for(var i = 0; i < displayArray.length; i++){
    var letterFromDisplayArray = displayArray[i].charAt(0).toUpperCase();
    if(letter == letterFromDisplayArray){
      return true;
    }
  }
  return false;
}

function getFirstLetter(c){
  var ci = c.charCodeAt(0);
  var idx = ci - 65;
  countArray[idx]++
}

function printFirstLetterArray(){
  for(var i = 0; i < countArray.length; i++){
    var letter = String.fromCharCode(i+65);
    if (shouldShow(letter)){
      var howMany = countArray[i];
      if(howMany > 0){
        console.log(letter, ":", howMany)
      }
    }
  }
}

for(var i = 0; i < array.length; i++){
  var firstLetter = array[i].charAt(0).toUpperCase();
  getFirstLetter(firstLetter);
}

printFirstLetterArray();
