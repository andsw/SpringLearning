package cnjxufe.beans_11_generic_di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hsw
 * @create 2018-11-07  11:15
 */
public class BaseRepository {
    @Autowired
    protected BaseService service;

    public void add() {
        System.out.println("adding ...");
        System.out.println(service);
    }
}
