import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class word_counter{
    static void wordcount(String s){
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i) ==' ') && (s.charAt(i+1)!=' ')){
                  count++;
            }
        }
        System.out.println("Number of words:" +count);
    }
    static void count_freq(String s){
            Map<String,Integer> hp=new TreeMap<>();

            String arr[]=s.split(" ");

            for(int i=0;i<arr.length;i++)
            {
                if(hp.containsKey(arr[i]))
                {
                    hp.put(arr[i], hp.get(arr[i])+1);
                }
                else
                {
                    hp.put(arr[i],1);
                }
            }
            System.out.println("Frequency of each word :");
            for(Map.Entry<String,Integer> entry:
                        hp.entrySet())
            {   
                System.out.println(entry.getKey()+
                        " - "+entry.getValue());
            }
        }
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        wordcount(s);
		count_freq(s);

	}
}








