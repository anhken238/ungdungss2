package test_batch;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ducanh";
		String code = "123";
		String sex = " nam ";
		// This is  path of folder containing file.sh (shell script).
		String path = new File("resources/testBatch.sh").getAbsolutePath();
		ProcessBuilder processBuilder = new ProcessBuilder(path, name, code, sex);
		try {
			Runtime.getRuntime().exec("chmod 777 " + path);
			Process process = processBuilder.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s = null;
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
