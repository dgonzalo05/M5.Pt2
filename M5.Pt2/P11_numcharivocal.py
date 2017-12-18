# encoding: utf-8
# Programa que demana un string. Després et mostra el nombre caràcters i vocals que hi ha
st = raw_input("Escriu alguna cosa: ")
vocal = 0
for i in range (len(st)):
	if st[i] == 'a' or st[i] == 'e' or st[i] == 'i' or st[i] == 'o' or st[i] == 'u':
		vocal+=1
print "Hi ha ",len(st)," caràcters i ",vocal," vocals"
