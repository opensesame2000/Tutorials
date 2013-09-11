package com.porul.ss;

import javax.jws.WebService;

@WebService(endpointInterface = "com.porul.ss.SimpleService")
public class SimpleServiceImpl implements SimpleService {
	
	@Override
	public String concat(ConcatRequest parameters) {
		return parameters.getS1() + parameters.getS2();
	}
}