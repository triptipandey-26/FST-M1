#Print Hello World program
print("Hello world")

#printing interger Value
test= 5
print(test)

#To find the Type of the variable use Type keyword
Bollean= True
print(type(Bollean))

#Slicing String
b= "hello world"
print(b[2:5])
print(b[-2])


#STRING LENGTH
a = "Hello, World!"
print(len(a))

#LOWER AND UPPER
a = "Hello, World!"
print(a.lower()) # Output: "hello, world!"

#upper() method returns the string in upper case:
a = "Hello, World!"
print(a.upper())


#REPLACE AND SPLIT
a = "Hello, World!"
print(a.replace("H", "J"))
print(a.split(","))

#CHECK STRING
txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x)
print(y)

#STRING CONCATENATION
a = "Hello"
b = " World"
c = a + b
print(c)


#STRING FORMAT
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))


#Type CASTING
a = int(1)   	 # a will be 1
b = int(2.8)	 # b will be 2
c = int("3") 	 # c will be 3

print(a,b,c)

x = float(1)     # x will be 1.0
y = float(2.8)   # y will be 2.8
z = float("3")   # z will be 3.0
w = float("4.2") # w will be 4.2

print(x,y,z,w)

j = str("s1") 	 # j will be 's1'
k = str(2)    	 # k will be '2'
l = str(3.0)  	 # l will be '3.0'

print(j,k,l)
