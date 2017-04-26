package help.mygod.cloud.o2o.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import help.mygod.cloud.o2o.client.OrderClient;
import help.mygod.cloud.o2o.client.PayClient;
@RefreshScope
@RestController
public class HiController {
	@Resource
	private OrderClient orderClient;
	@Resource
	private PayClient payClient;
	
	@Value("${server.port}")
    private String port;
	
	@Value("${my.message}")
	private String message;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+ name + "," + who() + ",and the remote message is " + message;
    }
    @RequestMapping("/order")
    public String order(){
    	return who() + ",call order server ,and response is " + orderClient.orderBatchSubmit();
    }
    @RequestMapping("/pay")
    public String pay(){
    	return who() + ",call pay server ,and response is " + payClient.pay();
    }
    
    private String who(){
    	return "i am o2o,from port:" + port;
    }
}
