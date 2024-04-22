soma_pares = 0
soma_impares = 0
soma_div3 = 0
for c in range(1,11):
    numero = int(input(f'Digite o {c}° valor: '))
    if numero % 2 == 0:
        soma_pares += numero
    else:
        soma_impares += numero
    if numero % 3 == 0:
        soma_div3 += numero

print(f'Soma dos valores pares: {soma_pares}')
print(f'Soma dos valores impares: {soma_impares}')
print(f'Soma dos valores divisiveis por 3: {soma_div3}')