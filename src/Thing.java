public class Thing {
    private String name;
    private int age;

    public Thing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Thing() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;

        Thing thing = (Thing) o;

        if (age != thing.age) return false;
        return name != null ? name.equals(thing.name) : thing.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
