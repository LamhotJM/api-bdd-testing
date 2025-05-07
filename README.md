Thought for 4 seconds


````markdown
# api-bdd-testing

**By Lamhot Siagian**

[![CI/CD Pipeline](https://github.com/LamhotJM/api-bdd-testing/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/LamhotJM/api-bdd-testing/actions/workflows/ci-cd.yml)

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [BDD Scenarios](#bdd-scenarios)
- [Running Tests](#running-tests)
- [CI/CD Integration](#ci-cd-integration)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Overview

`api-bdd-testing` is a Behavior-Driven Development (BDD) framework for automating API tests. This project demonstrates how to write clear, human-readable test scenarios using Gherkin syntax and execute them against RESTful APIs.

## Features

- Write tests in Gherkin (`.feature`) files
- Support for Given/When/Then steps
- Easy-to-extend step definitions in Java/Python/JavaScript
- Detailed HTML and JSON test reports
- Integration with popular CI/CD pipelines

## Prerequisites

- Java 11+ or Python 3.8+ or Node.js 14+
- Maven/Gradle (for Java) or pytest/Behave (for Python) or Cucumber.js (for JavaScript)
- Git 2.20+

## Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/LamhotJM/api-bdd-testing.git
   cd api-bdd-testing
````

2. **Install dependencies**

   * **Java (Maven)**

     ```bash
     mvn clean install
     ```
   * **Python (Behave)**

     ```bash
     pip install -r requirements.txt
     ```
   * **JavaScript (Cucumber.js)**

     ```bash
     npm install
     ```

## Usage

1. Write your `.feature` files under `src/test/resources/features`.
2. Implement corresponding step definitions under:

   * `src/test/java/steps` (Java)
   * `features/steps` (Python)
   * `features/step_definitions` (JavaScript)
3. Run the tests using your chosen framework:

   ```bash
   # Java (Maven)
   mvn test

   # Python (Behave)
   behave

   # JavaScript (Cucumber.js)
   npx cucumber-js
   ```

## BDD Scenarios

Example `login.feature`:

```gherkin
Feature: User Authentication
  As a registered user
  I want to log in to the API
  So that I can access my dashboard

  Scenario: Successful login with valid credentials
    Given I have a valid username and password
    When I send a POST request to "/auth/login"
    Then the response code should be 200
    And the response JSON should contain "token"
```

## Running Tests

* **Generate HTML Report (Java)**:

  ```bash
  mvn test -Dcucumber.options="--plugin html:target/cucumber-report.html"
  ```
* **Generate JSON Report (Python)**:

  ```bash
  behave -f json.pretty -o reports/report.json
  ```
* **Custom tags**:

  ```bash
  # Run only @smoke tests
  mvn test -Dcucumber.options="--tags @smoke"
  ```

## CI/CD Integration

This project includes a GitHub Actions workflow (`.github/workflows/ci-cd.yml`) that:

* Checks out code
* Installs dependencies
* Runs BDD tests
* Publishes test reports as artifacts

Whenever you push to `main`, the pipeline will automatically execute and display the status above.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/YourFeature`
3. Commit your changes: `git commit -m "Add new BDD scenario for X"`
4. Push to the branch: `git push origin feature/YourFeature`
5. Open a Pull Request and describe your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Author

**Lamhot Siagian**

* GitHub: [LamhotJM](https://github.com/LamhotJM)
* Email: [lamhot@example.com](mailto:lamhot@example.com)

```
```
