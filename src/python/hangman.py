
def pularLinha(linhas):
    for i in range(linhas):
        print("")


frase = input("Digite sua palavra: ")
while not frase.isalpha():
    frase = input("Mano, sem numeros. Apenas palavras. Tente novamente: ")
pularLinha(10)

iniciar = "Iniciando"
iniciar= iniciar.center(50,"-")

print(iniciar)

acertou = False
letrasDescobertas=" "
vidas = 5
comprimento = len(frase)

while not acertou:
    contador = 0
    for letra in frase:
        if letra.casefold() in letrasDescobertas:
            print(letra, end="")
            contador += 1
            
        else:
            print("_", end="")

    if contador == comprimento:
        acertou = True
        break

    print("\n")
    tentativa = input("Digite uma letra: ").casefold()

    if tentativa in frase.casefold():
        letrasDescobertas += tentativa
        
        
    else:
        vidas -= 1
        print("Você errou!", "Vidas Restantes: " + str(vidas))
        if vidas < 0:
            break

pularLinha(2)

if acertou:
    print("Parabéns, você ganhou!", "Palavra: " + frase)
else:
    print("Boooo, você perdeu!", "Palavra: " + frase)


    
    