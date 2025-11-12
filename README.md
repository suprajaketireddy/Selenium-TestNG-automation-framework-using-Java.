# 🧪 Selenium Automation Project

This is a **Page Object Model (POM)** based automation framework built using **Selenium WebDriver**, **Java**, and **TestNG**, integrated with **Extent Reports** for visual reporting.


---

## 📂 Project Overview
The DemoQA Automation Framework is developed using Java, Selenium WebDriver, and TestNG.
It automates various test scenarios on the DemoQA
 web application, covering real-world functionalities such as Alerts, Frames, Windows, and Web Elements.

This project follows the Page Object Model (POM) design pattern for clean separation between test scripts and page logic.


---

## 🧰 Tech Stack Used
| Category | Tools / Technologies |
|-----------|----------------------|
| **Programming Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **Testing Framework** | TestNG |
| **Build Management Tool** | Maven |
| **Design Pattern** | Page Object Model (POM) |
| **Browser** | Google Chrome  |
| **Version Control** | Git and GitHub |
| **IDE Used** | Eclipse |
---

## 🗂 Folder Structure

```text
DemoQAAutomationFramework/
│
├── pom.xml
├── testng.xml
├── src/
│   ├── main/java/
│   │   ├── base/
│   │   │   └── BaseTest.java
│   │   ├── pages/
│   │   │   ├── HomePage.java
│   │   │   ├── TextBoxPage.java
│   │   │   ├── AlertsPage.java
│   │   │   ├── WindowsPage.java
│   │   │   └── FramesPage.java
│   │   └── reports/
│   │       └── ExtentManager.java
│   │
│   └── test/java/
│       └── tests/
│           ├── TextBoxTest.java
│           ├── AlertsTest.java
│           ├── WindowsTest.java
│           └── FramesTest.java
└── test-output/

```
## ⚙️ Execution Steps

### 1️⃣ Clone the Repository
```
bash
git clone https://github.com/<your-username>/SeleniumAutomation.git
cd SeleniumAutomation
```
### 2️⃣ Import into IDE
```
 Open the project in Eclipse as a Maven Project.

Ensure you have Java 8+, Maven, and ChromeDriver installed on your system.
```
###  3️⃣ Install Dependencies
```
Run Maven to download all required dependencies from the pom.xml file:

mvn clean install
```
 ###   4️⃣ Run the Tests
```
You can execute tests in two ways:

  Option 1: From IDE

Right-click on the testng.xml file → choose Run as → TestNG Suite

  Option 2: From Terminal

mvn test
```
###    5️⃣ View Reports
```
After execution, TestNG automatically generates a report.
You can open it from the following path:

/test-output/index.html
```

