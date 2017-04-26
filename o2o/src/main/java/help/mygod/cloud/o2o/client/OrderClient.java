package help.mygod.cloud.o2o.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("order")
public interface OrderClient {
	@RequestMapping("/orderBatchSubmit")
    public String orderBatchSubmit();
}
