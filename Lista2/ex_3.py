total_vendas = []
percentuais_comissao = []
nomes_vendedores = []
soma_vendas = 0
maior_comissao = 0
menor_comissao = 0

for i in range(1, 3):
    vendas = int(input(f'Total de vendas do {i}° vendedor: '))
    total_vendas.append(vendas)
    percentual = int(input(f'Porcentagem da comissão do {i}° vendedor: '))
    percentuais_comissao.append(percentual)
    nome = input(f'Nome do {i}° vendedor: ')
    nomes_vendedores.append(nome)
    
print()
print('Relatório:')
for indice, nome in enumerate(nomes_vendedores):
    comissao = total_vendas[indice] * (percentuais_comissao[indice] / 100)
    print(f'O vendedor {nome} recebeu R${comissao}')
    soma_vendas += total_vendas[indice]
    if indice == 0:
        maior_comissao = comissao
        maior_vendedor = nome
        menor_comissao = comissao
        menor_vendedor = nome
    else:
        if comissao > maior_comissao:
            maior_comissao = comissao
            maior_vendedor = nome
        elif comissao < menor_comissao:
            menor_comissao = comissao
            menor_vendedor = nome

print(f'Total de vendas: {soma_vendas}')
print(f'O vendedor que vai receber mais é o {maior_vendedor}, que recebeu R${maior_comissao}')
print(f'O vendedor que vai receber menos é o {menor_vendedor}, que recebeu R${menor_comissao}')
