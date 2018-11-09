package cnjxufe.beans_10_annotation.AllBeans.Repository;

import org.springframework.stereotype.Repository;

/**
 * @author hsw
 * @create 2018-11-06  22:06
 */
@Repository("personRepository")
public class PersonRepositoryImpl implements PersonRepository {

    public void save() {
        System.out.println("personRepository is saving");
    }
}
