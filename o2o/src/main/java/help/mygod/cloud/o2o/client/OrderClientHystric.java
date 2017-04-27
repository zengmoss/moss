package help.mygod.cloud.o2o.client;

import org.springframework.stereotype.Component;

@Component
public class OrderClientHystric implements OrderClient{

	public String orderBatchSubmit() {
		return "fail!!!order server is gone!";
	}

	
}
