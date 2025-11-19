def printNum(n) :
    if(n == 0): # Final condition
        return  # return output to main function
    print(n)    # Initial statement
    printNum(n-1) # Callback

if __name__ == "__main__" :
    n = int(input("Enter a number : "))
    printNum(n)