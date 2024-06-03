def somar_numeros(ate_numero):
    soma_total = 0
    for i in range(2, ate_numero):
        soma_total += i
    return soma_total

numero = int(input('Digite um valor: '))
resultado = somar_numeros(numero)
print(f'Resultado: {resultado}')
