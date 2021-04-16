import msvcrt
for i in range(1, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("ThreeFive, ", end="")
    elif i % 3 == 0:
        print("Three, ", end="")
    elif i % 5 == 0:
        if i == 100:
            print("Five.")
        else:
            print("Five, ", end="")
    else:
        print(str(i) + ", ", end="")
msvcrt.getch()