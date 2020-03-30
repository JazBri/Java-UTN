package com.company;

public class Libro {
    private String title;
    private float price;
    private int stock;
    private Autor autor;

//Empty constructor
    public Libro() {
    }

//Constructor
    public Libro(String title, float price, int stock, Autor autor){
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.autor = autor;
    }


//Setters
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setMoreStock(int more){
        setStock(this.stock + more);
    }
//Getters
    public Autor getAutor() {
        return autor;
    }


    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

//Methods

    @Override
    public String toString() {
        return "El libro {" +
                "title='" + title + '\'' +
                ", de =" + autor.getName() +
                ", se vende a =" + price +
                " pesos"
                ;
    }
}
