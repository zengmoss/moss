package help.mygod.cloud.pay.client;

import org.springframework.stereotype.Component;

@Component
public class OrderClientHystric implements OrderClient{

	public String orderPay() {
		return "fail!!!order server is gone!";
	}

	
}
