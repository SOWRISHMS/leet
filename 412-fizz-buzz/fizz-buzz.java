class Solution {
    public List<String> fizzBuzz(int n) 
    {
      ArrayList<String> res=new ArrayList<>();
      for(int i=1;i<=n;i++)
      {
        if((i%3==0) &&(i%5==0))
        {
            res.add("FizzBuzz");
            continue;
        }
        else if(i%3==0)
        {
            res.add("Fizz");
            continue;
        }
        else if(i%5==0)
        {
            res.add("Buzz");
            continue;
        }
       
        else 
        {
            res.add(Integer.toString(i));
        }
       
      }  
      return res;
    }
}