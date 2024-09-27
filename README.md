# Hotel-Reservation-Simulation
This project implements a hotel reservation system that simulates the management of rooms and bookings in a hotel environment. The system allows clients to request rooms with various specifications (number of beds, room type, desired floor) and handles bookings based on availability.

Features

  Client Management: Represents hotel guests and their booking preferences. Automatically assigns unique IDs to each client and randomly decides booking details.
  Room Management: Represents individual hotel rooms with attributes like room number, number of beds, room type (standard or superior), and the current occupant.
  Floor Management: Manages a collection of rooms on each floor, including methods for searching available rooms and releasing them after checkout.
  Hotel Management: Central class that oversees the entire hotel, managing multiple floors and rooms. Implements booking and room availability checking.
  Simulation Logic: Repeats a process simulating the passing of days in the hotel, where rooms are checked for availability, and clients are created randomly to request bookings.

Implementation Details

  Classes:
  Client: Handles client attributes and booking decisions.
  Room: Manages room details and availability.
  Floor: Contains a collection of rooms and handles room-related methods.
  Hotel: The main class that orchestrates the hotel operations.
  Main: Executes the simulation, creating the hotel, defining rooms, and running the booking process.

Technologies Used:
Java programming language
