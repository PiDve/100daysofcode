import 'dart:io';

int calcYear(int year) {
  return year * 365;
}

main() {
  // int year = 300;
  // print("Qual o ano: ");
  var year = stdin.readLineSync();
  print("Anos 300 em dias: ${calcYear(int.parse(year))}");
}

// dart run day01.dart
