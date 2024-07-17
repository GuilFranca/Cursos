num1 = int(input('Digite o primeiro valor: '))
num2 = int(input('Digite o segundo valor: '))

if num1 == num2:
    print(f'{num1} = {num2}')
elif num1 > num2:
    print(f'{num1} > {num2}')
else:
    print(f'{num2} > {num1}')