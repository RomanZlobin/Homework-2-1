public class Main {
    public static void main(String[] args) {

        int ticketPrice = 2000; // стоимость билета
        int bonus = 20; // рублей для одной бонусной милли

        int amountBonus = ticketPrice / bonus; // Рассчет бонусных миль

        System.out.println("Количество бонусных миль: " + amountBonus);
    }
}