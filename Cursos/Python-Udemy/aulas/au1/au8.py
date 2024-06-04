print('Calculadora')

print('Adição: +')
print('Subtração: -')
print('Multiplicação: *')
print('Divisão: /')

num1 = int(input('\nDigite o primeiro valor:'))

operacao = input('Selecione o tipo de operação:')

num2 = int(input('Digite o segundo valor:'))


if operacao == '+':
    print('\n', num1, '+', num2, '=', num1 + num2)
elif operacao == '-':
    print('\n', num1, '-', num2, '=', num1 - num2)
elif operacao == '*':
    print('\n', num1, '*', num2, '=', num1 * num2)
elif operacao == '/':
    print('\n', num1, '/', num2, '=', num1 / num2)