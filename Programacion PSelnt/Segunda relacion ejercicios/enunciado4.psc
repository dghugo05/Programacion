Algoritmo med
	definir numero Como Real
	escribir "Introduce n�mero de datos deseados"
	leer numero
	num = numero
	contador = 0
	suma = 0
	Repetir
		Escribir "Escriba el n�mero que desea introducir a la media"
		leer num_m
		suma = suma + num_m
		contador = contador + 1
	Hasta Que contador >= num
	media = suma / num
	escribir "La media es : ", media
FinAlgoritmo
