import numpy as np
import matplotlib.pyplot as plt

dt = 0.0001
tf = 1.5
n = np.int(tf / dt)
print("n = ", n)

t = np.linspace(0,tf,n)
# print(t)

vterminal = 6.80
v0 = 200 * 1000 / 3600 # conversão para radianos
alpha = np.radians(10)
g = 9.8

d = g / vterminal ** 2

v0x = v0 * np.cos(alpha)
v0y = v0 * np.sin(alpha)

y0 = 3
x0 = 0

vy = np.empty(n)
vx = np.empty(n)
y = np.empty(n)
x = np.empty(n)


vx[0] = v0x
vy[0] = v0y
x[0] = x0
y[0] = y0

for i in range(0,n-1):
    vv = np.sqrt(vx[i]** 2 + vy[i] ** 2)

    ay = -d * abs(vv) * vy[i] - g
    ax = -d * vx[i] * abs(vv)
    
    vy[i+1] = vy[i] + ay * dt
    vx[i+1] = vx[i] + ax * dt
    
    y[i+1] = y[i] + vy[i] * dt
    x[i+1] = x[i] + vx[i] * dt

    if y[i] == 0:
        break

fig, ax2 = plt.subplots(1)
ax2.set_ylabel("y (m)")
ax2.set_xlabel("x (m)")
ax2.grid()
ax2.plot(x,y)
ax2.set_ylim(0,5)
ax2.set_xlim(0,14)

plt.show()
plt.legend()

xpos = x[y>=0]
xalcance = np.round(xpos[xpos == xpos.max()],2)[0]
talcance = np.round(t[y>=0][xpos == xpos.max()][0],2)

print("O alcance do volante é",xalcance,"m e o instante em que isso ocorreu é",talcance,"s")
