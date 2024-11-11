package txst;
public class No6 {
	public static void main(String[] agrs) {
		Date date1=new Date(2019,9,10);
    	Date date2=new Date(2020,9,10);
    	dateCompare(date1,date2);
	}
	 static void dateCompare(Date A,Date B) {
    	int flag=1; 
    	//Date data1=new Date();
    	//Date data2=new Date();
    	if(flag==1) {
    		if(A.year>B.year) {
    			System.out.println("日期较大的是"+A.year+'/'+A.month+'/'+A.day+"日期较小的是"+B.year+'/'+B.month+'/'+B.day);
    		}
    		if(A.year<B.year) {
    			System.out.println("日期较大的是"+B.year+'/'+B.month+'/'+B.day+"日期较小的是"+A.year+'/'+A.month+'/'+A.day);
    		}
    		else flag=0;
    			if(flag==0) {
    				if(A.month>B.month) {
    	    			System.out.println("日期较大的是"+A.year+'/'+A.month+'/'+A.day+"日期较小的是"+B.year+'/'+B.month+'/'+B.day);
    	    		}
    	    		if(A.month<B.month) {
    	    			System.out.println("日期较大的是"+B.year+'/'+B.month+'/'+B.day+"日期较小的是"+A.year+'/'+A.month+'/'+A.day);
    	    		}
    			}
    	    		else flag=2;
    			if(flag==2) {
    				if(A.day>B.day) {
    	    			System.out.println("日期较大的是"+A.year+'/'+A.month+'/'+A.day+"日期较小的是"+B.year+'/'+B.month+'/'+B.day);
    	    		}
    	    		if(A.day<B.day) {
    	    			System.out.println("日期较大的是"+B.year+'/'+B.month+'/'+B.day+"日期较小的是"+A.year+'/'+A.month+'/'+A.day);
    	    		}
    			}
    	    			
    			}
    		}
	static void dateDifference(Date A,Date B) {
		int y2,m2,d2,y1,d1,m1;
		
		m1 = (A.month+9)%12;
		y1 = A.year-m1/10;
		d1 = 365*y1+y1/4-y1/100+y1/400+(m1*365+5)/10+(A.day-1);
		m2 = (B.month + 9) % 12;
		y2 = B.year - m2/10;
		d2 = 365*y2 + y2/4 - y2/100 + y2/400 + (m2*306 + 5)/10 + (B.day - 1);
		
		System.out.printf("两天相差%d天\n",d2-d1);
	}
}
class Date{
    int year;
    int month;
    int day;
    Date(int year,int month,int day){
     setYear(year);
     setMonth(month);
     setDay(day);
    }
    private void setMonth(int month2) {
		// TODO Auto-generated method stub
		month=month2;
	}
	private void setYear(int year2) {
		// TODO Auto-generated method stub
		year=year2;
	}
	private void setDay(int day2) {
		// TODO Auto-generated method stub
		day=day2;
	}
}