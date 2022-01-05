import com.crud.bean.Manufacture;
import com.crud.dao.ManufactureMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author Shirley
 * @create 2022-01-03-19:47
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    ManufactureMapper manufactureMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void TestsqlSession(){

//        System.out.println(manufactureMapper);
        manufactureMapper.insert(new Manufacture(null,333,1234,"1234567","厂商1111",120,null,"修改人1111","brand1111"));

//        ManufactureMapper mapper = sqlSession.getMapper(ManufactureMapper.class);
//
//        for (int i=0; i<1000; i++){
//            String uid = UUID.randomUUID().toString().substring(0, 7) + i;
//            mapper.insertSelective(new Manufacture(null,111,1234,uid,"厂商"+i,120,null,"修改人"+i,"brand"+i));
//        }

        System.out.println("批量添加完毕");
    }
}
