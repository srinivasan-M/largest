import java.util.*;
class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
TreeSet<Integer> t=new TreeSet<Integer>();
t.add(a);
t.add(b);
t.add(c);
System.out.println("Largest number:"+t.last());
}
}
