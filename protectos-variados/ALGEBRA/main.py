import numpy as np

def eliminar_elementos_columna(matriz, fila_pivote):
    for fila in range(len(matriz)):
        if fila != fila_pivote:
            factor = matriz[fila][fila_pivote]
            matriz[fila] -= factor * matriz[fila_pivote]
    return matriz

def gauss_jordan(matriz):
    filas, columnas = matriz.shape
    for i in range(filas):
        # Encontrar el pivote en la fila i
        pivote = matriz[i][i]
        
        # Si el pivote no es 1, dividir toda la fila por el pivote
        if pivote != 1:
            matriz[i] /= pivote
        
        # Hacer cero los elementos debajo del pivote
        matriz = eliminar_elementos_columna(matriz, i)
        
    return matriz

def pedir_matriz():
    ecuaciones = int(input("Ingrese el número de ecuaciones: "))
    print("Ingrese los coeficientes de cada ecuación fila por fila (incluyendo el término constante):")
    matriz = []
    for i in range(ecuaciones):
        ecuacion = input(f"Ingrese los coeficientes de la ecuación {i + 1} separados por espacios: ").split()
        fila = [float(coeficiente) for coeficiente in ecuacion]
        matriz.append(fila)
    return np.array(matriz)

def mostrar_matriz(matriz):
    for fila in matriz:
        print(" ".join(map(str, fila)))

# Main
matriz = pedir_matriz()
print("\nMatriz original:")
mostrar_matriz(matriz)

matriz_reducida = gauss_jordan(matriz)
print("\nMatriz reducida por eliminación de Gauss-Jordan:")
mostrar_matriz(matriz_reducida)
