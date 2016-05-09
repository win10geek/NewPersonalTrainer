package com.android.johnbalderson.mypersonaltrainer;

/**
 * Created by win10 on 5/3/2016.
 */
public class Customer {
    private long _id;
    private String _name, _address, _city, _state, _zip, _card_no, _card_expmo, _card_expyr;

    public Customer() {

    }

    public Customer(long id, String name, String address, String city, String state, String zip,
                    String card_no, String card_expmo, String card_expyr) {
        this._id = id;
        this._name = name;
        this._address = address;
        this._city = city;
        this._state = state;
        this._zip = zip;
        this._card_no = card_no;
        this._card_expmo = card_expmo;
        this._card_expyr = card_expyr;
    }

    public Customer(String name, String address, String city, String state, String zip,
                    String card_no, String card_expmo, String card_expyr)

    {
        this._name = name;
        this._address = address;
        this._city = city;
        this._state = state;
        this._zip = zip;
        this._card_no = card_no;
        this._card_expmo = card_expmo;
        this._card_expyr = card_expyr;
    }

    public void setID(long id) {
        this._id = id;
    }

    public long getID() {
        return this._id;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return this._name;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public String getAddress() {
        return this._address;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getCity() {
        return this._city;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getState() {
        return this._state;
    }

    public void setZip(String zip) {
        this._zip = zip;
    }

    public String getZip() {
        return this._zip;
    }

    public void setCardno(String cardno) {
        this._card_no = cardno;
    }

    public String getCardno() {
        return this._card_no;
    }

    public void setCardno_mo(String cardnoMo) {
        this._card_expmo = cardnoMo;
    }

    public String getCardno_mo() {
        return this._card_expmo;
    }

    public void setCardno_yr(String cardnoYr) {
        this._card_expyr = cardnoYr;
    }

    public String getCardno_yr() {
        return this._card_expyr;
    }

}

