# 🚀 OrangeHRM Employee Lifecycle Automation Framework

A robust **Hybrid Test Automation Framework** built using **Java, Selenium WebDriver, Rest Assured, Cucumber BDD, and Maven** to automate and validate the complete Employee Lifecycle Management process in OrangeHRM.

---

## 🌟 About the Project

This framework automates end-to-end employee management workflows and validates data consistency across both UI and API layers.

### Employee Lifecycle Workflow

```text
Login
  ↓
Add Employee
  ↓
Upload Profile Picture
  ↓
Search Employee
  ↓
Update Job Details
  ↓
Update Employment Status
  ↓
Validate Employee via API
  ↓
Delete Employee
  ↓
Logout
```

---

## 🏗 Framework Design

### UI Automation

* Selenium WebDriver
* Page Object Model (POM)
* Cross Browser Support
* Explicit Waits
* Screenshot Capture
* Reusable Utility Methods

### API Automation

* Rest Assured Integration
* API Request & Response Validation
* Employee Data Verification
* UI and API Data Comparison
* Reusable API Components

### Reporting

* Cucumber HTML Reports
* Execution Logs
* Failure Screenshots
* Step-Level Results

---

## 📁 Project Structure

```text
OrangeHRM_Automation
│
├── src/test/java
│   ├── com.orangehrm.base
│   │   ├── BaseClass.java
│   │   └── ApiBaseClass.java
│   │
│   ├── com.orangehrm.pages
│   │   ├── LoginPage.java
│   │   ├── DashboardPage.java
│   │   ├── AddEmployeePage.java
│   │   ├── EmployeeListPage.java
│   │   └── JobPage.java
│   │
│   ├── com.orangehrm.pojo
│   │   └── Employee.java
│   │
│   ├── com.orangehrm.stepdefinition
│   │   └── EmployeeLifecycleStep.java
│   │
│   ├── com.orangehrm.hooks
│   │   └── Hooks.java
│   │
│   └── com.orangehrm.utility
│       └── JsonReader.java
│
├── src/test/resources
│   ├── features
│   │   └── EmployeeLifeCycle.feature
│   │
│   ├── testdata
│   │   └── EmployeeData.json
│   │
│   └── profile
│       └── profile.png
│
└── target
    └── cucumber-reports
```

---

## 🛠 Technology Stack

| Technology         | Purpose               |
| ------------------ | --------------------- |
| Java 21            | Programming Language  |
| Selenium WebDriver | UI Automation         |
| Rest Assured       | API Testing           |
| Cucumber           | BDD Framework         |
| Maven              | Dependency Management |
| JUnit              | Assertions            |
| Jackson Databind   | JSON Processing       |
| WebDriverManager   | Driver Management     |
| Apache Commons IO  | File Utilities        |

---

## ⚙ Prerequisites

Before execution, ensure the following tools are installed:

* Java 21 or higher
* Maven 3.9+
* Git
* IntelliJ IDEA or Eclipse

---

## 📥 Installation

### Navigate to Project

```bash
cd OrangeHRM_Automation
```

### Install Dependencies

```bash
mvn clean install
```

---

## 🌐 Application Configuration

### URL

```text
https://opensource-demo.orangehrmlive.com/
```

### Login Credentials

```text
Username : Admin
Password : admin123
```

---

## 📄 Sample Test Data

```json
{
  "firstName": "Anusha",
  "lastName": "R",
  "jobTitle": "Account Assistant",
  "employmentStatus": "Freelance"
}
```

---

## ▶ Running Tests

### Execute Complete Test Suite

```bash
mvn test
```

### Execute from IDE

1. Import Maven Project
2. Update Maven Dependencies
3. Open Runner Class
4. Run as JUnit Test

---

## 🧪 Automated Scenario

```gherkin
Feature: Employee Lifecycle Management

Scenario: Verify complete employee lifecycle using UI and API

Given User launches OrangeHRM application
When User logs in with valid credentials
Then Dashboard should be displayed

When User adds a new employee
Then Employee should be created successfully

When User updates employee details
Then Updated details should be displayed

When User validates employee details using API
Then API data should match UI data

When User deletes employee
Then Employee should be removed successfully

When User logs out
Then Login page should be displayed
```

---

## 📊 Execution Results

The framework validates:

✅ Successful Login

✅ Employee Creation

✅ Profile Update

✅ API Verification

✅ Employee Deletion

✅ Successful Logout

---

## 📈 Reports

After execution, reports are generated under:

```text
target/cucumber-reports/
```

### Report Contents

* Execution Summary
* Scenario Results
* Step-Level Details
* Failure Screenshots
* Pass/Fail Statistics

---

## 💎 Framework Highlights

* Hybrid UI + API Automation Framework
* End-to-End Employee Lifecycle Validation
* Page Object Model Architecture
* Data-Driven Testing using JSON
* Reusable Components
* Maintainable and Scalable Design
* Cucumber BDD Reporting
* Industry Standard Framework Structure
* CI/CD Integration Ready

---

## 👩‍💻 Author

**Anusha**

Senior QA Automation Engineer

**Technology Stack:** Java | Selenium WebDriver | Rest Assured | Cucumber BDD | Maven

**Version:** 1.0.0

**Status:** ✅ Production Ready
