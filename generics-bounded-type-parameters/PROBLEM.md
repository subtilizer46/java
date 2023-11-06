## Problem Statement: Find the largest of three values of type Number ##

**Given three values of type Number and find the largest value among them using upper bound type parameters and Comparator**

**This exercise contains a class named LargestObject with the following method:**


    +findLargestNumber<T>(T,T,T) : Number
        -Should be converted to generic method so that this method accepts data of type Number
        -Should be able to find the largest among three values
        -Should return the largest of three values of type Number
        
      
## Example
    Sample Input:
    numberOne = 2
    numberTwo = 4
    numberThree = 5
    
    Expected Output:   
    5
--------------------------------------------------------
    Sample Input:
    numberOne = 2.0f
    numberTwo = 3.55f
    numberThree = 0.0f
    
    Expected Output:
    3.55f
--------------------------------------------------------
    Sample Input:
    numberOne = -5
    numberTwo = -6
    numberThree = -7
    
    Expected Output:
    -5


## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding