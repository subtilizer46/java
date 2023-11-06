## Problem Statement: Convert any type of array to a String using generics

**Given an array of any data type, append the values of array to a String using generic class**

**This exercise contains a class named Stringify with the following methods:**

     +inputValidator( E []) : String  
         - Should take an array of any type as input and return a String as result
         - Should validate the input array by checking whether it is null and return error message
         - Should convert array to arrayList     
         - Should check whether arrayList contains atleast one value and return error String when it is empty or blank space      
         - Should call method stringGenerator     

--------------------------------------------------------
     +stringGenerator() : String  
         - Should append the values from the arrayList to String using StringBuilder and return the string    


## Example
    Sample Input:
    {"Hi","my","name","is","Joel"}   
    
    Expected Output:
    Hi my name is Joel
--------------------------------------------------------
    Sample Input:
    null
        
    Expected Output:
    Given value is null
--------------------------------------------------------
    Sample Input:
    {"Hi","my",null,"is","Joel"}
        
    Expected Output:
    Given array contains a null value
--------------------------------------------------------
    Sample Input:
    {'G', 'o', 'o', 'd', 'M', 'o', 'r', 'n', 'i', 'n', 'g'}
        
    Expected Output:
    G o o d M o r n i n g


## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding