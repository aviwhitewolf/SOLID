import Builder.DatabaseConfigurationBuilder;
import Builder.QueryBuilder;

public class Main {
    public static void main(String[] args) {

        DatabaseConfigurationBuilder database = DatabaseConfigurationBuilder.builder()
                .databaseUrl("jdbc:postgresql://localhost:5432/mydb")
                .username("admin")
                .password("admin")
                .maxConnections(10)
                .enableCache(true)
                .isReadOnly(false)
                .build();


        QueryBuilder queryBuilder = QueryBuilder.builder()
                                    .select("column1")
                                    .from("table1")
                                    .where("column2 = 1")
                                    .build();


    }
}