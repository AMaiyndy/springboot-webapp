package ru.aratmay.springboot.webapp.rest;

public class Response {
    private String rs;

    public Response(String rs) {
        this.rs = rs;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }
}
