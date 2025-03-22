import java.util.List;

interface Reservable {
    boolean makeReservation();
    boolean cancelReservation();
    boolean isAvailable();
    List<Object> getAvailableTimeSlots();
}
