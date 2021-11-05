# LCM Calculator
## _*The Last API Ever, to find the LCM of a range of numbers*_

<img src="https://3.bp.blogspot.com/-oGZMRz-z0Ho/WJAuvFCLv5I/AAAAAAAAEiU/9-o6cIouVoMIE7ISZH8wmMHKue-GsnTbQCLcB/s400/lcm2.PNG" alt="drawing" width="200"/>

_...starting from 1_

## About Application
Finds the smallest number that can be divided by a sequential set of numbers:

Example: 1,2,3,4,5 = 60

"60 is the smallest number that can be divided by each of the numbers from 1 to 5 without any remainder.

_*Tested based on results of [Calculator.net](https://www.calculator.net/lcm-calculator.html?numberinputs)_

------------------------
## Usage:
    Use an http client like Postman to send the requests.
	perform a GET-request to path: localhost:8080/LeastCommonMultipleTill, proceeded with a query parameter: till
	Example: localhost:8080/LeastCommonMultiple?till=13

 ✨
 
------------------------
## Installation
Prerequisites: Maven is installed on the machine & the project is unzipped.
 
**1. Install maven:**
 	 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://dlcdn.apache.org/maven/maven-3/3.8.3/binaries/apache-maven-3.8.3-bin.zip [Download of 03-11-21]
 
 
**2. Add Maven to classpath:**
 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Navigate to Environment Variables
 	
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;In the bottom tab (System Variables) search for 'Path'. 
 	
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double click and add the /apache-maven-3.8.3/bin directory
 	
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Install refrence: https://maven.apache.org/install.html# 
 
**3. Test succesful installation:**
 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;run: ```mvn -v``` response should be:

    Apache Maven 3.8.3 (ff8e977a158738155dc465c6a97ffaf31982d739)
    Maven home: C:\Program Files\apache-maven-3.8.3
    Java version: 11.0.3, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.3
    Default locale: en_GB, platform encoding: Cp1252
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows

------------------------

## Run Project

1. Navigate to the projects root directory /West - Assignment. (See that the pom.xml is located here)

2. Run command: ```mvn spring-boot:run```
	- To skip tests run: ```mvn -DskipTests spring-boot:run```
	- To quit application run: ctrl + c, Terminate Batch Job?: N (Kill PID if necessary)


------------------------
## License

none

**Free Software :D**