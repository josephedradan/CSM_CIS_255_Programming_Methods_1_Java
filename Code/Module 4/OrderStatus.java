public enum OrderStatus {

    PURCHASED(true),SHIPPED(false),DELIVERED(false);

    private boolean orderModifiable;

    private OrderStatus(boolean modifiable) {
        this.orderModifiable = modifiable;
    }

    public boolean canOrderBeModified(){
        return orderModifiable;
    }

}

