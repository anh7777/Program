from math import sqrt
def solver(a, b, c):
    if a == 0:
        if b == 0:
            if c == 0: print("VSN")
            else: print("VN")
        else: print(-c/b)
    else:
        delta = b*b - 4*a*c
        if delta > 0:
            x1 = (-b + sqrt(delta)) / (2*a)
            x2 = (-b - sqrt(delta)) / (2*a)
            print(x1, x2)
        elif delta == 0:  
            x = -b / (2*a) 
            print(x)
        else:
            print("VN")
            
                    