import java.util.*;
import static java.lang.Integer.parseInt;

public class ArrayListTask {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();
        for(;;){
            String userInput=input.next();
            if(userInput.equals("0"))break;
            StringTokenizer tokenizer=new StringTokenizer(userInput,",");
            Person p =new Person(tokenizer.nextToken(),parseInt (tokenizer.nextToken()));
            persons.add(p);
        }
        for(int i=0;i< persons.size();i++){
            System.out.println("Person's name is: "+(persons.get(i)).getName()+" and his age is: "+(persons.get(i)).getAge());
        }
    }
}
