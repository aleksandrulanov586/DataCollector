import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String DELETING_BY_INDEX = "DELETE\\s+\\d+";
    public static String TEAM_LIST = "LIST";

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            if (input.matches(todoList.ADDING_TO_END)) {
                String[] add = input.split("ADD");
                todoList.add(add[1]);
            }
            if (input.matches(todoList.ADDING_BY_INDEX)) {

                String[] componentTeam = input.split(" ", 3);
                String indexText = componentTeam[1];
                int parsInput = Integer.parseInt(indexText);


                String textCase = componentTeam[2];
                todoList.add(parsInput, textCase);
            }
            if (input.matches(todoList.REPLACE_WITH_INDEX)) {
                String[] componentTeam = input.split(" ", 3);
                String indexText = componentTeam[1];
                int parsInput = Integer.parseInt(indexText);
                String textCaseEdit = componentTeam[2];
                todoList.edit(textCaseEdit, parsInput);

            }
            if (input.matches(DELETING_BY_INDEX)) {
                String[] componentTeam = input.split(" ", 3);
                String indexText = componentTeam[1];
                int parsInput = Integer.parseInt(indexText);
                todoList.delete(parsInput);
            }
            if (input.matches(TEAM_LIST)) {
                todoList.printTodos();
            }
        }
        //todoList.add("work");
        // todoList.add(1, "java");
        // todoList.printTodos();

        // System.out.println(todoList);

        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
