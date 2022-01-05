import com.crud.bean.Manufacture;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;


/**
 * @author Shirley
 * @create 2022-01-03-21:27
 */

@RunWith(SpringJUnit4ClassRunner.class)
//spring的ApplicationContext传入IOC
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:dispatcherServlet.xml"})
public class MVCTest {

    //虚拟MVC请求
    MockMvc mockMvc;

    //传入springIOC的MVC
    @Autowired
    WebApplicationContext context;

    @Before
    public void initMockMVC(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception {
        //模拟请求，拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/manufacture").param("pn", "1")).andReturn();

        MockHttpServletRequest request = result.getRequest();

        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");

        System.out.println("当前页码"+pageInfo.getPageNum());
        System.out.println("总页码"+pageInfo.getPages());
        System.out.println("总记录数"+pageInfo.getTotal());
        System.out.println("显示页码数：");

        int[] nums=pageInfo.getNavigatepageNums();
        for (int num : nums) {
            System.out.println(" "+num);
            
        }

        //获取厂商数据
        List<Manufacture> list = pageInfo.getList();

        for (Manufacture manufacture : list) {
            System.out.println("ID:"+manufacture.getId()+"====manufacture"+manufacture.getManufacture());
        }
    }
}
