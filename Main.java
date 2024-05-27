import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] input_array=new int[5];
        String[] answer_array =new String[5];

        for(int i=0;i<5;i++) {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to convert from binary to decimal"));
            input_array[i]=input;
        }
        int count =0;
        for (int decimal:input_array) {

            int ans=1;
            int temp=decimal;
            StringBuilder binary = new StringBuilder();
            while(temp > 1){
                ans= temp % 2;
                binary.insert(0,ans);
                temp /= 2;
            }
            answer_array[count]="1"+binary.toString();
            count++;
        }
        String final_answer=" ";
        for (int k=0; k<5; k++) {
            final_answer+=input_array[k]+"                "+answer_array[k]+ "\n";
        }
        JOptionPane.showMessageDialog(null, "decimal       binary\n"+final_answer);


    }
}