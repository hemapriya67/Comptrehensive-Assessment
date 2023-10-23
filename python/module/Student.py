



class Student:
    def __init__(self, nameReceived:str, gradeReceived:str, ageReceived:int) -> None:
        self.name:str = nameReceived
        self.grade:str = gradeReceived
        self.age:int = ageReceived
      

    def display(self):
        print("The student: {name} with age: {age} has scored :{grade}"
              .format(name = self.name,
                    grade = self.grade,
                    age = self.age))
        
        


        
student1:Student = Student("Hemapriya", "A", 19)

if(__name__ == '__main__'):
    student1.display()        