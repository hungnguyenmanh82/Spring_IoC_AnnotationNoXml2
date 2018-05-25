package hung.com.Spring.lang.impl;

import hung.com.Spring.lang.Language;

//English
public class Vietnamese  implements Language {

	@Override
	public String getGreeting() {
		return "xin chao";
	}

	@Override
	public String getBye() {
		return "tam biet";
	}


}
