Algoritmo primo
	definir num Como Entero
	Escribir "Introduzca un n�mero"
	leer numero
	para prim <- 1 Hasta numero Con Paso 1 Hacer
		si numero % prim = 0 Entonces
			contador = contador + 1
		FinSi
	FinPara
	si contador <> 2 Entonces
		Escribir numero, " El n�mero no es primo"
	sino 
		escribir numero, " El n�mero es primo"
	FinSi
FinAlgoritmo
