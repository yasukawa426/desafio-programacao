def ibmCalculator(massa,altura):
    ibm = massa/altura**2

    if ibm<=17:
        print("Muito abaixo do peso")
    elif ibm>17 and ibm<=18.49:
        print("Abaixo do peso")
    elif ibm>18.49 and ibm<=24.99:
        print("Peso normal")
    elif ibm>24.99 and ibm<=29.99:
        print("Acima do peso")
    elif ibm>29.99 and ibm<=34.99:
        print("Obesidade I")
    elif ibm>34.99 and ibm<=39.99:
        print("Obesidade II (severa)")
    else:
        print("	Obesidade III (mórbida)")
    return ibm
    
