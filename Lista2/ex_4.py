nomes_produtos = []
precos_produtos = []
quantidade_menores_50 = 0
media_maiores_100 = 0
quantidade_maiores_100 = 0
soma_maiores_100 = 0

for i in range(1, 6):
    nome_produto = input(f'Digite o nome do {i}° produto: ')
    nomes_produtos.append(nome_produto)
    preco_produto = int(input(f'Digite o valor do {i}° produto: '))
    precos_produtos.append(preco_produto)

print()
print(f'O nome dos produtos com preço entre R$ 50,00 e R$ 100,00 são: ')
for indice, preco in enumerate(precos_produtos):
    if preco < 50:
        quantidade_menores_50 += 1
    elif preco > 100:
        quantidade_maiores_100 += 1
        soma_maiores_100 += preco
    else:
        print(nomes_produtos[indice], end=' ')

print()
print(f'Quantidade de produtos com valor menor que R$50,00: {quantidade_menores_50}')
if soma_maiores_100 > 0:
    media_maiores_100 = soma_maiores_100 / quantidade_maiores_100
    print(f'A média dos valores de produtos com valor maior que R$100,00: R${media_maiores_100:.2f}')
else:
    print('Não existem produtos com valor maior que R$100,00')
