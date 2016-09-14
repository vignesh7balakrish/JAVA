import java.util.*;
public class stack3
{
  public static void main(String args[])
  {
    Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    while(s.peek()!=NULL)
    {
      System.out.println(s.pop());
    }
  }
}
