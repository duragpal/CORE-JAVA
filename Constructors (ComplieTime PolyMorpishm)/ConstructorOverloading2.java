class Box{
    int width, height, length;
    Box(int width, int height, int length){
        this.width=width;
        this.height = height;
        this.length = length;
    }
    Box( int side){
        height = width = length = side;
    }
    int area(){
       return 2*(length*width + width*height+length*height);
    }
    int volume(){
        return length*width*height;
    }
}
public class Main{
    public static void main(String args[]){
        Box cube = new Box(5);
        System.out.println("Cube Area: "+ cube.area());
        System.out.println("Cube Volume: "+ cube.volume());
        Box cuboid = new Box(5,2,3);
        System.out.println("Cuboid Area: "+ cuboid.area());
        System.out.println("Cuboid Area: "+ cuboid.volume());
        
        
    }
}
