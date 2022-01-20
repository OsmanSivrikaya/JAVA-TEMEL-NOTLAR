public class Product {
    //Constructor Yapısı
    //sadece içindeki değerleri verirsen product classını kullanabilirsin
    public Product(int id,String name,String description,double price,int stockAmount){
        System.out.println("Yapıcı Blok Çalıştı");
        this.id = id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
    }
    public Product(){

    }
    //attribute | field
    //Encapsulation

    int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;
    //getter
    //Ürün id sini sadece okuyabilirsin değiştiremezsin
    public int getId(){
        return id;
    }
    //setter
    // void geriye değer döndürmez set etmek için kullanırlır
    public void setId(int id){
        //this.id kullanımı karışıklık olmaması için kullanılır bu class daki id demek
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
