import java.util.HashMap;
import java.util.Map;
public class program3 {
    public static void main(String[] args) {
        Map<String, String> param = new HashMap<String,String>();
        param.put("name","Ivanov");
        param.put("country","Russia");
        param.put("city","Moscow");
        param.put("age",null);
        System.out.println(getQuery(param));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
}