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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setReturnDate(LocalDate date) {
        this.date = date;
    }

    public long numerOfDays() {
        return java.time.temporal.ChronoUnit.DAYS.between(date,LocalDate.now());
    }
}
