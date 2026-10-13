class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int fp = 0; //frontPointer
        int bp = s.length()-1; //backPointer
        while(fp < bp){
            int f = (int) s.charAt(fp);
            int b = (int) s.charAt(bp);
            System.out.println(f);
            System.out.println(b);
            if(f>=65 && f <= 90) f+=32;
            if(b>=65 && b <= 90) b+=32;
            if(((f>=97 && f <=122) || (f>=48 && f<=57)) &&
               ((b>=97 && b <=122) || (b>=48 && b<=57))){
                if(f!=b){
                    return false;
                }
                fp++;
                bp--;
            } 
            else {
                if(!((f>=97 && f <=122) || (f>=48 && f<=57)))fp++;
                if(!((b>=97 && b <=122) || (b>=48 && b<=57)))bp--;
            }
        }
        return true;
    }
}
