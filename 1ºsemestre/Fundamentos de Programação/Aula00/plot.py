import matplotlib.pyplot as plt
import numpy as np

t = np.arange(0.0, 5.0, 0.1)

plt.subplot(2, 1, 1)
y1 = np.exp(-t)
plt.plot (t, y1, 'b')

plt.subplot(2, 1, 2)
y2 = np.cos(2*np.pi*t)
plt.plot(t, y2, 'ro-')

plt.subplot(2, 1, 1)
y3 = (np.exp(-t)) * (np.cos(2*np.pi*t))
plt.plot(t, y1*y2, 'g')

plt.show()