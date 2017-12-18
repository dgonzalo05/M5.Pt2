#encoding: utf-8
#Programa que demana un nombre positiu més gran que 0 i mostra línia a línia els número introduït a l’1 fent un triangle.
valor = int(input("Introdueix un valor: "))
print " "
for i in range (1,valor+1,1):
    for o in range(i,0,-1):
        print o,
    print " "
