package help.mygod.cloud.pay.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("order")
public interface OrderClient {
	@RequestMapping("/orderPay")
    public String orderPay();
}
