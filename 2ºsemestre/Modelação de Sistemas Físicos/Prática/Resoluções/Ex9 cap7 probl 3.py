import numpy as np
import matplotlib.pyplot as plt

dt = 0.001
tf = 40.00
n = np.int(tf / dt + 0.1)
print("n= ",n)
t = np.linspace(0,tf,n)

k = 1
alfa = -0.01
massa = 1
w2 = k / massa
xeq = 0
ep0 = 1
v0 = 0
x0 = np.sqrt(xeq**2 + np.sqrt(ep0 * 2 / k))

x = np.empty(n+1)
v = np.empty(n+1)
Epotencial = np.empty(n+1)
Etotal = np.empty(n+1)

x[0] = 0
v[0] = 0

for i in range(0,n-1):
    a = -2 * w2 * (x[i]**2 - xeq**2)*x[i]
    v[i+1] = v[i] + a * dt
    x[i+1] = x[i] + v[i+1] * dt   #Método de Euler-Cromer
    Epotencial[i+1] = - k * x[i]**2 - x[i]**3

Epotencial[n-1] = -k * x[n-1]**2 - x[n-1]**3

plt.plot(x,Epotencial)
plt.xlabel("x (m)")
plt.ylabel("Energia Potencial (J)")
plt.grid()
plt.show()
