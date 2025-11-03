import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        //Razdvajanje rečenice u riječi
        String s[] = str.split(" ");

        //Dodavanje slova u string
        for(int j=0;j<s.length;j++){
            rev = s[j]+" "+rev;
        }

        System.out.println("Reversed sentence: " + rev);
    }
}