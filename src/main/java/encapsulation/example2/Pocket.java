package encapsulation.example2;

public class Pocket {

    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney(double moneyToWithdraw) {
        if (this.money > moneyToWithdraw) {
            this.money = this.money - moneyToWithdraw;
        }
        return this.money <= 10 ? 0 : this.money;
    }

    public double showMoney(){
        return this.money;
    }
    public void setMoney(double moneyToAddToPocket){
        if(moneyToAddToPocket < 0){
            System.out.println("Negalima ideti neigiams sums");
        } else if(moneyToAddToPocket > 3000){
            System.out.println("Negalima ideti tokios dideles sumos");
        } else {
            this.money = this.money + moneyToAddToPocket;
        }
    }
}





