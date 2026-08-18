package Tranforma;

public class Converter {
    public double temp;

    public double getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
//F = (°C x 1.8) + 32
    public void converter(){
        double tranf;
        tranf = (temp*1.8) +32;
        System.out.print("O valor convertrido é: "+tranf);
    }
}
