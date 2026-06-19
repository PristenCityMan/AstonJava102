package ru.aston.hometask02;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Student> students = mapper.readValue(new File("students.json"), new TypeReference<List<Student>>() {
            });
            students.stream()
                    .peek(x -> System.out.println(x.toString()))
                    .flatMap(x -> x.getListOfBook().stream())
                    .sorted(Comparator.comparingInt(book -> book.getPages()))
                    .forEach(x -> System.out.println(x.toString()));

        } catch (IOException e) {
            System.out.println("Ошибка чтения: students.json: " + e);
        }
    }
}
