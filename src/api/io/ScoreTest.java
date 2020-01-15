package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest{
	public static void main(String[] args) throws IOException {
		int sum = 0;
		int count = 0;
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader("src/data/score.txt"));
		
		while(true) {
			String str = br.readLine();
			
			if(str == null)
				break;
			
			String[] list = str.split(",");
			System.out.println(list[0] + "ÀÇ Á¡¼ö´Â " + list[1]);
			
			count++;
			sum += Integer.parseInt(list[1]);
		}
		
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + (double)(sum / count));
		
		if(br != null)
			br.close();
	}
}
