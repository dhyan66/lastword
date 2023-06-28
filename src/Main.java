import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Type in the content");
        String sentence = kb.nextLine();
        System.out.println("The last word cout is " + lengthOfLastWord(sentence));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        char store = 'x';
        int index = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                index = i;
                break;
            }
        }
        for(int i = index;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }

        }


        return count;
    }
}