import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ListTest {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> lList = new LinkedList<>();
		HashMap<String, Long> timeComparisonMap = new HashMap<String,Long>();
		
		long Atime1 = System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			aList.add(rand.nextInt(10));
		}
		long AelapsedTime1 = System.currentTimeMillis() - Atime1;
		
		long Ltime1 = System.currentTimeMillis();
		for(int i=0;i<10000000;i++){
			lList.add(rand.nextInt(10));
		}
		long LelapsedTime1 = System.currentTimeMillis() - Ltime1;
		
		timeComparisonMap.put("Add", AelapsedTime1-LelapsedTime1);
		
		
		
		long Atime2 = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			aList.remove(rand.nextInt(100000));
		}
		long AelapsedTime2 = System.currentTimeMillis() - Atime2;
		
		long Ltime2 = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			lList.remove(rand.nextInt(100000));
		}
		long LelapsedTime2 = System.currentTimeMillis() - Ltime2;

		timeComparisonMap.put("Remove", AelapsedTime2-LelapsedTime2);
	
		
		long Atime3 = System.currentTimeMillis();
		Collections.sort(aList);
		long AelapsedTime3 = System.currentTimeMillis() - Atime3;
		
		long Ltime3 = System.currentTimeMillis();
		Collections.sort(lList);
		long LelapsedTime3 = System.currentTimeMillis() - Ltime3;
		
		timeComparisonMap.put("Sort", AelapsedTime3-LelapsedTime3);
	
		
		
		for(Entry<String, Long> e : timeComparisonMap.entrySet()){
			String answer;
			if(e.getValue()>=0){
				answer = "ArrayList";
			} else{
				answer = "LinkedList";
			}
			System.out.println(e.getKey().toUpperCase() + " : " +answer+" Win");
		}
	}
}