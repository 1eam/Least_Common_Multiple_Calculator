# LCM Calculator v1
## _*The Last API Ever, to find the LCM of a range of numbers*_

<img src="https://3.bp.blogspot.com/-oGZMRz-z0Ho/WJAuvFCLv5I/AAAAAAAAEiU/9-o6cIouVoMIE7ISZH8wmMHKue-GsnTbQCLcB/s400/lcm2.PNG" alt="drawing" width="200"/>


## About Application
Finds the smallest number that can be divided by a sequential set of numbers from 1 till a given range

Example: 1,2,3,4,5 = 60

60 is the smallest number that can be divided by each of the numbers from 1 to 5 without any remainder.

_This program is intended to extend another application. For instance as (micro)service to your existing project_

## Usage
    #Instructions:
    Use an http client like Postman to send the requests.
    Perform a GET-request to path: localhost:8080/LeastCommonMultipleTill, proceeded with a query parameter: till
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Example:

    localhost:8080/LeastCommonMultiple?till=13

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The API will return a string containing:

    360360 is the smallest number that can be divided by each of the numbers from 1 to 13 without any remainder.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;_**Notes & Limits:**_

 - _**Inserting value other than number will return statuscode of 400 - BAD Request**_
 - _**Note that its not possible to request a max-range greater then 42**_
 - _**Results of this application are tested based on the standards of [Calculator.net](https://www.calculator.net/lcm-calculator.html?numberinputs)**_


## Run Project
Prerequisites: Maven is installed on the machine & the project is unzipped.

1. Navigate to the projects root directory /West - Assignment. (See that the pom.xml is located here)

2. Run command: ```mvn spring-boot:run```
	- To skip tests run: ```mvn -DskipTests spring-boot:run```
	- To quit application run: ctrl + c, ```Terminate Batch Job(Y/N)?:``` N (Kill in task manager if necessary)
3. Follow [usage instructions](#usage)


## Install Prerequisites
Prerequisites: Maven is installed on the machine & the project is unzipped.

**1. Install Project:**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Direct install of Project](https://github.com/1eam/Least_Common_Multiple_Calculator/archive/refs/heads/master.zip) github.com/1eam/Least_Common_Multiple_Calculator/archive/refs/heads/master.zip
 
**2. Install maven:**
 	 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://dlcdn.apache.org/maven/maven-3/3.8.3/binaries/apache-maven-3.8.3-bin.zip [Download of 03-11-21]
 
 
**3. Add Maven to classpath:**
 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Navigate to Environment Variables

![Find Environment Variables](https://github.com/1eam/Least_Common_Multiple_Calculator/blob/master/installation%20instruction%20docs/Navigate%20to%20Environment%20Variables.png?raw=true)
 	
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;In the bottom tab (System Variables) double-click on 'Path' and add the ```/apache-maven-3.8.3/bin``` directory

![System-Variables_Path](https://github.com/1eam/Least_Common_Multiple_Calculator/blob/master/installation%20instruction%20docs/System-Variables_Path.png?raw=true)
 
**4. Test successful installation of maven:**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;run: ```mvn -v``` response should look like:

![Run Maven Test](https://github.com/1eam/Least_Common_Multiple_Calculator/blob/master/installation%20instruction%20docs/Run%20Maven%20Test.png?raw=true)

_Install reference: https://maven.apache.org/install.html#_


## Considered Updates:
- Ability to calculate lcm of range x till x. Example: 3 - 45, 13 - 17, 19 - 23
- Ability to calculate lcm of x numbers. Where x are multiple random numbers. Example 23, 4, 15 and 8 = 2760


## License
none **Free Software✨**