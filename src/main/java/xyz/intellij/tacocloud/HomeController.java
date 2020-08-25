package xyz.intellij.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Home控制类
 * @author haipeng.wang
 * @date 2020-08-25 20:46
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String getHome(){
        return "home";
    }
}
