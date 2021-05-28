package com.company;

public class Detail {
    private String nameDetail;
    private String arc;
    private int price;


    public static Detail det = new Detail("Гайка", "4AC04D",17);

    public Detail (String nameDetail, String arc, int price) {
        this.nameDetail = nameDetail;
        this.arc = arc;
        this.price = price;

    }

    public void printAboutObject() {
        System.out.println("Делаль: ");
        System.out.println("Название запчасти: " + nameDetail);
        System.out.println("Артикул: " + arc);
        System.out.println("Цена: " + price);
        System.out.println();
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public String getArc() {
        return arc;
    }

    public void setArc(String arc) {
        this.arc = arc;
    }

    public String getNameDetail() {
        return nameDetail;
    }

    public void setNameDetail(String nameDetail) {
        this.nameDetail = nameDetail;
    }
}
