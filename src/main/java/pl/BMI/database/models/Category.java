package pl.BMI.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Mateusz on 28.05.2017.
 */
@DatabaseTable(tableName = "CATEGORY")
public class Category {

    public Category() {

    }

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "NAME",canBeNull = false)
    private String name;

    @ForeignCollectionField(eager = true)
    private ForeignCollectionField cars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ForeignCollectionField getCars() {
        return cars;
    }

    public void setCars(ForeignCollectionField cars) {
        this.cars = cars;
    }
}
