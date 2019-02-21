package lesson6.homework.products;

import java.util.Date;

public class Orders {
    private long id;
    private Customers customer;
    private Employees employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Shippers shipVia;
    private double freight;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private int shipPostalcode;
    private String shipCountry;

    public Orders(long id, Customers customer, Employees employee, Date orderDate, Date requiredDate, Date shippedDate, Shippers shipVia, double freight, String shipAddress, String shipCity, String shipRegion, int shipPostalcode, String shipCountry) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalcode = shipPostalcode;
        this.shipCountry = shipCountry;
    }
}
