public enum Discount {
    Solider(0.05),
    PersonOfNationalMerit(0.1),
    Student(0.03),
    General(0.0);

    private double discountRatio;

    Discount(double dR){
        this.discountRatio = dR;
    }

    public double getDiscountRatio(){
        return this.discountRatio;
    }

    public static double getSelectedRatio(int num){
        switch (num) {
            case 1: return PersonOfNationalMerit.getDiscountRatio();
            case 2: return Solider.getDiscountRatio();
            case 3: return Solider.getDiscountRatio();
            case 4: return General.getDiscountRatio();
            default: return General.getDiscountRatio();
        }
    }

}
