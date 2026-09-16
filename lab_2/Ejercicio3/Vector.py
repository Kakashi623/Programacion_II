import math
class Vector:
    def __init__(self, a1=0, a2=0, a3=0):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3
    def __add__(self, b):
        return Vector(
            self.a1 + b.a1,
            self.a2 + b.a2,
            self.a3 + b.a3
        )
    def __mul__(self, r):
        return Vector(
            r * self.a1,
            r * self.a2,
            r * self.a3
        )
    def __rmul__(self, r):
        return self * r
    def __abs__(self):

        return math.sqrt(
            self.a1 ** 2 +
            self.a2 ** 2 +
            self.a3 ** 2
        )
    def __truediv__(self, valor):
        return Vector(
            self.a1 / valor,
            self.a2 / valor,
            self.a3 / valor
        )
    def normal(self):
        longitud = abs(self)
        if longitud == 0:
            raise ValueError(
                "No se puede normalizar un vector cero"
            )
        return self / longitud
    def __matmul__(self, b):
        return (
            self.a1 * b.a1 +
            self.a2 * b.a2 +
            self.a3 * b.a3
        )
    def __xor__(self, b):

        return Vector(
            self.a2 * b.a3 - self.a3 * b.a2,
            self.a3 * b.a1 - self.a1 * b.a3,
            self.a1 * b.a2 - self.a2 * b.a1
        )
    def __str__(self):

        return f"({self.a1}, {self.a2}, {self.a3})"

    def __repr__(self):

        return str(self)