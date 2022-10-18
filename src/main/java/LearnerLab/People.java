package LearnerLab;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findByID(long id) {
        Person person = null;
        for (Person x : personList) {
            if (x.getId() == id) {
                person = x;
            }
        }

        return person;
    }

    public boolean contains(Person person){
    for(Person x : personList){
        if(personList.contains(x)){
            return true;
        }
    }return false;

    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for(Person x : personList){
            if(x.getId() == id){
                personList.remove(x);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
