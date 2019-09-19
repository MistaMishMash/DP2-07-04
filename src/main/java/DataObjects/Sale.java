package DataObjects;

/**
 * represents a sale entry in the product sales table
 */
public class Sale {

    private int entryID; // autogenerated
    private String saleID;
    private int productID;
    private String dateOfSale;
    private int numberSold;
    private float amountPaid;
    private String saleStatus;

    private String productCategory; // for searches with product category

    /**
     * for retrieving data
     */
    public Sale(int entryID, String saleID, int productID, String dateOfSale,
                int numberSold, float amountPaid, String saleStatus){
        checkDateRegex(dateOfSale);
        this.entryID = entryID;
        this.saleID = saleID;
        this.productID = productID;
        this.dateOfSale = dateOfSale;
        this.numberSold = numberSold;
        this.amountPaid = amountPaid;
        this.saleStatus = saleStatus;
    }

    /**
     * for ADDING data (entryID is autogenerated)
     */
    public Sale(String saleID, int productID, String dateOfSale,
                int numberSold, float amountPaid, String saleStatus){
        checkDateRegex(dateOfSale);
        this.saleID = saleID;
        this.productID = productID;
        this.dateOfSale = dateOfSale;
        this.numberSold = numberSold;
        this.amountPaid = amountPaid;
        this.saleStatus = saleStatus;
    }

    /**
     * if date string does not match the required regex of DD-MM-YYYY
     * throw an IllegalArgumentException
     */
    private void checkDateRegex(String date){
        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")){
            throw new IllegalArgumentException("SALE object was created with malformed date\n" +
                    "Expected Structure = 'DD-MM-YYYY' (all digits)\n" +
                    "Received date string = '"+date+"'");
        }
    }

    public int getEntryID() {
        return entryID;
    }

    public String getSaleID() {
        return saleID;
    }

    public int getProductID() {
        return productID;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setProductCategory(String category){
        this.productCategory = category;
    }

    public String getProductCategory(){ return this.productCategory; }

    @Override
    public String toString(){
        String toReturn = "Sale (";
        toReturn += "\nentryID= "+entryID;
        toReturn += "\nsaleID= "+saleID;
        toReturn += "\nproductID= "+productID;
        toReturn +="\ndateOfDale= "+dateOfSale;
        toReturn +="\nnumberSold= "+numberSold;
        toReturn += "\namountPaid=" +amountPaid;
        toReturn += "\nsaleStatus= "+saleStatus;
        toReturn += ")";
        return toReturn;
    }
}
