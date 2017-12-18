# encoding: utf-8
# programa que pide un mes y un año y te devuelve el mes anterior y el mes siguiente + validación condicional
mes = int(input("Escriu un mes :"))
anys = int(input("Escriu l'any :"))
valid = True
while valid:
	if mes > 0 and mes < 12:
		print str(mes -1)+"/"+str(anys)
		print str(mes +1)+"/"+str(anys)
		valid = False
	elif mes == 12:
		print str(mes -1)+"/"+str(anys)
		anys = anys +1
		print "1/"+str(anys)
		valid = False
	else:
		mes = int(input("Has escrit un mes incorrecte, torna a probar (1-12): "))
