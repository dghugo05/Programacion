Algoritmo factor
	definir numero Como Real
	escribir "Que número desea factorizar"
	leer numero
	num = numero
	fact = 1
	Para i<-num Hasta 2 Con Paso -1 Hacer
		fact = fact * i
		escribir fact
	Fin Para
FinAlgoritmo
