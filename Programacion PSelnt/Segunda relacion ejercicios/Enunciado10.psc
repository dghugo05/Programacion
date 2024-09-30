Algoritmo primo
	definir num Como Entero
	Escribir "Introduzca un número"
	leer numero
	para prim <- 1 Hasta numero Con Paso 1 Hacer
		si numero % prim = 0 Entonces
			contador = contador + 1
		FinSi
	FinPara
	si contador <> 2 Entonces
		Escribir numero, " El número no es primo"
	sino 
		escribir numero, " El número es primo"
	FinSi
FinAlgoritmo
