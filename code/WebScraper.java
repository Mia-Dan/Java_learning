import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebScraper {
/**
* Given a url from console, 
* Scrapes a web page of that given URL, and 
* prints it in console.
*/

    public static void main(String[] args) throws IOException {
        // Read URL from console
        System.out.print("Enter URL: ");
        String urlString = System.console().readLine();

        // Create URL object
        URL url = new URL(urlString);

        // Open connection and read contents
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
