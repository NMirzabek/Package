package oop.pdp;

public class Books {
    private String author;
    private double price;
    private double discount;
    private String title;
    private int pageNumbers;

    public Books(String author, double price, double discount, String title, int pageNumbers) {
        this.author = author;
        this.price = price;
        this.discount = discount;
        this.title = title;
        this.pageNumbers = pageNumbers;
    }
    public Books() {
    }

    public double customExpense(){ //customs fee
        return this.price * 0.3;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
}
