package ness.lib;

import java.time.*;

public class Borrowing {
    Book book;
    Subscriber subscriber;
    LocalDate date;

    public Borrowing(Book book, Subscriber subscriber, LocalDate date) {
        this.book = book;
        this.subscriber = subscriber;
        this.date = date;
    }
    @SuppressWarnings("unused")
    public Book getBook() {
        return book;
    }
    @SuppressWarnings("unused")
    public void setBook(Book book) {
        this.book = book;
    }
    @SuppressWarnings("unused")
    public Subscriber getSubscriber() {
        return subscriber;
    }
    @SuppressWarnings("unused")
    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }
    @SuppressWarnings("unused")
    public LocalDate getDate() {
        return date;
    }

    public void setReturnDate(LocalDate date) {
        this.date = date;
    }

    public long numberOfDays() {
        return java.time.temporal.ChronoUnit.DAYS.between(date,LocalDate.now());
    }
}
