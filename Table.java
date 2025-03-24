public class Table implements Reservable {

    private int tableNumber;
    private int capacity;
    private boolean isOccupied;
    private String reservationStatus;

    // constructor
    public Table(int tableNumber, int capacity, boolean isOccupied) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = isOccupied;
    }

    // getters
    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    // setters
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public boolean makeReservation() {
        if (!isOccupied) {
            reservationStatus = "Reserved";
            isOccupied = true;
            System.out.println("Reservation made for table " + tableNumber);
            return true;
        } else {
            System.out.println("Table " + tableNumber + " is already occupied.");
            return false;
        }
    }

    @Override
    public boolean cancelReservation() {
        if (isOccupied) {
            reservationStatus = "Available";
            isOccupied = false;
            System.out.println("Reservation for table " + tableNumber + " has been canceled.");
            return true;
        } else {
            System.out.println("Table " + tableNumber + " is not reserved.");
            return false;
        }
    }

    @Override
    public boolean isAvailable() {
        return !isOccupied;
    }
}
