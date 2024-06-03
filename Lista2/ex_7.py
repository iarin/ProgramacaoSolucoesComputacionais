def tempo_em_segundos(horas,minutos,segundos):
    horas_minutos = horas * 60
    minutos_segundos = (horas_minutos + minutos) * 60
    return minutos_segundos + segundos

horas = int(input('Digite as horas: '))
minutos = int(input('Digite os minutos: '))
segundos = int(input('Digite os segundos: '))
resultado = tempo_em_segundos(horas,minutos,segundos)
print(f'O tempo de {horas}h, {minutos}min e {segundos}seg correspondem a {resultado} segundos')