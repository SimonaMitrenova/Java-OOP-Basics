package com.company.onlineRadioDatabase.exceptions;

public class InvalidSongNameException extends InvalidSongException {
    private static final String message = "Song name should be between 3 and 30 symbols.";
    public InvalidSongNameException() {
        super(message);
    }
}
