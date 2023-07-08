package oop;
public class PizzaOrder {
    String name;
    enum Size {
        SMALL,
        MEDIUM,
        BIG
    }
    Size size;
    boolean sauce;
    String adress;
    boolean accepted;
    PizzaOrder(String name, Size size, boolean sauce, String adress) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.adress = adress;
    }
    public void order() {
        if (accepted) {
            System.out.println("Данный заказ уже принят");
            return;
        }
        accepted = true;
        String s;
        if (sauce) s = "с соусом";
        else s = "без соуса";
        switch (size) {
            case SMALL -> System.out.printf("Заказ принят. Маленькая пицца «%s» %s на адрес %s.%n", name, s, adress);
            case MEDIUM -> System.out.printf("Заказ принят. Средняя пицца «%s» %s на адрес %s.%n", name, s, adress);
            case BIG -> System.out.printf("Заказ принят. Большая пицца «%s» %s на адрес %s.%n", name, s, adress);
        }
    }
    public void cancel() {
        if (accepted) {
            accepted = false;
            System.out.println("Заказ отменен");
            return;
        }
        System.out.println("Заказ не был принят");
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        String s1, s2 = "";
        if (sauce) s1 = "с соусом";
        else s1 = "без соуса";
        switch (size) {
            case SMALL:
                s2 = String.format("Маленькая пицца «%s» %s на адрес %s.%n", name, s1, adress);
                break;
            case MEDIUM:
                s2 = String.format("Средняя пицца «%s» %s на адрес %s.%n", name, s1, adress);
                break;
            case BIG:
                s2 = String.format("Большая пицца «%s» %s на адрес %s.%n", name, s1, adress);
                break;
        }
        return s2;
    }
}
