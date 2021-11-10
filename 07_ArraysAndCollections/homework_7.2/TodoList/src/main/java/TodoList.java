import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoList {

    public String ADDING_BY_INDEX = "ADD\\s+\\d+\\s+.+";
    public String ADDING_TO_END = "ADD\\s+.+";
    public String REPLACE_WITH_INDEX = "EDIT\\s+\\d+\\s+";


    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка

        todoList.add(todo);

        System.out.println("Добавлено дело" + todo);

    }

    public void add(int index, String todo) {


        if (todo.matches(ADDING_BY_INDEX)) {

            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления

    }

    public void edit(String todo, int index) {

        if (todo.matches(REPLACE_WITH_INDEX)) {

            todoList.add(index, todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {

        if (index < todoList.size()) {
            todoList.remove(index);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела

    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }

    public void printTodos() {
        for (String printLine : todoList) {

            System.out.println(printLine);
        }
        // напишите код которые печатает каждую строку todos
    }
}