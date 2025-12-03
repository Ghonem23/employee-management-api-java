# Employee Management API (Java – Spring Boot)
A clean and simple RESTful API built using Java and Spring Boot that allows adding new employees and retrieving all employees.
This project was created as part of a backend assignment to demonstrate real-world API development skills, layered architecture, and clean code organization.

---

## 🚀 Features
- ➕ Add a new employee
- 👀 View all employees
- 💾 In-memory storage for simplicity
- ⚡ Lightweight, fast, and easy to run
- 🧩 Layered architecture (Controller → Service → Repository)

---

## 🛠 Technologies Used
- Java  
- Spring Boot
- JSON
- REST API  

---

## 📌 API Endpoints

### 1️⃣ Add Employee  
**POST** `/employees`

**Request Body**
```json
{
  "id": 1,
  "name": "Ahmed Hussein",
  "email": "ahmghonem23@gmail.com",
  "role": "Backend Developer"
}
```

**Response**
```json
{
  "message": "Employee added successfully"
}
```

---

### 2️⃣ View All Employees  
**GET** `/employees`

**Response**
```json
[
  {
    "id": 1,
    "name": "Ahmed Hussein",
    "email": "ahmghonem23@gmail.com",
    "role": "Backend Developer"
  }
]
```

---

## ▶ How to Run the Project
1. Clone the repository:
```bash
git clone https://github.com/Ghonem23/employee-api-java.git
```

2. Navigate to the project:
```bash
cd employee-api-java
```

3. Compile and run:
```bash
javac *.java
java Main
```

```bash
mvn spring-boot:run
```

---

## 📸 Output Screenshot
Screenshot of successful API output is included in the repository under `/screenshots`.
<img width="1853" height="425" alt="Welcome page" src="https://github.com/user-attachments/assets/02c97caf-e1e0-4e82-b802-28c98e932826" />
<img width="1542" height="854" alt="Dispaly all employees" src="https://github.com/user-attachments/assets/306ed8eb-0a5f-450f-9a4f-baf962153ab3" />
<img width="1848" height="431" alt="Create 2nd employee" src="https://github.com/user-attachments/assets/d7f1dc57-c77d-402e-908b-ebcbc9a46270" />
<img width="1848" height="431" alt="Create 1st employee" src="https://github.com/user-attachments/assets/58cc99f9-c07b-4814-a668-9edd02b19dff" />
<img width="1848" height="431" alt="Browser view" src="https://github.com/user-attachments/assets/a2066296-c4d9-4468-97a0-bde28c9ae5aa" />

---

## 📁 Project Structure (Example)

```
employee-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ghonem/
│   │   │           └── employee_api/
│   │   │               ├── controller/
│   │   │               │   ├── EmployeeController.java
│   │   │               │   └── WelcomeController.java
│   │   │               │
│   │   │               ├── model/
│   │   │               │   └── Employee.java
│   │   │               │
│   │   │               ├── repository/
│   │   │               │   └── EmployeeRepository.java
│   │   │               │
│   │   │               ├── Screenshot of output/
│   │   │               │   ├── Browser view.png
│   │   │               │   ├── Create 1st employee.png
│   │   │               │   ├── Create 2nd employee.png
│   │   │               │   ├── Display all employees.png
│   │   │               │   └── Welcome page.png
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── EmployeeService.java
│   │   │               │
│   │   │               └── EmployeeApiApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── (test files if any)
│
├── target/
├── .gitattributes
├── .gitignore
└── README.md
```

---

## 👤 Author
**Ahmed Hussein Mohamed**  
Junior Software Engineer  

- 📧 Email: ahmghonem23@gmail.com  
- 📱 Mobile: +201151476406  
- 🔗 LinkedIn: www.linkedin.com/in/ahmed-hussein-277468361  
- 🧾 GitHub: https://github.com/Ghonem23  

---

## ⭐ Feedback
If you have any suggestions or improvements, feel free to open an issue or submit a pull request.

