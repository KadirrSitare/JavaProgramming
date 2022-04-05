package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "asdsfdsfdgfg";
        String uniques = "";

        for (int i = 0; i <str.length() ; i++) {
            if (uniques.contains(""+ str.charAt(i))){
                continue;
            }
            uniques += str.charAt(i);
        }
        System.out.println(uniques);
    }
}
