Algoritmo tab
	definir numero Como Entero
	escribir "Introduzca el número del que quiera saber la tabla de multiplicar"
	leer numero
	num = numero
	escribir "La tabla de multiplicar de", num 
	multiplo = 1
	Mientras multiplo <=10 Hacer
		Tabla = num * multiplo
		escribir num, "*", multiplo, "=", tabla
		multiplo = multiplo + 1
	Fin Mientras
FinAlgoritmo
