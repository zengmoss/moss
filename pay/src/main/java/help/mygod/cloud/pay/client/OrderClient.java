package help.mygod.cloud.pay.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order", fallback = OrderClientHystric.class)
public interface OrderClient {
	@RequestMapping("/orderPay")
    public String orderPay();
}
