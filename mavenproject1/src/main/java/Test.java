
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test{
    public static void main(String args[]) throws Exception{
//        try (       Circle c1 = new Circle(2.5,"Blue");
//        System.out.print(c1.getColor()+" ");        
//        System.out.print(c1.getRadius());
//        c1.setColor("Kala");        
//        c1.setRadius(5.5);
//        c1.calculateArea();
//        System.out.print(c1.toString());
//        Employee emp1 = new Employee(121,"Raj","rajput",35000);
//        System.out.print(emp1.getId()+" ");
//        System.out.print(emp1.getFirstName()+" ");
//        System.out.print(emp1.getLastName()+" ");
//        System.out.print(emp1.getName()+" ");
//        System.out.print(emp1.getSalary()+" "); 
//        emp1.raiseSalary(12);
//        System.out.print(emp1.getSalary()+" ");
//        System.out.print(emp1.getAnnualSalary()+" ");
//        System.out.print(emp1.toString()+" ");
//        Square sqr = new Square(10.5,"red",true);
//        System.out.println(sqr.getSide());
//        sqr.setWidth(12.0);
//        System.out.println(sqr.getSide());
//        System.out.println(sqr.getArea());
//        System.out.println(sqr.getColor());
            
//            FileOutputStream f = new FileOutputStream("textDemo.txt")) {
//            String str = "Hello from here" ;
//            byte bt[] = str.getBytes();
//            f.write(bt);
//            f.close();
                
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Write File Path : ");
//        
//        String fname = sc.next();
//        try (FileInputStream fl = new FileInputStream(fname)) {
//            while(true){
//                int n = fl.read();
//                if(n==-1) break;
//                System.out.println(n);
//            }
//        }
//        }


//          game

        String pathForGame = "/home/utsav/JavaPrograms/Programs/Game.txt";
        Game player1 = null;
        Scanner sc = new Scanner(System.in);
        int newX, newY;

        System.out.print("Do You Want to Start a new game 1/0 -> ");
        int isNew = sc.nextInt();

        if (isNew == 0) {
            FileInputStream fis = new FileInputStream(pathForGame);  
            ObjectInputStream ois = new ObjectInputStream(fis);
            player1 =  (Game)ois.readObject();
        } else {
            player1 = new Game();
        }

        System.out.print("Enter X -> ");
        newX = sc.nextInt();

        System.out.print("Enter Y -> ");
        newY = sc.nextInt();

        player1.move(newX, newY);
        player1.show();

        try (FileOutputStream gameFile = new FileOutputStream(pathForGame);
            ObjectOutputStream oos = new ObjectOutputStream(gameFile)) {
            oos.writeObject(player1);
        } catch (IOException e) {
        }
    } 
}