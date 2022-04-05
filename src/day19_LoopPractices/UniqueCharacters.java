package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabbbbbbfdddddddtlllllllllhppppppppppr";
        String str2 = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 0;
            if (str2.contains(ch + "")){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                System.out.print(ch+"");
            }
            str2 += ch+"";
        }

    }
}
/*
Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */