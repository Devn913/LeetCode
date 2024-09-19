class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> results = new ArrayList<>();
        if (expression.length() == 0) return results;

        if (expression.length() == 1) {
            results.add(Integer.parseInt(expression));
            return results;
        }
        if(expression.length() == 2 && Character.isDigit(expression.charAt(0))){
            results.add(Integer.parseInt(expression));
            return results;
        }
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) continue;

            List<Integer> leftResults = diffWaysToCompute(
                expression.substring(0, i)
            );
            List<Integer> rightResults = diffWaysToCompute(
                expression.substring(i + 1)
            );

            for (int leftValue : leftResults) {
                for (int rightValue : rightResults) {
                    int computedResult = 0;

                    switch (currentChar) {
                        case '+':
                            computedResult = leftValue + rightValue;
                            break;
                        case '-':
                            computedResult = leftValue - rightValue;
                            break;
                        case '*':
                            computedResult = leftValue * rightValue;
                            break;
                    }

                    results.add(computedResult);
                }
            }
        }

        return results;
    }
}