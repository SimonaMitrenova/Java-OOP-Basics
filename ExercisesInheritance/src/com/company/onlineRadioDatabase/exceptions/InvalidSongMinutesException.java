package com.company.onlineRadioDatabase.exceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    private static final String message = "Song minutes should be between 0 and 14.";
    public InvalidSongMinutesException() {
        super(message);
    }
}
