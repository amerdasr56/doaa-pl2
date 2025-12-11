package models;

import java.util.*;

public class Room implements Payable {
    private String roomId;
    private String type;
    private double price;
    private String status;
    private ArrayList<String> amenities;  // e.g., "WiFi,TV,MiniBar" = additional services
    private int floor;
    private String view;

    public Room(String roomId, String type, double price, String status, String amenities, int floor, String view) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.status = status;
        this.amenities = new ArrayList<>(Arrays.asList(amenities.split(",")));  // Split amenities by comma
        this.floor = floor;
        this.view = view;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void addAmenity(String amenity) {
        amenities.add(amenity);
    }

    public void removeAmenity(String amenity) {
        amenities.remove(amenity);
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public double calculatePayment() {
        return price;
    }

    @Override
    public void printInvoice() {
        System.out.println("Room: " + roomId + ", Price: " + price);
    }

    @Override
    public String getPaymentDetails() {
        return "Room:" + roomId + "\nRoomType:" + type + "\nPrice:" + price + "\nstatus:" + status + "\nAmenities:"
                + amenities + "\nFloor:" + floor + "\n View:" + view;
    }

}
