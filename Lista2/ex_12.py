def ultimo_nome(nome):
    for ind, letra in enumerate(nome[::-1]):
        if letra == ' ':
            stop = len(nome) - ind - 1
            ultimo = nome[stop+1:]
            return ultimo	

nome = input('Digite o nome completo: ')
resultado = ultimo_nome(nome)
print(f'O ultimo nome é {resultado}')