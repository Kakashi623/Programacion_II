from Vector import Vector
a = Vector(2, 3, 4)
b = Vector(1, 5, 2)
print("Vector a:", a)
print("Vector b:", b)
c = a + b
print("\na + b =", c)
c = 3 * a
print("3 * a =", c)
c = a * 3
print("a * 3 =", c)
print("|a| =", abs(a))
print("Normal de a =", a.normal())
producto = a @ b
print("a · b =", producto)
producto = a ^ b
print("a × b =", producto)