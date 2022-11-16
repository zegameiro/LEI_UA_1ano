import matplotlib.pyplot as plt
import numpy as np

dt = 0.001
tf = 1.00
n = int(tf / dt)
print("n =",n)

g = 9.8
vterminal = 100 / 3.6 #Transformação de km/h para m/s
vel0 = 100 / 3.6
angle = np.deg2rad(10)
massa = 0.057

v0x = vel0 * np.cos(angle)
v0y = vel0 * np.sin(angle)
x0 = 0
y0 = 0

t = np.empty(n+1)
x = np.empty(n+1)
y = np.empty(n+1)
vx = np.empty(n+1)
vy = np.empty(n+1)
ax = np.empty(n+1)
ay = np.empty(n+1)
energia = np.empty(n+1)

t[0] = 0
x[0] = 0
y[0] = 0
vx[0] = v0x
vy[0] = v0y

for i in range(n):
    t[i+1] = t[i] + dt

    vv = np.sqrt(vx[i]**2 + vy[i]**2)

    ax[i] = 0
    ay[i] = -g

    vx[i+1] = vx[i] + ax[i] * dt
    vy[i+1] = vy[i] + ay[i] * dt

    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt

    energia[i] = 0.5 * massa * vv**2 + massa * g * y[i]

energia[i+1] = (0.5 * massa * (np.sqrt(vx[i]**2 + vy[i]**2))**2) + (massa * g * y[i+1])

plt.plot(t,energia)
plt.xlabel("t (s)")
plt.ylabel("Em (J)")
plt.show()
plt.grid()




