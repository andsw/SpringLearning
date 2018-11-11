package cnjxufe.beans_15_Spring_jdbcTemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hsw
 * @create 2018-11-11  18:07
 * 前面都没有用过junit，这里开始用上感觉很方便诶！
 */
public class Main {
    private ApplicationContext context = null;
    private JdbcTemplate jdbcTemplate = null;
    {
        context = new ClassPathXmlApplicationContext(
"classpath:cnjxufe/beans_15_Spring_jdbcTemplate/applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    }

    @Test
    public void testUpdate() {
        String sql = "UPDATE tbl_employee SET name = ? WHERE id = ?";
        int num = jdbcTemplate.update(sql, "jack", "0164559");
        System.out.println("num" + num);
    }

    /**
     * 批量更新
     * 返回值不是这个方法影响了多少行，而是返回一个int数组，每个数为1和0分别表示每一次成功或失败！
     * */
    @Test
    public void testBatchUpdate() {
        String sql = "INSERT INTO tbl_employee VALUES(?,?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"0174560", "ll", "M", "0164557@qq.com"});
        list.add(new Object[]{"0174551", "he", "M", "95934131@qq.com"});
        list.add(new Object[]{"0174558", "j", "W", "0164558@qq.com"});
        list.add(new Object[]{"0174552", "LiHua", "M", "0123456@qq.com"});

        int[] i = jdbcTemplate.batchUpdate(sql, list);
        for (int s : i) {
            System.out.println("s = " + s);
        }
    }


    /**
     * 从数据库中取出一条记录，实际得到一个对应的对象！
     * 使用  Employee employee = jdbcTemplate.queryForObject(sql, Employee.class, "0164559");
     * 虽看起来很合理，但会出现：
     * “org.springframework.jdbc.IncorrectResultSetColumnCountException: Incorrect
     *        column count: expected 1, actual 4”错误
     *  应该使用queryForObject(Sql, RowMapper, args)
     *   1. 其中RowMapper指定如何映射结果集的行，常用的实现类为BeanPropertyRowMapper。、
     *   2. 使用sql中的列的别名映射类的属性名，例如last_name和lastName
     *   3. 不支持级联属性，jdbcTemplate毕竟是一个jdbc的小工具！不是ORM框架！
     * */
    @Test
    public void testQueryForObject() {
        String sql = "SELECT * FROM tbl_employee where id = ?";

        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);

        Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, "0164559");
        System.out.println(employee);
    }


    /**
     * 又理所当然地以为是queryForList方法。。
     * 这玩意儿真奇怪...
     * */
    @Test
    public void testQueryForList() {
        String sql = "SELECT * FROM tbl_employee WHERE gender = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> list = jdbcTemplate.query(sql, rowMapper, "M");
        list.forEach(System.out::println);
    }

    /**
     * 查询单个列值，或做统计查询
     * 看！这个方法里的功能才是用到queryForObject(sql, Employee.class, "0164559")类方法的。
     */
    @Test
    public void testQueryForObject2() {
        String sql = "select name from tbl_employee where id = ?";

        String name = jdbcTemplate.queryForObject(sql, String.class, "0164559");
        System.out.println("name is " + name);

    }
}
