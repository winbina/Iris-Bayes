package com.main.proxy.bayes;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IrisBayes {

    private List<Iris> irises;

    private List<Iris> setosa;

    private List<Iris> versicolor;

    private List<Iris> virginica;

    Map<String, Double> data = new HashMap<String, Double>();

    public static void main(String[] args) {
        IrisBayes irisBayes = new IrisBayes();
        irisBayes.init();
        irisBayes.analysis();
        irisBayes.predict();
    }

    private void predict() {
        for (int i = 0; i < this.irises.size(); i ++) {
            double s1 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("setosa-s1")*this.data.get("setosa-s1")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP1()-this.data.get("setosa-a1"))*(this.irises.get(i).getP1()-this.data.get("setosa-a1")))
                                    /
                                    (2*Math.PI*this.data.get("setosa-s1")*this.data.get("setosa-s1")));
            double s2 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("setosa-s2")*this.data.get("setosa-s2")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP2()-this.data.get("setosa-a2"))*(this.irises.get(i).getP2()-this.data.get("setosa-a2")))
                                            /
                                            (2*Math.PI*this.data.get("setosa-s2")*this.data.get("setosa-s2")));
            double s3 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("setosa-s3")*this.data.get("setosa-s3")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP3()-this.data.get("setosa-a3"))*(this.irises.get(i).getP1()-this.data.get("setosa-a3")))
                                            /
                                            (2*Math.PI*this.data.get("setosa-s3")*this.data.get("setosa-s3")));
            double s4 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("setosa-s4")*this.data.get("setosa-s4")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP4()-this.data.get("setosa-a4"))*(this.irises.get(i).getP4()-this.data.get("setosa-a4")))
                                            /
                                            (2*Math.PI*this.data.get("setosa-s4")*this.data.get("setosa-s4")));

            double v1 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("versicolor-s1")*this.data.get("versicolor-s1")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP1()-this.data.get("versicolor-a1"))*(this.irises.get(i).getP1()-this.data.get("versicolor-a1")))
                                            /
                                            (2*Math.PI*this.data.get("versicolor-s1")*this.data.get("versicolor-s1")));
            double v2 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("versicolor-s2")*this.data.get("versicolor-s2")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP2()-this.data.get("versicolor-a2"))*(this.irises.get(i).getP2()-this.data.get("versicolor-a2")))
                                            /
                                            (2*Math.PI*this.data.get("versicolor-s2")*this.data.get("versicolor-s2")));
            double v3 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("versicolor-s3")*this.data.get("versicolor-s3")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP3()-this.data.get("versicolor-a3"))*(this.irises.get(i).getP3()-this.data.get("versicolor-a3")))
                                            /
                                            (2*Math.PI*this.data.get("versicolor-s3")*this.data.get("versicolor-s3")));
            double v4 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("versicolor-s4")*this.data.get("versicolor-s4")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP4()-this.data.get("versicolor-a4"))*(this.irises.get(i).getP4()-this.data.get("versicolor-a4")))
                                            /
                                            (2*Math.PI*this.data.get("versicolor-s4")*this.data.get("versicolor-s4")));


            double vi1 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("virginica-s1")*this.data.get("virginica-s1")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP1()-this.data.get("virginica-a1"))*(this.irises.get(i).getP1()-this.data.get("virginica-a1")))
                                            /
                                            (2*Math.PI*this.data.get("virginica-s1")*this.data.get("virginica-s1")));
            double vi2 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("virginica-s2")*this.data.get("virginica-s2")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP2()-this.data.get("virginica-a2"))*(this.irises.get(i).getP2()-this.data.get("virginica-a2")))
                                            /
                                            (2*Math.PI*this.data.get("virginica-s2")*this.data.get("virginica-s2")));
            double vi3 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("virginica-s3")*this.data.get("virginica-s3")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP3()-this.data.get("virginica-a3"))*(this.irises.get(i).getP1()-this.data.get("virginica-a3")))
                                            /
                                            (2*Math.PI*this.data.get("virginica-s3")*this.data.get("virginica-s3")));
            double vi4 =
                    (1.0/Math.sqrt(2*Math.PI*this.data.get("virginica-s4")*this.data.get("virginica-s4")))
                            *
                            Math.exp
                                    (-((this.irises.get(i).getP4()-this.data.get("virginica-a4"))*(this.irises.get(i).getP4()-this.data.get("virginica-a4")))
                                            /
                                            (2*Math.PI*this.data.get("virginica-s4")*this.data.get("virginica-s4")));

            String index = "";
            double p = 0;
