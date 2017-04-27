package help.mygod.cloud.o2o.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "order", fallback = OrderClientHystric.class)
public interface OrderClient {
	@RequestMapping(value = "/orderBatchSubmit",method = RequestMethod.GET)
    public String orderBatchSubmit();
}
