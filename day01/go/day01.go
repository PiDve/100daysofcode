package main

import "fmt"

func calcYear(year int) int {
	year = year * 365
	return year
}

func main() {
	year := 0
	fmt.Println("Digite o ano")
	fmt.Scanln(&year)
	fmt.Println("Ano: ", year, " Dias:", calcYear(year))

}

// go run day01.go
