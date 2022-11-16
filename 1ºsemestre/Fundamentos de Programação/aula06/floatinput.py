import math

def floatInput(prompt, mini, maxi):
    try:
        num = float(input(prompt))
        if not(mini<=num and num<=maxi):
            raise Exception(num)
    except ValueError:
        print("Not a float!")
        floatInput(prompt, mini, maxi)
    except Exception:
        print("Value should be in: [",mini,",",maxi,"]")
    else:
        print(num)

mini = input("Mínimo?")
if mini == "":
    mini = -math.inf
maxi = input("Máximo?")
if maxi == "":
   maxi = math.inf


def main():
    print("a) Try entering invalid values such as 1/2 or 3,1416.")
    v = floatInput("Value? ", mini, maxi)
    print("v:", v)

    print("b) Try entering invalid values such as 15%, 110 or -1.")
    h = floatInput("Humidity (%)? ", 0, 100)
    print("h:", h)

    print("c) Try entering invalid values such as 23C or -274.")
    t = floatInput("Temperature (Celsius)? ", min=-273.15)
    print("t:", t)

    # d) What happens if you uncomment this?
    #impossible = floatInput("Value in [3, 0]? ", min=3, max=0)

    return

if __name__ == "__main__":
    main()
