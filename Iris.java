package com.main.proxy.bayes;

public class Iris {
    private String name;

    private Double p1;

    private Double p2;

    private Double p3;

    private Double p4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getP3() {
        return p3;
    }

    public void setP3(Double p3) {
        this.p3 = p3;
    }

    public Double getP4() {
        return p4;
    }

    public void setP4(Double p4) {
        this.p4 = p4;
    }

    public Iris(String p1, String p2, String p3, String p4,String name) {
        this.name = name;
        this.p1 = Double.parseDouble(p1);
        this.p2 = Double.parseDouble(p2);
        this.p3 = Double.parseDouble(p3);
        this.p4 = Double.parseDouble(p4);
    }
}
