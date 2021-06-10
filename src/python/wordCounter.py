#Esse programa conta o numero de palavras em uma frase

# frase = input("Digite uma frase e eu contarei o número de palavras: ")
frase = """Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam risus purus, vulputate elementum tempus quis, faucibus non nisi. Cras ultrices, tellus quis eleifend pellentesque, erat ligula rhoncus enim, sed congue lacus tellus sed leo. Maecenas odio arcu, viverra eu vestibulum a, porta et felis. Integer ex ex, molestie sed fermentum vitae, congue non metus. In lorem mi, ullamcorper vel ullamcorper ac, consequat sed nisi. Suspendisse tempor quis tortor nec efficitur. Nunc suscipit ut erat at efficitur. Sed maximus, ipsum non placerat eleifend, massa mauris vulputate risus, ut ultricies elit nibh ac ipsum. Vivamus nisl odio, ultricies sed lacinia nec, dignissim aliquet tortor. Aenean volutpat sagittis elit nec convallis. Fusce eget ultrices risus, sit amet viverra libero. Nunc in lectus vitae augue molestie facilisis ut eu urna. Praesent semper tellus sit amet mollis euismod. Nullam vehicula, purus malesuada tempor lacinia, justo ipsum placerat turpis, a porttitor ex tellus vitae ligula.

Suspendisse metus eros, vulputate vel sem a, ornare vehicula tellus. Praesent condimentum at quam ut varius. Mauris luctus eros eu tortor suscipit, at gravida odio condimentum. Nulla facilisi. Fusce pharetra enim id tempus posuere. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec ultrices malesuada placerat. Aliquam tincidunt feugiat augue, quis tempus ligula varius eu. Mauris sit amet blandit nibh, ut dictum diam. Quisque dapibus vulputate ipsum non feugiat. Phasellus turpis arcu, eleifend in turpis vel, auctor laoreet augue.

Vestibulum ultricies lorem vel libero lobortis, quis vehicula mi sollicitudin. Integer ut sem aliquet, blandit erat at, bibendum magna. Etiam ut luctus risus, at laoreet purus. Nullam convallis nisi vehicula nulla sagittis sollicitudin. Pellentesque ornare libero est, in pretium nulla imperdiet at. Cras et leo pulvinar, accumsan sapien scelerisque, iaculis libero. In mi massa, porttitor sit amet varius nec, ornare ac felis. Aenean tempor quis sapien in fermentum. Integer mollis non dolor ut aliquam. Maecenas bibendum, urna eu feugiat ultrices, sapien metus pellentesque turpis, vel efficitur nulla odio non libero. Praesent bibendum purus eu rhoncus lacinia."""

numeroPalavras = 0;
numeroParagrafos = 0;


for paragrafo in frase.splitlines():
    if paragrafo == '':
        continue
    else: 
        # é um paragrafo
        numeroParagrafos += 1

        for palavra in paragrafo.split(" "):
            # é uma palavra
            numeroPalavras += 1

print(f"Sua frase contem {numeroPalavras} palavras!")
print(f"Sua frase contem {numeroParagrafos} paragrafos!")
# print(frase.splitlines(), end="")