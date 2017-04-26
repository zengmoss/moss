package help.mygod.cloud.pay.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import help.mygod.cloud.pay.client.OrderClient;
@RefreshScope
@RestController
public class HiController {
	@Resource
	private OrderClient orderClient;
	@Value("${server.port}")
    private String port;
	
	@Value("${my.message}")
	private String message;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+ name + "," + who() + port + ",and the remote message is " + message;
    }
    @RequestMapping("/pay")
    public String pay(){
    	return who() + "支付成功，需要修改order状态！call order server, and reponse is " + orderClient.orderPay();
    }

    private String who(){
    	return "i am pay,from port:" + port;
    }
}
