![image](https://github.com/user-attachments/assets/438d5c60-cebe-4bc9-8553-d04c7c78ef26)



# Operations in a Java List Interface
#### Declaration
```java
List<Integer> li = new ArrayList<>(10);
```

#### Add
```java
li.add(1); // add a new element
l1.add(0, 1);  // add a new element at given index . Adds 1 at index 0
l1.addAll(1, l2);  // Adding all elements of l2 to l1 starting from index 1 , ie it inserts l2  in the first index
```

#### Remove
```java
l1.remove(1); // Removes element from index 1
l1.remove(1); // remove 1 (it is confusing in integer list, but remove "geeks" from [srfs,sgfs,geeks,wetwe] of index 0,1,2,3  l1.remove("geeks");)
```

#### Element present or not
```java
boolean isPresent = al.contains("Geeks"); // // Checking if element is present 
```

#### Accessing elements
```java
System.out.println(l1.get(3)); // Prints element at index 3 in list 1
```

#### Updating
```java
l1.set(0, 5); // Replace 0th element with 5 in list 1
```

#### Searching for elements
```java
int index = numbers.indexOf(2);
        System.out.println("The first occurrence of 2 is at index "+ index);  // use indexOf() to find the first occurrence of an  element in the list
int lastIndex = numbers.lastIndexOf(2);
        System.out.println( "The last occurrence of 2 is at index " + lastIndex);  // use lastIndexOf() to find the last occurrence of  an element in the list
```

#### Printing:
```java
// Using  FOR LOOP  for iteration
        for (int i = 0; i < al.size(); i++) {

            // Using get() method to
            // access particular element
            System.out.print(al.get(i) + " ");
        }

        // New line for better readability
        System.out.println();

// Using FOR-EACH loop for iteration
        for (String str : al)

            // Printing all the elements
            // which was inside object
            System.out.print(str + " ");
```

#### Size
```java
 int size = list.size();
```

#### Equating
```java
l=[10, 15, 20]
l2=[100, 200, 300]
if (l.equals(l2)) 
            System.out.println("Equal"); 
        else
            System.out.println("Not equal");
```

