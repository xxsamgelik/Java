package org.example;

public class Thema {

    private Type thema;
    private Types type;
    private boolean isActive;
    private String country;
    private int year;
    private String author;
    private Valuable value;

    public Thema(Type thema, boolean isActive, String country, int year, String author, Valuable value,Types type) {
        this.thema = thema;
        this.isActive = isActive;
        this.country = country;
        this.year = year;
        this.author = author;
        this.value = value;
        this.type=type;
    }


    @Override
    public String toString() {
        return "Тема изображения: " + thema + ", тип: " +type  + ", была ли отправлена?" + (isActive?"да":"нет")
                + ", Страна: " + country + ", Год: " + year + ", Автор: " + author
                + ", Ценность: " + value;
    }

    public void setType(Types type) {
        this.type = type;
    }
    public Types getType()
    {
        return type;
    }

    public Type getThema() {
        return thema;
    }

    public void setThema(Type thema) {
        this.thema = thema;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Valuable getValue() {
        return value;
    }

    public void setValue(Valuable value) {
        this.value = value;
    }
}
