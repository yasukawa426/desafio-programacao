from datetime import date
# esse programa transforma a sua idade em segundos

idade = int(input("Digite sua idade em anos ou digite o seu ano de nascimento: "))

# significa q o usuario digitou o ano de nascimento
if idade > 1000:
    hoje = date.today()
    hoje = hoje.year
    # print("Today's date:", hoje)
    # pega quantos anos a pessoa tem
    idade = hoje - idade
    # transforam e msegundos
    idade = idade * 31556926
    print(f"Sua idade em segundos é {idade}")


# digitou a idade
else:
    # print("salve")

    # transforma em segundos
    idade = idade * 31556926
    print(f"Sua idade em segundos é: {idade}")

