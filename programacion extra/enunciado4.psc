Algoritmo collatz
	definir numero Como Entero
	Escribir "Introduzca un n�mero: "
	leer num
	si num < 0 Entonces
		Escribir "El n�mero introducido debe ser positivo"
	sino 
		mientras num <> 1 Hacer
			si num % 2 = 0 Entonces
				escribir num
				num = num/2
			sino 
				escribir num
				num = (num * 3) + 1
			FinSi
		FinMientras
		Escribir num
	FinSi
FinAlgoritmo
