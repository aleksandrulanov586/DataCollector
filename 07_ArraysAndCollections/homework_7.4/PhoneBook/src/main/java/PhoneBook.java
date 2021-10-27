import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    public String NAME = "\\w+";
    public String PHONES_BY_NAME = "\\w+\\s+\\d{11}";
    public String PHONE_NUMBER = "\\d{11}";
    public static String PHONES_BY_NAME = "\\w+\\s+.+\\s+\\d{11}";
    HashMap<String, String> hashMap = new HashMap<>();


    public void addContact(String phone, String name) {

        if (name.matches(NAME) && phone.matches(PHONE_NUMBER)) {
            System.out.println("Введите номер телефона для абонента" + name);
            hashMap.put(phone, name);
            System.out.println("Контакт сохранен!");
        } else {
            System.out.println("Неверный формат ввода");
        }


        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента

    }

    public String getNameByPhone(String phone) {
        for (int i = 0; 0 < hashMap.size(); i++) {
            if (phone.matches(PHONES_BY_NAME)) {
                System.out.println(hashMap.get(i));
            } else {
                return "";
            }
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; 0 < hashMap.size(); i++) {
            if (name.matches(PHONES_BY_NAME)) {
                System.out.println(hashMap.get(i));
            } else {
                return treeSet;
            }
            // формат одного контакта "Имя - Телефон"
            // если контакт не найден - вернуть пустой TreeSet

        }

        public Set<String> getAllContacts () {

            // формат одного контакта "Имя - Телефон"
            // если контактов нет в телефонной книге - вернуть пустой TreeSet
            return new TreeSet();
        }

    }
}