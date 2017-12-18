# encoding: utf-8
#Programa que demana 3 strings i els torna amb la inicial en majúscula i la resta en minúscules

nom = raw_input("Escriu el teu nom complet ")
text = ""
con = 0
for i in range (len(nom)):
	if i == 0 or  ' ' == nom[i-1]:
		text += nom[i].upper()
	else:
		text += nom[i].lower()
print text

