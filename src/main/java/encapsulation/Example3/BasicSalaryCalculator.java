package encapsulation.Example3;

public class BasicSalaryCalculator {

    private double basicSalary;

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public BasicSalaryCalculator()  {
        if(basicSalary < 0){
            throw new IllegalArgumentException("Negative salary is not allowed");
        }
        this.basicSalary = basicSalary;
    }

    public double getGrossSalary(){
        return this.basicSalary + getSocialInsurance() + getAdditionalBonus();

    }

    public double getSocialInsurance() {
        return this.basicSalary * 25/100;
    }


    public double getAdditionalBonus(){
        return this.basicSalary / 10;
    }
}
