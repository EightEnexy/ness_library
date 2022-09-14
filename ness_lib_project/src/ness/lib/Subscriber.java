package ness.lib;

public class Subscriber {
    String firstName;
    String lastName;
    SubscriberAddress address;
    String email;
    Integer age;

    @SuppressWarnings("unused")
    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = null;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
    }
    @SuppressWarnings("unused")
    public String getFirstName() {
        return firstName;
    }
    @SuppressWarnings("unused")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @SuppressWarnings("unused")
    public String getLastName() {
        return lastName;
    }
    @SuppressWarnings("unused")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @SuppressWarnings("unused")
    public SubscriberAddress getAddress() {
        return address;
    }
    @SuppressWarnings("unused")
    public void setAddress(SubscriberAddress address) {
        this.address = address;
    }
    @SuppressWarnings("unused")
    public String getEmail() {
        return email;
    }
    @SuppressWarnings("unused")
    public void setEmail(String email) {
        this.email = email;
    }
    @SuppressWarnings("unused")
    public int getAge() {
        return age;
    }
    @SuppressWarnings("unused")
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderage() {
        return age < 18;
    }
}
