## 🚀 Microservices Banking System

A **Spring Boot Microservices Architecture** for a banking system, enhanced with **containerized MySQL databases** and orchestrated using **Docker Compose**.

---

## 🧰 Tech Stack

* ☕ **Java 21**
* 🌱 **Spring Boot**
* ☁️ **Spring Cloud Config Server**
* 🐳 **Docker & Docker Compose**
* 🐰 **RabbitMQ**
* 🛢️ **MySQL (Containerized per service)**
* 📦 **GitHub (External Config Repository)**

---

## 🏗️ Architecture Overview

* Each microservice has its **own dedicated MySQL database container**
* Services communicate via **REST APIs** and **RabbitMQ**
* Centralized configuration using **Spring Cloud Config Server**
* All services connected through a **custom Docker network**

---

## 📁 Project Structure

```bash
microservices-banking-system/
│
├── Configurations_management_microservices/
│   ├── configserver/        # Spring Cloud Config Server
│   └── config-repo/         # External configuration repository (Git-based)
│   ├── accounts/            # Accounts microservice
│   ├── loans/               # Loans microservice
│   ├── cards/               # Cards microservice
│   ├── docker-compose.yml   # Docker orchestration (services + databases)
│   └── common-config.yml    # Shared Docker configuration
│
├── Microservices_MySQL_DB_Containers/
│   ├── configserver/        # Spring Cloud Config Server
│   └── config-repo/         # External configuration repository (Git-based)
│   ├── accounts/            # Accounts microservice
│   ├── loans/               # Loans microservice
│   ├── cards/               # Cards microservice
│   ├── docker-compose.yml   # Docker orchestration (services + databases)
│   └── common-config.yml    # Shared Docker configuration
│
└── README.md
```

---

## 🐳 Docker Compose Setup

### 🔹 Microservices

* `accounts-ms`
* `loans-ms`
* `cards-ms`
* `configserver-ms`

### 🔹 Databases (MySQL Containers)

* `accountsdb`
* `loansdb`
* `cardsdb`

Each service connects to its database using the container name:

```properties
SPRING_DATASOURCE_URL=jdbc:mysql://accountsdb:3306/accountsdb
```

---

## 🌐 Docker Network

* Custom network: `mbenyghil` (bridge)
* Enables communication between containers using **service names** instead of `localhost`

---

## 🔄 Service Startup & Health Checks

Services start in the correct order using:

```yaml
depends_on:
  configserver:
    condition: service_healthy
```

Health check endpoint:

```bash
/actuator/health
```

---

## 📨 Message Broker (RabbitMQ)

Used for:

* 🔁 Configuration refresh
* 📡 Event-driven communication

Default access:

* URL: http://localhost:15672
* Username: `guest`
* Password: `guest`

---

## ▶️ Run the Project

```bash
docker-compose up -d
```

---

## 📌 Key Improvements (Latest Update)

* ✅ Added **MySQL container per microservice**
* ✅ Improved **service isolation and scalability**
* ✅ Configured **Docker networking for inter-service communication**
* ✅ Integrated **health checks for reliable startup order**

---

## 👨‍💻 Author

**Mohamed Benyghil**
Software Engineering

---

## ⭐ Future Improvements

* API Gateway
* Eureka Service Discovery
* Centralized Logging (ELK Stack)
* CI/CD Pipeline (GitHub Actions)
