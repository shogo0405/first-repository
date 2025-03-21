def add(x,y):
    return x + y
def substract(x,y):
    return x - y
def multiply(x,y):
    return x * y
def divide(x,y):
  if y !=0:
    return x / y
  else:
    return "Error: Division by zero"

choice = input("選択（1/2/3/4):")

if choice in('1','2','3','4'):
    num1 = float(input("最初に入れた数値："))
    num2 = float(input("次の値："))

if choice == '1':
    print(num1,"+",num2,"=",add(num1,num2))
elif choice == '2':
    print(num1,"-",num2,"=",substract(num1,num2))
elif choice == '3':
    print(num1,"*",num2,"=",multiply(num1,num2))
elif choice == '4':
    print(num1,"/",num2,"=",divide(num1,num2))
else:
    print("無効な選択")