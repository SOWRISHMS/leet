class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
       long vol=(long)length*(long)width*(long)height;
       String s1=Bulky(vol,length,width,height);
       long temp=(long)mass; 
       String s2=heavy(temp);

       if((s1=="Bulky")&&(s2=="Heavy"))
       {
        return "Both";
       }

       else if((s1=="Bulky")&&(s2!="Heavy"))
       {
        return "Bulky";
       }

        else if((s1!="Bulky")&&(s2=="Heavy"))
       {
        return "Heavy";
       }
       
       return "Neither";

    }

    public static String Bulky(long vol,int length,int width,int height)
    {
       if((vol>=1_000_000_000)||(length>=1_0000)||(width>=1_0000)||(height>=1_0000))
       {
        return "Bulky";
       }
       return "Not Bulky";
    }

    public static String heavy(long v)
    {
       if(v>=100)
       {
        return "Heavy";
       }
       return "Not Heavy";
    }
}