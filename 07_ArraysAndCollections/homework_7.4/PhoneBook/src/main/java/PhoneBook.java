import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

  public String NAME = "\\w+";

  public String PHONE_NUMBER = "\\d{11}";
  public static String PHONES_BY_NAME = "\\w+\\s+.+\\s+\\d{11}";
  public static String GET_NAME_BY_PHONE = "\\w+\\s+.+\\s+\\d{11}";
  Map<String, String> hashMap = new HashMap<>();


  public void addContact(String phone, String name) {

    if (name.matches(NAME) && phone.matches(PHONE_NUMBER)) {

      hashMap.put(phone, name);
      System.out.println("Контакт сохранен!");
    } else {
      System.out.println("Неверный формат ввода");
    }

    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента

  }

  public String getNameByPhone(String phone) {

    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      if (phone.matches(value) != value.matches(NAME)) {
        return "";
      }
      if (phone.matches(key) != key.matches(PHONE_NUMBER)) {
        return null;
      }

    }
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку
    return "";
  }

  public Set<String> getPhonesByName(String name) {
    TreeSet<String> treeSet = new TreeSet<>();

    for (Map.Entry<String, String> entry : hashMap.entrySet()) {
      if (name.matches(NAME)) {
        String value = entry.getValue();

      }
      // формат одного контакта "Имя - Телефон"
      // если контакт не найден - вернуть пустой TreeSet

    }
    return treeSet;
  }

  public Set<String> getAllContacts() {
    TreeSet<String> treeSet = new TreeSet<>();

    for (Map.Entry<String, String> entry : hashMap.entrySet()) {

      // формат одного контакта "Имя - Телефон"
      // если контактов нет в телефонной книге - вернуть пустой TreeSet

    }
    return treeSet;
  }
}
