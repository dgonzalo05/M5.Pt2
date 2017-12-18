# encoding: utf-8
# Programa que mostra els nombres introduïts de menor valor a major
primer = int(input("Escriu el primer número: "))
segon = int(input("Escriu el segon número: "))
tercer = int(input("Escriu el tercer número: "))
if primer > segon and primer > tercer:
	if segon > tercer:
		print tercer,segon,primer
	else:
		print segon,tercer,primer
elif segon > primer and segon > tercer:
	if tercer > primer:
		print primer,tercer,segon
	else:
		print tercer,primer,segon
if tercer > segon and tercer > primer:
	if segon > primer:
		print primer,segon,tercer
	else:
		print segon,primer,tercer
