package txst;
public class No5 {
  public static void main(String[] args) {
	  juxing J=new juxing(10,5,5);
	  square S=new square(10,10,10);
	  System.out.println(J.Circum());
	  System.out.println(J.Area());
	  System.out.println(S.Circum());
      System.out.println(S.Area());	  
	  System.out.println(J.getInfo());
	  System.out.println(S.getInfo());
  }
	
}
class juxing{
	int length;
	int wide;
	static int num;
	juxing(int length,int wide,int num){
		setLength(length);
		setWide(wide);
		setNum(num);	
	}
	private void setNum(int num2) {
		// TODO Auto-generated method stub
		num=num2;
	}
	void setLength(int length2) {
		// TODO Auto-generated method stub
		length=length2;
	}
	 void setWide(int wide2) {
		// TODO Auto-generated method stub
		wide=wide2;
	}
    int Circum() {
    	return (length+wide)*2;
    }
	int Area() {
		return length*wide;
	}
	String getInfo () {
		String info;
		info="矩形个数为"+num;
		return info;
	}
}
class square extends juxing{
	square(int length,int wide,int num){
		super(length, wide, num);
		}
	void Circum(int length){
		int circum=length*4;
	}
	void Squzre(int length) {
		int square=length*length;
	}
	String getInfo () {
		String info;
		info="正方形个数为"+num;
		return info;
	}
}