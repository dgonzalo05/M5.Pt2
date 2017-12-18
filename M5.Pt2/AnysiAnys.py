# encoding: utf-8
# Programa que al introduïr el nom, l'edat, i l'any actual et diu quan vas nàixer, quants anys vas tenir a cada any fins ara, i es despedeix.
nom = str(raw_input("Com et dius? "))
edat = int(input("Quants anys tens? "))
anys = int(input("Quin any és? "))
anys = anys - edat
print "El",anys,"va nàixer"
anys+=1
for i in range(1,edat,1):
	print "El",anys,"tenia",i,"anys"
	anys+=1
print "Adéu",nom
