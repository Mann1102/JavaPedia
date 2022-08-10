import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int number=scan.nextInt();
        String[][] arr=new String[number][3]; 
        scan.nextLine();
        for(int i=0;i<arr.length;i++){
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            arr[i][0]=scan.nextLine(); 
            System.out.print("\t - Date of birth: ");
            arr[i][1]=scan.nextLine();
            System.out.print("\t - Occupation: ");
            arr[i][2]=scan.nextLine();
            System.out.print("\n");
        }
        System.out.println("These are the values you stored:\n"); 
        print2DArray(arr);
        boolean option=true;
        while(option==true){
        System.out.print("\nWho do you want information on? ");  
        String name=scan.nextLine();
        System.out.println("\n");
        for(int i=0;i<arr.length;i++){
            if(arr[i][0].equalsIgnoreCase(name)){
                System.out.println("\tName: "+arr[i][0]);
                System.out.println("\tDate of birth: "+arr[i][1]);
                System.out.println("\tOccupation: "+arr[i][2]+"\n\n");
            }
        }
        System.out.println("If you want any more information type yes or no");
        String answer=scan.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            option=true;
        }
        else if(answer.equalsIgnoreCase("no")){
            option=false;
            System.out.println("\nThank you for using JavaPedia!\n");
            System.exit(0);
        }
        else{
            System.out.println("\nInvalid response! System exit.\n");
            System.exit(0);
        }
    }
    scan.close();   
}
    public static void print2DArray(String[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t Name: "+arr[i][0]);
            System.out.print("\t - Date of birth: "+arr[i][1]);
            System.out.print("\t - Occupation: "+arr[i][2]);
            System.out.println();
        }
    }
}
