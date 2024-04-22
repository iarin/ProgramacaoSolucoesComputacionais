soma_idade = 0
qtd_pessoas = 0
media_idade = 0
for c in range(1,8):
    idade = int(input(f'Digite a idade da {c}° pessoa: '))
    soma_idade += idade
    peso = float(input(f'Digite o peso da {c}° pessoa: '))
    if peso > 90:
        qtd_pessoas += 1
media_idade = soma_idade/7
print(f'A media da idade é: {media_idade}')
print(f'A quantidade de pessoas com peso acima de 90kg foi: {qtd_pessoas}')