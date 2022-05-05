import pandas as pd

data = {

    "X": [1,2,3,4,5],
    "Y": [9,8,7,6,5],
    "Z": [10,12,13,14,15]

}
#Create a new Dataframe using our dictionary
table = pd.DataFrame(data)

#Print the data Frame
print(table)
print(table["Y"][2])


#READING CSV DATA
import pandas
dataframe = pandas.read_csv('Resource/employee.csv')
print(dataframe)