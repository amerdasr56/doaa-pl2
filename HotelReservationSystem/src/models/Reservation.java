package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Reservation implements Payable {
    private String reservationID;
    private Guest guest;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private ArrayList<Service> services = new ArrayList<>();

    public Reservation(String reservationID, Guest guest, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationID = reservationID;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void addService(Service s) {
        services.add(s);
    }

    @Override
    public double calculatePayment() {
        long days = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        double total = 0;
        if (room != null)
            total += room.getPrice() * days;
        for (Service s : services)
            total += s.getServicePrice();
        return total;
    }

    @Override
    public void printInvoice() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Guest: " + guest.getName());
        if (room != null)
            System.out.println("Room: " + room.getRoomId() + ", Price: " + room.getPrice());
        for (Service s : services)
            System.out.println("Service: " + s.getServiceName() + ", Price: " + s.getServicePrice());
        System.out.println("Total Payment: " + calculatePayment());
    }

    @Override
    public String getPaymentDetails() {
        String details = "Reservation ID: " + reservationID + "\nGuest: " + guest.getName() + "\n";
        if (room != null)
            details += "Room: " + room.getRoomId() + ", Price: " + room.getPrice() + "\n";
        for (Service s : services)
            details += "Service: " + s.getServiceName() + ", Price: " + s.getServicePrice() + "\n";
        details += "Total Payment: " + calculatePayment();
        return details;
    }
}
