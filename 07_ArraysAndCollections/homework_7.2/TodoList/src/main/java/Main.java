import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.split(input);
        Pattern pattern = Pattern.compile("ADD\\s+\\d+\\s+.+\\w+");
        Matcher adding = pattern.matcher(input);
        if (adding.matches()) {
            System.out.println(todoList.getTodos());
        } else {
            todoList.add(input);
        }
        if (input.equals("EDITE")) {
            System.out.println(todoList.getTodos());
        } else {
            todoList.edit(input, input);
        }
        if (input.equals("DELET")) {
            System.out.println(todoList.getTodos());
        } else {
            todoList.delete(input);
        }
        if (input.equals("LIST")) {
            System.out.println(todoList.getTodos());
        }

        todoList.add("work");
        todoList.add(1, "java");
        todoList.printTodos();

        System.out.println(todoList);


        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
