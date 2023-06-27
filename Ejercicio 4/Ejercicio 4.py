#1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
#Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

numeroIf= int(input("Dime un número "))
if numeroIf <0:
    print ("este número es negativo")
elif numeroIf >0:
    print(" Este número es positivo")
else:
    print("Este número es cero")

#2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
#Incrementar el valor de la variable en uno cada vez que se ejecute.
#Mostrarlo por pantalla cada vez que se ejecute.

numeroWhile= 0

while numeroWhile <3:
    numeroWhile= numeroWhile+1
    print(numeroWhile)

#3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

numeroDoWhile = 0

while True:
    numeroDoWhile= numeroDoWhile +1
    print(numeroDoWhile)
    
    if numeroDoWhile >= 3:
        break 

#4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

for numeroFor in range(4):
    print(numeroFor)    