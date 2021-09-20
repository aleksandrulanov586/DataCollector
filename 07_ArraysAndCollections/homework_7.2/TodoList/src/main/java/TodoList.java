import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        String text = "";
        Pattern pattern = Pattern.compile("ADD\\s+.+");
        Matcher matcher = pattern.matcher(todo);
        todo.split("ADD");
    }

    public void add(int index, String todo) {


        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления


    }

    public void edit(String todo, int index) {

        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }

    public void printTodos() {
        for (int i = 0; i < todoList.size(); i++) {

            System.out.println(todoList.get(i));
        }
        // напишите код которые печатает каждую строку todos
    }
}