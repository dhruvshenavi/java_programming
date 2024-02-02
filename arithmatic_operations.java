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

        int xc=6,yc=8;
        System.out.print("5*++xc+4*yc++ = ");
        System.out.println(5*++xc+4*yc++);

        /*
         understanding bitwise operations...
         & - and
         ^ - exor
         | - or
         */

        int xi=1,xj=4;
        int j = xi&xj;
        System.out.print("xi & xj = ");
        System.out.println(j);
        System.out.print("xi | xj = ");
        System.out.println(xi|xj);
        System.out.print("xi ^ xj = ");
        System.out.println(xi^xj);


        /*
          
        left shift << right shift >> 

         */

        int xs=12;
        System.out.println("left shift:");
        System.out.print("x :"+xs+" ");
        System.out.println(xs<<1);
        System.out.println("right shift:");
        System.out.print("x :"+xs+" ");
        System.out.println(xs>>1);


        /*
         
        ~ negation  
        
         */

        int xn = 7;
        System.out.println( "negation of 7 :" + Integer.toBinaryString(~ xn) +'\n'+ ~xn );
        
        /*
         MASKING-AND SWAPPING-XOR MERGING-OR
         */

        int xum = 10;
        int yum = 2;
        System.out.println(" x :" + Integer.toBinaryString(xum) + " y :" + Integer.toBinaryString(yum) + " res :" + Integer.toBinaryString(xum&yum));
        System.out.println(" x :" + Integer.toBinaryString(xum) + " y :" + Integer.toBinaryString(yum) + " res :" + Integer.toBinaryString(xum|yum));

       // SWAPPING

       int xs1=1;
       int xs2=3;
       System.out.println("initially x:"+xs1+" y:"+xs2);
       xs1=xs1^xs2;
       xs2=xs1^xs2;
       xs1=xs1^xs2;
       System.out.println("finally x:"+xs1+" y:"+xs2);


    }

}
