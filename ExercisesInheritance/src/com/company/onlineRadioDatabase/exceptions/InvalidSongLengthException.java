package com.company.onlineRadioDatabase.exceptions;

public class InvalidSongLengthException extends InvalidSongException {
    private static final String message = "Invalid song length.";
    public InvalidSongLengthException() {
        super(message);
    }

    public InvalidSongLengthException(String message) {
        super(message);
    }
}
