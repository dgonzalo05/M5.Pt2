# encoding: utf-8
# programa que pide un mes y un año y te devuelve el mes anterior y el mes siguiente
mes = int(input("Escriu un mes :"))
anys = int(input("Escriu l'any :"))
if mes > 0 and mes < 12:
	print str(mes -1)+"/"+str(anys)
	print str(mes +1)+"/"+str(anys)
elif mes == 12:
	print str(mes -1)+"/"+str(anys)
	anys = anys +1
	print "1/"+str(anys)
else:
	print "Error, no existeix aquesta dada escrita"
