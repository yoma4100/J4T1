public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        
        System.out.println("Накоплено миль: "+service.calculate(10_000));
    }
}