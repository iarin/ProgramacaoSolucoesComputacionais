soma_idade = 0
for c in range(1,11):
    idade = int(input(f'Digite a idade da {c}° pessoa: '))
    soma_idade += idade
print(f'A soma das idades é: {soma_idade}')