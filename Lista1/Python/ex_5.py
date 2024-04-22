cont_idade = 0
soma_altura = 0
media_altura = 0
cont_idade_10_20 = 0
cont_peso = 0
porcentagem = 0

for c in range(1,4):
    idade = int(input(f'Digite a idade da {c}° pessoa: '))
    if idade > 50:
        cont_idade += 1
    altura = float(input(f'Digite a altura da {c}° pessoa: '))
    if idade > 10 and idade < 20:
        cont_idade_10_20 += 1
        soma_altura += altura
    peso = float(input(f'Digite o peso da {c}° pessoa: '))
    if peso < 40:
        cont_peso += 1

print(f'O número de pessoas com idade superior a 50 é: {cont_idade}')
if cont_idade_10_20 == 0:
    print(f'Não tem pessoas com idade entre 10 a 20 anos')
else:
    media_altura = soma_altura/cont_idade_10_20
    print(f'A media da altura das pessoas com idade entre 10 e 20 anos é: {media_altura}')
porcentagem = cont_peso/3 * 100
print(f'A porcentagem de pessoas com peso inferior a 40kg é: {porcentagem}')