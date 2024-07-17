num = int(input('Digite um valor: '))

comp = 'vazio'

if num == 5:
    comp = 'igual'
elif num < 5:
    comp = 'menor'
else:
    comp = 'maior'

print(f'{num} é {comp} do que 5')