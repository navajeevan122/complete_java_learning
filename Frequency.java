// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Frequency {
    public static void main(String[] args) 
    {
        
        String a="the is the is The as a as the";
        String b=a.toLowerCase();
        String s[]=b.split(" ");
        boolean flag[]=new boolean[s.length];
        int maxCount=0;
        String FreqWord=" ";

        for(int i=0;i<s.length;i++)
            {
                if(flag[i])
                {
                    continue;
                }
                int count=0;
                for(int j=0;j<s.length;j++)
                    {
                        if(s[j].equals(s[i]))
                        {
                            count++;
                            flag[j]=true;
                        }
                    }
                if(count>maxCount)
                {
                    maxCount=count;
                    FreqWord=s[i];
                }
            }
        System.out.println(FreqWord);
        System.out.println(maxCount);
    }
}