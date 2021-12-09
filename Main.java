public class Main {
    public static void main(String[] args) {
        //герои
        Heroes Ia = new Heroes("Иа-Иа");
        Heroes Svinya = new Heroes("Пятачок");
        //предметы
        Inventory Pot = new Inventory("горшок");
        Inventory Balloon = new Inventory("шарик");
        Inventory Teeth = new Inventory("зубы");
        //место
        Place Ground = new Place("земля");

        System.out.println(Ia.saw(Pot) + ",");
        System.out.println(Ia.perkUp() + ".");
        Svinya.setCondition(Conditions.SAD);
        System.out.println(Svinya.turnToAt() + ".");
        Ia.setCondition(Conditions.FORMER);
        System.out.println(Ia.catched(Balloon) + " в " + Teeth.getName() + " и ");
        Ia.setCondition(Conditions.CAUTIOUSLY);
        System.out.println(Ia.layed(Balloon) + " в " + Pot.getName() + ", ");
        Ia.setCondition(Conditions.NORMAL);
        System.out.println("потом " + Ia.pulled(Balloon) + " и " + Ia.layedOn(Ground) + ",");
        Ia.setCondition(Conditions.CAUTIOUSLY);
        System.out.println("a потом " + Ia.pickedUp(Balloon) + " обратно.");

    }

}
