package com.in28minutes.learnspringframework.test;

class Pojo {
    private String text;
    private int number;

    @Override
    public String toString() {
        return "Pojo{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}

class JavaBean { //EJB
    private String text;
    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class SpringBeanVsJavaBean {
    public SpringBeanVsJavaBean() {
    }

    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);
    }

}
