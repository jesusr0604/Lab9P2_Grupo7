package lab9progra2_carlosnoé;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClaseAdministrativa {

    public Object OrderID;
    public Object OrderDate;
    public Object ShipDate;
    public Object ShipMode;
    public Object CustomersID;
    public Object CustomersName;
    public Object Segment;
    public Object Country;
    public Object City;
    public Object State;
    public Object PostalCode;
    public Object Region;
    public Object ProductID;
    public Object Category;
    public Object SubCategory;
    public Object ProductName;
    public Object Sales;
    public Object Quantity;
    public Object Discount;
    public Object Profit;
    ArrayList<ClaseAdministrativa> listaAlumnos;

    public ClaseAdministrativa(ArrayList<ClaseAdministrativa> listaAlumnos) {
        this.listaAlumnos = Listar(listaAlumnos);
    }

    

    public ArrayList<ClaseAdministrativa> getListaAlumnos() {
        return listaAlumnos;
    }

    
    public void setListaAlumnos(ArrayList<ClaseAdministrativa> listaAlumnos) {
        this.listaAlumnos = Listar(listaAlumnos);
    }
    

    public ClaseAdministrativa() {
    }

    public ClaseAdministrativa(Object OrderID, Object OrderDate, Object ShipDate, Object ShipMode, Object CustomersID, Object CustomersName, Object Segment, Object Country, Object City, Object State, Object PostalCode, Object Region, Object ProductID, Object Category, Object SubCategory, Object ProductName, Object Sales, Object Quantity, Object Discount, Object Profit) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.ShipDate = ShipDate;
        this.ShipMode = ShipMode;
        this.CustomersID = CustomersID;
        this.CustomersName = CustomersName;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.PostalCode = PostalCode;
        this.Region = Region;
        this.ProductID = ProductID;
        this.Category = Category;
        this.SubCategory = SubCategory;
        this.ProductName = ProductName;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    public Object getOrderID() {
        return OrderID;
    }

    public void setOrderID(Object OrderID) {
        this.OrderID = OrderID;
    }

    public Object getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Object OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Object getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Object ShipDate) {
        this.ShipDate = ShipDate;
    }

    public Object getShipMode() {
        return ShipMode;
    }

    public void setShipMode(Object ShipMode) {
        this.ShipMode = ShipMode;
    }

    public Object getCustomersID() {
        return CustomersID;
    }

    public void setCustomersID(Object CustomersID) {
        this.CustomersID = CustomersID;
    }

    public Object getCustomersName() {
        return CustomersName;
    }

    public void setCustomersName(Object CustomersName) {
        this.CustomersName = CustomersName;
    }

    public Object getSegment() {
        return Segment;
    }

    public void setSegment(Object Segment) {
        this.Segment = Segment;
    }

    public Object getCountry() {
        return Country;
    }

    public void setCountry(Object Country) {
        this.Country = Country;
    }

    public Object getCity() {
        return City;
    }

    public void setCity(Object City) {
        this.City = City;
    }

    public Object getState() {
        return State;
    }

    public void setState(Object State) {
        this.State = State;
    }

    public Object getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(Object PostalCode) {
        this.PostalCode = PostalCode;
    }

    public Object getRegion() {
        return Region;
    }

    public void setRegion(Object Region) {
        this.Region = Region;
    }

    public Object getProductID() {
        return ProductID;
    }

    public void setProductID(Object ProductID) {
        this.ProductID = ProductID;
    }

    public Object getCategory() {
        return Category;
    }

    public void setCategory(Object Category) {
        this.Category = Category;
    }

    public Object getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(Object SubCategory) {
        this.SubCategory = SubCategory;
    }

    public Object getProductName() {
        return ProductName;
    }

    public void setProductName(Object ProductName) {
        this.ProductName = ProductName;
    }

    public Object getSales() {
        return Sales;
    }

    public void setSales(Object Sales) {
        this.Sales = Sales;
    }

    public Object getQuantity() {
        return Quantity;
    }

    public void setQuantity(Object Quantity) {
        this.Quantity = Quantity;
    }

    public Object getDiscount() {
        return Discount;
    }

    public void setDiscount(Object Discount) {
        this.Discount = Discount;
    }

    public Object getProfit() {
        return Profit;
    }

    public void setProfit(Object Profit) {
        this.Profit = Profit;
    }

    public String toStringOders() {
        return "OrderID=" + OrderID + "\n"
                + "OrderDate= " + OrderDate + "\n"
                + "ShipDate= " + ShipDate + "\n"
                + "ShipMode= " + ShipMode + "\n"
                + "CustomersID= " + CustomersID;
    }

    public String toStringDetails() {
        return "OrderID= " + OrderID + "/n"
                + "ShipMode= " + ShipMode + "/n"
                + " CustomersID= " + CustomersID + "\n"
                + " ProductID= " + ProductID + "\n"
                + " Sales= " + Sales;
    }

    public String toStringCustomers() {
        return "CustomersID= " + CustomersID + "\n"
                + " CustomersName= " + CustomersName + "\n"
                + " Segment= " + Segment + "\n"
                + " Country= " + Country + "\n"
                + "City= " + City + "\n"
                + " State= " + State + "\n"
                + " PostalCode= " + PostalCode + "\n"
                + " Region= " + Region;
    }

    public String toStringProducts() {
        return "ProductID= " + ProductID + "\n"
                + "Category= " + Category + "\n"
                + "SubCategory=" + SubCategory + "\n"
                + "ProductName=" + ProductName;
    }

    public void agregar() {
        Dba data = new Dba("./Base_de_DATOS.accdb");
        data.conectar();
        try {
            data.query.execute("INSERT INTO Base de DATOS"
                    + " ([Order ID],[Order Date],[Ship Date],[Ship Mode],[Customer ID],[Customer Name],[Segment],[Country],[City],[State],[Postal Code],[Region],[Product ID],[Category],[Sub-Category],[Product Name], [Sales], [Quantity], [Discount], [Profit])"
                    + " VALUES ('" + OrderID + "', '" + OrderDate + "', '" + ShipDate + "', '" + ShipMode + "', '" + CustomersID + "', '" + CustomersName + "', '" + Segment + "', '" + Country + "', '" + City + "', '" + State + "', '" + PostalCode + "', '" + Region + "', '" + ProductID + "', '" + Category + "', '" + SubCategory + "', '" + ProductName + "', '" + Sales + "', '" + Quantity + "', '" + Discount + "', '" + Profit + "')");
            data.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operacion Fallida");
        }
        data.desconectar();

    }

    public void delete() {
        Dba db = new Dba("./Base_de_DATOS.mdb");
        db.conectar();
        try {
            db.query.execute("DELETE from Base de datos where Order ID=" + OrderID);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }

    public ArrayList<ClaseAdministrativa> Listar(ArrayList<ClaseAdministrativa> listaAlumnos ) {
        String jdbcUrl = "jdbc:ucanaccess./Base_de_DATOS.accdb";

        // Lista para almacenar los datos


        try ( Connection connection = DriverManager.getConnection(jdbcUrl)) {
            String query = "SELECT OrderID, OrderDate, ShipDate, ShipMode, CustomerID, CustomerName, Segment, Country, City, State, PostalCode, Region, ProductID, Category, Sub-Category, ProductName, Sales, Quantity, Discount, Profit FROM base de datos";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Object onee = resultSet.getObject("OrderID");
                Object onee1 = resultSet.getObject("OrderDate");
                Object onee2 = resultSet.getObject("ShipDate");
                Object onee3 = resultSet.getObject("ShipMode");
                Object onee4 = resultSet.getObject("CustomerID");
                Object onee5 = resultSet.getObject("CustomerName");
                Object onee6 = resultSet.getObject("Segment");
                Object onee7 = resultSet.getObject("Country");
                Object onee8 = resultSet.getObject("City");
                Object onee9 = resultSet.getObject("State");
                Object onee10 = resultSet.getObject("PostalCode");
                Object onee11 = resultSet.getObject("Region");
                Object onee12 = resultSet.getObject("ProductID");
                Object onee13 = resultSet.getObject("Category");
                Object onee14 = resultSet.getObject("Sub-Category");
                Object onee15 = resultSet.getObject("ProductName");
                Object onee16 = resultSet.getObject("Sales");
                Object onee17 = resultSet.getObject("Quantity");
                Object onee18 = resultSet.getObject("Discount");
                Object onee19 = resultSet.getObject("Profit");

                // Crear un objeto Alumno con los datos y agregarlo a la lista
                ClaseAdministrativa alumno = new ClaseAdministrativa(onee,onee1,onee2,onee3,onee4,onee5,onee6,onee7,onee8,onee9,onee10,onee11,onee12,onee13,onee14,onee15,onee16,onee17,onee18,onee19);
                listaAlumnos.add(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return listaAlumnos;

    }
}
