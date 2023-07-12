// Общий класс для вагона
public abstract class Wagon {
    private String type;
    private double length;
    private double width;
    private double height;

    public Wagon(String type, double length, double width, double height) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract void displayInformation();
}

// Класс для грузового вагона
 class FreightWagon extends Wagon {
    private double maxPayload;
    private boolean hasDoors;
    private boolean hasSideWalls;
    private String loadingSystem;

    public FreightWagon(String type, double length, double width, double height, double maxPayload,
                        boolean hasDoors, boolean hasSideWalls, String loadingSystem) {
        super(type, length, width, height);
        this.maxPayload = maxPayload;
        this.hasDoors = hasDoors;
        this.hasSideWalls = hasSideWalls;
        this.loadingSystem = loadingSystem;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(double maxPayload) {
        this.maxPayload = maxPayload;
    }

    public boolean hasDoors() {
        return hasDoors;
    }

    public void setHasDoors(boolean hasDoors) {
        this.hasDoors = hasDoors;
    }

    public boolean hasSideWalls() {
        return hasSideWalls;
    }

    public void setHasSideWalls(boolean hasSideWalls) {
        this.hasSideWalls = hasSideWalls;
    }

    public String getLoadingSystem() {
        return loadingSystem;
    }

    public void setLoadingSystem(String loadingSystem) {
        this.loadingSystem = loadingSystem;
    }

    @Override
    public void displayInformation() {
        System.out.println("Freight Wagon Information:");
        System.out.println("Type: " + getType());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Max Payload: " + getMaxPayload());
        System.out.println("Has Doors: " + hasDoors());
        System.out.println("Has Side Walls: " + hasSideWalls()); //Наличие дверей и/или боковых стенок
        System.out.println("Loading System: " + getLoadingSystem()); //специализированные системы загрузки и выгрузки, такие как краны или подъемные платформы.
    }
}

// Класс для пассажирского вагона
 class PassengerWagon extends Wagon {
    private int seatingCapacity;
    private boolean hasSeats;
    private boolean hasBeds;
    private boolean hasTables;
    private boolean hasToilets;
    private boolean hasVentilation;
    private boolean hasWindows;

    public PassengerWagon(String type, double length, double width, double height, int seatingCapacity,
                          boolean hasSeats, boolean hasBeds, boolean hasTables, boolean hasToilets,
                          boolean hasVentilation, boolean hasWindows) {
        super(type, length, width, height);
        this.seatingCapacity = seatingCapacity;
        this.hasSeats = hasSeats;
        this.hasBeds = hasBeds;
        this.hasTables = hasTables;
        this.hasToilets = hasToilets;
        this.hasVentilation = hasVentilation;
        this.hasWindows = hasWindows;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean hasSeats() {
        return hasSeats;
    }

    public void setHasSeats(boolean hasSeats) {
        this.hasSeats = hasSeats;
    }

    public boolean hasBeds() {
        return hasBeds;
    }

    public void setHasBeds(boolean hasBeds) {
        this.hasBeds = hasBeds;
    }

    public boolean hasTables() {
        return hasTables;
    }

    public void setHasTables(boolean hasTables) {
        this.hasTables = hasTables;
    }

    public boolean hasToilets() {
        return hasToilets;
    }

    public void setHasToilets(boolean hasToilets) {
        this.hasToilets = hasToilets;
    }

    public boolean hasVentilation() {
        return hasVentilation;
    }

    public void setHasVentilation(boolean hasVentilation) {
        this.hasVentilation = hasVentilation;
    }

    public boolean hasWindows() {
        return hasWindows;
    }

    public void setHasWindows(boolean hasWindows) {
        this.hasWindows = hasWindows;
    }

    @Override
    public void displayInformation() {
        System.out.println("Passenger Wagon Information:");
        System.out.println("Type: " + getType());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Seating Capacity: " + getSeatingCapacity());
        System.out.println("Has Seats: " + hasSeats()); // строки 183-187 - удобства(зависят от типа вагона)
        System.out.println("Has Beds: " + hasBeds());
        System.out.println("Has Tables: " + hasTables());
        System.out.println("Has Toilets: " + hasToilets());
        System.out.println("Has Ventilation: " + hasVentilation());
        System.out.println("Has Windows: " + hasWindows()); //Наличие окон для обзора и естественного освещения
    }
}


 class Main {
    public static void main(String[] args) {
        FreightWagon freightWagon = new FreightWagon("Platform", 12.5, 2.7, 2.5, 20000,
                true, true, "Crane");
        PassengerWagon passengerWagon = new PassengerWagon("Sitting", 20.0, 3.0, 3.5, 50,
                true, false, true, true, true, true);

        freightWagon.displayInformation();
        System.out.println();
        passengerWagon.displayInformation();
    }
}
