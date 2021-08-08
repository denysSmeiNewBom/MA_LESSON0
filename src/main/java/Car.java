public class Car {
    double maxSpeed;
    String color;
    String mark;

    public Car(double maxSpeed, String color, String mark) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.mark = mark;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
