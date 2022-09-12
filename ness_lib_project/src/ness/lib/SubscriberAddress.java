package ness.lib;

public class SubscriberAddress {
    String streetName;
    String city;
    String country;
    int zipCode;
    int streetNumber;

    public SubscriberAddress(String streetName,int zipCode, String city,String country, int streetNumber) {
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}
