import numpy as np
import matplotlib.pyplot as plt

tf = 40.00
dt = 0.001
n = np.int(tf / dt)
print("n = ",n)

t = np.linspace(0,tf,n)

k = 1
massa = 1
xeq = 1.5
v0 = 0
ep0 = 1
x0 = np.sqrt(xeq**2 + np.sqrt(ep0 * 2 / k))

w = np.sqrt(k / massa)

x = np.empty(n)
v = np.empty(n)
ep = np.empty(n)
etotal = np.empty(n)

x[0] = x0
v[0] = v0
ep[0] = ep0

for i in range(0,n-1):
    a = -2 * w**2 * (x[i]**2 - xeq**2) * x[i]

    v[i+1] = v[i] + a * dt
    x[i+1] = x[i] + v[i+1] * dt

    ep[i] = 0.5 * k * (x[i]**2 - xeq**2)**2

    etotal[i] = 0.5 * massa * v[i]**2 + ep[i]

ep[n-1] = 0.5 * k * (x[n-1]**2 - xeq**2) **2
etotal[n-1] = ep[n-1] + 0.5 * massa * v[n-1]**2

plt.plot(x,ep)
plt.ylabel("Energia Potencial (J)")
plt.xlabel("x (m)")
plt.grid()
plt.show()

plt.plot(x,etotal)
plt.ylabel("Energia Total (J)")
plt.xlabel("x (m)")
plt.grid()
plt.show()

plt.plot(t,x)
plt.ylabel("x (m)")
plt.xlabel("t (s)")
plt.grid()
plt.show()
    