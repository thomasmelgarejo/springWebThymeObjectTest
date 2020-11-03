package com.example.demo;

public class Person
{
    private String fornavn;
    private String efternavn;
    private String titel;
    private boolean gift;

    public Person(String fornavn, String efternavn, String titel, boolean gift) {
        this.gift = gift;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.titel = titel;
    }

    public Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", titel='" + titel + '\'' +
                ", gift=" + gift +
                '}';
    }

    public boolean isGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
