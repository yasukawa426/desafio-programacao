num = 1
while num <= 100 :
    output = ""
    if num % 3 == 0: output += "Fizz"
    if num % 5 == 0: output +="Buzz"
    if output =="": print(num)
    else: print(output)
    num +=1