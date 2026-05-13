package date;
import java.util.Scanner;

public class date_invalidator {
	public static void main(String[] args) {
		System.out.println("Enter a date (format: mm/dd/yyyy): ");

	    Scanner input = new Scanner(System.in);
	    String data = input.next();
//		String data = "1211/1111/1333";

	    int[] day31 = {1,3,5,7,8,10,12};
	    boolean[] isInvalid = {false, false, false};
	    
	    int i = data.length()-1;
//	    System.out.println(i);
//	    System.out.println("\n");
	    int now = 0;
	    
	    int isDate = 0;
	    int[] date = {0,0,0};
	    
	    // / 자동 인덱싱
	    while(true) {
	    	int index = data.substring(now ,i).indexOf('/')+now;
	    	String index_string;
	    	
	    	if(isDate>2)
	    	{
	    		break;
	    	}
	    	if(index>now)
	    	{
//	    		System.out.println(index);
//		    	System.out.println(now);
//		    	System.out.println(data.substring(now,index));
		    	index_string = data.substring(now,index);
		    	date[isDate] = Integer.parseInt(index_string);
		    	isDate += 1;
	    	}else {
//	    		System.out.println(data.substring(now,i+1));
	    		date[isDate] = Integer.parseInt(data.substring(now,i+1));
	    		break;
	    	}
//	    	
//	    	if(now>=i) {
//	    		break;
//	    	}
//	    	
	    	now += index-now + 1;
	    }
	    	
	    
	    // 월 유효성
	    if(date[0]<13 && date[0]>0) {
	    	System.out.println(String.valueOf(date[0])+" is a VALID month");
	    	isInvalid[0] = true;
	    }else {
	    	System.out.println(String.valueOf(date[1])+" is an INVALID date");
	    }
	    
	    // 일 유효성
	    if(date[0] == 2) {
	    	if(date[1]>28 || date[1]<1) {
	    		System.out.println(String.valueOf(date[1])+" is an INVALID date");
	    	}else {
	    		isInvalid[1] = true;
	    		System.out.println(String.valueOf(date[1])+" is a VALID date");
	    	}
	    }else if(date[1]==31) {
	    	for(int i31:day31) {
		    	if(i31==date[0]) {
		    		isInvalid[1] = true;
		    		System.out.println(String.valueOf(date[1])+" is a VALID date");
		    	}
		    }
	    	if(isInvalid[1] == false) {
	    		System.out.println(String.valueOf(date[1])+" is an INVALID date");
	    	}
	    } else if(date[1]>0 && date[1]<31) {
	    	isInvalid[1] = true;
	    	System.out.println(String.valueOf(date[1])+" is a VALID date");
	    } else {
	    	System.out.println(String.valueOf(date[1])+" is an INVALID date");
	    }
	    
	    
	    //년 유효성
	    if(date[2]>0) {
	    	isInvalid[2] = true;
	    	System.out.println(String.valueOf(date[2])+" is a VALID date");
	    }else {
	    	System.out.println(String.valueOf(date[2])+" is an INVALID date");
	    }
	    
	    
	    if(isInvalid[0] && isInvalid[1] && isInvalid[2]) {
	    	System.out.println(String.valueOf(data)+" is a VALID date");
	    }else {
	    	System.out.println(String.valueOf(data)+" is an INVALID date");
	    }
	    input.close();
	  }
}
