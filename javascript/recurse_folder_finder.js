var fs = require('fs');

function printFileOrDirectory(filename, tabwidth) {
  // console.log("I'm being called with", filename);
  console.log(Array(tabwidth).join(" "), filename, tabwidth);

  var fileDescriptor = fs.openSync(filename, 'r')
  var stat = fs.fstatSync(fileDescriptor)

  fs.closeSync(fileDescriptor);

  if(stat.isFile() == true){
    return;
  }

  var parentFolder = filename;
  var childrenFolder = fs.readdirSync(parentFolder);

  //recursive case
  for(var i = 0; i < childrenFolder.length; i++) {
    var childName = childrenFolder[i];
    var fullPath = parentFolder + "/" + childName;
    printFileOrDirectory(fullPath, tabwidth+1)
  }
}

printFileOrDirectory("Documents/Geosciences", 0);

// var fs = require('fs');

// function printFileOrFolder(filename, tabwidth, folderCount) {
//   console.log(tabwidth + filename + " " + folderCount);
//   folderCount++
//   // find a file type and check if it is a directory or a file
//   var typeOfFile = fs.statSync(filename);
//   var isFile = typeOfFile.isFile(filename);

//   if(isFile == true){
//     return;
//   }

//   var parentDir = filename;
//   var childrenFolder = fs.readdirSync(parentDir);

//   for (var i = 0; i < childrenFolder.length; i++){
//     var childList = childrenFolder[i];
//     var fullPath = filename + "/" + childList;
//     printFileOrFolder(fullPath, tabwidth+" ", folderCount)
//   }
// }

// printFileOrFolder("Documents/Geosciences", "", 0)
