import java.util.HashMap;

public class AlgoMap {
    static HashMap<String,Integer> map = new HashMap<>();
    
    static{
        //sales a/c
        map.put("sales",1);
        map.put("sold",1);
        map.put("sale",1);
        map.put("sent",1);
        
        //capital a/c
        map.put("capital",2);
        map.put("commenced",2);
        map.put("started",2);
        map.put("invested",2);
        
        
        //deposit a/c
        map.put("deposit",3);
        map.put("deposited",3);
        //purchase a/c
        map.put("purchase",4);
        map.put("purchased",4);
        map.put("bought",4);
        //paid a/c
        map.put("paid",5);
    }
}
