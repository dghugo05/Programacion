Algoritmo primo
	definir num Como Entero
	Escribir "Introduzca un número"
	leer numero
	num = numero
	divisor = 2
	Mientras num % divisor <> 0 y divisor <= num/2 Hacer
		divisor = divisor+1
	Fin Mientras
FinAlgoritmo
