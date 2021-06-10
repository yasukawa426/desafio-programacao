from spellchecker import SpellChecker
import pprint
import string
#Esse programa conta o numero de palavras, paragrafos, orações e erros de digitação em sua frase

# frase = input("Digite uma frase e eu contarei o número de palavras: ")
frase = """Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth.

Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way.

When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word "and" and the Little Blind Text should turn around and return to its own, safe country. But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their projects again and again. And if she hasn’t been rewritten, then they are still using her. Far far away, behind the word mountains, far from the countries Vokalia and
"""
# frase = """O joão foir la. Ta bom neh kakakaka. kekw.
# 
# comer pao. Mas ta neh. okkkkkkkkk"""
numeroPalavras = 0;
numeroParagrafos = 0;
numeroFrase = 0;
numeroTypos = 0;

palavrasErradas = {}
spell = SpellChecker(distance=1)

for paragrafo in frase.splitlines():
    if paragrafo == '':
        continue
    
    # é um paragrafo
    else: 
        numeroParagrafos += 1

        # é uma palavra
        for palavra in paragrafo.split(" "):
            numeroPalavras += 1

            #checando se ta td certo
            palavraCorrigir = (palavra.translate(str.maketrans('', '', string.punctuation + '’'))).casefold()
            palavraCorreta = (spell.correction(palavra.casefold())).translate(str.maketrans('', '', string.punctuation + '’'))
            if palavraCorrigir != palavraCorreta:
                numeroTypos += 1
                #cria uma chave no dicionario com palavraErrada: correção
                palavrasErradas[palavraCorrigir] = palavraCorreta
        # é uma frase
        for frasE in paragrafo.split("."):
            if frasE != "":
                # print(frasE)
                numeroFrase += 1
    

# print(frase.split("."))
print(f"Sua frase contem {numeroPalavras} palavras!")
print(f"Sua frase contem {numeroParagrafos} paragrafos!")
print(f"Sua frase contem {numeroFrase} orações!")
print(f"Sua frase contem {numeroTypos} erros de digitação!")
if numeroTypos >= 1:
    print("Palavras erradas: ")
    pprint.pprint(palavrasErradas)