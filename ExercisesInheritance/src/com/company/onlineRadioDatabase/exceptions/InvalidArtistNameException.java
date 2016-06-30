package com.company.onlineRadioDatabase.exceptions;

public class InvalidArtistNameException extends InvalidSongException {
    private static final String message = "Artist name should be between 3 and 20 symbols.";
    public InvalidArtistNameException() {
        super(message);
    }
}
