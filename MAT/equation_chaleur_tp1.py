import numpy as np
import matplotlib.pyplot as plt

def creation_matrice(n):
    return (-2 * np.eye(n,n) + np.eye(n,n,1) + np.eye(n,n,-1));
    
def conditionnement_norme_2(A):
    return np.linalg.cond(A,2);

    
def show_evolution_on_cond(n):
    x = np.arange(2,n + 1,1)
    y = np.zeros(n - 2 + 1)
    for k in range (0,n - 2):
        y[k] = conditionnement_norme_2(creation_matrice(x[k]))
    x = x[:-1]
    y = y[:-1]
    plt.plot(x, y)
    plt.show()

def f_cos_sin(x):
    return (np.cos(x) - np.sin(x))

def solve(n, a, b, alpha, beta):
    w = np.zeros(n)
    h = (b - a) / (n + 1)  
    w[0] = f_cos_sin(a + h) + ( alpha / h**2 )
    for k in range (0, n - 1):
        w[k] = f_cos_sin(a + k*h)
    w[n - 1] = f_cos_sin(a + (n - 1)*h ) + ( beta / h**2 )
    w.reshape(n,1)
    w = (- (h**2)) * w 
    
    u = np.dot(np.linalg.inv(creation_matrice(n)),w) 
    x = np.arange(1,n + 1,1)
    #plt.plot(x,u)
    #plt.show(block=False)
    u_real = np.zeros(n)
    for k in range(0, n):
        u_real[k] = np.cos(a + k*h) -np.sin(a + k*h) + 1
    plt.plot(x,u_real)
    plt.show()