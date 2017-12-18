# encoding: utf-8
# Programa que cerca si un caràcter es troba a o no (a una frase) i el mostra per pantalla.
st = raw_input("Escriu alguna cosa: ")
put = raw_input("Escriu un caràcter: ")
con = 0
while con < len(st):
	if put == st[con]:
		result = "El caràcter '"+put+"' apareix a "+st
		break
	else:
		result = "El caràcter '"+put+"' no apareix a "+st
	con+=1
print result
