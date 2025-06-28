class Shape {
    protected int height;
    protected int width;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}

class Rectangle extends Shape {
    public int area() {
        return width * height; // Corrected the return statement
    }
}

class Single {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setWidth(5);   // Corrected method name to match Java conventions
        obj.setHeight(4);
        System.out.println(obj.area());  // Displaying the area
    }
}
