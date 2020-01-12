## This SpringBoot project is work for the Fibonacci palindrome problem
### 1. How to run
Clone this project, 
a. you can import this project by your ide, and then run this project in ide.
b. or you can start this project by mvn command : "mvn spring-boot:run" 

### 2. How to use
After you start this project, you can find out the Fibonacci-Palindrome list 
from your list by postman or swagger
a. set up a POST request to http://localhost:8899/find with the request param
"sequence=1,2,3,4"
b. swagger ui address http://localhost:8899/swagger-ui.html

### 3. about the ut
The ut is cover for just the main function DefaultFibonacciPalindrome.findFibonacciPalindrome()
for about three cases.