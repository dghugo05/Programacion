Algoritmo ordenar
	definir num Como Entero
	escribir "Introduzca 3 numeros"
	leer num1
	leer num2
	leer num3
	num1 = num1
	num2 = num2
	num3 = num3
	si num1 > num2 Entonces
		si num1 > num3 entonces
			si num2 > num3 Entonces
				escribir "Números del más grande al más pequeño: " + num1 + " " + num2 + " " + num3
			sino escribir "Números del más grande al más pequeño: " + num1 + " " num3 + " " num2
			FinSi
			
		FinSi
	FinSi
	
	si num2 > num3 Entonces
		si num2 > num1 Entonces
			si num3 > num2 Entonces
				escribir "Números del más grande al más pequeño: " + num2 + " " num3 + " " num1
			SiNo escribir "Números del más grande al más pequeño: " + num2 + " " num1 + " " num3
				
			FinSi
		FinSi
	FinSi
	si num3 > num1 Entonces
		si num3 > num2 Entonces
			si num1 > num2 Entonces
				escribir "Números del más grande al más pequeño: " + num3 + " " num1 + " " num2
			sino escribir "Números del más grande al más pequeño: " + num3 + " " + num2 + " " + num1
			FinSi
		FinSi
	FinSi
FinAlgoritmo
