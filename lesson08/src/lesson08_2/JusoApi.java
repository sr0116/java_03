package lesson08_2;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JusoApi {
	public static void main(String[] args) throws Exception{
		String url = "https://business.juso.go.kr/addrlink/addrLinkApiJsonp.do";
			String key = "U01TX0FVVEgyMDI1MDQxNzEyMDYwOTExNTY2MzQ=";
			String keyword = "구로동";
			String json = "json";
			
			//String req = String.format("%s?confmKey=%s&resultType=%s&keyword=%s", url,key,json,URLEncoder.encode(keyword, "utf-8"));
			
			String postData = "confmKey=" + key;
			postData += "&resultType="+ json;
			postData += "&keyword=" + URLEncoder.encode(keyword, "utf-8");
			
			HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(url))
	                .header("Content-Type", "application/x-www-form-urlencoded")
	                .POST(HttpRequest.BodyPublishers.ofString(postData))
	                .build();

	        HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
	        System.out.println(resp.body());
					
	}

}
