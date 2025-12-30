# Sports Reservations Microservice (Spring Boot + MySQL)

This project is a backend microservice for managing **sports courts, sports groups, trainers and training/competition time slots**.

The system provides a REST API for creating, validating and querying
sports time slots across different resources.

The application was developed as part of the *Mikroservisne aplikacije* course at RAF.

---

## 🧩 Domain Model

### Court
- code
- type (indoor / outdoor)
- capacity

### Sports Group
- code
- sport type
- max members
- group type (recreational / competitive)

### Trainer
- first name
- last name
- title
- specialization

### Term (Time Slot)
- court
- trainer
- sports group
- day of week
- start time / end time
- term type (training / competition / free slot)

All entities are persisted in **MySQL** using **Spring Data JPA**.

---

## 🛠 Tech Stack

Backend:
- Spring Boot
- Spring Data JPA (Hibernate)

Database:
- MySQL

API:
- REST (JSON)

Testing:
- Postman / HTTP client
---

## 🚀 Features

### ✔ Create & manage domain entities
- add courts, groups and trainers
- create new time slots (terms)
- validate entity existence before persisting

If referenced entities do not exist → request is rejected.

---

### ✔ Retrieve & search data
- get court by code
- get sports groups by sport type
- get trainers by name
- list all terms for:
  - specific court
  - specific trainer
  - specific sports group

---

### ✔ Time slot schedule management
- add new scheduled term
- delete term based on:
  - court
  - day of week
  - start time

---

### ✔ Sorting & filtering
Get all terms sorted by:
- court
- day of week + start time
- term type

Query support for:
- day + court
- sports group
- trainer
- group type
- term type

---

### ⚠ Conflict rules

When inserting a new term:

- court must be free in requested timeslot  
- trainer must be free in requested timeslot  

If conflict exists → request returns an error response.

Each term has **exactly one trainer**,  
but a trainer may work with multiple groups.
