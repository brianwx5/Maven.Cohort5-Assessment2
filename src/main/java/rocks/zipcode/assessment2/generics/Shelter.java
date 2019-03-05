package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable{
    //You can put T instead of Ageable
    ArrayList<Ageable> list = new ArrayList<>();
    public Shelter() {

    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(Ageable object) {
        list.add(object);
    }

    public Boolean contains(Ageable object) {
        return list.contains(object);
    }

    public void remove(Ageable object) { list.remove(object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public Integer getIndexOf(Ageable ageable) {
        return list.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}