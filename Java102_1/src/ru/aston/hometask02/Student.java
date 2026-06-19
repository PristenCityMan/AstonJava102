package ru.aston.hometask02;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Student {

    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("patronymic")
    private String patronymic;
    @JsonProperty("listOfBook")
    private List<Book> listOfBook;

    public Student() {
    }

    public Student(String lastName, String firstName, String patronymic, List<Book> listOfBook) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.listOfBook = listOfBook;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public List<Book> getListOfBook() {
        return listOfBook;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setListOfBook(List<Book> listOfBook) {
        this.listOfBook = listOfBook;
    }

    @Override
    public String toString() {
        return String.join(" ", this.lastName, this.firstName, this.patronymic);
    }
}
