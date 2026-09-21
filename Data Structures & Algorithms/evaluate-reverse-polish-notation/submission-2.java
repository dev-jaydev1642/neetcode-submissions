class Solution {
    public int evalRPN(String[] tokens) {
        List<Integer> list = new ArrayList<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = list.removeLast();
                int num1 = list.removeLast();

                switch(token) {
                    case "+": list.add(num1 + num2); break;
                    case "-": list.add(num1 - num2); break;
                    case "*": list.add(num1 * num2); break;
                    case "/": 
                        if (num2 == 0) {
            System.out.println("Warning: Division by zero encountered. Defaulting result to 0.");
            list.add(0); 
        } else {
            list.add(num1 / num2);
        }
        break;
                }
            } else {
                list.add(Integer.parseInt(token));
            }
        }  

        return list.get(0);  
    }
}
