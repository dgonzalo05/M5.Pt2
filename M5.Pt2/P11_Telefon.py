# encoding: utf-8
# Programa que demana una paraula i dibuixa una figura amb les lletres del final fins al principi i després les lletres del final s'esborren
text = raw_input("Escriu una paraula: ")
for i in range(len(text), 0, -1):
	conc = ""
	for o in range(len(text)-1, i, -1):
		conc = text[o]+conc;
	print conc

for j in range(len(text),0,-1):
	conc = ""
	for p in range(0,j,1):
		conc += text[p];
	print conc
