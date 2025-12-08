package models;

public class Service implements Payable {
    private String ServiceId;
    private String ServiceName;
    private double ServicePrice;

    public Service(String ServiceId, String ServiceName, double ServicePrice) {
        this.ServiceId = ServiceId;
        this.ServiceName = ServiceName;
        this.ServicePrice = ServicePrice;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public double getServicePrice() {
        return ServicePrice;
    }

    public void setServicePrice(double ServicePrice) {
        this.ServicePrice = ServicePrice;
    }

    @Override
    public void printInvoice() {
        System.out.println("Service: " + ServiceName + "\nServicePrice: " + ServicePrice);
    }

    @Override
    public double calculatePayment() {
        return ServicePrice;
    }

    @Override
    public String getPaymentDetails() {
        return "Service: " + ServiceName + "\n ServiceId: " + ServiceId + "\nServicePrice: " + ServicePrice;
    }

}
