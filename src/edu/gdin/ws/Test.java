package edu.gdin.ws;

public class Test {
	public static void main(String[] args) {
		CommonExpressServiceService ss = new CommonExpressServiceService();
		IExpressService is = ss.getCommonExpressServicePort();
		String info = is.sfexpressService("", "");
	}
}
