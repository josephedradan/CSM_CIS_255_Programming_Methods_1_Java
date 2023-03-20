public class Shirt {

    private Size size;
    private String color;
    private double price;

    enum Size { SMALL, MEDIUM, LARGE }

    public static void main (String args[]){
        Shirt a = new Shirt(Size.SMALL,"blue",10.23);
        Shirt b = new Shirt(Size.SMALL,"blue",10.23);
        Shirt c = new Shirt(Size.SMALL,"green",10.23);
        Shirt d = new Shirt(Size.LARGE,"blue",10.23);
        Shirt e = new Shirt(Size.SMALL,"blue",100);

        a.sameShirt(b);
        a.sameShirt(c);
        a.sameShirt(d);
        a.sameShirt(e);



    }
    public Shirt(Size size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public Size getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    public void sameShirt(Shirt shirtInput){
        if(size == shirtInput.getSize() && color == shirtInput.color && price == shirtInput.getPrice()){
            System.out.println("They are the same shirt.");
        }
        else{
            System.out.println("They are not the same shirt.");
        }
    }
    @Override
    public String toString() {
        return "Size = " + size + "\n" +
                "Color = " + color + "\n" +
                "Price = " + price + "\n";
    }
}