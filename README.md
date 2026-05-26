# Pensionat Booking Backend

Backend API for a guesthouse booking system built with Java and Spring Boot.

The application handles customers, rooms and bookings, including booking validation, room availability, account management and database persistence.

---

## Related Repository

**Frontend:** [pensionat-booking-frontend](https://github.com/Igor-01-Gomes/pensionat-booking-frontend)

## Architecture Overview

```text
User
  ↓
Frontend (Next.js / React)
  ↓ REST API
Backend (Spring Boot)
  ↓ Spring Data JPA / Hibernate
MySQL Database
```

---

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Dotenv
- JUnit
- Mockito
- Bean Validation
- Spring Security Crypto

---

## Project Structure

The backend is organized into separate layers:

- **Controller layer** – Handles API requests and responses
- **Service layer** – Contains business logic and validation
- **Repository layer** – Handles database access through Spring Data JPA
- **Entity classes** – Represent database tables
- **DTOs** – Used for request and response data
- **Exceptions** – Custom error handling for invalid operations

---

## Functionality

The backend supports:

1. Customer registration and login
2. Updating customer information
3. Deleting customer accounts
4. Preventing account deletion when active bookings exist
5. Room management
6. Creating bookings
7. Updating bookings
8. Cancelling bookings
9. Preventing double bookings for the same room and date interval
10. Searching available rooms
11. Handling room types and extra beds
12. Returning clean DTO responses to the frontend

---

## Database

The application uses a MySQL database.

The main entities are:

- **CustomerEntity**
- **RoomEntity**
- **BookingEntity**

Bookings are connected to both customers and rooms through relational mappings.

---

## Business Rules

- A room cannot be double booked for overlapping dates
- A booking must have a valid start and end date
- Extra beds are only allowed for double rooms
- A customer cannot delete their account while having active bookings
- Cancelled bookings can be removed when deleting a customer account

---

## Configuration

The application uses Dotenv and environment variables for local database configuration.

Create a `.env` file in the project root with:

```env
DB_USERNAME=your_username
DB_PASSWORD=your_password
```

---

## Testing

The backend includes unit tests using JUnit and Mockito for parts of the service layer and business validation logic.

---

## Running the Application

The backend runs locally on:

```text
http://localhost:8080
```
> Make sure the MySQL database is running and correctly configured before starting the application.

---

## Team

- Patric Westman
- Daniel Lyytikäinen
- Niklas Dahlström
- Igor Gomes