Algoritmo romboAlt
	definir num Como Entero
	Escribir "Escriba la altura del rombo: "
	leer altura
	altura = altura
	fila = 1
	contador = altura
	si altura < 0 Entonces
		Escribir "Los número introducidos deben ser positivos"
	SiNo
		Mientras altura <> 0 Hacer
			si fila <= altura Entonces
				para espacio <- fila hasta altura - 1 Con Paso 1 Hacer
					escribir " "Sin Saltar
				FinPara
				para asterisco <- 1 hasta 2*fila-1 Con Paso 1 Hacer
					escribir "*"sin saltar
				FinPara
				escribir ""
				fila = fila + 1
			SiNo
				fila = altura
				Para espacios <- fila hasta contador Con Paso 1 Hacer
					Escribir " " Sin Saltar
				FinPara
				Para asteriscos <- 3 hasta 2*fila-1 Con Paso 1 Hacer
					Escribir "*" Sin Saltar
				FinPara
				escribir ""
				altura = altura - 1
			FinSi
		FinMientras
	FinSi
	
FinAlgoritmo
