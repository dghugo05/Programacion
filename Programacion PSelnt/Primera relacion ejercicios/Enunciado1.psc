Algoritmo Ficha
	Definir Nombre, Apellido, Sexo Como cadena
	Escribir "Introduzca su Nombre"
	leer Nombre	
	nombre = Nombre
	Escribir "Introduzca sus Apellidos"
	leer Apellidos
	Apellido=Apellidos
	escribir "Introduzca su Sexo"
	leer Sexo
	sexo=Sexo
	Si minusculas(sexo) == "hombre" Entonces
		Escribir "Bienvenido, Sr" + " " + nombre + " " + Apellido
	SiNo
		Escribir "Bienvenido Srt" + " " + nombre + " " + Apellido
	Fin Si
FinAlgoritmo
