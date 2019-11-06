/*
    Class to observe the theoretical max and min of primitive data types and
    observe characteristics of overflow.

@author Shen Wang
@version 1.0
@peram: 
@exception e : cannot compile main class
@see : peterhuiwang1995@gmail.com
*/

public class Vars {
    
    public static void main(String... args){
        
        dataTypes null_set = new dataTypes("null_set");
        
        try{
            printAll(null_set);
            
            dataTypes set_min = new dataTypes("set_min");
            set_min.setMin();
            printAll(set_min);
            
            dataTypes set_max = new dataTypes("set_max");
            set_max.setMax();
            printAll(set_max);
            
            dataTypes set_max_plus = new dataTypes("set_max_plus");
            set_max_plus.setMax();
            set_max_plus.one_Up();
            printAll(set_max_plus);
            

            System.out.printf("NOTE: Float point based primitive data types do not wrap. \n "
                    + "float and double overflow to infinity and -infinity.");
        }
        
        catch (Exception e){
            System.err.print("ERROR: Cannot create dataTypes Object.");
            System.exit(0);
        }
    }
    
    public static void printAll(dataTypes h){
    
            System.out.printf("%s\n", h.name);
            System.out.printf("byte (a) size: %d\n", h.a);
            System.out.printf("short (b) size: %d\n", h.b);
            System.out.printf("Integer (c) size: %d\n", h.c);
            System.out.printf("Long (d) size: %d\n", h.d);
            System.out.println("Float (e) size: " + Float.toString(h.e));
            System.out.println("Double (f) size: " + Double.toString(h.f) + "\n");
    
    }
}

