/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement;

/**
 *
 * @author debbs
 */
class Floor {
    private int number;
    private Room[] rooms;

    public Floor(int number, int numRooms) {
        this.number = number;
        this.rooms = new Room[numRooms];
        setRoomData();
    }

    private void setRoomData() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(number * 100 + i + 1, i % 2 + 2, i % 2 + 1);
        }
    }

    public Room searchRoom(int numBeds, int type) {
        for (Room room : rooms) {
            if (room.isEmpty() && room.getNumBeds() == numBeds && room.getType() == type) {
                return room;
            }
        }
        return null;
    }

    public void emptyRooms(int currentDay) {
        for (Room room : rooms) {
            if (!room.isEmpty() && room.getNumber() < 100 * (number + 1) &&
                    room.getCheckOutDate() <= currentDay) {
                room.checkOut();
            }
        }
    }

    public int roomIndexFromNumber(int roomNumber) {
        int index = roomNumber % 100 - 1;
        return (index >= 0 && index < rooms.length) ? index : -1;
    }

    public int getNumber() {
        return number;
    }

   
}

