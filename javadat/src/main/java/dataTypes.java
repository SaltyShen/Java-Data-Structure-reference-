/**
    basic variable types for review
    created as an object because I can't be bothered
    
           FORMAT: TYPE | SIZE | RANGE
        - Integers
            - byte  | 1 byte  | -128 to 127
            - short | 2 bytes | −32768 to 32767
            - int   | 4 bytes |−2,147,483,648 to 2,147,483,647
            - long  | 8 bytes |	9,223,372,036,854,775,808 to
                                9,223,372,036,854,755,807
        - Floats
            - float | 4 bytes | 3.4e−038 to 3.4e+038
            - double| 8 bytes | 1.7e−308 to 1.7e+038
        - Characters
            - Char | 2 byte
        - Booleans
            - bool \ for \ while
            - and \ if \ only if \ if not
            - >> \ <<
            - >= \ <=
            - ++ \ --
            - == \ !=
 */

public class dataTypes{
        
        String name;
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        
    public dataTypes(String name){
        
        this.name = name;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0f;
        this.f = 0.0;
        
    }
    /*
        Sets all data members to default value 1.
    */
    public void setMin(){
        a = Byte.MIN_VALUE; 
        b = Short.MIN_VALUE;
        c = Integer.MIN_VALUE;
        d = Long.MIN_VALUE;
        e = Float.MIN_VALUE; 
        f = Double.MIN_VALUE;
    }
    /*
    *   Sets all data members to theoretical max.
    */
    public void setMax(){
        
        a = Byte.MAX_VALUE;
        b = Short.MAX_VALUE;
        c = Integer.MAX_VALUE;
        d = Long.MAX_VALUE;
        e = Float.MAX_VALUE;
        f = Double.MAX_VALUE;

    }
    public void one_Up(){
    
        a++;
        b++;
        c++;
        d++;
        e = e*10;
        f = f*10;
    
    }
        @Override
    public String toString(){
    
        String str = ("Types in array in order :" + "\n" +
              ((Object)a).getClass().getName() + "\n" +
              ((Object)b).getClass().getName() + "\n" +
              ((Object)c).getClass().getName() + "\n" +
              ((Object)d).getClass().getName() + "\n" +
              ((Object)e).getClass().getName() + "\n" +
              ((Object)f).getClass().getName() + "\n");
        return str;
    }
    public void setByte(int set_a){
        set_a = a;
    }
    public byte getByte(){
        return a;
    }
    //-----------------------------------------
    public void setShort(int set_b){
        set_b = b;
    }
    public short getShort(){
        return b;
    }
    //-----------------------------------------
    public void setInteger(int set_c){
        set_c = c;
    }
    public int getInteger(){
        return c;
    }
    //-----------------------------------------
    public void setLong(long set_d){
        set_d = d;
    }
    public long getLong(){
        return d;
    }
    //-----------------------------------------
    public void setFloat(float set_e){
        set_e = e;
    }
    public float getFloat(){
        return e;
    }
    //-----------------------------------------
    public void setDouble(double set_f){
        set_f = f;
    }
    public double getDouble(){
        return f;
    }
}
