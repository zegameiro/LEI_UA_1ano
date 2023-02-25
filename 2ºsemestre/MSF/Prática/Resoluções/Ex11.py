# -*- coding: utf-8 -*-
"""
Created on Mon May 23 15:28:18 2022

@author: joseg
"""

g = 9.8
m = 75
u = 0.004
cres = 0.9
par = 1.225
atronco = 0.3
vel = (30 * 1000) / 3600 #conversão de km\h para m\s

#11a) -------------------------------------------------------------------------

fcic = (u * m * g) + ((cres / 2) * atronco * par * vel * vel)

pot = fcic * vel

print("A potência do ciclista com uma velocidade de 70km/h é",round(pot,0),"w")

#11b) -------------------------------------------------------------------------

vel1 = (40 * 1000) / 3600

fcic1 = (u * m * g) + ((cres / 2) * atronco * par * vel1 * vel1)

pot1 = fcic1 * vel1

print("A potência do ciclista com uma velocidade de 70km/h é",round(pot1,0),"w")
