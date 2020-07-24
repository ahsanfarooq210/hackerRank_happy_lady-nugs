import java.util.Hashtable;
import java.util.Map;

public class Mainclass
{
    public static void main(String[] args)
    {
        System.out.println(happyLadybugs("AABCBC"));
    }
    static String happyLadybugs(String b)
    {
        boolean flag=false;
        char[] arr=b.toCharArray();
        Hashtable<Character,Integer> hash=new Hashtable<>();

        for(char ch:arr)
        {
            if(hash.containsKey(ch))
            {
                int num=hash.get(ch);
                num+=1;
                hash.put(ch,num);
            }
            else
            {
                if(ch!='_')
                {
                    hash.put(ch,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> map:hash.entrySet())
        {
            if(map.getValue()==1)
            {
                return "NO";
            }
        }

        if(b.contains("_"))
        {
            return "YES";
        }

        flag=false;
        for (int i=1;i<arr.length-1;i++)
        {
            if (!(arr[i - 1] == arr[i] || arr[i + 1] == arr[i]))
            {
                flag = true;
                break;
            }
        }

        if (flag == true)
        {
            return "NO";
        }
        else
        {
            return "YES";
        }
    }
}
