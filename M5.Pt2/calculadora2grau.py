#encoding: utf-8
#Programa que sol·luciona equacions de segon grau
import math
A = float(raw_input("Introdueix el coeficient A: "))
B = float(raw_input("Introdueix el coeficient B: "))
C = float(raw_input("Introdueix el coeficient C: "))
if A == 0:
	print "Error a la divisió"
else:
	aux=B**2-4*A*C
if aux<0:
	print "Sol·lució imaginària"
else:  #aux>=0
	print "Primera sol·lució",(-B+math.sqrt(aux))/(2*A)
	print "Segona sol·lució",(-B-math.sqrt(aux))/(2*A)
