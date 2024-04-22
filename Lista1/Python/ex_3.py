qtd_pares = 0
for c in range(1,11):
    numero = int(input(f'Digite o {c}° número: '))
    if numero % 2 == 0:
        qtd_pares += 1
print(f'A quantidade de números pares digitados foi: {qtd_pares}')