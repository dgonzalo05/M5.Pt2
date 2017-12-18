# encoding: utf-8
# Programa que demana dos strings i respón si el segon està inclòs dins del primer
text = raw_input("Escriu una paraula: ")
seg = raw_input("Escriu la segona: ")

if seg in text:
	print "El substring '",seg,"' apareix a ",text
else:
	print "El substring '",seg,"' no apareix a ",text
