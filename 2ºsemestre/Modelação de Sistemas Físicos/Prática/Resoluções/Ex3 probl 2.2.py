import matplotlib.pyplot as plt
import numpy as np

dt = 0.001
tf = 0.5
n = int(tf / dt)
print("n =",n)

g = 9.8
vterminal = 100 / 3.6 #Conversão de km/h para m/s
v0x = 25
v0y = 5
v0z = -50
par = 1.225
massa = 0.45
raio = 0.11
x0 = 0
y0 = 0
z0 = 23.8
area = np.pi * raio**2

t = np.empty(n+1)

x = np.empty(n+1)
y = np.empty(n+1)
z = np.empty(n+1)

vx = np.empty(n+1)
vy = np.empty(n+1)
vz = np.empty(n+1)

ax = np.empty(n+1)
ay = np.empty(n+1)
az = np.empty(n+1)

x[0] = x0
y[0] = y0
z[0] = z0

vx[0] = v0x
vy[0] = v0y
vz[0] = v0z

dres = g / vterminal**2

wx = 0
wy = 400
wz = 0

Fmagnus = 0.5 * area * par * raio

for i in range(n):

    t[i+1] = t[i] + dt

    vel = np.sqrt(vx[i]**2 + vy[i]**2 + vz[i]**2)

    amagx = Fmagnus * wy * vz[i] / massa
    amagy = Fmagnus * wy * vy[i] / massa
    amagz = -Fmagnus * wy * vx[i] / massa

    ax[i] = dres * vx[i] * abs(vel) + amagx
    ay[i] = -g - dres * vy[i] * abs(vel) + amagy
    az[i] = -dres * vz[i] * abs(vel) + amagz

    vx[i+1] = vx[i] + ax[i] * dt
    vy[i+1] = vy[i] + ay[i] * dt
    vz[i+1] = vz[i] + az[i] * dt

    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt
    z[i+1] = z[i] + vz[i] * dt

plt.grid()
plt.plot(t, x, label='x(t)')
plt.plot(t, y, label='y(t)')
plt.plot(t, z, label='z(t)')
plt.xlabel("t(m)")
plt.legend()
plt.title("Gráfico da posição em função do tempo com rotação e resistência, dt=0.001")
plt.show()
