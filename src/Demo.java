public class Demo {
    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println(scientificCalculator.pow(2, 3)); // From Scientific Calculator
        /*
        Multi - level inheritance Calculator extends AdvancedCalculator
        and AdvancedCalculator extends ScientificCalculator
        */
        scientificCalculator.show(); // Advanced Calculator
    }
}
