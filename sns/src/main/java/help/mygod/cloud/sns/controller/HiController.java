package help.mygod.cloud.sns.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import help.mygod.cloud.sns.client.CustClient;
@RefreshScope
@RestController
public class HiController {
	@Resource
	private CustClient custClient;
	
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
    	return who() + ",call cust server ,and response is " + custClient.getCustInfo();
    }
    
    private String who(){
    	return "i am sns,from port:" + port;
    }
}
