// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class ex {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> income = new ArrayList<>();
        // ArrayList<String> type = new ArrayList<>();
        // ArrayList<Integer> exp = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int incomeSum=0;
        int totalExp=0;
        // String input=sc.nextLine();
        
        while(true){
            System.out.print("Enter the income(or done):");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("done")){
                break;
            }

            int incomeValue=Integer.parseInt(input);
            income.add(incomeValue);
            incomeSum+=incomeValue;
            // sc.next();
            System.out.print("enter the type:");
            String type1=sc.nextLine();
            // type.add(type1);

            System.out.print("enter the exp:");
            int exp1 = sc.nextInt();
            sc.nextLine();
            // exp.add(exp1);
            totalExp+=exp1;
            map.put(type1,exp1);
            // sc.next();
        }
        System.out.println("Expenditures:");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("Total Income: "+incomeSum);
        System.out.println("Savings : "+(incomeSum-totalExp));

    }
}