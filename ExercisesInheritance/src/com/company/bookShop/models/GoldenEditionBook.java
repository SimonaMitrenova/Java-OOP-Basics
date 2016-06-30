package com.company.bookShop.models;

public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }

    @Override
    public void setPrice(double price) {
        double goldenPrice = price * 1.3;
        super.setPrice(goldenPrice);
    }
}
