public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber (double firstNumber){
        this.firstNumber = firstNumber;

    }

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult(){
        System.out.println(getFirstNumber() + " + " + getSecondNumber() + " = " + (getFirstNumber()+getSecondNumber()));
        return (getFirstNumber() + getSecondNumber());
    }

    public double getSubtractionResult(){
        System.out.println(getFirstNumber() + " - " + getSecondNumber() + " = " + (getFirstNumber()-getSecondNumber()));
        return (getFirstNumber() - getSecondNumber());
    }

    public double getMultiplicationResult(){
        System.out.println(getFirstNumber() + " * " + getSecondNumber() + " = " + (getFirstNumber()*getSecondNumber()));
        return (getFirstNumber() * getSecondNumber());
    }
    public double getDivisionResult(){
        if( getSecondNumber() == 0){
            System.out.println("The second number is 0 !");
            return 0;
        }
        else {
            System.out.println(getFirstNumber() + " / " + getSecondNumber() + " = " + (getFirstNumber()/getSecondNumber()));
            return (getFirstNumber() / getSecondNumber());
        }

    }

}
