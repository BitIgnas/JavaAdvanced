package encapsulation.example2;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(50);
        System.out.println("Kiseneje yra " + pocket.showMoney() + " Eur");
        pocket.setMoney(50);
        System.out.println("Dabar kiseneje yra " + pocket.showMoney());
        pocket.setMoney(-10); //negalima ideti neigiamos sumos
        pocket.setMoney(3001); //negalime ideti didesnes, nei 3000 sumos
        System.out.println("Likutis " + pocket.getMoney(10));
        pocket.getMoney(8);
        double allMoney = pocket.getMoney(8);
        System.out.println(allMoney);


    }
}
