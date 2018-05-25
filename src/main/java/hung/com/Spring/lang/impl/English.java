package hung.com.Spring.lang.impl;

import hung.com.Spring.lang.Language;

//English
public class English  implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye bye";
	}


}
