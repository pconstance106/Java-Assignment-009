import java.util.Scanner;
public class ArrayProcessing {

    int[] array = new int[5];
    Scanner scan = new Scanner(System.in);
    public ArrayProcessing(){
        scan = this.scan;
        array = this.array;
        getNumbers();
        processNumbers();
    }
    public void getNumbers(){
        System.out.println("Enter 5 separate whole numbers: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
    }
    public void processNumbers(){
        for(boolean again = true; again; again = again()){
            int choice = printMenu();
            if(choice == 1){
                add();
            }
            else if(choice == 2){
                mult();
            }
            else if(choice == 3){
                print();
            }
            else if(choice == 4){
                reverse();
            }else{
                System.out.println("Error, try again");
            }
        }

    }
    public int printMenu(){
        int choice;
        System.out.println("Choose an option to perform:");
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        choice = scan.nextInt();
        return choice;
    }
    public void add(){
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Added = "+sum);
    }
    public void mult(){
        int multSum = 1;
        for(int i = 0; i< array.length; i++){
            multSum = multSum * array[i];
        }
        System.out.println("Multiplied = "+multSum);
    }
    public void print(){

        for(int i = 0; i< array.length; i++){
            System.out.println("Printed = "+array[i]);
        }
    }
    public void reverse(){
        for(int i = array.length-1; i>-1; i--) {
            System.out.print("IN REVERSE ORDER = "+array[i]);
        }
    }
    public boolean again(){
        int playAgain = 0;
        System.out.println("Enter 1 to choose another option or 2 to exit");
        playAgain = scan.nextInt();
        if (playAgain == 1){
            return true;
        } else {
            return scan.nextInt() !=2;
        }
    }
    public static void main(String[] args) {
        new ArrayProcessing();
    }
}