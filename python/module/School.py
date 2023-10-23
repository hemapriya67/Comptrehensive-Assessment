from Student import Student

class School(Student):


    def __init__(self, nameReceivedSchool: str, gradeReceivedSchool: str, ageReceivedSchool: int) -> None:
        super().__init__(nameReceivedSchool, gradeReceivedSchool, ageReceivedSchool)
        


    def SchoolStudentDisplay(self) -> None:
        print("The student: {name} with age: {age} has scored :{grade}"
            .format(name = self.name,
                grade = self.grade,
                age = self.age))
        

      




school:School = School("Dinesh", "B", 22)
school.SchoolStudentDisplay()
        