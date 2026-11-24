package principles.kiss;

public class DiscountCalculator {
    private final double FIRST_PURCHASE_DISCOUNT_COEFF = 0.1;
    private final double LOYAL_DISCOUNT_COEFF = 0.05;
    private final double COUPON_DISCOUNT_COEFF = 0.07;
    private final double ORDINARY_DISCOUNT_COEFF = 0.02;

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        if (isLoyalCustomer) {
            return price - (isFirstPurchase ?
                    price * FIRST_PURCHASE_DISCOUNT_COEFF :
                    price * LOYAL_DISCOUNT_COEFF);
        }

        return price - (hasCoupon ?
                price * COUPON_DISCOUNT_COEFF :
                price * ORDINARY_DISCOUNT_COEFF);
    }
}
