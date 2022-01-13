import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    public String NAME = "[А-ЯЁ][а-яё]+";

    public String PHONE_NUMBER = "\\d{11}";


    Map<String, String> hashMap = new HashMap<>();


    public void addContact(String phone, String name) {

        if (phone.matches(PHONE_NUMBER) && (name.matches(NAME))) {
            hashMap.put(phone, name);
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

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (name.equals(entry.getValue())) {
                String combiningStrings = value + " - " + key;
                treeSet.add(combiningStrings);
            }
            // формат одного контакта "Имя - Телефон"
            // если контакт не найден - вернуть пустой TreeSet

        }
        return treeSet;
    }

    public Set<String> getAllContacts() {
        TreeSet<String> treeSet = new TreeSet<>();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            String combiningStrings = value + " - " + key;
            treeSet.add(combiningStrings);
        }

// формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return treeSet;
    }
}