//            if (s1*s2*s3*s4 > v1*v2*v3*v4) {
//                index = "setosa";
//                p = s1*s2*s3*s4;
//            } else {
//                index = "versicolor";
//                p = v1*v2*v3*v4;
//            }
//            if (p < vi1*vi2*vi3*vi4) {
//                index = "virginica";
//            }
            if (s1*s4 > v1*v4) {
                index = "setosa";
                p = s1*s4;
            } else {
                index = "versicolor";
                p = v1*v4;
            }
            if (p < vi1*vi4) {
                index = "virginica";
            }
            //System.out.println( index + "----" + this.irises.get(i).getName());
            if (!index.equals(this.irises.get(i).getName())) {
                System.out.println(s1*s2*s3*s4 + "--" + v1*v2*v3*v4 + "--"+ vi1*vi2*vi3*vi4 + "--" +index + "----" + this.irises.get(i).getName());
            }

        }
    }

    private void init() {
        this.irises = new ArrayList<Iris>();
        this.setosa = new ArrayList<Iris>();
        this.versicolor = new ArrayList<Iris>();
        this.virginica = new ArrayList<Iris>();
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(new File("D://Iris.txt"));
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = "";
            while((line = br.readLine()) != null) {
                String[] str = line.split(" ");
                Iris iris = new Iris(str[1], str[2], str[3], str[4], str[5].substring(1,str[5].length()-1));
                if (iris.getName().equals("setosa")) {
                    setosa.add(iris);
                } else if (iris.getName().equals("versicolor")) {
                    versicolor.add(iris);
                } else if (iris.getName().equals("virginica")) {
                    virginica.add(iris);
                }
                irises.add(iris);
            }
        } catch (Exception e) {

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void analysis() {
        analysisSetosa();
        analysisVersicolor();
        analysisVirginica();
    }

    private void analysisVirginica() {
        double a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
        for (int i = 0; i < virginica.size(); i++) {
            a1 += virginica.get(i).getP1();
            a2 += virginica.get(i).getP2();
            a3 += virginica.get(i).getP3();
            a4 += virginica.get(i).getP4();
        }
        a1 = a1/virginica.size();
        a2 = a2/virginica.size();
        a3 = a3/virginica.size();
        a4 = a4/virginica.size();
        this.data.put("virginica-a1", a1);
        this.data.put("virginica-a2", a2);
        this.data.put("virginica-a3", a3);
        this.data.put("virginica-a4", a4);

        for (int i = 0; i < virginica.size(); i++) {
            s1 += (virginica.get(i).getP1()-a1)*(virginica.get(i).getP1()-a1);
            s2 += (virginica.get(i).getP2()-a2)*(virginica.get(i).getP2()-a2);
            s3 += (virginica.get(i).getP3()-a3)*(virginica.get(i).getP3()-a3);
            s4 += (virginica.get(i).getP4()-a4)*(virginica.get(i).getP4()-a4);
        }
        s1 = Math.sqrt(s1/virginica.size());
        s2 = Math.sqrt(s2/virginica.size());
        s3 = Math.sqrt(s3/virginica.size());
        s4 = Math.sqrt(s4/virginica.size());
        this.data.put("virginica-s1", s1);
        this.data.put("virginica-s2", s2);
        this.data.put("virginica-s3", s3);
        this.data.put("virginica-s4", s4);
    }

    private void analysisVersicolor() {
        double a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
        for (int i = 0; i < versicolor.size(); i++) {
            a1 += versicolor.get(i).getP1();
            a2 += versicolor.get(i).getP2();
            a3 += versicolor.get(i).getP3();
            a4 += versicolor.get(i).getP4();
        }
        a1 = a1/versicolor.size();
        a2 = a2/versicolor.size();
        a3 = a3/versicolor.size();
        a4 = a4/versicolor.size();
        this.data.put("versicolor-a1", a1);
        this.data.put("versicolor-a2", a2);
        this.data.put("versicolor-a3", a3);
        this.data.put("versicolor-a4", a4);

        for (int i = 0; i < versicolor.size(); i++) {
            s1 += (versicolor.get(i).getP1()-a1)*(versicolor.get(i).getP1()-a1);
            s2 += (versicolor.get(i).getP2()-a2)*(versicolor.get(i).getP2()-a2);
            s3 += (versicolor.get(i).getP3()-a3)*(versicolor.get(i).getP3()-a3);
            s4 += (versicolor.get(i).getP4()-a4)*(versicolor.get(i).getP4()-a4);
        }
        s1 = Math.sqrt(s1/versicolor.size());
        s2 = Math.sqrt(s2/versicolor.size());
        s3 = Math.sqrt(s3/versicolor.size());
        s4 = Math.sqrt(s4/versicolor.size());
        this.data.put("versicolor-s1", s1);
        this.data.put("versicolor-s2", s2);
        this.data.put("versicolor-s3", s3);
        this.data.put("versicolor-s4", s4);
    }

    private void analysisSetosa() {
        double a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
        for (int i = 0; i < setosa.size(); i++) {
            a1 += setosa.get(i).getP1();
            a2 += setosa.get(i).getP2();
            a3 += setosa.get(i).getP3();
            a4 += setosa.get(i).getP4();
        }
        a1 = a1/setosa.size();
        a2 = a2/setosa.size();
        a3 = a3/setosa.size();
        a4 = a4/setosa.size();
        this.data.put("setosa-a1", a1);
        this.data.put("setosa-a2", a2);
        this.data.put("setosa-a3", a3);
        this.data.put("setosa-a4", a4);

        for (int i = 0; i < setosa.size(); i++) {
            s1 += (setosa.get(i).getP1()-a1)*(setosa.get(i).getP1()-a1);
            s2 += (setosa.get(i).getP2()-a2)*(setosa.get(i).getP2()-a2);
            s3 += (setosa.get(i).getP3()-a3)*(setosa.get(i).getP3()-a3);
            s4 += (setosa.get(i).getP4()-a4)*(setosa.get(i).getP4()-a4);
        }
        s1 = Math.sqrt(s1/setosa.size());
        s2 = Math.sqrt(s2/setosa.size());
        s3 = Math.sqrt(s3/setosa.size());
        s4 = Math.sqrt(s4/setosa.size());
        this.data.put("setosa-s1", s1);
        this.data.put("setosa-s2", s2);
        this.data.put("setosa-s3", s3);
        this.data.put("setosa-s4", s4);
    }
}
