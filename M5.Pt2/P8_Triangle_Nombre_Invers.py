#encoding: utf-8
#Programa que demana un nombre positiu més gran que 0 i mostra línia a línia del 1 fins al número introduït fent un triangle.
valor = int(input("Introdueix un valor: "))
print " "
for i in range (valor,0,-1):
	for o in range(1,i+1,1):
		print o,
	print " "
