from cProfile import label
import numpy as np
import matplotlib.pyplot as plt

dt = 0.00001
tf = 1.00
n = np.int(tf / dt + 0.1)

t = np.linspace(0,tf,n)

g = 9.8
vt = (100 * 1000) / 3600 # conversão de km/h para m/s
vel0 = (100 * 1000) / 3600 # conversão de km/h para m/s
theta = np.radians(10)
v0x = vel0 * np.cos(theta)
v0y = vel0 * np.sin(theta)
y0 = 0
x0 = 0

vy = np.empty(n)
vx = np.empty(n)
x = np.empty(n)
y = np.empty(n)
ax = np.empty(n)
ay = np.empty(n)
vx[0] = v0x
vy[0] = v0y
x[0] = x0
y[0] = y0

D = g / vt**2

for i in range(0,n-1):
    vv = np.sqrt(vx[i]**2 + vy[i]**2)
    ax[i] = -D * vv * vx[i]
    ay[i] = -D * vv * vy[i] - g
    vx[i+1] = vx[i] + ax[i] * dt
    vy[i+1] = vy[i] + ay[i] * dt
    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt

xsres = x0 + v0x * t
ysres = y0 + v0y * t - 0.5 * g * t**2

fig, ax1 = plt.subplots(1)
ax1.set_xlabel = ("x (m)")
ax1.set_ylabel = ("y (M)")
ax1.plot(xsres,ysres,label="Sem resistência")
ax1.plot(x,y,label = "Com resistência")

ax1.set_ylim(0,1.3 * y.max())
plt.legend()
plt.grid()
plt.show()

tmax = np.round(np.unique(t[y==y.max()])[0],2)

print("A altura máxima atingida pela bola é",np.round(y.max(),2),"m e o instante é",tmax,"s.")

xpos = x[y>=0]
xalcance = np.round(xpos[xpos == xpos.max()],2)[0]
talcance = np.round(t[y>=0][xpos == xpos.max()][0],2)
print("O alcance da bola é de",xalcance,"m e o instante em que a bola atingiu o alcance é",talcance,"s")
