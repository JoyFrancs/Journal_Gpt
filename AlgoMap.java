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
        map.put("met",5);
        
        //received 
        map.put("received",6);
        map.put("withdraw",6);
        map.put("withdrawn",6);
        map.put("withdrew",6);
        map.put("drew",6);
        map.put("check",6);

        //returned
        map.put("returned",7);
        map.put("return",7);       
        //settled
        map.put("settled",8);
        map.put("settle",8);
    }
}
