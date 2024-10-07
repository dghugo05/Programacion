Algoritmo division
	definir divisor Como Entero
	Escribir "Introduzca un número:"Sin Saltar
	leer divisor
	num_total = 0
	Escribir "Los divisores propios de ", divisor,  " son "Sin Saltar
	Para numero <- 1 hasta divisor/2 Con Paso 1 Hacer
		Si numero = divisor/2 Entonces
			Escribir numero, " "Sin Saltar
			num_total = numero + num_total
		SiNo
			Si divisor % numero = 0 Entonces
				num_total = num_total + numero
				Escribir numero, ", "Sin Saltar
			FinSi
		FinSi
		
	FinPara
		Escribir "y la suma de los mismos es ", num_total
FinAlgoritmo
