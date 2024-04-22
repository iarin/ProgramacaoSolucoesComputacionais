cont_peso = 0
soma_idade = 0
media_idade = 0
for c in range(1,8):
    idade = int(input(f'Digite a idade da {c}° pessoa: '))
    soma_idade += idade
    peso = float(input(f'Digite o peso da {c}° pessoa: '))
    if peso > 90:
        cont_peso += 1
media_idade = soma_idade/7
print(f'A quantidade de pessoas com peso maior que 90kg é: {cont_peso}')
print(f'A media da idade é: {media_idade}')