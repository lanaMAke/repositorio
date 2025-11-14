arq_MB = float(input('Digite tamanho do arquivo para baixar (em MB).: '))
veloc_Mbps = float(input('Digite a velocidade do link da internet (emMbps).: '))

tempoDownload = arq_MB / veloc_Mbps

print(f'Seu tempo de baixa de arquivo, é aproximadamente {round(tempoDownload)} minutos...')

