Algoritmo amigo
	definir divisor, divisor2 Como Entero
	Escribir "Introduzca un número:"Sin Saltar
	leer divisor
	Escribir "Introduzca otro número: "Sin Saltar
	leer divisor2
	num_total = 0
	num_total2 = 0
	
	Escribir "Los divisores propios de ", divisor, " son "Sin Saltar
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
	
	Escribir "Los divisores propios de ", divisor2, " son "Sin Saltar
	
	Para numero <- 1 hasta divisor2/2 Con Paso 1 Hacer
		Si numero = divisor2/2 Entonces
			Escribir numero, " "Sin Saltar
			num_total2 = numero + num_total2
		SiNo
			Si divisor2 % numero = 0 Entonces
				num_total2 = num_total2 + numero
				Escribir numero, ", "Sin Saltar
			FinSi
		FinSi
		
	FinPara
	Escribir "y la suma de los mismos es ", num_total2
	
	Si num_total = divisor2 y num_total2 = divisor Entonces
		Escribir "Los dos números si son amigos"
	SiNo
		Escribir "Los dos números no son amigos"
	FinSi
FinAlgoritmo
