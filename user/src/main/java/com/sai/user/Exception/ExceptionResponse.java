package com.sai.user.Exception;

import java.util.Date;

public class ExceptionResponse {
    private Date date;
    private String message;
    private String description;

    
    public ExceptionResponse() {
    }
    public ExceptionResponse(Date date, String message, String description) {
        this.date = date;
        this.message = message;
        this.description = description;
    }
    public Date getDate() {
        return date;
    }
    public String getMessage() {
        return message;
    }
    public String getDescription() {
        return description;
    }
    

    

}
