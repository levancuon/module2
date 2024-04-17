package First;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double[] scores = new double[3];
    private String gender;

    public Student(int id, String name, double[] scores, String gender) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double[] getScores() {
        return scores;
    }
    public void setScores(double[] scores) {
        this.scores = scores;
    }
    public double getAvrScore() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    @Override
    public String toString() {
        return "{"
                + "id="
                + id
                + ", name = "
                + name
                + ", scores="
                + Arrays.toString(scores)
                + ", gender "
                + gender
                + ", Avr score = "
                + getAvrScore()
                + '}';
    }
}
