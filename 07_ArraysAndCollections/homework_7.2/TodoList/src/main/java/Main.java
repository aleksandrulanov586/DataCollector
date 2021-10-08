import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.split(input);

        if (input.equals("ADD")) {
            System.out.println(todoList.getTodos());
        } else {
            todoList.add(input);
        }
        if (input.equals("EDITE")) {
            System.out.println(todoList.getTodos());
        } else {
            todoList.edit();
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
