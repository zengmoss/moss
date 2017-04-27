package help.mygod.cloud.o2o.client;

import org.springframework.stereotype.Component;

@Component
public class PayClientHystric implements PayClient{

	public String pay() {
		return "fail!!!pay server is gone!";
	}
}
