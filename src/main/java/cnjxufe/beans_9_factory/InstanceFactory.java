package cnjxufe.beans_9_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hsw
 * @create 2018-11-06  21:06
 */
public class InstanceFactory {
    private Map<String, Person> personMap;

    public InstanceFactory() {
        personMap = new HashMap<>();
        personMap.put("Alice", new Person("Alice", 33));
        personMap.put("Mike", new Person("Mike", 21));
    }

    public Person getInstance(String name) {
        return personMap.getOrDefault(name, new Person("anonymous",0));
    }
}
