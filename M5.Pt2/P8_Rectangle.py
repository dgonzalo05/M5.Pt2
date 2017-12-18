# encoding: utf-8
# Programa que demana dos enters positius més gran que 0 i dibuixa un rectangle amb els nombres fins del 1 fins el valor de l'entrada el cop de vegades del segon nombre.
valor = int(input("Introdueix un número: "))
segon = int(input("Introdueix un segon número: "))
for i in range(0,segon,1):
    print " "
    for o in range(1,valor+1,1):
        print o,
