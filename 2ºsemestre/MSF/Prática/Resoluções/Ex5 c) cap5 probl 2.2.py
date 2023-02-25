import matplotlib.pyplot as plt
import numpy as np

dt = 0.001
tf = 1.00
n = int(tf / dt)
print("n =",n)

t = np.linspace(0,tf,n+1)

g = 9.8
vterminal = 100 / 3.6 #Transformação de km/h para m/s
vel0 = 100 / 3.6
angle = np.deg2rad(10)
massa = 0.057

v0x = vel0 * np.cos(angle)
v0y = vel0 * np.sin(angle)
x0 = 0
y0 = 0

vv = np.empty(n+1)
x = np.empty(n+1)
y = np.empty(n+1)
vx = np.empty(n+1)
vy = np.empty(n+1)
ax = np.empty(n+1)
ay = np.empty(n+1)
energia = np.empty(n+1)
fun = np.empty(n+1)
aresx = np.empty(n+1)
aresy = np.empty(n+1)
trabres = np.empty(n+1)

x[0] = 0
y[0] = 0
vx[0] = v0x
vy[0] = v0y

D = g / vterminal**2

for i in range(n):

    vv = np.sqrt(vx[i]**2 + vy[i]**2)

    aresx[i] = -D * vv * vx[i]
    aresy[i] = -D * vv * vy[i]

    ax[i] = aresx[i]
    ay[i] = aresy[i] - g

    vx[i+1] = vx[i] + ax[i] * dt
    vy[i+1] = vy[i] + ay[i] * dt

    x[i+1] = x[i] + vx[i] * dt
    y[i+1] = y[i] + vy[i] * dt

    energia[i] = 0.5 * massa * vv**2 + massa * g * y[i]

    fun[i] = massa * aresx[i] + vx[i] + massa * aresy[i] * vy[i]

    trabres[i] = dt * ((fun[0] + fun[i]) * 0.5 + np.sum(fun[1:i]))

    if (i==0):
        print("Tempo = ",np.round(t[i],1),"s")
        print("Trabalho da Resistência do Ar = ",np.round(trabres[i],3),"m")
    elif (t[i] < 0.4 and t[i+1] > 0.4):
        print("Tempo = ",np.round(t[i],1),"s")
        print("Trabalho da Resistência do Ar ",np.round(trabres[i],3),"m")
    elif (t[i] < 0.8 and t[i+1] > 0.8):
        print("Tempo = ",np.round(t[i],1),"s")
        print("Trabalho da Resistência do Ar ",np.round(trabres[i],3),"m")

energia[i+1] = (0.5 * massa * (np.sqrt(vx[i]**2 + vy[i]**2))**2) + (massa * g * y[i+1])

plt.plot(t,trabres)
plt.xlabel("t (s)")
plt.ylabel("Em (J)")
plt.title(" Trabalho da Força da Resistência do ar da Bola de Ténis, dt = 0.001s")
plt.show()
plt.grid()
