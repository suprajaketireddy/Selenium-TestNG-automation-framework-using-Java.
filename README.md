# 🧪 Selenium E-Commerce Automation Project

This project automates the **Login** and **Product Search** functionalities of an e-commerce website using **Selenium WebDriver, Java, and TestNG**.  
It demonstrates a simple **Page Object Model (POM)** framework design to ensure modularity, reusability, and clean code structure.

---

## 📂 Project Overview
The objective of this mini framework is to validate core user flows such as:
- Launching the e-commerce portal ([https://www.demoblaze.com/](https://www.demoblaze.com/))
- Performing Login functionality
- Searching and selecting a product
- Managing browser sessions efficiently


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
git clone https://github.com/<your-username>/SeleniumEcommerceAutomation.git
cd SeleniumEcommerceAutomation
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

