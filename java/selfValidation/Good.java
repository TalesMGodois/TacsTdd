public class Good{
    @Test
    public void createReport() {
        Catalog catalog = new Catalog();
        // ...
        InventoryReport report = new InventoryReport(catalog);
        assertThat(report.contains(BookTestData.AGILE_JAVA.getClassification());
        // ...
    }
}