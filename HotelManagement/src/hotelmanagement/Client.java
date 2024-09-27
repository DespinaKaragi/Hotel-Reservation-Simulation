
package hotelmanagement;

/**
 *
 * @author debbs
 */
import java.util.Random;

class Client {
    private static int clientIdCounter = 1;

    private int id;
    private int numBeds;
    private int roomType;
    private int desiredFloor;
    private int stayDays;

    public Client(int numFloors, int numRoomTypes) {
        this.id = clientIdCounter++;
        decideBooking(numFloors, numRoomTypes);
    }

    private void decideBooking(int numFloors, int numRoomTypes) {
        Random random = new Random();

        this.numBeds = random.nextInt(2) + 2; // 2 or 3 beds
        this.roomType = random.nextInt(numRoomTypes) + 1; // 1 for std, 2 for sup
        this.desiredFloor = random.nextInt(numFloors) + 1; // 1 to numFloors
        this.stayDays = random.nextInt(5) + 1; // 1 to 5 days

        System.out.println("Client " + id + " wants a room: Beds: " + numBeds +
                ", Type: " + (roomType == 1 ? "std" : "sup") +
                ", Floor: " + (desiredFloor == 0 ? "Any" : desiredFloor) +
                ", Stay Days: " + stayDays);
    }

    public int getId() {
        return id;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public int getRoomType() {
        return roomType;
    }

    public int getDesiredFloor() {
        return desiredFloor;
    }

    public int getStayDays() {
        return stayDays;
    }
}

