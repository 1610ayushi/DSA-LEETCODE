class Solution {
    public void reverseString(char[] s) {
          int front=0;
        int back= s.length-1;
        while(front<=back){
              char temp = s[front];
            s[front]=s[back];
            s[back]=temp;
            front +=1;
            back-=1;
        }
    }
}
