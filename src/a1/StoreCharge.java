package a1;
import java.util.Scanner;
public class StoreCharge {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入应付金额：");
        double x = sc.nextDouble();
        Price p1 = ampayable(x);
        System.out.println(p1.toString());
        System.out.println("输入实付金额：");
        double y = sc.nextDouble();
        Price p2 = ampaid(y);
        System.out.println(p2.toString());
        System.out.println("找零："+charge(p1,p2).toString());
        charge(p1,p2);
          
    }
    public static Price charge(Price p1,Price p2){//p1总货价 p2收款
        int c,b;
        if(p2.conner<p1.conner){
            b = p2.conner+10-p1.conner;
            p2.element = p2.element-1;
        }else
            b = p2.conner-p1.conner;
        c = p2.element - p1.element;
        return new Price(c,b);        
    }
    public static Price ampayable(double x){//应付金额
        Price a = new Price();
        a.element = (int)x;
        a.conner  = (int)(x*10 -((int)x)*10);
        return a;
    }
    public static Price ampaid(double x){//实付金额
        Price a = new Price();
        a.element = (int)x;
        a.conner  = (int)(x*10 -((int)x)*10);
        return a;
    }
  
}
class Price{
    int element;//元
    int conner;//角
    public Price(){}
    public Price(int e,int c){
        element = e;
        conner = c;
    }
    public String toString(){
        return element+"元"+conner+"角";
    }
}
