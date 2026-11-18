import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CountrySetDemo {
    public static void main(String[] args) {
  
        HashSet<String> countries = new HashSet<>();
        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia");

        System.out.println("=== Step 10: HashSet Setelah 6x add() ===");
        System.out.println(countries);
        System.out.println("Jumlah elemen = " + countries.size());

        System.out.println("\n=== Step 11: contains, remove, size ===");
        System.out.println("Contains \"Indonesia\": " + countries.contains("Indonesia"));
        countries.remove("Japan");
        System.out.println("Setelah remove(\"Japan\"): " + countries);
        System.out.println("Jumlah elemen = " + countries.size());

        HashSet<String> countriesSet = new HashSet<String>();
        countriesSet.add("Indonesia");
        countriesSet.add("Japan");
        countriesSet.add("Malaysia");
        countriesSet.add("Singapore");
        countriesSet.add("Thailand");

        ArrayList<String> countriesList = new ArrayList<String>();
        countriesList.add("Japan");
        countriesList.add("Indonesia");
        countriesList.add("Malaysia");

        Collections.sort(countriesList);
        System.out.println("\n=== Step 12: Collections.sort(countriesList) ===");
        System.out.println(countriesList);

        ArrayList<String> sortedCountries = new ArrayList<>(countriesSet);
        Collections.sort(sortedCountries);
        System.out.println("\n=== Step 13: Data Set Disalin ke ArrayList lalu Di-sort ===");
        System.out.println(sortedCountries);
    }
}
