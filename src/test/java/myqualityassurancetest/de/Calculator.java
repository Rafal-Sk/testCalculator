package myqualityassurancetest.de;

import myqualityassurance.Operations;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class Calculator {

    private char sign;
    private long number1;
    private long number2;
    private long result;


    @Given("a Calculator Class with operation sign <sign>")
    public void givenACalculatorClassWithOperationSignsign(@Named("sign") String sign  ) {
        this.sign = sign.charAt(0);

        switch (this.sign)  {

            case '+':
                System.out.println("Addition operation test z klsy");
                break;

            case '-':
                System.out.println("Substraction operation test z klsy");
                break;

            case '*':
                System.out.println("Multiplication operation test z klsy");
                break;

            case '/':
                System.out.println("Division operation test z klsy");
                break;

        }



    }

    @When("I give the first number <number1>")
    public void whenIGiveTheFirstNumbernumber1(@Named("number1") long number1) {
       this.number1 = number1;
    }

    @When("I give the second number <number2>")
    public void whenIGiveTheSecondNumbernumber2(@Named("number2") long number2) {
        this.number2 = number2;

    }

    @Then("I should get the result as <result>")
    public void thenIShouldGetTheResultAsresult(@Named("result") long result) {

        Operations operation = new Operations();

        switch (this.sign)  {

            case '+':
                this.result = operation.additions(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;

            case '-':
                this.result = operation.substraction(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;

            case '*':
                this.result = operation.multiplication(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;

            case '/':
                this.result = operation.division(this.number1,this.number2);
                Assert.assertEquals(this.result,result);
                break;

            default:
                System.out.println("Please a give correct operation");

        }

    }


}
