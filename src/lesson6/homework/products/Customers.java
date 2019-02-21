package lesson6.homework.products;

public class Customers {
    private long id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private int postalcode;
    private String country;
    private String phone;
    private String fax;

    public Customers(long id, String companyName, String contactName, String contactTitle, String address, String city, String region, int postalcode, String country, String phone, String fax) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalcode = postalcode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }
}
