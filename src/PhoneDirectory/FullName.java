package PhoneDirectory;

import java.util.Objects;

public class FullName {
    private final String name1;
    private final String name2;

    public FullName(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(name1, fullName.name1) && Objects.equals(name2, fullName.name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, name2);
    }

    @Override
    public String toString() {
        return name1 + " " + name2;
    }
}
