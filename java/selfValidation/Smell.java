public class Smell{
    @Test
    public void createReport() {
        Catalog catalog = new Catalog();
        catalog.add(new Holding(BookTestData.AGILE_JAVA));
        catalog.add(new Holding(BookTestData.JAWS));
        catalog.add(new Holding(BookTestData.THE_TRIAL));

        InventoryReport report = new InventoryReport(catalog);
        System.out.println(report.allBooks());
    }
}