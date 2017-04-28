package help.mygod.cloud.cust.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class HiController {
	@Value("${server.port}")
    private String port;
	
	@Value("${my.message}")
	private String message;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+ name + "," + who() + ",and the remote message is " + message;
    }
    @RequestMapping("/getCustInfo")
    public String getCustInfo(){
    	return who() + "获取用户信息成功！";
    }

    private String who(){
    	return "i am cust,from port:" + port;
    }
}
