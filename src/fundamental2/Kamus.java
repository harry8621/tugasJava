package fundamental2;

import java.util.HashMap;
import java.util.Map;

public class Kamus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> kamus = new HashMap<String,String>();
		kamus.put("eat", "makan");
		kamus.put("Drink"," minum");
		kamus.get("eat");
		System.out.println(kamus.get("eat"));
	}

}
