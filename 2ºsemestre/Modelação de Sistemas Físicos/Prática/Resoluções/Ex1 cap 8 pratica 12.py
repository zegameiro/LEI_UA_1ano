import numpy as np
import matplotlib.pyplot as plt

tf = 400.00
dt = 0.001
n = np.int(tf / dt)
print("n = ",n)

k = 1
massa = 1
vx0 = 0
t0 = 0
x0 = 4.0
b = 0.05
wf = 1
ampl = 0
f0 = 7.5
t0 = 0
countmax = 0

w = np.sqrt(k / massa)

x = np.empty(n)
a = np.empty(n)
vx = np.empty(n)
Em = np.empty(n)
tempo = np.empty(n)

x[0] = x0
vx[0] = vx0
tempo[0] = t0 
tmax = []
periodo = []

for i in range(0,n-1):
    tempo[i+1] = tempo[i] + dt
    a[i] = - (k / massa) * x[i] - (b / massa) * vx[i] + f0 * np.cos(wf * tempo[i])

    vx[i+1] = vx[i] + a[i] * dt
    x[i+1] = x[i] + vx[i+1] * dt

    Em[i] = 0.5 * massa * vx[i]**2 + 0.5 * k* x[i]**2

    

plt.title("Oscilador Harmónico Forçado Met Euler-Cromer")
plt.xlabel("t (s)")
plt.ylabel("Energia Mecânica (J)")
plt.plot(tempo,Em)
plt.grid()
plt.show()

plt.title("Oscilador Harmónico Forçado Met Euler-Cromer")
plt.xlabel("t (s)")
plt.ylabel("x (m)")
plt.plot(tempo,x)
plt.grid()
plt.show()



    