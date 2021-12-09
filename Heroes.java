public class Heroes extends AHeroes {
    Heroes (String name) {
        this.name = name;
    }

    public String saw(Inventory inventory) {
        return name + " увидел " + inventory.getName();
    }

    public String perkUp() {
        return name + " оживился";
    }

    public String turnToAt() {
        if (condition == Conditions.SAD) {
            return name + " грустно оглянулся";
        } else {
            return name + " оглянулся";
        }
    }

    public String catched(Inventory inventory) {
        if (condition == Conditions.FORMER) {
            return (name + " схватил бывший " + inventory.getName());
        } else {
            return (name + "схватил" + inventory.getName());
        }
    }

    public String layed(Inventory inventory) {
        if (condition == Conditions.CAUTIOUSLY) {
            return (name + " осторожно положил " + inventory.getName());
        } else {
            return (name + " положил " + inventory.getName());
        }
    }

    public String layedOn(Place place) {
        if(condition == Conditions.NORMAL) {
            return (name + " положил на " + place.getName());
        } else {
            return "ну пока";
        }
    }

    public String pulled(Inventory inventory) {
       return name + " достал " + inventory.getName();
    }

    public String pickedUp(Inventory inventory) {
       return name + " поднял " + inventory.getName();
    }
}
