# -*- coding: utf-8 -*-
"""
Created on Mon May  9 13:14:29 2022

@author: joseg
"""
import numpy as np
import matplotlib.pyplot as plt

v0 = 130/3.6 # m/s
teta = 10 * np.pi / 180 #transformação para radianos
dt = 0.1
g = 9.8
t0 = 0
tf = 1.5
omegax = 0
omegay = 0
omegaz = 100
raio = 0.067 / 2
dens = 1.225
area = np.pi*raio**2
k = 0.5 * area * dens * raio

vt= 100/3.6 # m/s

n = int((tf-t0)/dt)
print("n = ", n)
t = np.linspace(t0,tf,n)

vx = np.empty(n)
vy = np.empty(n)
vz = np.empty(n)

ax = np.empty(n)
ay = np.empty(n)
az = np.empty(n)

x = np.empty(n) 
y = np.empty(n)
z = np.empty(n)

x[0] = -10
y[0] = 1
z[0] = 0

vx[0] = v0*np.cos(teta)
vy[0] = v0*np.sin(teta)
vz[0] = 0

d = g/vt**2

for i in range(n-1):    
    
    ay[i] = -d * abs(vx[i]) * vy[i] - g
    ax[i] = -d * vx[i] * abs(vx[i])
    # az[i] = 0
    
    vy[i+1] = vy[i] + ay[i] * dt
    vx[i+1] = vx[i] + ax[i] * dt
    # vz[i+1] = vz[i] + az[i] * dt
    
    y[i+1] = y[i] + vy[i] * dt
    x[i+1] = x[i] + vx[i] * dt
    # z[i+1] = z[i] + vz[i] * dt
    
    
for i in range(n-1):
    if (y[i+1]<y[i]):
        print("A altura max é {:0.3f} m".format(y[i+1]))
        plt.plot(x[i+1],y[i+1], "o", label="Altura máxima")
        break
    
for i in range(n-1):
    if (y[i+1]*y[i]<0):
        print("Alcance {:0.3f} m".format(x[i+1]))
        plt.plot(x[i+1],y[i+1], "o", label="Alcance")
        break
    elif (dt == 0.1):
        print("Alcance {:0.3f} m".format(x[n-1]))
        plt.plot(x[n-1], y[n-1],"o",label="alcance")
        break
    
plt.plot(x,y)
plt.legend()
plt.show()

