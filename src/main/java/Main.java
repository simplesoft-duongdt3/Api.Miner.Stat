import org.sql2o.Sql2o;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        Sql2o sql2o = new Sql2o("jdbc:mysql://163.44.207.20:3306/mining_api", "user_mining_api", "asKJ980)80");
        port(9000);
        get("/hello", (request, response) -> "Hello World!");

        //sql2o.open();
    }
}