# encoding: utf-8
# Un metge virtual que segons la resposta del pacient, li recomana una cosa u altre
tos = str(raw_input("Tens tos?(S/N) "))
edat = int(input("Introdueix la teva edat: "))
esternuts = str(raw_input("Tens esternuts?(S/N) "))
cap = str(raw_input("Tens mal de cap?(S/N) "))
estomac = str(raw_input("Tens problemes d'estómac?(S/N) "))
if tos == "S" and edat < 12:
    print "Et recomano un caramel de mel"
elif tos == "S" and edat > 12:
    print "Et recomano un caramel d'eucaliptus"
if esternuts == "S" and cap == "S" and estomac == "S":
    print "Et recomano un paracetamol"
elif esternuts == "S" and cap == "S" and estomac == "N":
    print "Et recomano prendre àcid acetil salicílic (AAS)"
else:
    print "Et recomano que vinguis a la meva consulta presencial per poder examinar-te"
