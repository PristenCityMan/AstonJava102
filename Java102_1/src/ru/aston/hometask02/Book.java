package ru.aston.hometask02;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Book {
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("pages")
    private Integer pages;
    @JsonFormat(pattern = "dd.MM.yyyy")
    @JsonProperty("releaseDate")
    private Date releaseDate;

    public Book() {
    }

    public Book(String bookName, Integer pages, Date releaseDate) {
        this.bookName = bookName;
        this.pages = pages;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPages() {
        return pages;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return String.format("%s страниц:%d от %t", this.bookName, this.pages, this.releaseDate);
    }
}
