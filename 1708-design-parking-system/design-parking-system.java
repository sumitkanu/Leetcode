class ParkingSystem {
    int big;
    int med;
    int sm;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.med = medium;
        this.sm = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && big > 0) {
            big--;
            return true;
        } else if(carType == 2 && med > 0) {
            med--;
            return true;
        } else if(carType == 3 && sm > 0) {
            sm--;
            return true;
        } else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */