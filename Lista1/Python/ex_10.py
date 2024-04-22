cont_primo = 0
numero = int(input('Digite um número para saber se é primo ou não: '))
for c in range(1, numero+1):
    if numero % c == 0:
        cont_primo += 1
if cont_primo == 2 or numero == 1:
    print(f'O número {numero} é primo')
else:
    print(f'O número {numero} não é primo')