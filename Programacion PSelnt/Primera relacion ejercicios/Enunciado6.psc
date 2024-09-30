Algoritmo calcula
	definir num1, num2 Como entero
	escribir "Ingrese un primer número"
	leer numero
	num1=numero
	escribir "Ingrese un segundo número"
	leer numero
	num2=numero
	escribir "Seleccione una operación"
	Escribir "1. Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicaión"
	Escribir "4. División"
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
		Escribir "La multiplicación es: ", resultado
	FinSi
	si operacion = "4" Entonces
		resultado= num1 / num2
		Escribir "La división es: ", resultado
	FinSi
FinAlgoritmo
