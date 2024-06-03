def raio_volume(raio):
    volume = (4/3) * (pow(raio,3))
    return volume

raio = int(input('Digite o raio para saber o volume da esfera: '))
resultado = raio_volume(raio)
print(f'O volume da esfera é {resultado}!')