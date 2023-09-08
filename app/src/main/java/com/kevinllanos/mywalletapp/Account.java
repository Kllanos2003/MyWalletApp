package com.kevinllanos.mywalletapp;

public class Account {
    private String name;
    private String typeAccount;
    private Double currentValue;

    public Account(String name, String typeAccount, Double currentValue) {
        this.name = name;
        this.typeAccount = typeAccount;
        this.currentValue = currentValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
