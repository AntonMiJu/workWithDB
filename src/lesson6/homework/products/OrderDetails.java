package lesson6.homework.products;

public class OrderDetails {
    private Orders order;
    private Products product;
    private double unitPrice;
    private int quantity;
    private double discount;

    public OrderDetails(Orders order, Products product, double unitPrice, int quantity, double discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
