# List of customer IDs
customerID = [1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010]
print(f"Customer IDs = {customerID}")
print("Enter an ID to search, or type '0' to exit.")

# Main Program Loop
while True:
    try:
        key = int(input("\nEnter ID number: ")) # Taking user input 

        # 1. Check for the exit condition first
        if key == 0:
            print("Exited Successfully")
            break  # Exit the while loop

        # 2. Perform the search using the 'in' operator
        if key in customerID:
            print(f"✅ ID {key} Found.")
        else:
            print(f"❌ ID {key} Not Found.")

    # 3. Handle cases where input is not a valid integer
    except ValueError:
        print("⚠️ Invalid input! Please enter a whole number.")

print("\nThanks for using this program!")