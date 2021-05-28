package com.company;

public class Supply {

    private int number;
    private String date;


    public static Supply det = new Supply(1500, "Тридцатое апреля");

    public Supply (int number, String date) {
        this.number = number;
        this.date = date;
    }

    public void printAboutObject() {
        System.out.println("Готовое: ");
        System.out.println("Количество: " + number);
        System.out.println("Дата: " + date);
        System.out.println();
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
