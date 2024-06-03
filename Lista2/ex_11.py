def serie_euler(num):
    fatorial = 1
    S = 0
    for c in range(1,num+1):
        fatorial *= c
        S += 1/fatorial

    return S

num = int(input('Digite um valor: '))
resultado = serie_euler(num)
print(f'O valor de S para Num = {num} é: {resultado}')
