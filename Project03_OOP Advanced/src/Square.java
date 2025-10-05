public class Square extends Shape{
    double length;

    Square(){
        System.out.println("Square Class.");
    }
    Square(double length){
        this.length = length;
    }

    @Override
    void display() {
        //super.display();
        System.out.println("Area of Square is " + length*length);
    }
}
