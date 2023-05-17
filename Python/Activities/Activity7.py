#example_list = ["apple", "banana", "cherry"]
#"print(example_list) 

numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0
for number in numbers:
  sum += int(number)
print(sum)
