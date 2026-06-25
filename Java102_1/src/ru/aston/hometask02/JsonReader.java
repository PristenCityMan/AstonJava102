package ru.aston.hometask02;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class JsonReader {

    public static void readFromPath(Path path) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {

            List<Student> students = mapper.readValue(Files.readString(path), new TypeReference<List<Student>>() {
            });
            students.stream()
                    .peek(student -> System.out.println(student.toString()))
                    .flatMap(student -> student.getListOfBook().stream())
                    .sorted(Comparator.comparingInt(Book::getPages))
                    .distinct()
                    .filter(book -> book.getReleaseDate().getYear() > 2000)
                    .limit(3)
                    .map(book -> book.getReleaseDate().getYear())
                    .findAny()
                    .ifPresentOrElse(System.out::println, () -> System.out.println("Такая книга отсутствует"));


        } catch (
                IOException e) {
            System.out.println("Ошибка чтения students.json: " + e);
        }
    }

}
