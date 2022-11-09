import java.util.Scanner;
public class ArrayProcessing {

    int[] intArray = new int[5];
    Scanner scan = new Scanner(System.in);
    public ArrayProcessing(){
        scan = this.scan;
        intArray = this.intArray;
        getNumbers();
        processNumbers();
    }
    public void getNumbers(){
        System.out.println("Enter 5 separate whole numbers: ");
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = scan.nextInt();
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
                System.out.println("Error...\nPlease enter valid input.");
            }
        }

    }
    public int printMenu(){
        int choice;
        System.out.println("1) Add numbers");
        System.out.println("2) Multiply numbers");
        System.out.println("3) Print numbers");
        System.out.println("4) Print number in reverse");
        choice = scan.nextInt();
        return choice;
    }
    public void add(){
        int sum = 0;
        for(int i = 0; i< intArray.length; i++){
            sum = sum + intArray[i];
        }
        System.out.println("The sum of the values equals "+sum);
    }
    public void mult(){
        int multSum = 1;
        for(int i = 0; i< intArray.length; i++){
            multSum = multSum * intArray[i];
        }
        System.out.println("The values multiplied equals "+multSum);
    }
    public void print(){

        for(int i = 0; i< intArray.length; i++){
            System.out.println("Print value: "+ intArray[i]);
        }
    }

    public void reverse(){
        for(int i = intArray.length-1; i>-1; i--) {
            System.out.println("In reverse: "+ intArray[i]);
        }
    }
    public boolean again(){
        int playAgain = 0;
        System.out.println("Enter 1 to choose another option, enter anything else to end: ");
        playAgain = scan.nextInt();
        if (playAgain == 1){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        new ArrayProcessing();
    }

}