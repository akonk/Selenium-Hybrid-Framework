
# What is Selenium ?

Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. You can use multiple programming languages like Java, C#, Python, etc to create Selenium Test Scripts. Testing done using the Selenium testing tool is usually referred to as Selenium Testing.


## why we use cucumb framework ?
To help implement BDD, one of the most popular open-source tools is Cucumber. It allows for creating higher-level specifications or scenarios that can be run and tested using Gherkin—a natural language programming platform. At their core, these scenarios are written in a human-readable format called Given-When-Then. Here’s how:

Given:A customer wants to buy a specific product.

When:Customer enters the required parameters: Product name, the quantity of product, customer location to deliver the product

Then:The customer will see the preview of the product with its price and a button to buy it.

The good thing about the Cucumber testing framework is that it breaks down feature design and implementation into small, manageable steps. It helps identify the best solution for an issue, and if there’s no solution, the test is simply broken.

This is how a project becomes less ambiguous and more reliable over time. Besides, the test can be scaled per the needs and understanding exhibited by cross-functional teams.
## Advantages of Cucumber Framework

Cucumber automation tool is definitely an efficient testing tool. Cucumber is an exceptionally comprehensive framework that supports BDD in the best way possible. Following are some of its main benefits.

1. Intuitive Way to Express Requirements in Human-Readable Form.
2. Translating Business Requirements into Testable Scenarios.
3. Multi-language Support
4. The Role of Cucumber in Agile Projects
5. The Facility of Code Reusability

## Practice Cucumber Framework Project - ERP Software Web Application.

This Cucumber framework developed using BDD style.
It is ERP Web Application tested under Selenium and Cucumber framework.
All Sceanarios  and Feature files are included in this framework.
Reporting mechnism is also added in project which tells more about tests results. 

## Web Application Used For Testing : https://admin-demo.nopcommerce.com/ 
## Language Used : Java , Gherkin 
## Frameworks Used : Selenium WebDriver , Cucumber , TestNG , Junit 
## Tools : Maven , Intellij idea  
## Reporting : Allure Reports , TestNG reports , Html Reports
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
