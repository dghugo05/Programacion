Algoritmo calculo
	definir numero Como Entero
	escribir"Introduzca un n�mero"
	leer numero
	num = numero
	si num mod 5 = 0  Entonces
		num = num
		si num mod 10 = 0 Entonces
			escribir "Su n�mero no contiene 5"
		sino escribir "Su n�mero contiene 5"
			num = num
		FinSi
	FinSi
	si num >= 0 Entonces
		escribir "Su n�mero es positivo"
	sino escribir "Su n�mero es negativo"
	FinSi
	
FinAlgoritmo
