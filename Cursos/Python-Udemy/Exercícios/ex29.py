print('Cálculadora IMC')

nome = str(input('Digite o seu nome: '))
altura = float(input('altura: '))
peso = float(input('peso: '))

imc = peso / (altura * altura)

print('O seu IMC é: ', imc)

if imc < 16:
    print('Magreza grave')
    
elif 16 >= imc <= 16.9:
    print('Magreza moderada')

elif 17 >= imc <= 18.5:
    print('Magreza leve')

elif 18.6 >= imc <= 24.9:
    print('Peso ideal')

elif 25 >= imc <= 29.9:
    print('Sobrepeso')

elif 30 >= imc <= 34.9:
    print('Obesidade grau I')

elif 35 >= imc <= 39.9:
    print('Obesidade grau II')

elif 40 >= imc:
    print('Obesidade grau III') 
