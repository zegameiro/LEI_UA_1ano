# -*- coding: utf-8 -*-
"""
Created on Mon May 16 12:16:22 2022

@author: joseg
"""

import matplotlib.pyplot as plt
import numpy as np

v0 = 100/3.6 # m/s
alfa = np.deg2rad(10)
# alfa = 10 * np.pi / 180 #transformação para radianos
dt = 0.1
g = 9.8
t0 = 0
tf = 1
m = 0.057

n = int((tf-t0)/dt)
print("n = ", n)

t = np.zeros(n)

vx = np.zeros(n)
vy = np.zeros(n)

ax = np.zeros(n)
ay = np.zeros(n)

x = np.zeros(n) 
y = np.zeros(n)

Em = np.zeros(n)

t[0] = 0
x[0] = 0
y[0] = 0
Em[0] = 0


vx[0] = v0*np.cos(alfa)
vy[0] = v0*np.sin(alfa)

for i in range(n-1):    
    t[i+1] = t[i]*dt
    
    vv = np.sqrt(vx[i]**2 + vy[i]**2)
    
    ax[i] = 0
    ay[i] = -g
    
    vy[i+1] = vy[i] + ay[i] * dt
    vx[i+1] = vx[i] + ax[i] * dt
    
    y[i+1] = y[i] + vy[i] * dt
    x[i+1] = x[i] + vx[i] * dt
    
    Em[i] = 0.5 * m * vv ** 2 + m * g * y[i]
    
print(vy)
print(Em)

plt.plot(x,y)
plt.legend()
plt.show()
