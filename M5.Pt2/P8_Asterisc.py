# encoding: utf-8
# Programa que demana un nombre positiu més gran que 0 i dibuixa línia a línia un "*" fent un triangle.
valor = int(input("Introdueix un número: "))
for i in range(1,valor+1):
	print ""
	for a in range(i):
		print "*",
