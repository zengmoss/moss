package help.mygod.cloud.sns.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cust", fallback = CustClientHystric.class)
public interface CustClient {
	@RequestMapping(value = "/getCustInfo",method = RequestMethod.GET)
    public String getCustInfo();
}
