Algoritmo calcula
	definir num1, num2 Como entero
	escribir "Ingrese un primer n�mero"
	leer numero
	num1=numero
	escribir "Ingrese un segundo n�mero"
	leer numero
	num2=numero
	escribir "Seleccione una operaci�n"
	Escribir "1. Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicai�n"
	Escribir "4. Divisi�n"
	leer operacion
	oper=operacion
	si operacion = "1" Entonces
		resultado= num1 + num2
		Escribir "La suma es: ", resultado
	FinSi
	si operacion = "2" Entonces
		resultado= num1 - num2
		Escribir "La resta es: ", resultado
	FinSi
	si operacion = "3" Entonces
		resultado= num1 * num2
		Escribir "La multiplicaci�n es: ", resultado
	FinSi
	si operacion = "4" Entonces
		resultado= num1 / num2
		Escribir "La divisi�n es: ", resultado
	FinSi
FinAlgoritmo
