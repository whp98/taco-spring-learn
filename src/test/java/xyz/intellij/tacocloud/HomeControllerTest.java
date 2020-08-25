package xyz.intellij.tacocloud;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @description: HomeController测试，测试包含页面
 * @author: haipeng.wang
 * @date: 2020-08-25 21:06
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    //注入mock
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception {
        //发起对/的get请求
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                //期待能够获取200状态码
                .andExpect(MockMvcResultMatchers.status().isOk())
                //期待名字是Home
                .andExpect(MockMvcResultMatchers.view().name("home"))
                //期待内容包含Welcome
                .andExpect(MockMvcResultMatchers.content().string(CoreMatchers.containsString("Welcome to")));

    }
}
