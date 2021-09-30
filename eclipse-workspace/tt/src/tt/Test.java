package tt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test{
	   public static void main(String[] args) {
				List<Integer> a=new ArrayList<Integer>();
				List<Integer> b=a;
				b.add(10);
				System.out.println(a);
	   }
	}