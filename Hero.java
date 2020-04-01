public class Hero implements Comparable <Hero> {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Hero other) {
     //trions les employés selon leur age dans l'ordre croiddant
     //retroune un entier négative, zéro ou positive si l'age 
     //de cet employé est moins que, égale à ou supérieur à l'objet comparé avec
           return name.compareTo(other.getName());
    }

}