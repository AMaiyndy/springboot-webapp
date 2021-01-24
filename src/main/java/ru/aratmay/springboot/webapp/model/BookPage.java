package ru.aratmay.springboot.webapp.model;

public class BookPage {
    private int pageNumber;

    public BookPage(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public BookPage() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
