## Problem Statement: Find the count of occurrence of an item in array of items ##

**Given an array of items, find the count of occurrence of an item in array of items. Here item is any type of data**

**This exercise contains a class named CountOccurrence with the following method:**


    +findCount<T>(T[],T) : int
        -Should be converted to generic method so that this method accepts any type of data
        -Should accept array of items and item for finding count of occurrence as input
        -Should return the count of occurrence of given item in array of items
        
      
## Example
    Sample Input:
    items = {2,4,7,5,4,2} 
    item = 4
    
    Expected Output:   
    2
--------------------------------------------------------
    Sample Input:
    items = {2,4,7,5,4,2} 
    item = 10
    
    Expected Output:
    0
--------------------------------------------------------
    Sample Input:
    items = {2.0,4.4,7.2,1.5,4.2,2.0} 
    item = 2.0
    Expected Output:
    2
--------------------------------------------------------
    Sample Input:
    items = {"Hello","Hi","Hello",null}
    item = null
    
    Expected Output:
    1

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding