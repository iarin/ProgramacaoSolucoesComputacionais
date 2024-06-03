numeros = []
quantidade_pares = 0
quantidade_impares = 0
pares = []
impares = []

for i in range(1, 7):
    valor = int(input(f'Digite o {i}° valor: '))
    numeros.append(valor)

for numero in numeros:
    if numero % 2 == 0:
        quantidade_pares += 1
        pares.append(numero)
    else:
        quantidade_impares += 1
        impares.append(numero)

print()
print(f'Valores no vetor: {numeros}')
print()
print(f'Quantidade de números pares: {quantidade_pares}')
print(f'Números pares: {pares}')
print(f'Quantidade de números ímpares: {quantidade_impares}')
print(f'Números ímpares: {impares}')
