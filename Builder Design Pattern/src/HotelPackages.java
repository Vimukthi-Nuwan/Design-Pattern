public class HotelPackages {

    int number_Of_Room;
    int adults_Per_Room;
    int child;
    boolean welcomeDrink;
    boolean breakfast;
    boolean lunch;
    boolean pool;
    boolean extra_Activities;
    boolean hiking;

    public HotelPackages(Builder builder) {
        this.number_Of_Room = builder.number_Of_Room;
        this.adults_Per_Room = builder.adults_Per_Room;
        this.child = builder.child;
        this.welcomeDrink = builder.welcomeDrink;
        this.breakfast = builder.breakfast;
        this.lunch = builder.lunch;
        this.pool = builder.pool;
        this.extra_Activities = builder.extra_Activities;
        this.hiking = builder.hiking;
    }

    public int getNumber_Of_Room() {
        return number_Of_Room;
    }

    public int getAdults_Per_Room() {
        return adults_Per_Room;
    }

    public int getChild() {
        return child;
    }

    public boolean isWelcomeDrink() {
        return welcomeDrink;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public boolean isLunch() {
        return lunch;
    }

    public boolean isPool() {
        return pool;
    }

    public boolean isExtra_Activities() {
        return extra_Activities;
    }

    public boolean isHiking() {
        return hiking;
    }

    @Override
    public String toString() {
        return "HotelPackages{" +
                "number_Of_Room=" + number_Of_Room +
                ", adults_Per_Room=" + adults_Per_Room +
                ", child=" + child +
                ", welcomeDrink=" + welcomeDrink +
                ", breakfast=" + breakfast +
                ", lunch=" + lunch +
                ", pool=" + pool +
                ", extra_Activities=" + extra_Activities +
                ", hiking=" + hiking +
                '}';
    }

    static class Builder{

        int number_Of_Room;
        int adults_Per_Room;
        int child;
        boolean welcomeDrink;
        boolean breakfast;
        boolean lunch;
        boolean pool;
        boolean extra_Activities;
        boolean hiking;

        public Builder(int number_Of_Room, int adults_Per_Room, int child, boolean welcomeDrink, boolean breakfast, boolean lunch) {
            this.number_Of_Room = number_Of_Room;
            this.adults_Per_Room = adults_Per_Room;
            this.child = child;
            this.welcomeDrink = welcomeDrink;
            this.breakfast = breakfast;
            this.lunch = lunch;
        }

        public HotelPackages build(){
            HotelPackages hotelPackages = new HotelPackages(this);
            return hotelPackages;
        }

        public Builder setNumber_Of_Room(int number_Of_Room) {
            this.number_Of_Room = number_Of_Room;
            return this;
        }

        public Builder setAdults_Per_Room(int adults_Per_Room) {
            this.adults_Per_Room = adults_Per_Room;
            return this;
        }

        public Builder setChild(int child) {
            this.child = child;
            return this;
        }

        public Builder setWelcomeDrink(boolean welcomeDrink) {
            this.welcomeDrink = welcomeDrink;
            return this;
        }

        public Builder setBreakfast(boolean breakfast) {
            this.breakfast = breakfast;
            return this;
        }

        public Builder setLunch(boolean lunch) {
            this.lunch = lunch;
            return this;
        }

        public Builder setPool(boolean pool) {
            this.pool = pool;
            return this;
        }

        public Builder setExtra_Activities(boolean extra_Activities) {
            this.extra_Activities = extra_Activities;
            return this;
        }

        public Builder setHiking(boolean hiking) {
            this.hiking = hiking;
            return this;
        }
    }

}
