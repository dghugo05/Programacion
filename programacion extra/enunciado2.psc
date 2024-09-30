Algoritmo primos_complicados
	definir a,b Como Entero
	escribir "Introduzca un número entero."
	leer a
	a = a
	Escribir  "Introduzca otro número entero"
	leer b 
	b = b
	contador = 0
	si a < 0 o b < 0 Entonces
		Escribir "Los número introducidos deben ser positivos."
	SiNo
		si a > b Entonces
			mientras b <= a Hacer
				Para rango <- 1 Hasta a con paso 1 Hacer
					si b % rango = 0 Entonces
						contador = contador + 1
					FinSi
				FinPara
				si contador <= 2 Entonces
					escribir b
				FinSi
				b = b + 1
				contador = 0
			FinMientras
			
		SiNo
			Mientras a <= b Hacer
				Para rango <- 1 hasta b Con Paso 1 Hacer
					si a % rango = 0 Entonces
						contador = contador + 1
					FinSi
				FinPara
				si contador <= 2 Entonces
					escribir a
				FinSi
				a = a + 1
				contador = 0
			FinMientras
		FinSi
	FinSi
	
	
FinAlgoritmo
