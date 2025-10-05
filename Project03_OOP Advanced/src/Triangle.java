public class Triangle extends Square{
    double height;

    Triangle(){
        System.out.println("Triangle Class.");
    }
    Triangle(double height){
        super(x);
        this.height = height;
    }

    @Override
    void display() {
        //super.display();
        System.out.println("Area of Triangle is " );
    }
}
