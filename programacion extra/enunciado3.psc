Algoritmo comundivisor
	definir a,b Como Entero
	escribir "Introduzca un n�mero: "
	leer a
	a = a
	Escribir "Introduzca otro n�mero: "
	leer b
	b = b
	si a < 0 o b < 0 Entonces
		Escribir "Los n�meros introducidos deben ser positivos."
	sino 
		para calculo <- 1 hasta a Con Paso 1 Hacer
			si a % calculo = 0 y b % calculo = 0 Entonces
				mcd = calculo
			FinSi
		FinPara
	FinSi
	Escribir "El m�ximo comun divisor de ", a, " y ", b, " es ", mcd 
	
FinAlgoritmo
