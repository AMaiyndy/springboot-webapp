package ru.aratmay.springboot.webapp.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Book {
    private String title;
    private int pagesCount;
    private Author author;
    private List<BookPage> pages;

    public Book(String title, int pagesCount, Author author) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.author = author;
        this.pages = IntStream.rangeClosed(1, pagesCount)
            .mapToObj(BookPage::new)
            .collect(Collectors.toList());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<BookPage> getPages() {
        return pages;
    }

    public void setPages(List<BookPage> pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("title", title)
            .append("pagesCount", pagesCount)
            .append("author", author)
            .append("pages", pages)
            .toString();
    }
}
