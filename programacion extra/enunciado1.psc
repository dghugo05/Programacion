Algoritmo tri�nguloNumeros
    Definir altura, contador, contador2 Como Entero
    Escribir "Introduzca la altura del tri�ngulo:"
    Leer altura
    
    Si altura < 0 Entonces
        Escribir "Por favor escriba un n�mero positivo."
    Sino
        Para contador <- 1 hasta altura hacer
            Para contador2 <- 1 hasta contador hacer
                Escribir contador2 Sin Saltar
            FinPara
            Escribir ""
        FinPara
    FinSi
FinAlgoritmo