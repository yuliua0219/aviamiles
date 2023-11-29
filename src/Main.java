public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        service.calculate(10000);
        int price = 10_000;
        int miles = service.calculate(price);

        System.out.println(miles);

    }
}
