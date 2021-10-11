import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    HashMap<String, String> hashMap = new HashMap<>(); //Я не понял мы должны создавать hasMap? или TreeSet должны создать?

    public void addContact(String phone, String name) {
        Pattern pattern = Pattern.compile("\\w[^LIST,EXIT]\\d{11}"); // написал вот такую регулярку получается
        Matcher matcher = pattern.matcher(phone, name); // Почему тут matcher принемает только один аргумент?
        if (matcher.matches()) { //Я еще добавил этот код> Дайте свой комментарий
            hashMap.put(phone, name);
        } else {
            System.out.println("Неверный формат ввода");
        }
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new HashMap<String, String>();// как тут мне вернуть HashMap ?
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>(); // как тут мне вернуть HashMap ?
    }

}