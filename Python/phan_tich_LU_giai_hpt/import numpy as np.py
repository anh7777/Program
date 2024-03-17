import numpy as np

# Ma trận hệ số A và vector kết quả b
A = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 10]])
b = np.array([2, 5, 8])

# Phân tích LU
P, L, U = scipy.linalg.lu(A)

# Giải Ly = b
y = np.linalg.solve(L, b)

# Giải Ux = y
x = np.linalg.solve(U, y)

print("Nghiệm của hệ phương trình:", x)
