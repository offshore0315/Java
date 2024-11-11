package txst;

public class No4 {
	public static void main(String[] args) {
		Emploee e=new Emploee();
	    Manager g=new Manager();
	    e.setName("ma");
	    e.setNum(18);
	    g.setName("zhao");
	    g.setNum(20);
	    System.out.println(e.getInfo());
	    System.out.println(g.getInfo());
	}
}

class Emploee{
	String name;
	int num;
	Emploee(){
		setNum(num);
		setName(name);
	}
    void setName(String name2) {
		// TODO Auto-generated method stub
		name = name2;
	}
     void setNum(int num2) {
		// TODO Auto-generated method stub
		num = num2;
	}
    String getInfo() {
    	 String info;
    	 info="姓名"+name+"员工号"+num;
    	 return info;
    }
}
class Manager extends Emploee{
	Manager(){
		super();
	}
	String getInfo() {
		String info;
		info="主管姓名"+name+"员工号"+num;
		return info;
	}
}