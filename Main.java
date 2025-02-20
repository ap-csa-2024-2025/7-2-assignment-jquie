import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /*
    //Classwork - create an arrat of ints, fill it with stuff and loop through it, print every value
    int[] jennys = {8,7,9,5,6,4,5,3};
    for (int i = 0; i < jennys.length; i++)
    {
      System.out.println(jennys[i]);
    }
    //can also use enhanced loop
    for (int n : jennys)
    {
      System.out.println(n);
    }
    //Do for ArrayList
    ArrayList<Integer> foo = new ArrayList<Integer>();
    foo.add(new Integer(1));
    foo.add(new Integer(2));
    foo.add(new Integer(5));
    foo.add(new Integer(3));

    for (int i = 0; i < foo.size(); i++)
    {
      System.out.println(foo.get(i));
    }

    // enhanced for loop
    for (Integer N : foo)
    {
      System.out.print(N); // toString()
      System.out.println(N.intValue()); // intValue returns the int value instead of the class
    }
    */

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(5);
    list.add(7);
    System.out.println(getEvens(list));
    System.out.println(highestNum(list));

    //Problem 1
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> words = new ArrayList<String> ();
    while (!input.equals("STOP"))
    {
      System.out.println("Enter words:");
      input = sc.nextLine();
      words.add(input);
    }
    words.remove(words.size()-1);
    System.out.println(words);
    ArrayList<String> reverseWords = new ArrayList<String>();
    for (int i = words.size()-1; i >= 0; i--)
    {
      reverseWords.add(words.get(i));
    }
    for (int i = 0; i < words.size(); i ++)
    {
      System.out.println(reverseWords.get(i) + words.get(i));
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    int max = (arr.get(0)).intValue();
    for (Integer n : arr)
    {
      if (n > max)
      {
        max = n.intValue();
      }
    }
    return max;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer> ();
    for (Integer n : arr)
    {
      if (n % 2 == 0)
      {
        ans.add(n);
      }
    }
    return ans;
  }
}
