import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class SortNatural{
	public static HashMap<String,Employee> sortNatural(HashMap<String, Employee> hm)
    {
        List<Map.Entry<String, Employee> > list =
               new LinkedList<Map.Entry<String, Employee> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Employee> >() {
            public int compare(Map.Entry<String, Employee> o1, 
                               Map.Entry<String, Employee> o2)
            {
                return (o1.getValue().empId).compareToIgnoreCase(o2.getValue().empId);
            }
        });
        HashMap<String, Employee> temp = new LinkedHashMap<String, Employee>();
        for (Map.Entry<String, Employee> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

}
