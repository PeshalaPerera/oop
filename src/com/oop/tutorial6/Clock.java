package com.oop.tutorial6;

public class Clock {
    String getHours() {
        return java.time.Instant.now().toString();
    }

    String getMinutes() {
        return java.time.Instant.now().toString();
    }

    String getTime() {
        return getHours() + ":" + getMinutes();
    }
}
