Algoritmo cuadrado
	definir altura, ancho, asterisco, espacio Como Entero
	escribir "De que altura quiere el cuadrado"
	leer altura
	Para fila <- 1 Hasta altura Con Paso 1 Hacer
		si fila < 2 o fila = altura Entonces
			Para asterisco <- 1 Hasta altura Con Paso 1 Hacer
				Escribir "*" Sin Saltar 
			FinPara
		SiNo
			Escribir "*" Sin Saltar
			para espacio <- 1 hasta altura-2 Con Paso 1 Hacer
				Escribir " " Sin Saltar
			FinPara
			Escribir "*" Sin Saltar
		finsi
	escribir ""//
	Fin Para
FinAlgoritmo
