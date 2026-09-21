class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String s : operations){
            if(s.equals("D")){
                int a = stack.peek() * 2;
                stack.push(a);
                res += a;
            }
            else if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                int c = a+ b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
                res += c;
            }
            else if(s.equals("C")){
                res -= stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
                res += stack.peek();
            }
        }
        return res;

    }
}