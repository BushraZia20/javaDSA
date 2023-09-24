
    import java.util.ArrayList;
import java.util.Collections;
public class Arraysslistt {
    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<String>();  {           ///[bushra, shadow, moti, xx, yy]
                name.add("bushra");
                name.add("shadow");
                name.add("moti");
                name.add("xx");
                name.add("yy");
                //name.set(3, "nushra" );
                //name.remove(0);
               //System.out.println(name.get(3));
               //Collections.sort(name);
               for(int i =0;i<name.size();i++){
                System.out.println(name.get(i));
               }
                // System.out.println(name); 
                // System.out.println(name.size());                            //[bushra, shadow, moti, nushra, yy]
    }
}
}


