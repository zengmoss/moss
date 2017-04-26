package help.mygod.cloud.o2o.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("pay")
public interface PayClient {
	@RequestMapping("/pay")
    String pay();
}
