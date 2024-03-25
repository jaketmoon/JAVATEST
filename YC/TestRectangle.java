package YC;

class Rectangle{//类名,抽象,不分配内存
    //成员变量,数据,属性.
    int width;
    int height;
    //成员函数,方法,行为.
    public int perimeter(){
        return 2*(width+height);
    }
    public int area(){
        return width*height;
    }
}
class Person {
    Person(int a){
        age=a;
    }
    int age;
    public void grow(){
        age++;
    }
    public void grow(int a){
        age+=a;
    }
    public void show(){
        System.out.println(age);
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();//创建对象r,分配内存,就是实例化,将width和height赋值为0
        //r里面储存了width,height,perimeter(),area()的地址
        r.width=10;
        r.height=20;
        Person p=new Person(10);
        p.show();
        p.grow();
        p.show();
        p.grow(10);
        p.show();
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}