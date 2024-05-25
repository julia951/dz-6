import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dz6 {
    public static void main(String[] args) {
        List<String> cities = List.of("London", "Lviv", "New York");
        String searchCity = "Lviv";
        boolean result = containsString(cities, searchCity);
        System.out.println("Contains " + searchCity + ": " + result);

        List<String> repeatedCities = List.of("London", "Lviv", "Lviv");
        removeDuplicatesAndPrint(repeatedCities);
    }

    public static boolean containsString(List<String> list, String searchString) {
        for (String element : list) {
            if (element.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicatesAndPrint(List<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        for (String element : uniqueSet) {
            System.out.println(element);
        }
    }
}