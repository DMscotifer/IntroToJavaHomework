public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public int add() {
        return this.getNum1() + this.getNum2();
    }

    public int subtract() {
        return this.getNum1() - this.getNum2();
    }

    public int multiply() {
        return this.getNum1() * this.getNum2();
    }

    public int divide() {
        return this.getNum1() / this.getNum2();
    }
}
