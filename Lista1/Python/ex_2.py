maior = 0
for c in range(1,6):
    numero = float(input(f'Digite o {c}° número: '))
    if numero > maior:
        maior = numero
print(f'O maior número de ponto flutuante digitado foi: {maior}')