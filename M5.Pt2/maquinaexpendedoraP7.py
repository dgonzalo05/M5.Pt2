# encoding: utf-8
# programa que simula una màquina expenedora de monedes. Una quantitat introduïda de diners per l'usuari es mostra en el mínim nombre de bitllets i monedes possibles en cas de que no sigui 0
diners = int(input("Introdueix un número de diners :"))
m500 = diners / 500
diners = diners - 500 * m500
if m500 > 0:
	print m500,"bitllets de 500"
m200 = diners / 200
diners = diners - 200 * m200
if m200 > 0:
	print m200,"bitllets de 200"
m100 = diners / 100
diners = diners - 100 *m100
if m100 > 0:
	print m100,"bitllets de 100"
m50 = diners / 50
diners = diners - 50 *m50
if m50 > 0:
	print m50,"bitllets de 50"
m20 = diners / 20
diners = diners - 20 *m20
if m20 > 0:
	print m20,"bitllets de 20"
m10 = diners / 10
diners = diners - 10 *m10
if m10 > 0:
	print m10,"bitllets de 10"
m5 = diners / 5
diners = diners - 5 *m5
if m5 > 0:
	print m5,"bitllets de 5"
m2 = diners / 2
diners = diners - 2 *m2
if m2 > 0:
	print m2,"monedes de 2"
m1 = diners / 1
diners = diners - 1 *m1
if m1 > 0:
	print m1,"monedes de 1"
