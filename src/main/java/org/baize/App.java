package org.baize;

import org.baize.dao.model.Shop;
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
//        PlayerModel model = new PlayerModel();
////        model.setAge("10");
////        model.setName("asdasdas");
////        mapper.addUser(model);
//       // String sql = "select * from player where id = 1";
//        System.out.println(mapper.selectOneForId(1));
//        Map<String,String> map = new HashMap<>();
//        map.put("name","age");
//        map.put("tablename","player");
//        map.put("id","1");
//        System.out.println(mapper.selectOneForAccount(map));
//        System.out.println( "Hello World!" );

        Shop shop = new Shop();
        shop.setId(3);
        shop.setName("Hello World!");
        shop.update();

    }
}
