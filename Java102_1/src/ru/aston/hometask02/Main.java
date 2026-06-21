package ru.aston.hometask02;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("students.json");
        JsonReader.readFromPath(path);
    }
}
