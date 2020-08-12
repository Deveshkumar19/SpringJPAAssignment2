package com.devesh.SpringAssignment.Exception;

import java.util.Date;

public class ResponseObject {

    private Date timestamp;

    private String message;




    public ResponseObject(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;

    }

    public Date getTimestamp() {
        return timestamp;
    }

    public ResponseObject setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseObject setMessage(String message) {
        this.message = message;
        return this;
    }


}
