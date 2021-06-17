from datetime import date
# esse programa transforma a sua idade em segundos

def eBissexto( ano):
    if (ano % 4) == 0:
        if (ano % 100) == 0:
            if (ano % 400) == 0:
                return True
        else:
            return True
    return False

# constantes
SEGUNDOS_DIA = 86400
SEGUNDOS_ANO = 31556926

idade = int(input("Digite sua idade em anos ou digite o seu ano de nascimento: "))

# significa q o usuario digitou o ano de nascimento
if idade > 1000:
    # pega o ano de hj
    hoje = date.today()
    hoje = hoje.year

    # pega quantos anos a pessoa tem
    idade = hoje - idade

    # transforam em segundos
    idade = idade * SEGUNDOS_ANO


    # se for um ano bissexto, tem ano/4 dias a mais
    diasMais = 0 
    if eBissexto(hoje):
        diasMais = hoje / 4
        
        # transforma em segundos
        diasMais = diasMais * SEGUNDOS_DIA
    else:
        # acha o ano bissexto mais proximo e ent calcula os dias a mais
        while not eBissexto(hoje):
            hoje -= 1 
        
        diasMais = hoje / 4
        
        # transforma em segundos
        diasMais = diasMais * SEGUNDOS_DIA
        
    # adiciona na idade
    idade += diasMais

    print(f"Sua idade em segundos é: {idade} segundos")


# digitou a idade
else:
    # print("salve")

    # transforma em segundos
    idade = idade * SEGUNDOS_ANO
    print(f"Sua idade em segundos é: {idade} segundos")


