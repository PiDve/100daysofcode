// deno run day01.js

var year = prompt("Digite o ano: ")
function calcYear(year){
    return year*365
}
var days = calcYear(year)
console.log("Days: ", days);

