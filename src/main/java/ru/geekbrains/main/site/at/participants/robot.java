package ru.geekbrains.main.site.at.participants;

public class robot implements Runner {
    private String Name;
    private int maxLength;
    private int maxWeight;
    private boolean success = true;

    public robot(String name, int maxLength, int maxWeight) {
        this.Name = name;
        this.maxLength = maxLength;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println(getClass().getSimpleName() + " " + Name + " бежит максимум: " + maxLength);
    }

    public void jump() {
        System.out.println(getClass().getSimpleName() + " " + Name + " прыгает максимум: " + maxWeight);
    }

    public String getName() {
        return Name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}