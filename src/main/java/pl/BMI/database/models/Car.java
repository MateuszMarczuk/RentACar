package pl.BMI.database.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Mateusz on 28.05.2017.
 */
@DatabaseTable(tableName = "CAR")
public class Car implements BaseModel{

    public Car(){

    }

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "CATEGORY_ID", foreign = true,foreignAutoCreate = true,foreignAutoRefresh = true,canBeNull = false)
    private Category category;

    @DatabaseField(columnName = "Marka", canBeNull = false)
    private String marka;

    @DatabaseField(columnName = "Model", canBeNull = false)
    private String model;

    @DatabaseField(columnName = "Rok", canBeNull = false)
    private int rok;

    @DatabaseField(columnName = "Przebieg")
    private int przebieg;

    @DatabaseField(columnName = "Pojemnosc",canBeNull = false)
    private Double pojemnosc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public Double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(Double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
}
