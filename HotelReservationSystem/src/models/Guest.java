package models;

import java.time.*;
import java.util.ArrayList;

public class Guest extends Person {
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private ArrayList<Service> services = new ArrayList<>();

    public Guest(String fullName, String phone, String email, String nationalId, String address) {
        super(fullName, phone, email, nationalId, address);
    }

    public void assignRoom(Room room, LocalDate in, LocalDate out) {
        this.room = room;
        this.checkIn = in;
        this.checkOut = out;
    }

    public void addServices(Service s) {
        services.add(s);
    }

    @Override
    public double pay() {
        long days = checkOut.toEpochDay() - checkIn.toEpochDay();
        double total = 0;
        if (room != null)
            total += room.getPrice() * days;
        for (Service s : services)
            total += s.getServicePrice();
        return total;
    }

    @Override
    public double calculatePayment() {
        return pay();
    }

    @Override
    public void printInvoice() {
        System.out.println("Invoice for Guest: " + getName());
        if (room != null)
            System.out.println("Room: " + room.getRoomId() + "\nprice: " + room.getPrice());
        for (Service s : services)
            System.out.println("Service: " + s.getServiceName() + "\nPrice: " + s.getServicePrice());
        System.out.println("Total Payment: " + calculatePayment());
    }

    @Override
    public String getPaymentDetails() {
        String details = "Invoice for Guest: " + getName() + "\n";
        if (room != null)
            details += "Room: " + room.getRoomId() + "\n Price: " + room.getPrice() + "\nfloor: " + room.getFloor()
                    + "Status: " + room.getStatus() + "view" + room.getView() + "\ntype: " + room.getType()
                    + "\nAmenities:" + room.getAmenities() + "\n";
        for (Service s : services)
            details += "Service: " + s.getServiceName() + "\nPrice: " + s.getServicePrice() + "\nservices id:"
                    + s.getServiceId() + "\n";
        details += "Total Payment: " + calculatePayment();
        return details;
    }
}
