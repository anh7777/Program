from math import sqrt

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def is_super_prime(n):
    if not is_prime(n):
            return False
    result = True
    while n > 0:
        if not is_prime(n):
            result = False
            break
        n = n // 10
    return result
        

def main():
    n = int(input())
    if is_super_prime(n): 
        print("True")
    else:
        print("False")

if __name__ == "__main__":
    main()
