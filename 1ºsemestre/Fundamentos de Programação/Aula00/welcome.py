message = """
Caro/a {name},

Bem-vindo/a à disciplina de Fundamentos de Programação
e ao curso de {x}.

Esperamos que aprendas muito e que te divirtas.

Cumprimentos,

Os Profes de FP. 
"""
name = str(input('Como te chamas?'))
x = str(input('Qual o teu curso?'))
print(message.format(name = name, x = x))
