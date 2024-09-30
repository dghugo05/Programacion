Algoritmo raise
	definir numero Como Logico
	escribir "Escriba su sueldo"
	leer num
	sueldo = num
	si num > 500000 entonces
		num_1 = (num*12)/100
		num_1 = num_1 + num
		Escribir "Este será su nuevo sueldo ", num_1
	sino num_1 = (num*15)/100
		num_1 = num_1 + num
		escribir "Este será su nuevo sueldo ", num_1
	FinSi
FinAlgoritmo
