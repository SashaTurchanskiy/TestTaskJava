public class Test3 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        System.out.println(test3.firstNotRepeatingCharacter("abacabad"));



    }
    char firstNotRepeatingCharacter(String s){
        for (int i = 0; i <s.length() ; i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return s.charAt(i);
            }

        }
        return '_';
    }
}
