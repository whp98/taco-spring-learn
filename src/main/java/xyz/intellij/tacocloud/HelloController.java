/********************************************
 * 文件名称: HelloController.java
 * 系统名称: xRiskPlus 市场风险管理系统V5.0
 * 模块名称: TODO
 * 软件版权: 衡泰软件有限公司
 * 功能说明: 
 * 系统版本: 5.0.0.1
 * 开发人员: haipeng.wang
 * 开发时间: 2020/8/25 19:28
 * 审核人员:
 * 相关文档:
 * 修改记录: 
 * 程序版本  修改日期    修改人员  修改单号      修改说明
 TODO   2020/8/25     haipeng.wang   TODO    TODO
 *********************************************/

package xyz.intellij.tacocloud;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
