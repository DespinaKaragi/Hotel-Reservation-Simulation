
package hotelmanagement;
import java.util.Random;

public class Main {
    public static final int NUM_FLOORS = 4;
    public static final int NUM_ROOMS_PER_FLOOR = 10;
    public static final int SIMULATION_DAYS = 10;

    public static void main(String[] args) {
        createHotel();
        runSimulation();
    }

    private static void createHotel() {
        
    }

    private static void runSimulation() {
        Hotel hotel = new Hotel("MyHotel", NUM_FLOORS, NUM_ROOMS_PER_FLOOR);

        for (int day = 1; day <= SIMULATION_DAYS; day++) {
            System.out.println("\nSimulation Day " + day + ":");
            hotel.emptyRooms(day);

            int numCustomers = new Random().nextInt(5); // Random number of customers 
            for (int i = 0; i < numCustomers; i++) {
                Client client = new Client(NUM_FLOORS, 2); // Assuming 2 room types (std and sup)
                hotel.serviceClient(client, day);
            }
        }
    }
}
