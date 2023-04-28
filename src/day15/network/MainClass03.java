package day15.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/011/0004184683?ntype=RANKING");
		// URLConnection 객체 생성
		// 1. URLConnection 은 서버의 헤더 정보를 얻을 수 있음
		// 2. URLConnection 은 리소스(HTML)를 스트림으로 얻을 수 있다. 
		URLConnection urlConn = url.openConnection();
		
		// getHeaderFields() 메서는 헤더의 정보를 Map으로 반환
		// Key - String, value - List<String>
		Map<String, List<String>> headMap = urlConn.getHeaderFields();
		
		Set<String> set = headMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			List<String> listValue = headMap.get(key);
			
			System.out.print(key + ": ");
			for(String values : listValue) {
				System.out.print(values + " ");
			}
			
			System.out.println();
		}
		
		// getInputStream() 메소드 URLConnection 에서 입력 스트립을 얻어 온다. 
		InputStream in = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		
		
		
		
		
		
	}

}
