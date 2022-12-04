
# What is Selenium ?

Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. You can use multiple programming languages like Java, C#, Python, etc to create Selenium Test Scripts. Testing done using the Selenium testing tool is usually referred to as Selenium Testing.


## Practice Selenium Hybrid Framework Project - BookMyShow Movie Booking Web Application.

This is Selenium Hybrid framework developed using Page object Model style.
It is movie booking Web Application tested under Selenium WebDriver and other frameworks.
All  required test scripts are included in this framework.
Reporting mechnism is also added in project which tells more about tests results. 

## Web Application Used For Testing : https://in.bookmyshow.com/ 
## Language Used : Java 
## Frameworks Used : Selenium WebDriver ,Hybdrid Framework , TestNG , Log4j2    
## Tools : Maven , Intellij idea  , Git & GitHub
## Reporting : Extent Reports , TestNG reports 
## Types of Selenium Tool Suite



Selenium Software is not just a single tool but a suite of software, each piece catering to different Selenium QA testing needs of an organization. Here is the list of tools

Selenium Integrated Development Environment (IDE)
Selenium Remote Control (RC)
WebDriver
Selenium Grid


## Selenium WebDriver

Selenium Webdriver consist of following Components.

API
Application Programming Interface. Ports test scripts you write in Ruby, Java, Python, or C# to Selenese (Selenium’s own scripting language), through bindings.

Library
Houses the API and language-specific bindings. Although plenty of third-party bindings exist to support different programming languages, the core client-side bindings supported by the main project are: Selenium Java (as selenium jar files), Selenium Ruby, Selenium dotnet (or Selenium C#, available as .dll files), Selenium Python, and Selenium JavaScript (Node).

Driver
Executable module that opens up a browser instance and runs the test script. Browser-specific—for instance, Google develops and maintains Chromedriver for Selenium to support automation on Chromium/Chrome.


Framework
Support libraries for integration with natural or programming language test frameworks, like Selenium with Cucumber or Selenium with TestNG.


# How selenium webDriver works?

 The WebDriver protocol has a local end (‘client’) which sends the commands (test script) to a browser-specific driver. The driver executes these commands on its browser-instance. So, if the test script calls for execution on Chrome and Firefox, the ChromeDriver will execute the test on Chrome; the GeckoDriver will do the same on Firefox.

## Why Use Selenium Framework for Automated Browser Testing?

let’s take a look at the main points or benefits of Selenium and why it is a good tool for automation testing:

Open Source : Selenium is open source, this means that no licensing or cost is required, it is totally free to download and use. This is not the case for many other automation tools out there.

Mimic User Actions : As stated earlier, Selenium WebDriver is able to mimic user input, in real scenarios, you are able to automate events like key presses, mouse clicks, drag and drop, click and hold, selecting and much more.

Easy Implementation : Selenium WebDriver is known for being a user-friendly automation tool. Selenium being Open Source means that users are able to develop extensions for their own needs.

Tool for every scenario : As mentioned earlier, Selenium is a suite of tools, and you will most likely find something that fits your scenario and your way of working.

Language Support : One big benefit is multilingual support. Selenium supports all major languages like Java, JavaScript, Python, Ruby, C sharp, Perl, .Net and PHP, giving the developer a lot of freedom and flexibility.

Browser, Operating System & Device support: Selenium supports many different browsers Chrome, Firefox, Opera, Internet Explorer, Edge, and Safari as well as operating systems (Windows, Linux, Mac)

Framework Support : Selenium also supports a multitude of frameworks like Maven, Junit, TestNG to make it easier to automate testing. CI and CD tools like Jenkins is also supported, for automating the deployment process.

Reusability : Scripts written for WebDriver is cross-browser compatible. Testers can therefore run multiple testing scenarios with the same base.

Community Support : The Selenium community is quite active and open. Therefore, there is a lot of information and help available when needed.

Advanced User Input: With WebDriver it is possible to request clicking of the browser back and front buttons. A practical feature when testing money transfer applications for example. This feature is not found in many tools, especially open source.
