import random as rd
import numpy as np
import matplotlib.pyplot as plt

def approximation_pi_monte_carlo(nb_pts, show = 0, R = 1, ):
    x = np.zeros(nb_pts)
    y = np.zeros(nb_pts)
    for k in range (0, nb_pts): # 0 <= k < nb_pts
        x[k] = rd.random() * R
        y[k] = rd.random() * R
    nb_pts_dans_cercle = 0
    indice_dans_cercle = np.zeros(nb_pts)
    for k_bis in range (0, nb_pts):
        if ((x[k_bis]**2 + y[k_bis]**2) <= R**2):
            nb_pts_dans_cercle+=1
            indice_dans_cercle[k_bis] = 1
    approx_pi = (nb_pts_dans_cercle/nb_pts)*4
    
    if show:
        print("Estimation de pi = "+ str(approx_pi) + ", erreur = " + str((np.pi-approx_pi) / np.pi) )
        x_dans_cercle = []
        y_dans_cercle = []
        x_pas_dans_cercle = []
        y_pas_dans_cercle = []
        
        for k_ter in range (0, nb_pts):
            if (indice_dans_cercle[k_ter]):
                x_dans_cercle.append(x[k_ter])
                y_dans_cercle.append(y[k_ter])
            else:
                x_pas_dans_cercle.append(x[k_ter])
                y_pas_dans_cercle.append(y[k_ter])
        plt.plot(x_pas_dans_cercle, y_pas_dans_cercle,'ro', color="red")
        plt.plot(x_dans_cercle, y_dans_cercle, 'ro', color="green")
        plt.show()
    
    return ((np.pi-approx_pi) / np.pi)
    
def show_convergence(le_pas, nb_max):
    nb_pts = 100
    x_nb_pts = [100]
    y_val_relative = [approximation_pi_monte_carlo(100)]
    while (nb_pts < nb_max):
        nb_pts+=le_pas
        x_nb_pts.append(nb_pts)
        y_val_relative.append(approximation_pi_monte_carlo(nb_pts))
    plt.close()
    plt.plot(x_nb_pts,y_val_relative)
    plt.show()
    
def centree
    