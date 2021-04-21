public class Wall {
    /*Wall Area
    Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
    The class needs to have two constructors. The first constructor does not have any parameters (no-arg  constructor). The second constructor has parameters width and height of type double and it needs to  initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the  height parameter is less than 0 it needs to set the height field value to 0.
    Write the following methods (instance methods):
    * Method named getWidth without any parameters, it needs to return the value of width field. * Method named getHeight without any parameters, it needs to return the value of height field.
    * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
    * Method named setHeight with one parameter of type double, it needs to set the value of the  height field. If the parameter is less than 0 it needs to set the height field value to 0.
    * Method named getArea without any parameters, it needs to return the area of the wall. TEST EXAMPLE
    → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT) Wall wall = new Wall (5, 4);
    System.out.println("area= " + wall.getArea());
    wall.setHeight(-1.5);
    System.out.println("width= " + wall.getWidth());
    System.out.println("height= " + wall.getHeight());
    System.out.println("area= " + wall.getArea());
    → OUTPUT:
    area= 20.0
    width= 5.0
    height= 0.0
    area= 0.0
    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 5 methods and 2 constructors.
    */

        double width,height;//create variables

        public Wall(){
            System.out.println("This is no parameters constructor");
        }
        public Wall(double width,double height){
            if (width<0){
                this.width=0;//if it is negative assign zero
            }
            else
            {
                this.width=width;//if it is not negative than assign width
            }
            if (height<0){
                this.height=0;//if it is negative assign zero
            }
            else
            {
                this.height=height;//if it is not negative than assign height

            }


        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {

            if (width<0){
                this.width=0;//if it is negative assign zero
            }
            else
            {
                this.width=width;//if it is not negative than assign width
            }

        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            if (height<0){
                this.height=0;//if it is negative assign zero
            }
            else
            {
                this.height=height;//if it is not negative than assign height

            }

        }
        public double getArea(){//instance method
            double area= this.height*this.width;//that is why we have used this.
            return area;
        }

        public static void main(String[] args) {
            Wall wall = new Wall (5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());

        }


    }