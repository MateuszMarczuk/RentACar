package pl.BMI.database.models.dbutils;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.h2.jdbc.JdbcConnection;
import pl.BMI.database.models.Car;
import pl.BMI.database.models.Category;

import java.io.IOException;
import java.sql.SQLException;


/**
 * Created by Mateusz on 28.05.2017.
 */
public class DbManager {

    private static final com.j256.ormlite.logger.Logger LOGGER = LoggerFactory.getLogger(DbManager.class);

    private static final String JDBC_DRIVER_HD = "jdbc:h2:./rentCarDB";
    private static final String USER = "ADMIN";
    private static final String PASSWORD = "ADMIN";

    private static ConnectionSource connectionSource;

    public static void initDatabase(){

        createConnectionSource();
        dropTable();
        createTable();
        closeConnectionSource();
        
    }
    private static void createConnectionSource() {
        try{
            connectionSource = new JdbcConnectionSource(JDBC_DRIVER_HD,USER,PASSWORD);
        }catch (SQLException e ){
            LOGGER.warn(e.getMessage());
        }
    }

    public static ConnectionSource getConnectionSource(){
        if (connectionSource == null){
            createConnectionSource();
        }
        return connectionSource;
    }


    public static void closeConnectionSource() {
        if (connectionSource!=null) {
            try {
                connectionSource.close();

            } catch (IOException e) {

                LOGGER.warn(e.getMessage());

            }
        }
    }

    private static void createTable() {

        try{
            TableUtils.createTableIfNotExists(connectionSource,Category.class);
            TableUtils.createTableIfNotExists(connectionSource,Car.class);
        } catch (SQLException e) {
           LOGGER.warn(e.getMessage());
        }

    }

    private static void dropTable() {

        try{
            TableUtils.dropTable(connectionSource,Category.class,true);
            TableUtils.dropTable(connectionSource, Car.class,true);
        }catch (SQLException e){
            LOGGER.warn(e.getMessage());
        }

    }







}
