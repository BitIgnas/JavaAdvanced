package encapsulation.Example3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicSalaryCalculatorTest {

    private BasicSalaryCalculator basicSalaryCalculator;

    @BeforeEach
    void setUpBeforeEach(){
        basicSalaryCalculator = new BasicSalaryCalculator();
    }

    @Test
    void testBasicSalaryCalculatorWithValidSalary(){
        double basicSalary = 4000;
        basicSalaryCalculator.setBasicSalary(basicSalary);

        double expectedSocialInsurance = basicSalary * 0.25;
        assertEquals(expectedSocialInsurance, basicSalaryCalculator.getSocialInsurance());

    }

    @Test
    void testAdditionalBonusCalculation(){
        double basicSalary = 2000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectAdditionalInsurance = basicSalary * 0.10;

        double actualAdditionalBonus = basicSalaryCalculator.getAdditionalBonus();

        assertEquals(expectAdditionalInsurance, actualAdditionalBonus);
    }

    @Test
    void testGrossSalaryCalculation(){
        double basicSalary = 6000;
        basicSalaryCalculator.setBasicSalary(basicSalary);
        double expectedGrossSalary = 8100;

        double actualGrossSalary = basicSalaryCalculator.getGrossSalary();

        assertEquals(expectedGrossSalary,actualGrossSalary );




    }

    @Test
    @DisplayName("Should throw an exception when salary below 0")
    void testBasicSalary(){
        final double basicSalary = -1000;
        assertThrows(IllegalArgumentException.class, () ->basicSalaryCalculator.setBasicSalary(basicSalary));
    }

}