Algoritmo rombo
	definir num Como Entero
	Escribir "Iontroduzca la altura del rombo: "
	leer altura
	si altura < 0 Entonces
		Escribir "Los número introducidos deben ser positivos"
	SiNo
		para fila <- 1 hasta altura con paso 1 Hacer
			para espacio <- fila hasta altura - 1 Con Paso 1 Hacer
				escribir " "Sin Saltar
			FinPara
			para asterisco <- 1 hasta 2*fila-1 Con Paso 1 Hacer
				escribir "*"sin saltar
			FinPara
			escribir ""//
		FinPara
		Para fila <- altura Hasta 1 Con Paso -1 Hacer
			Para espacios <- fila hasta altura Con Paso 1 Hacer
				Escribir " " Sin Saltar
			FinPara
			Para asteriscos <- 3 hasta 2*fila-1 Con Paso 1 Hacer
				Escribir "*" Sin Saltar
			FinPara
			Escribir ""//
		Fin Para
	FinSi
	
FinAlgoritmo
