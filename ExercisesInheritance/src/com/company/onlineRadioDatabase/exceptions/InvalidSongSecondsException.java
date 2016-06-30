package com.company.onlineRadioDatabase.exceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException{
    private static final String message = "Song seconds should be between 0 and 59.";
    public InvalidSongSecondsException() {
        super(message);
    }
}
