# encoding: utf-8
# Demana un color, o verd, o groc o vermell. Segons el color introduït, el programa respon una cosa o altre
color = str(raw_input("De quin color està el semàfor? verd, groc o vermell: "))
if color == "vermell":
	print "Espera a que canvii de color"
elif color == "groc":
	print "Run forrest run!"
elif color == "verd":
	print"Pots passar sense cap problema."
else:
	print "Això no és un color del semàfor..."
