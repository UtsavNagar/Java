
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsav
 */
public class Patterns {
    private static void a(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j>=size-i-1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j<i){
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
    }
    private static void b(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j>=i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j<size-i-1){
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
    }
    private static void c(int size){
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size;j++){
                if(j>=size-i-1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j<i){
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j>=i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j<size-i-1){
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
        
    }
    
    
    private static void d(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j<size-i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j>=i){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j<=i+1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j=0; j<size;j++){
                if(j>=size-i-1){
                    System.out.print("# ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }
    }
    
    
    public void show(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");

        int size = scanner.nextInt();
        
        System.out.print("Enter a choice (1,2,3,4 only) : ");        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1 -> a(size);
            case 2 -> b(size);
            case 3 -> c(size);
            case 4 -> d(size);
            default -> System.out.println("Invalid Choice");
        }
    }
}
