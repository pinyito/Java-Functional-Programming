package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Imperative Java style
        System.out.println(getDBConnectionUrl());

        //Using a Supplier
        System.out.println(getDBConnectionUrlSupplier.get());
    }
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc:MySQL://localhost:3032/dabodibo";
    static String getDBConnectionUrl(){
        return "jdbc:MySQL://localhost:3032/dabodibo";
    }
}
