def printNum(n) :
    if(n == 0):
        return
    print(n)
    printNum(n-1)

if __name__ == "__main__" :
    n = int(input("Enter a number : "))
    printNum(n)