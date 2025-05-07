public class Person {
    private String first;
    private String last;
    private int age;

    // Basic Constructor.
    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    // Getters for other class use.
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return first + " " + last + " " + age;
    }
}
