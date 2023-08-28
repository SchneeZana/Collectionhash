public class Hero implements Comparable<Hero>{

    private String name;
    private int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int compareTo(Hero other) {
        return this.name.compareTo(other.name);

}}
