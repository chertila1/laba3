public enum Conditions {
    SAD("грустно"),
    CAUTIOUSLY("осторожно"),
    NORMAL("обычное состояние"),
    FORMER("бывший");

    private final String condition;

    Conditions(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}
