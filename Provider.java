package com.company;

public class Provider {
    private String nameProvider;
    private String address;
    private int phone;


    public static Provider provider = new Provider("ФОС", "ул.Чульминова 44",66-33-55);

    public Provider (String nameProvider, String address, int phone) {
        this.nameProvider = nameProvider;
        this.address = address;
        this.phone = phone;

    }

    public void printAboutObject() {
        System.out.println("Информация о поставщике: ");
        System.out.println("Поставщик: " + nameProvider);
        System.out.println("Адрес: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNameProvider(String nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String getNameProvider() {
        return nameProvider;
    }

    public int getPhone() {
        return phone;
    }


    public void setPhone(int phone) {
        this.phone = phone;
    }

}
