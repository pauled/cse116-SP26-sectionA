class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

p1 = Person("Linus", 28)

print(p1.name)
print(p1.age)

class Game:
    def __init__(self,title):
        self.title=title
        self.score=0
    def __str__(self):
        self.value="I can create a class variable anywhere"
        return self.title + " score: " + str(self.score)
    def addPoint(self,point):
        self.score+=point
class BigGame(Game):
    def __init__(self,title,cost):
        super().__init__(title)
        self.cost=cost
    def __str__(self):
        return super().__str__()

g1=Game("Win now")
print(g1.title)
print(g1.score)
print(g1)
g1.addPoint(100)
print(g1)
print(g1.value)
b1=BigGame("WHAT?",60)
print(b1)