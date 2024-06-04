nome = input('Digite o seu primeiro nome: ')
sobrenome = input('Digite o seu sobrenome: ')
idade = int(input('Digite a sua idade: '))
ano_nascimento = 2024 - idade
altura_metros = float(input('Digite a sua altura: '))

if idade >= 18 :
    maior_idade = 'Sim'
else :
    maior_idade = 'Não'

print('\nNome:', nome)
print('Sobrenome:', sobrenome)
print('Idade:', idade)
print('Ano de nascimento:', ano_nascimento)
print('É maior de idade:', maior_idade)
print('Altura em metros', altura_metros)
