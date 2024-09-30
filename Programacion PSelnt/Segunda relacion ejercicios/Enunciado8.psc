Algoritmo Piramide_nvertida
	Definir num, i Como Entero
	Escribir "Introduzca la altura de la pirámide: "
	leer altura
	Para fila <- altura Hasta 1 Con Paso -1 Hacer
		Para espacios <- fila hasta altura -1 Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		Para asteriscos <- 1 hasta 2*fila-1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
		Fin Para
FinAlgoritmo
