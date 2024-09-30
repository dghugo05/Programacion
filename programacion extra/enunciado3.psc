Algoritmo comundivisor
	definir a,b Como Entero
	escribir "Introduzca un número: "
	leer a
	a = a
	Escribir "Introduzca otro número: "
	leer b
	b = b
	si a < 0 o b < 0 Entonces
		Escribir "Los números introducidos deben ser positivos."
	sino 
		para calculo <- 1 hasta a Con Paso 1 Hacer
			si a % calculo = 0 y b % calculo = 0 Entonces
				mcd = calculo
			FinSi
		FinPara
	FinSi
	Escribir "El máximo comun divisor de ", a, " y ", b, " es ", mcd 
	
FinAlgoritmo
