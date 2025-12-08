package models;

public interface Payable  {
    double calculatePayment();
    String getPaymentDetails();
    void printInvoice();

}
