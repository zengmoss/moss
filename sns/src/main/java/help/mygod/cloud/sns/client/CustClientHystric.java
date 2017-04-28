package help.mygod.cloud.sns.client;

import org.springframework.stereotype.Component;

@Component
public class CustClientHystric implements CustClient{

	public String getCustInfo() {
		return "fail!!!cust server is gone!";
	}

	
}
