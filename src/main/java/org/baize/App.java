package org.baize;

import org.apache.ibatis.session.SqlSession;
import org.baize.dao.PlayerModel;
import org.baize.dao.sqlmapper.PlayerMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PlayerMapper mapper = ctx.getBean(PlayerMapper.class);
        PlayerModel model = new PlayerModel();
//        model.setAge("10");
//        model.setName("asdasdas");
//        mapper.addUser(model);
        String sql = "select * from player where id = 1";
        System.out.println(mapper.selectUser(1));
        Map<String,String> map = new HashMap<>();
        map.put("name","age");
        map.put("tablename","player");
        map.put("id","1");
        System.out.println(mapper.selectUserForAccount(map));
        System.out.println( "Hello World!" );
    }
}
