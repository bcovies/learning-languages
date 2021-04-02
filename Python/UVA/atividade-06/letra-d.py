def procura_valor(matriz, valor):
    if not matriz_quadrada or not matriz_quadrada[0]:
        return "Matriz não inicializada."
    j = len(matriz_quadrada) - 1
    for linha in matriz_quadrada:
        while linha[j] > valor:
            j = j - 1
            if j == -1:
                return  ("Valor %d não encontrado!!!"%valor)
        if linha[j] == valor:
            return ("Valor %d encontrado!!!"%valor)
    return ("Valor %d não encontrado!!!"%valor)

matriz_quadrada = [[3, 4, 4, 6],
                   [6, 8, 11, 12],
                   [6, 8, 11, 15],
                   [9, 11, 12, 17]]

print(procura_valor(matriz_quadrada, 3))