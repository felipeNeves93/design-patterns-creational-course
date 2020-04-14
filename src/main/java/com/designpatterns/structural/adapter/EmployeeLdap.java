package com.designpatterns.structural.adapter;

public class EmployeeLdap {

    private final String cn;
    private final String givenName;
    private final String surname;
    private final String mail;

    public EmployeeLdap(String cn, String givenName, String surname, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public String getCn() {
        return this.cn;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMail() {
        return mail;
    }
}
