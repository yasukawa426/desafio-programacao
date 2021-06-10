#Esse programa conta o numero de palavras em uma frase

frase = input("Digite uma frase e eu contarei o número de palavras: ")
numeroPalavras = 0;

for palavras in frase.split(" "):
    numeroPalavras += 1

print(f"Sua frase contem {numeroPalavras} palavras!")