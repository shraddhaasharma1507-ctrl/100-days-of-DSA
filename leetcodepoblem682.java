class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        int sum =0;
        String[] s = operations;
        for (int i= 0; i<s.length;i++){
           if(s[i].equals( "C")){
            stack.pop();
           }
           else if(s[i].equals("D")){
            stack.push(2*stack.peek());
           }
          else if(s[i].equals("+")){
            int x = stack.pop();
            int y = stack.pop();
            int z = x+y;
            stack.push(y);
            stack.push(x);
            stack.push(z);
           }
           else{
            stack.push(Integer.parseInt(s[i]));
           }
        }
       while(!stack.isEmpty()){
        sum = sum+ stack.pop();
       }
       return sum;
    }
}