package day31_CustomClass_Construction.salaryCalculator;

public class Test {

    public static void main(String[] args) {

        $1_SalaryCalculator calc1 = new $1_SalaryCalculator(100, 20, 10, 45);

        System.out.println(calc1.salary());
        System.out.println(calc1.stateTax());
        System.out.println(calc1.federalTax());
        System.out.println(calc1.salaryAfterTax());

        System.out.println(calc1);


    }


}
