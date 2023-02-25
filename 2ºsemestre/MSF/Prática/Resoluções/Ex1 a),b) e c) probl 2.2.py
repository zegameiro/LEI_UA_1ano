import numpy as np
import matplotlib.pyplot as plt

#Gráfico da trajetória(distância por altura) de uma bola sem rotação e sem resistência do ar

#a)-----------------------------------------------------
dt = 0.00001
tf = 1.00
n = np.int(tf / dt)

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
ax = 0
ay = -g
vx[0] = v0x
vy[0] = v0y
x[0] = x0
y[0] = y0

for i in range(0,n-1):
    vx[i+1] = vx[i]
    vy[i+1] = vy[i] + ay * dt
    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt


fig, ax = plt.subplots(1)
ax.set_ylabel("y (m)")
ax.set_xlabel("x (m)")
ax.grid()
ax.plot(x,y)

plt.show()
plt.legend()
plt.title("Trajetória de uma bola sem rotação e sem resistência do ar")
#b)--------------------------------------------------------------------------------
tmax = np.round(np.unique(t[y==y.max()])[0],2)
print("A altura máxima atingida pela bola é",np.round(y.max(),2),"m e o instante em que a bola atingiu a altura máxima é",tmax,"s")

#c)---------------------------------------------------------------------------------------------------
xpos = x[y>=0]
xalcance = np.round(xpos[xpos == xpos.max()],2)[0]
talcance = np.round(t[y>=0][xpos == xpos.max()][0],2)
print("O alcance da bola é de",xalcance,"m e o instante em que a bola atingiu o alcance é",talcance,"s")



