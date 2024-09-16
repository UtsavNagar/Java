/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author utsav
 */
public class Mavenproject1 {
    private void controlFlows(){
        int marks = 59;
        
        if(marks >= 60){
            System.out.println("I division");
        }else if(marks >= 50){
            System.out.println("II division");
        }else if(marks >= 40){
            System.out.println("III division");
        }else if(marks >= 30){
            System.out.println("I division");
        }else{
            System.out.println("Fail Hai Bhai tu");
        }
    }
    
    private void switchCases(){
        int day = 2;
        
        switch(day){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("ThurseDay");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Satureday");
                    break;
            
        }
    }
    
    private static void addInt(int a[]){
        int sum = 0;
        for(int i : a)
            sum += i;
       
        System.out.println(sum);
    }
    
    private static void ForEachLoops(){
        int a[]={10,20,30,40,50,50};        
        int b[]={11,220,430,240,450,50};
        int c[]={12,24,31,433,55,511};
        
        addInt(a);
        addInt(b);
        addInt(c);
    }
    
    public static void main(String[] args){
        Mavenproject1 obj1 = new Mavenproject1();
        //obj1.controlFlows();
        //obj1.switchCases();
        
        ForEachLoops();
    }
}
