# encoding: utf-8
# programa que mostra un missatge si l’edat es igual o major a 18
nom = str(raw_input("Introdueix el teu nom: "))
edat = int(input("Introdueix la teva edat: "))
if edat >= 18:
	print "Vostè ja pot anar a la presó!"
print "Adéu",nom,"!"
