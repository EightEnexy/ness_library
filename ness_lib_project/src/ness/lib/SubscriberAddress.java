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
    @SuppressWarnings("unused")
    public String getStreetName() {
        return streetName;
    }
    @SuppressWarnings("unused")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    @SuppressWarnings("unused")
    public String getCity() {
        return city;
    }
    @SuppressWarnings("unused")
    public void setCity(String city) {
        this.city = city;
    }
    @SuppressWarnings("unused")
    public String getCountry() {
        return country;
    }
    @SuppressWarnings("unused")
    public void setCountry(String country) {
        this.country = country;
    }
    @SuppressWarnings("unused")
    public int getZipCode() {
        return zipCode;
    }
    @SuppressWarnings("unused")
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    @SuppressWarnings("unused")
    public int getStreetNumber() {
        return streetNumber;
    }
    @SuppressWarnings("unused")
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}
