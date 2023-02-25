import numpy as np
import matplotlib.pyplot as plt

def acelera(t,x,vx):
    ax = g -g / vt**2 * np.abs(vx) * vx
    return ax

def rk4(t,vx,acelera,dt):

    """
    Integração numérica de equação diferencial de 2ª ordem:
			dvx/dt = ax(t,vx)    de valor inicial
	Erro global:  proporcional a dt**4
    acelera=dvx/dt=Força(t,vx)/massa     : acelera é uma FUNÇÃO
    input:  t = instante de tempo
            vx(t) = velocidade
            dt = passo temporal 
    output: vxp = vx(t+dt)
    """

    ax1 = acelera(t,x,vx)
    c1v = ax1 * dt
    ax2 = acelera(t + dt / 2., vx + c1v / 2.)
    c2v = ax2 * dt       			# predicto:  vx(t+dt) * dt
    ax3 = acelera(t + dt / 2., vx + c2v / 2.)
    c3v = ax3 * dt
    ax4 = acelera(t + dt,vx + c3v)
    c4v = ax4*dt
          
    vxp = vx+(c1v + 2. * c2v + 2. *c3v + c4v) / 6.
    return vxp

g = 9.8
vt = 6.8
dt = 0.5
tf = 2.0
n = np.int(tf / dt)
t0 = 0
vx0 = 0
x0 = 3

tempo = np.empty(n+1)
xrk4 = np.empty(n+1)
vxrk4 = np.empty(n+1)
vxe = np.empty(n+1)

tempo[0] = t0
vxrk4[0] = vx0
xrk4[0] = x0
vxe[0] = 0

tem = t0
xet = x0
vxet = vx0

for i in range(n-1):
    xet, vxet = rk4(tem,xet,vxet,vx0)
    tem = tem + dt
    tempo[i+1] = tem
    vxrk4[i+1] = vxet
    xrk4[i+1] = xet
    vxe[i+1] = vxe[i] + (g - g / vt**2 * np.abs(vxe[i]) * vxe[i]) * dt

te = np.linspace(t0,tf,100)



