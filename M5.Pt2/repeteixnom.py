# encoding: utf-8
# Programa que demana un nom i un número, i amb aquestes dades mostra el nom tantes vegades com el número que s'hagi introduït.
nom = str(raw_input("Introdueix el teu nom: "))
num = int(input("Introdueix un número: "))
for nom1 in range(num):
	print nom,
