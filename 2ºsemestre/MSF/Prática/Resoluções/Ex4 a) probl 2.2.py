import matplotlib.pyplot as plt
import numpy as np

tf = 1.5
dt = 0.0001
n = int(tf / dt)
print("n = ",n)

t = np.linspace(0,tf,n)

g = 9.8
angle = np.deg2rad(10)
massa = 0.057
r = 0.067 / 2
v0 = 130 / 3.6 # transformçaõ de km/h para m/s
vter = 100 / 3.6
area = np.pi * r**2
par = 1.225

x0 = -10
y0 = 1
z0 = 0

vx = np.empty(n)
vy = np.empty(n)
vz = np.empty(n)

ax = np.empty(n)
ay = np.empty(n)
az = np.empty(n)

x = np.empty(n)
y = np.empty(n)
z = np.empty(n)

x[0] = x0
y[0] = y0
z[0] = z0

vx[0] = v0 * np.cos(angle)
vy[0] = v0 * np.sin(angle)
vz[0] = 0

d = g / vter**2

wx = 0
wy = 0
wz = 100

Fmagnus = 0.5 * area * par * r

for i in range(n-1):
    vv = np.sqrt(vx[i]**2 + vy[i]**2 + vz[i]**2)

    amagx = Fmagnus * wy * vz[i] / massa
    amagy = Fmagnus * wy * vy[i] / massa
    amagz = -Fmagnus * wy * vx[i] / massa

    ax[i] = -d * vx[i] * abs(vv) + amagx
    ay[i] = -d * vy[i] * abs(vv) - g + amagy
    az[i] = 0 + amagz

    vx[i+1] = vx[i] + ax[i] * dt
    vy[i+1] = vy[i] + ay[i] * dt
    vz[i+1] = vz[i] + az[i] * dt

    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt
    z[i+1] = z[i] + vz[i] * dt



plt.plot(x,y)
plt.xlabel("x (m)")
plt.ylabel("y (m)")
plt.grid()
plt.show()

print("Altura máxima: ",np.round(y.max(),4),"m")

for i in range(n-1):
    if (y[i+1]*y[i]<0):
        print("Alcance: {:0.3f} m".format(x[i+1]))
        plt.plot(x[i+1],y[i+1], "o", label="Alcance")
        break
    elif (dt == 0.1):
        print("Alcance: {:0.3f} m".format(x[n-1]))
        plt.plot(x[n-1], y[n-1],"o",label="alcance")
        break
    