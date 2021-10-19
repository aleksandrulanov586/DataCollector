import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public String NAME = "\\w+";
    public String PHONE_NUMBER = "\\d{11}";
    public String CHECKING_THE_NUMBER = "\\w[^LIST,EXIT]\\d{11}";
    public String PRINT_THE_LIST = "LIST";
    HashMap<String, String> hashMap = new HashMap<>();


    public void addContact(String phone, String name) {

        if (name.equals(NAME)) {
            System.out.println("Введите номер телефона для абонента" + name);
        } else {
            System.out.println("Неверный формат ввода");
        }
        if (name.equals(PHONE_NUMBER)) {
            hashMap.put(phone, name);
        } else {
            System.out.println("Контакт сохранен!");
            // проверьте корректность формата имени и телефона
            // если такой номер уже есть в списке, то перезаписать имя абонента
        }
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new Set<String>;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet;
    }

}