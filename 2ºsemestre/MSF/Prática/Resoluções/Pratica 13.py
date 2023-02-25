import numpy as np
import matplotlib.pyplot as plt

k = 1
f0 = 7.5
v0 = 0
x0 = 3
b = 0.05
alfa = 0.002
wf = 1.0
tf = 400
dt = 0.0001
massa = 1

n = np.int(tf / dt)
v = np.empty(n)
x = np.empty(n)
a = np.empty(n)
tempo = np.empty(n)

x[0] = x0
v[0] = v0
tempo[0] = 0
amplitude = []
periodo = []

for i in range(n-1):
    tempo[i+1] = tempo[i] + dt
    a[i] = -(k / massa) * x[i] * (1 + 2 * alfa * x[i]**2) - ((b * v[i]) / massa) + ((f0 / massa) * np.cos(wf * tempo[i]))
    v[i+1] = v[i] + a[i] * dt
    x[i+1] = x[i] + v[i] * dt

    if tempo[i] > 150 :
        if x[i-1] < x[i] and x[i] > x[i+1]:
            amplitude.append(x[i])
        continue

print("Amplitude = ",np.max(amplitude))
print("Período = ",amplitude[1] - amplitude[0])

plt.plot(tempo,x)
plt.xlabel("Tempo (s)")
plt.ylabel("x (m)")
plt.grid()
plt.show()
