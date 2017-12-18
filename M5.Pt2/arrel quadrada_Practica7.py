# encoding: utf-8
# Programa que retorna l'arrel quadrada d'un número sencer positiu introduït
import math
num = int(input("Introdueix un número positiu: "))
while (num < 0):
	print "el nombre introduït no és positiu."
	num = int(input("Introdueix un número positiu: "))
print "L'arrel quadrada és: ", math.sqrt(num)
