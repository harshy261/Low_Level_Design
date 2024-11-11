package models;

public class Branch {
    private String name;
    private int branchId;
    private String location;
    private TableChart tableChart;
    private Menu menu;
    private Kitchen kitchen;

    public boolean addTableChart(TableChart chart) {
        return true;
    }
}
