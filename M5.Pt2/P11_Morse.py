# encoding: utf-8
#Programa que demana un text i el torna en format morse
text = raw_input("Introdueix un text ").lower()
morse = [["a","·-"],["b","-···"],["c","-·-·"],["d","-··"],["e","·"],["f","··-·"],
		["g","--·"],["h","····"],["i","··"],["j","·---"],["k","-·-"],["l","·-··"],
		["m","--"],["n","-·"],["o","---"],["p","·--·"],["q","--·-"],["r","·-·"],
		["s","···"],["t","-"],["u","··-"],["v","···-"],["w","·--"],["x","-··-"],
		["y","-·--"],["z","--··"],["1","·----"],["2","··---"],["3","···--"],
		["4","····-"],["5","·····"],["6","-····"],["7","--···"],["8","---··"],
		["9","----·"],["0","-----"]]
resultat = ""
for i in range(len(text)):
	for o in range(len(morse)):
		if morse[o][0] == text[i]:
			resultat += morse[o][1] + " "
print resultat

