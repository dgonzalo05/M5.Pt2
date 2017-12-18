# encoding: utf-8
# Programa que demana el nom i la nota de 10 alumnes. Mostra la mitjana de les notes i la pitjor nota. A més a més, pregunta si vol finalitzar, i si respon "s" s'acaba.
mitja = 0.0
pitjor = 11
desitja = "s"
for i in range(0,10,1):
	nom = str(raw_input("Introdueix nom de l'alumne: "))
	nota = int(input("Introdueix la seva nota: "))
	mitja = mitja+nota
	if nota < pitjor:
		pitjor = nota
		nomp = nom
	desitja = str(raw_input("Desitja finalitzar (s/n)"))
	if desitja == "s":
		print "Adéu"
		break
print "la mitja de totes les notes és:",mitja/10
print "l'alumne amb la pitjor nota és:",nomp,"amb un",pitjor
