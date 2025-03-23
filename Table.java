import java.util.List;

public class Table implements Reservable {
    private int tableNumber;
    private int capacity;
    private boolean isOccupied;
    private List<Customer> currentCustomers;
    private String reservationStatus;
    private Employee assignedWaiter;

    // constructor
    public Table(int tableNumber, int capacity, boolean isOccupied, Employee assignedWaiter) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = isOccupied;
        this.assignedWaiter = assignedWaiter;
    }

    // getters
    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public List<Customer> getCurrentCustomers() {
        return currentCustomers;
    }

    public String reservationStatus() {
        return reservationStatus;
    }

    public Employee getAssignedWaiter() {
        return assignedWaiter;
    }

    // setters
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setCurrentCustomers(List<Customer> currentCustomers) {
        this.currentCustomers = currentCustomers;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void setAssignedWaiter(Employee assignedWaiter) {
        this.assignedWaiter = assignedWaiter;
    }
}
