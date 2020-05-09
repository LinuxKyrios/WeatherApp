import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException { //notifying about possible exceptions

        //Getting information from div class on website and displaying in console
        Document document = Jsoup
                .connect("https://pogoda.onet.pl/prognoza-pogody/wroclaw-362450").get();
        System.out.println(document.getElementsByClass("temp").get(0).text());
    }

}