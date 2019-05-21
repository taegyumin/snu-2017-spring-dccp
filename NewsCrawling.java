import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsCrawling {

	public static void main(String[] args) {
		String outPath = "crawlResult.txt";
		try {
			Writer outFile = new BufferedWriter(new FileWriter(outPath));
			
			for(int i=1;i<=10;i++){
				outFile.write("=========page "+i+"=========\n");
				String add;
				if(i>=10){
					add = "0"+Integer.toString(i);
				} else{
					add = "00"+Integer.toString(i);
				}
				
				Document doc = Jsoup.connect("http://news.naver.com/main/list.nhn?sid1=001&listType=paper&mid=sec&mode=LSD&date=20170607&page="+add).get();

				Elements ele = doc.select("ul.type13.firstlist li");
				for(Element e : ele){
					outFile.write(e.select("span.writing").text()+"   ");
					outFile.write(e.select("span.date").text()+"   ");
					outFile.write(e.select("dl dt").text()+"   ");
					outFile.write(e.select("dt a").attr("href")+"\n");
				}
			}
			outFile.flush();
			outFile.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}


	}
}