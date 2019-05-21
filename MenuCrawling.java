import java.io.IOException;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MenuCrawling {

	public static void main(String[] args) {
		Document doc;
		HashMap<Integer,Integer> priceMap = new HashMap<Integer,Integer>();
		try {
			doc = Jsoup.connect("http://mini.snu.kr").get();

			Elements ele = doc.select("span.price");
			
			for(Element e : ele){
				String priceStr = e.text();
				if(priceStr.equals("??")) continue;
				int price = Integer.parseInt(e.text());
				if(priceMap.containsKey(price)==false){
					priceMap.put(price, new Integer(1));
				}
				priceMap.put(price,priceMap.get(price).intValue() +1);
			}
			
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(priceMap);
	}

}