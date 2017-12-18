# encoding: utf-8
# Et mostra els € que et falten per pagar o els que tens que tornar
preu = float(input("Introdueix el preu: "))
pagat = float(input("Introdueix el que has pagat: "))
if preu > pagat:
    print "Falten:",(preu-pagat),"€"
else:
    print "Sobren",(pagat-preu),"€"
