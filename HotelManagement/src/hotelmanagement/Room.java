/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement;

/**
 *
 * @author debbs
 */
class Room {
    private int number;
    private int numBeds;
    private int type;
    private Client client;
    private int checkOutDate;

    public Room(int number, int numBeds, int type) {
        this.number = number;
        this.numBeds = numBeds;
        this.type = type;
        this.client = null;
        this.checkOutDate = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public int getType() {
        return type;
    }

    public boolean isEmpty() {
        return client == null;
    }

    public void checkIn(Client client, int checkOutDate) {
        this.client = client;
        this.checkOutDate = checkOutDate;
        System.out.println("Room " + number + " booked by Client " + client.getId() +
                " until Day " + checkOutDate);
    }

    public void checkOut() {
        System.out.println("Room " + number + " vacated on Day " + checkOutDate);
        this.client = null;
        this.checkOutDate = 0;
    }

    public int getCheckOutDate() {
        return checkOutDate;
    }
}

