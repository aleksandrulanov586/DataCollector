import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)  {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(components[3]);
        Pattern pattern1 = Pattern.compile("\\@");
        Matcher matcher2 = pattern1.matcher(components[2]);

        if (components.length > 4) {
            throw new ArrayStoreException();
        } else if (matcher.find()) {
            throw new ArrayStoreException();

        } else if (!matcher2.find()) {
            throw new ArrayStoreException();
        } else {
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));

        }


    }


        public void listCustomers () {


            storage.values().forEach(System.out::println);
        }

        public void removeCustomer (String name){
            storage.remove(name);
        }

        public Customer getCustomer (String name){
            return storage.get(name);
        }

        public int getCount () {
            return storage.size();
        }
    }
