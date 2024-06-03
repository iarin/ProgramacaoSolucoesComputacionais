def verifica_primo(num):
    cont = 0
    for c in range (1, num+1):
        if num % c == 0:
            cont += 1
    if cont == 2:
        return True
    else:
        return False
    
num = int(input('Digite um valor para saber se ele é primo: '))
resultado = verifica_primo(num)
print(f'O resultado é: {resultado}')