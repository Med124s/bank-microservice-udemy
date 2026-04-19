# 🏦 Microservices Banking System

This project is a **Spring Boot Microservices Architecture** using **Spring Cloud Config Server**, **Docker**, and **RabbitMQ**.

---

## 🚀 Tech Stack

* ☕ Java 21
* 🌱 Spring Boot
* ☁️ Spring Cloud Config Server
* 🐳 Docker & Docker Compose
* 🐰 RabbitMQ (Message Broker)
* 📦 GitHub (Config Repository)

---

## 📁 Project Structure

```
v2-spring-cloud-config/
│── configserver/   # Centralized configuration server
│── accounts/       # Accounts microservice
│── loans/          # Loans microservice
│── cards/          # Cards microservice
│── docker-compose.yml
```

---

## ⚙️ Configuration Server

* Runs on: `http://localhost:8071`
* Fetches config from GitHub:

  ```
  https://github.com/Med124s/bank-config
  ```
* Example:

  ```
  http://localhost:8071/accounts/prod
  ```

---

## 🐳 Run with Docker

```bash
docker-compose up -d
```

---

## 🔄 Health Check

Each service uses Spring Boot Actuator:

```
/actuator/health
```

Docker ensures services start in order using:

```yaml
depends_on:
  configserver:
    condition: service_healthy
```

---

## 📨 Message Broker

RabbitMQ is used for:

* Config refresh
* Event-driven communication

Default access:

* URL: http://localhost:15672
* Username: guest
* Password: guest

---

## 🔐 Encryption API

Config Server provides encryption endpoints:

* Encrypt:

  ```
  POST /encrypt
  ```
* Decrypt:

  ```
  POST /decrypt
  ```

---

## 📌 Notes

* Configurations are stored in a separate Git repository
* `force-pull` ensures latest updates are always fetched
* `clone-on-start` loads config at startup

---

## 👨‍💻 Author

**Mohamed Ben-yghil**
Software Engineering

---

## ⭐ Future Improvements

* Add API Gateway
* Integrate Eureka Service Discovery
* Add centralized logging (ELK)
* CI/CD pipeline (GitHub Actions)

---
