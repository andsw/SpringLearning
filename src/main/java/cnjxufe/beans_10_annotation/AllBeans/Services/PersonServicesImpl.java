package cnjxufe.beans_10_annotation.AllBeans.Services;

import cnjxufe.beans_10_annotation.AllBeans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author hsw
 * @create 2018-11-06  22:08
 */
@Service("personServices")
public class PersonServicesImpl implements PersonServices {

    private Person person;

    public PersonServicesImpl() {
    }

    @Autowired
    public void setPerson(@Qualifier("")Person person) {
        this.person = person;
    }

    @Override
    public void server() {
        System.out.println("PersonServices is serving" + person.getName());
    }

}
