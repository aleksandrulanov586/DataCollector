package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Keyboard ansiKeyboard = new Keyboard(100.0, false, KeyboardType.ANSI);
        Computer computer = new Computer(" dddddd", "HP", "text",ansiKeyboard);
    }
}
