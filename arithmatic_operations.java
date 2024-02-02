public class arithmatic_operations {
    
    /*understanding coersion : 
     * 
     * i+c=i
     * i+f=f
     * l+f=f
     * i+l=f
     * i+s=i
     * s+c=i
     * d+f=d
     * d+l=f
     * 
     */

    int i = 10;
    char c = 2;
    double d = 4;
    float f = 5.6f;
    long l = 78;
    short s = 4;

    public int res1 = c + s;
    public double res2 = d + f;
    public float res3 = f + l;

    /*public arithmatic_operations(){


    }*/

    public static void main(String[] args) {
        
        arithmatic_operations obj = new arithmatic_operations() ;
        System.out.println("c+s = "+obj.res1+'\n'+"d + f = "+obj.res2+'\n'+"f + l = "+obj.res3);

        /*
         
        understanding post and pre increment... 
        
         */

         int pre,post,x = 5;
         pre=++x;
         x = 5;
         post=x++;
        System.out.println(" x (before) : "+5+" pre: "+pre+" post: "+post+" x (after) : "+x);

    }

}
