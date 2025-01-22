public class Producto {
    private int stock;
    private double precio_Compra, precio_Venta;
    private String descripcion, codigo;

    public Producto(String codigo, String descripcion, double precio_Compra, double precio_Venta, int stock) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio_Compra = precio_Compra;
        this.precio_Venta = precio_Venta;
        this.stock = stock;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public double getPrecio_Compra(){
        return this.precio_Compra;
    }

    public void setPrecio_Compra(double precio_Compra){
        this.precio_Compra = precio_Compra;
    }

    public double getPrecio_Venta(){
        return this.precio_Venta;
    }

    public void setPrecio_Venta(double precio_Venta){
        this.precio_Venta = precio_Venta;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String toString(){
        return " código: " + codigo + " Descripción: " + descripcion +  " precio de compra: " + precio_Compra + " precio de venta" + precio_Venta + "stock: " + stock;
    }
}
