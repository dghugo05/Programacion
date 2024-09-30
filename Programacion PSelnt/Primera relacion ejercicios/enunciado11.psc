Algoritmo zapatos
	definir numero Como Real
	escribir "Cuántos zapatos desea encargar"
	leer num_z
	num_z = num_z
	precio = num_z*80
	si num_z >= 10 y num_z < 20 Entonces
		precio = precio - ((precio * 10) / 100)
		escribir "El precio total es de ", precio
	FinSi
	si num_z >= 20 y num_z < 30 Entonces
		precio = precio - ((precio * 20) / 100)
		escribir "El precio total es de ", precio
	FinSi
	si num_z > 30 Entonces
		precio = precio - ((precio * 40) / 100)
		escribir "El precio total es de", precio
	FinSi
FinAlgoritmo
