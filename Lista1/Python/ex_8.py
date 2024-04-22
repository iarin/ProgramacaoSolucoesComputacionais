numero = int(input('Digite um numero para saber sua tabuada: '))
print(f'Tabuada do numero {numero}')
for c in range (0,101):
    print(f'{numero}x{c} = {numero*c}')