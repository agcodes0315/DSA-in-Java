import java.util.HashSet;
public class Hashing {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();// ArrayList<Integer> list=new ArrayList<>();
    //Insert values in HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);//list.add(5);
        System.out.println(set);
    //Search/contains value in HashSet
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }
        if(!set.contains(6))
        {
            System.out.println("Set does not contain 6");
        }
    }
}
