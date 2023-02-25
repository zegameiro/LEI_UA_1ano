# -*- coding: utf-8 -*-
"""
Created on Mon May 23 15:48:06 2022

@author: joseg
"""
import matplotlib.pyplot as plt
import numpy as np

dt = 0.001
tf = 200.00
n = int(tf/dt)

t = np.linspace(0, tf,n+1)

potencia = 0.4 * 735.49875
u = 0.004
Cres = 0.9
A = 0.3
densidade = 1.225
massa = 75
g = 9.8
v0x = 1
fatrito = -u * massa * g

vel = np.empty(n+1)
v = np.empty(n+1)
vx = np.empty(n+1)
x = np.empty(n+1)
ax = np.empty(n+1)
aresx = np.empty(n+1)
fcic = np.empty(n+1)

vx[0] = v0x
x[0] = 0
tolerancia = 0.00000001

for i in range(n):
    vel[i] = np.sqrt(vx[i]**2)
    aresx[i] = -Cres / (2*massa) * A * densidade * vel[i] * vx[i]
    fcic[i] = potencia / (massa * vel[i])
    ax[i] = fatrito / massa + aresx[i] + fcic[i]
    vx[i+1] = vx[i] + ax[i] * dt
    x[i+1] = x[i] + vx[i] * dt
    
    #12a) -------------------------------------------------------------------------------
    if (vel[i] - vel[i-1] < tolerancia):
        vTerminal = vel[i]
        print("Velocidade terminal =",round(vTerminal,2),"m/s")
        break
    
fig,ax = plt.subplots(1)
plt.plot(t,vel)

#12b) -------------------------------------------------------------------------------------
for j in range(n):
    if (vel[j] > 0.9 * vTerminal):
        print("Tempo que demora a atingir 90% da velocidade terminal:",round(t[j],2),"s")
        break

#12c) ------------------------------------------------------------------------------------

for k in range(n):
    if x[k] > 2000:
        print("Tempo que demora a percorrer 2 km =",x[k])

    