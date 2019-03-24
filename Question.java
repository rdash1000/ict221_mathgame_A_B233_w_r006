public class Question {
    int value1;
    int value2;
    String operator;

    public Question(int value1, int value2, String operator) {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;


        if (operator.equals("/")){
            this.value1 = this.value1 * this.value2;
        }
    }
    /**
     * disolayes the question
     */
    public void showQuestion() {System.out.println("What is "+value1+" "+operator+" "+value2+"?");}

    /**
     * check if the given responce is correct
     * @parm responce the responce given by the user
     * @return true if the responce is correct, false otherwise
     */
    public boolean checkAnswer(int responce){
        boolean retValue = false;

        switch(operator){
            default:
            case "+":
                if (responce ==(value1 + value2))
                    retValue = true;
                break;
            case "-":
                if (responce ==(value1 - value2))
                    retValue = true;
            case "*":
                if (responce == (value1 * value2))
                    retValue = true;
                break;
            case "/":
                if (responce == (value1 / value2))
                    retValue = true;
                break;
        }
        return retValue;
    }

}

