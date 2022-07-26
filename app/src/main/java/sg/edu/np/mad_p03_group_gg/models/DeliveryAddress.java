package sg.edu.np.mad_p03_group_gg.models;

import androidx.annotation.Nullable;

public class DeliveryAddress {
    private String line1;
    private String line2;
    private String postalCode;
    private String shippingName;

    public DeliveryAddress() {

    }

    public DeliveryAddress(String line1, String line2, String postalCode, String shippingName)
    {
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.shippingName = shippingName;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }
}
