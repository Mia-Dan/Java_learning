import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebScraper {
/**
* Scrapes a web page of a given URL and prints it in console
*/
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
