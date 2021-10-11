import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoList {
    final static String ADDING_TO_END = "ADD\\s+\\D+\\s+";
    final static String ADDING_TO_INDEX = "ADD\\s+.+";  // Сделал конастанты с регулярками  Я вот подумал написать вот такую регулярку как вы считаете она будет эффективной?"\\D[ADD]\\s+.+";
    final static String REPLACE_WITH_INDEX = "EDIT\\s+\\d+\\s+.+";
    final static String DELETING_BY_INDEX = "DELETE\\s+\\d+";
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка

        Pattern pattern = Pattern.compile(ADDING_TO_END);
        Matcher matcher = pattern.matcher(todo);

        if (matcher.matches()) {
            todoList.add(todo);
        }


    }

    public void add(int index, String todo) {
        Pattern pattern = Pattern.compile(ADDING_TO_INDEX);
        Matcher matcher = pattern.matcher(todo);
        if (matcher.matches()) {
            todoList.add(index, todo);
        }
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
    }// Какой код мне написать в этих методах не пойму? то есть там должна быть провека? И как в целом мне написать кода который бы по запросу удалял бы по нужному индексу?

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