package com.company.onlineRadioDatabase.exceptions;

public class InvalidSongException extends RuntimeException {
    private static final String message = "Invalid song.";
    public InvalidSongException() {
        super(message);
    }

    public InvalidSongException(String message) {
        super(message);
    }
}
