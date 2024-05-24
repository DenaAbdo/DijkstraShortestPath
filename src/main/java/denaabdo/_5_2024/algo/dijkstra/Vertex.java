package denaabdo._5_2024.algo.dijkstra;

public class Vertex {
    String cityName;
    double x, y;

    public void Vertex(String cityName, double xCordinate, double yCordinate ){
        this.cityName = cityName;
        this.x = xCordinate;
        this.y = yCordinate;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
