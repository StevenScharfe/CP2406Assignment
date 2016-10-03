import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by Steven-1 on 1/10/2016.
 */
public class dictionary {
    public static void main(String[] args) {
        Dictionary cleavage = new Hashtable();
        cleavage.put("1", "none");
        cleavage.put("2", "poor/none");
        cleavage.put("3", "1 poor");
        cleavage.put("4", "2 poor");
        cleavage.put("5", "1 good");
        cleavage.put("6", "1 good, 1 poor");
        cleavage.put("7", "2 good");
        cleavage.put("8", "3 good");
        cleavage.put("9", "1 perfect");
        cleavage.put("10", "1 perfect, 1 good");
        cleavage.put("11", "1 perfect, 2 good");
        cleavage.put("12", "2 perfect, 1 good");
        cleavage.put("13", "3 perfect");
        cleavage.put("14", "4 perfect");
        cleavage.put("15", "6 perfect");
        //System.out.println(cleavage);

        Dictionary CrystalAbundance = new Hashtable();
        CrystalAbundance.put("1", "Ultratrace");
        CrystalAbundance.put("2", "Trace");
        CrystalAbundance.put("3", "Low");
        CrystalAbundance.put("4", "Moderate");
        CrystalAbundance.put("5", "High");
        CrystalAbundance.put("6", "Very High");

        Dictionary EconomicValue = new Hashtable();
        EconomicValue.put("1", "Trivial");
        EconomicValue.put("2", "Low");
        EconomicValue.put("3", "Moderate");
        EconomicValue.put("4", "High");
        EconomicValue.put("5", "Very High");
        EconomicValue.put("6", "I'm Rich!");
    }
}
