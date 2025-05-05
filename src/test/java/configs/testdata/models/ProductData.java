package configs.testdata.models;

public class ProductData {
    private String name;
    private String amount;
    private String unitPrice;
    private String totalPrice;
    private String amountAfterIncrease;
    private String totalPriceAfterIncrease;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAmountAfterIncrease() {
        return amountAfterIncrease;
    }

    public void setAmountAfterIncrease(String amountAfterIncrease) {
        this.amountAfterIncrease = amountAfterIncrease;
    }

    public String getTotalPriceAfterIncrease() {
        return totalPriceAfterIncrease;
    }

    public void setTotalPriceAfterIncrease(String totalPriceAfterIncrease) {
        this.totalPriceAfterIncrease = totalPriceAfterIncrease;
    }
}
