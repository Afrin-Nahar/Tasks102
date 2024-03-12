import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap; 
public class Tasks102{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Input: ");
String sentence = input.nextLine();

String arr[] = sentence.split(" ");
int count = 0;
Map<String, Integer>map= new TreeMap<>();
for(int i=0; i<arr.length; i++){
    count=0;
    for(int j =0; j<arr.length; j++){
        if(arr[i].equals(arr[j])){
            count++;
        }
    }
    map.put((arr[i]), count);
}
System.out.println(map);
}
}