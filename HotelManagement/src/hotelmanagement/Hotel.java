/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement;

/**
 *
 * @author debbs
 */
class Hotel {
    private String name;
    private Floor[] floors;

    public Hotel(String name, int numFloors, int numRoomsPerFloor) {
        this.name = name;
        this.floors = new Floor[numFloors];
        createFloors(numRoomsPerFloor);
    }

    private void createFloors(int numRoomsPerFloor) {
        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(i + 1, numRoomsPerFloor);
        }
    }

    public Floor getFloor(int floorNumber) {
        for (Floor floor : floors) {
            if (floor.getNumber() == floorNumber) {
                return floor;
            }
        }
        return null;
    }

    public Room searchRoom(int numBeds, int type, int desiredFloor) {
        if (desiredFloor > 0) {
            Floor floor = getFloor(desiredFloor);
            if (floor != null) {
                return floor.searchRoom(numBeds, type);
            }
        } else {
            for (Floor floor : floors) {
                Room room = floor.searchRoom(numBeds, type);
                if (room != null) {
                    return room;
                }
            }
        }
        return null;
    }
    
    

    public void bookRoom(Room room, Client client, int checkOutDate) {
        room.checkIn(client, checkOutDate);
    }

    public void emptyRooms(int currentDay) {
        for (Floor floor : floors) {
            floor.emptyRooms(currentDay);
        }
    }

    public void serviceClient(Client client, int currentDay) {
        Room availableRoom = searchRoom(client.getNumBeds(), client.getRoomType(), client.getDesiredFloor());
        if (availableRoom != null) {
            bookRoom(availableRoom, client, currentDay + client.getStayDays());
        } else {
            System.out.println("No available room for Client " + client.getId());
        }
    }
}
