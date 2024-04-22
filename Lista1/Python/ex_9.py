numero = int(input('Digite um numero para saber seu fatorial: '))
print(f'Fatorial de {numero}')
print(f'{numero}! = ',end='')
fatorial = numero
for c in range(numero, 0, -1):
    if c < numero:
        fatorial *= c
print(fatorial)