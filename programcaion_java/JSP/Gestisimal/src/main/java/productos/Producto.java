package productos;

public class Producto {


    /**
     * codigo = Is the unique code that has every product
     */
    private long codigo;
    /**
     * descripcion = The description of the product
     */
    private String descripcion;
    /**
     * precioCompra = The price of the product when buying
     */
    private double precioCompra;
    /**
     * precioVenta = The price of the product qhen selling
     */
    private double precioVenta;
    /**
     * stock = Quantity of products that are available
     */
    private int stock;

    /**
     * Construct of the class
     * @param codigo
     * @param descripcion
     * @param precioCompra
     * @param precioVenta
     * @param stock
     */
    public Producto(long codigo, String descripcion, double precioCompra, double precioVenta, int stock){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public long getCodigo(){
        return this.codigo;
    }

    public void setCodigo(long codigo){
        this.codigo = codigo;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecioCompra(){
        return this.precioCompra;
    }

    public void setPrecioCompra(double precioCompra){
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta(){
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public String seralizar(){
        return this.codigo + "," + this.descripcion + "," + precioCompra + "," + precioVenta + "," + stock;
    }
}