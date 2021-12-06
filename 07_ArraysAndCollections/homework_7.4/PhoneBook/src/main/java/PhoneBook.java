import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    public String NAME = "[А-яё]";

    public String PHONE_NUMBER = "\\d{11}";
    public static String PHONES_BY_NAME = "\\w+\\s+.+\\s+\\d{11}";

    Map<String, String> hashMap = new HashMap<>();


    public void addContact(String phone, String name) {

        if (name.matches(NAME) && (phone.matches(PHONE_NUMBER))) {
            System.out.println("Контакт сохранен!");
        } else {
            System.out.println("Неверный формат!");
        }
    }
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента


    public String getNameByPhone(String phone) {
        String gettingName = hashMap.get(phone);

        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return gettingName == null ? "" : gettingName + " - " + phone;
    }

    public Set<String> getPhonesByName(String name) {
        TreeSet<String> treeSet = new TreeSet<>();
        Map<String, String> hashMap2 = new HashMap<>();

        for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (name.equals(entry.getValue())) {
                String combiningStrings = value + key;
                treeSet.add(combiningStrings);
            }
            // формат одного контакта "Имя - Телефон"
            // если контакт не найден - вернуть пустой TreeSet

        }
        return treeSet;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> treeSet = new TreeSet<>();


// формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return treeSet;
    }
}
