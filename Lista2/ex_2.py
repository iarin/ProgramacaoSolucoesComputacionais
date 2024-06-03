numeros = []
posicoes_30 = []

for i in range(1, 16):
    valor = int(input(f'Digite o {i}° valor: '))
    numeros.append(valor)

for indice, valor in enumerate(numeros):
    if valor == 30:
        posicoes_30.append(indice)

print()
print(f'Valores no vetor: {numeros}')
print(f'O número 30 foi identificado nos índices: {posicoes_30}')