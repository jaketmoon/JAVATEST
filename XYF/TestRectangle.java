package XYF;


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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();//创建对象r,分配内存,就是实例化,将width和height赋值为0
        //r里面储存了width,height,perimeter(),area()的地址
        r.width=10;
        r.height=20;
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}