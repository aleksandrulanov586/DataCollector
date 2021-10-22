import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.split(input);
        Pattern addpattern = Pattern.compile(todoList.ADDING_TO_END);
        Matcher addingEnd = addpattern.matcher(input);
        Pattern patternByIndex = Pattern.compile(todoList.ADDING_BY_INDEX);
        Matcher addingByIndex = patternByIndex.matcher(input);
        Pattern patternDelete = Pattern.compile(todoList.DELETING_BY_INDEX);
        Matcher delete = patternDelete.matcher(input);
        Pattern patternList = Pattern.compile(todoList.TEAM_LIST);
        Matcher list = patternList.matcher(input);
        Pattern patternEdit = Pattern.compile(todoList.REPLACE_WITH_INDEX);
        Matcher edit = patternEdit.matcher(input);
        if (addingEnd.matches()) {
            todoList.add(input);
        }
        if (addingByIndex.matches()) {
            todoList.add(input, input);
        }
        if (edit.matches()) {
            todoList.edit(input, input);
        }
        if (delete.matches()) {
            todoList.delete(input);
        }
        if (list.matches()) {
            System.out.println(todoList.getTodos());
        }

        todoList.add("work");
        todoList.add(1, "java");
        todoList.printTodos();

        System.out.println(todoList);


        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
