# Employee Management API (Java)  
A simple RESTful API built in Java that allows adding employees and viewing all employees.  
This project was created as a basic backend assignment to demonstrate API development skills.

---

## 🚀 Features
- Add a new employee  
- View all employees  
- Simple in-memory storage  
- Lightweight & fast to run  
- Clear API endpoints  

---

## 🛠 Technologies Used
- Java  
- Spring Boot *(if applicable—remove if not used)*  
- JSON (for request/response formatting)  
- REST API  

---

## 📌 API Endpoints

### 1️⃣ Add Employee  
**POST** `/employees`

**Request Body**
```json
{
  "id": 1,
  "name": "Ahmed Hassan",
  "position": "Backend Developer"
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
    "position": "Backend Developer"
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

*(If you used Spring Boot:)*  
```bash
mvn spring-boot:run
```

---

## 📸 Output Screenshot
Screenshot of successful API output is included in the repository under `/screenshots`.

---

## 📁 Project Structure (Example)

```
/src
  ├── Employee.java
  ├── EmployeeService.java
  ├── Main.java
  └── ...
/screenshots
  └── output.png
README.md
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

