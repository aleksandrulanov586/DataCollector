import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public String NAME = "\\w+";
    public String PHONE_NUMBER = "\\d{11}";
    public String PRINT_THE_LIST = "LIST";
    public String PRINT_THE_EXIT = "EXIT";
    HashMap<String, String> hashMap = new HashMap<>();


    public void addContact(String phone, String name) {
        Pattern phonepattern = Pattern.compile(NAME);
        Matcher number = phonepattern.matcher(phone);
        Pattern namepattern = Pattern.compile(PHONE_NUMBER);
        Matcher namesubscriber = namepattern.matcher(phone);
        if (namesubscriber.matches()) {
            System.out.println("Введите номер телефона для абонента" + name);
        } else {
            System.out.println("Неверный формат ввода");
        }
        if (number.matches()) {
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
        TreeSet<String> treeSet = new TreeSet<>();

        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return treeSet;
    }

    public Set<String> getAllContacts() {

        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet();
    }

}