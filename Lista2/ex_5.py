numeros = []
numeros_primos = []
contador_divisores = 0

for i in range(1, 16):
    numero = int(input(f'Digite o {i}° valor: '))
    numeros.append(numero)

for numero in numeros:
    for i in range(1, numero + 1):
        if numero == 1:
            numeros_primos.append(numero)
        elif numero % i == 0:
            contador_divisores += 1
    if contador_divisores == 2:
        numeros_primos.append(numero)
    contador_divisores = 0

print()
print(f'Os números primos digitados são: {numeros_primos}')
