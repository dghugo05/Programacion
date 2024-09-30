Algoritmo fibonacci
	definir numero como entero
	escribir "¿Cuántos números quiere de la secuencia de fibonacci?"
	leer numero
	num = numero
	contador = 0
	fib = 1
	fib_1 = 0
	Repetir
		escribir fib_1
		fib_1 = fib_1 +fib
		escribir fib
		fib = fib + fib_1
		
		contador = contador + 1
	Hasta Que contador >= num
FinAlgoritmo
