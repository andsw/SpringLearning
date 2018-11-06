package cnjxufe.beans_9_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hsw
 * @create 2018-11-06  20:55
 */
public class StaticFactory {
    private static Map<String, Person> personMap;

    static {
        personMap = new HashMap<>();
        personMap.put("tom", new Person("Tom", 21));
        personMap.put("mark", new Person("mark", 25));
    }

    public static Person createPerson(String name) {
        return personMap.getOrDefault(name, new Person("anonymous", 0));
    }
}