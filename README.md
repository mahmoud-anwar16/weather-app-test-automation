# Weather App Test Automation Framework

This repository contains an automated testing framework designed to validate the functionalities of the Android Weather
App's home screen. The framework is built using Appium with Java and TestNG.

## Overview

The framework offers automated tests for the following operations:

1. **Changing Temperature Unit:** Converts temperature from Celsius to Fahrenheit with assertions on the main Weather
   screen.
2. **Changing Time Format:** Switches the time format from 24-hour to 12-hour, with assertions on the main Weather
   screen.
3. **Assertion of Weather Parameters:** Ensures that Chance of Rain (raining icon) and Humidity (waterdrop icon) values
   are displayed for each hour in the next 6 hours.

## Setup

### Prerequisites

- JDK 1.8 or higher
- Maven
- Appium Server
- Android Emulator or Device

### Steps

1. **Clone the Repository:**

    ```
    git clone https://github.com/your-repo/weather-app.git
    cd weather-app
    ```

2. **Install Dependencies:**

    ```
    mvn clean install
    ```

3. **Appium Configuration:**

    - Start the Appium server on your local machine or designated server.
    - Ensure the desired capabilities in `TestBase.java` match your test environment settings (device, platform, etc.).

4. **Execute Tests:**

   Run the test suite using the following Maven command:

    ```
    mvn test
    ```

## Test Execution

The tests are organized in the `WeatherTest` class and cover the specified functionalities:

- Changing temperature units and asserting temperature conversion.
- Changing time format and asserting time format conversion.
- Checking for Chance of Rain and Humidity values for the next 6 hours.

## Test Reports

After test execution, a test report is generated. The report can be found at `target/surefire-reports/index.html`.