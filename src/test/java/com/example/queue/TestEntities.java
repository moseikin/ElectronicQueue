package com.example.queue;

import com.example.queue.entities.Booking;
import com.example.queue.entities.BookingTime;
import com.example.queue.entities.User;
import com.example.queue.entities.enums.StatusesEnum;

import java.sql.Timestamp;
import java.util.Calendar;

public class TestEntities {

    public User testUser(){
        return new User()
                .name("testUserName")
                .lastName("testUserLastName")
                .login("testUser")
                .pass("testUser")
                .eMail("testUser@testUser.ru")
                .role("ROLE_USER");
    }


    public Booking testBooking(Timestamp timestamp, User user){
        return new Booking()
                .bookingTime(timestamp)
                .user(user)
                .status(StatusesEnum.STATUS_UNCONFIRMED.getStatus());
    }

    public BookingTime getBookingTime(){
        Calendar calendar = Calendar.getInstance();
        BookingTime bookingTime = new BookingTime();
        bookingTime.setYear(calendar.get(Calendar.YEAR));
        bookingTime.setMonth(calendar.get(Calendar.MONTH));
        // it must be working time and not the past
        bookingTime.setDay(calendar.get(Calendar.DATE) + 1);
        bookingTime.setHour(12);
        bookingTime.setMinute(0);
        return bookingTime;
    }
}
