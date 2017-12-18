# encoding: utf-8
# programa que obté el descompte en quantitat i en percentatge aplicat al preu original i pagat de l'usuari
original = float(input("Introdueix el preu original: "))
pagat = float(input("Introdueix el preu pagat: "))
descompte = original - pagat
percentatge = (descompte / original) * 100
if original > pagat:
    print "El descompte en quantitat és:",descompte,"€","\nI el percentatge és:",int(percentatge),"%"
else:
    print "T'han pres el pel"
