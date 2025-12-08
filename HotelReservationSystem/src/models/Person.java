package models;

public abstract class Person implements Payable {
    private String phone;
    private String fullName;
    private String email;
    private String nationalId;
    private String address;

    public Person() {
        fullName = "doaa amer ahmed";
        phone = "01152505710";
        email = "doaaamer@gmail.com";
        nationalId = "30701030100827";
        address = "Giza ";
    }

    public Person(String fullName, String phone, String email, String nationalId, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.nationalId = nationalId;
        this.address = address;
    }

    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getAddress() {
        return address;
    }

    public abstract double pay();
}
