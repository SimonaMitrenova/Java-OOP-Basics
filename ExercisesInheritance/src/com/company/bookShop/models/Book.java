package com.company.bookShop.models;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || !this.isAuthorNameValid(author)){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    private boolean isAuthorNameValid(String author) {
        String[] authorParams = author.split("\\s+");
        if (authorParams.length > 1 && Character.isDigit(authorParams[1].charAt(0))){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator());
        output.append("Title: ").append(this.getTitle()).append(System.lineSeparator());
        output.append("Author: ").append(this.getAuthor()).append(System.lineSeparator());
        output.append("Price: ").append(String.format("%.1f", this.getPrice())).append(System.lineSeparator());

        return output.toString();
    }
}
