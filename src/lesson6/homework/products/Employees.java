package lesson6.homework.products;

import java.util.Date;

public class Employees {
    private long id;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private int postalcode;
    private String country;
    private String phone;
    private String expensions;
    private String photo;
    private StringBuffer notes;
    private Employees reportsTo;

    public Employees(long id, String lastName, String firstName, String title, String titleOfCourtesy, Date birthDate, Date hireDate, String address, String city, String region, int postalcode, String country, String phone, String expensions, String photo, StringBuffer notes, Employees reportsTo) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalcode = postalcode;
        this.country = country;
        this.phone = phone;
        this.expensions = expensions;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}
