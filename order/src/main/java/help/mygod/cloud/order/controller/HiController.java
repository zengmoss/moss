package help.mygod.cloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class HiController {
	@Value("${server.port:8010}")
    private String port;
	
	@Value("${my.message}")
	private String message;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+ name + "," + who() + ",and the remote message is " + message;
    }
    @RequestMapping("/orderBatchSubmit")
    public String orderBatchSubmit(){
    	return who() + "下单成功！";
    }
    @RequestMapping("/orderPay")
    public String orderPay(){
    	return who() + "订单支付完成，待发货！";
    }

    private String who(){
    	return "i am order,from port:" + port;
    }
}
