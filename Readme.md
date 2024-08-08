### Design Specification
1. Task
   - Create a class `Car`, which contains following fields
     - `String make`, `String model`, `int year` and `String color`
   - This class will contain a method
     - `public String displayInfo()` this method will return value in following format
       - Make - Sedan, Model - GT90, Year - 2000, Color - Red Black
   - This class will contain a parameterized constructor
   - Create `MyMain` class, which contains `main()` method.
     - create object of `Car` class and initialize them by accepting values from user. And display values using `displayInfo()` method

2. Task - Logical Question
   - Write program to print the Nth prime number. Accept the value of N from the user and print the Nth prime number.
    ```
      Sample
      input N = 5
      output = 11
      Explanation 
      first prime number - 2, second prime number - 3, third - 5, fourth - 7 and 5th prime number - 11
   ```
   - Please follow the mentioned guidelines
     1. Use `main()` method only to accept input , display output and calling any required methods.
     2. Functionality to check prime number must be separate. Create a method `isPrime(long number)` this method will check if the given number is prime or not, if the given number is prime it will return true otherwise false.
     3. Main method can not directly call isPrime. 
     4. Create another method which will accept a number N, and returns the Nth prime number.