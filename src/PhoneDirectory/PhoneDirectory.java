package PhoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {
    private final Map<FullName, String> directory = new HashMap<>();

    public void addPhone(FullName fullName, String phone) {
        directory.put(fullName, phone);
    }

    @Override
    public String toString() {
        return "" + directory;
    }


}
