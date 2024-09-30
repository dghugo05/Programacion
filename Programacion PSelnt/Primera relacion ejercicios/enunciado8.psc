Algoritmo calculo
	definir numero Como Entero
	escribir"Introduzca un número"
	leer numero
	num = numero
	si num mod 5 = 0  Entonces
		num = num
		si num mod 10 = 0 Entonces
			escribir "Su número no contiene 5"
		sino escribir "Su número contiene 5"
			num = num
		FinSi
	FinSi
	si num >= 0 Entonces
		escribir "Su número es positivo"
	sino escribir "Su número es negativo"
	FinSi
	
FinAlgoritmo
