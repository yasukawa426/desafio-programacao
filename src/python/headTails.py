import random

def testarProbabilidade(vezes):
    resultadosPossiveiss =["cara","cara","coroa","coroa","meio"]
    cara = 0
    coroa = 0
    meio = 0
    for i in range(vezes):
        caiu = random.choice(resultadosPossiveiss)
        if caiu == "cara":
            cara += 1
        elif caiu == "coroa":
            coroa += 1
        else:
            meio += 1

    print("Cara: ", cara)
    print("Coroa: ", coroa)
    print( "Meio: ", meio)

escolha = input("Cara ou coroa? ").casefold()

#                           49%            49%        2%
resultadosPossiveis =["cara","cara","coroa","coroa","meio"]

resultado = random.choice(resultadosPossiveis)
if escolha == resultado:
    print("Boaa, caiu " + resultado)
else:
    print("Foi mal mano, caiu " + resultado)

