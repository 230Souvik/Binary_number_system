
package ex3;

import java.util.Scanner;


public class Ex3 {
public int oper(String s){
    if(s==null)
        return -1;
    else{
        int r=s.charAt(0)-'0';
        for (int i = 1; i < s.length ();)
      {
	char prev = s.charAt (i);
	  i++;
	if (prev == 'A')
	  r = r & (s.charAt (i) - '0');
        else if(prev=='B')
            r=r |(s.charAt(i)-'0');
        
        else
            r=r ^ (s.charAt(i)-'0');
        i++;
    }
        return r;
}
}
    
    public static void main(String[] args){
        // TODO code application logic here
        Ex3 e=new Ex3(); 
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int k=e.oper(s1);
        System.out.println("result "+k);
    }
    
}
