#   Introdução para a utilização de tipos dados em python
# Tipos : (1) int (2) float (3) string " " ou ''
a = 42
b = 42.42
c = '42' 
d = "42"

print(type(a))
print(type(b))
print(type(c))
print(type(d))

#   Para operações aritméticas podemos usar os mesmos
# parâmetros de declaração estabelecidas no anteriormente 
#   O python quando recebe números ele entende como string
# para isto devemos converter a string em um tipo artimético
print("Digite um número qualquer: ")
numero = input()
print(type(numero))
numero = int(numero)
print("Depois da conversão...")
print(type(numero))