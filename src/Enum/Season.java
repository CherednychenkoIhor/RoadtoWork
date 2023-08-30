package Enum;

public enum Season {
    SUMMER (35), WINTER(-25), AUTUMN (10), SPRING(20);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


}
