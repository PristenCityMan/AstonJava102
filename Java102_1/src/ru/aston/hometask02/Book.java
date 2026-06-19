package ru.aston.hometask02;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;


@JsonAutoDetect
public class Book {
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("pages")
    private Integer pages;
    @JsonFormat(pattern = "yyyy.MM.dd")
    @JsonProperty("releaseDate")
    private LocalDate releaseDate;

    public Book() {
    }

    public Book(String bookName, Integer pages, LocalDate releaseDate) {
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return String.format("%s страниц:%d от %tF", this.bookName, this.pages, this.releaseDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(pages, book.pages) &&
                Objects.equals(releaseDate, book.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, pages, releaseDate);
    }
}
