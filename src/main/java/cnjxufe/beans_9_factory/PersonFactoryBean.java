package cnjxufe.beans_9_factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author hsw
 * @create 2018-11-06  21:46
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person("Ant", 29);
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
