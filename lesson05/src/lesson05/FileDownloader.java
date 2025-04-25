package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
public static void main(String[] args) throws Exception {
	String img = "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fd2u3dcdbebyaiu.cloudfront.net%2Fuploads%2Fatch_img%2F307%2Fc93a950fa705a6a650254af6ad2d1cf6_res.jpeg&type=a340";
	
	URL url = new URL(img); //컨트롤 스페이스
	
	InputStream is = url.openStream(); 
	FileOutputStream fos = new FileOutputStream("1.jpeg");
	
	int b = 0;
	while ((b = is.read())!=-1) {
		fos.write(b);
		
	}
	
	fos.close();
	
}
}
