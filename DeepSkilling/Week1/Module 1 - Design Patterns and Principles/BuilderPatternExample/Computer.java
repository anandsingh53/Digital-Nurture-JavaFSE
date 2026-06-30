public class Computer {

    // Attributes
    private String cpu;
    private int ram;
    private int storage;
    private String gpu;
    private String operatingSystem;
    private boolean bluetooth;

    // Private Constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.operatingSystem = builder.operatingSystem;
        this.bluetooth = builder.bluetooth;
    }

    // Display Computer Details
    public void display() {
        System.out.println("Computer Configuration");
        System.out.println("----------------------");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("GPU: " + gpu);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println();
    }

    // Static Nested Builder Class
    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private String gpu;
        private String operatingSystem;
        private boolean bluetooth;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        // Build Method
        public Computer build() {
            return new Computer(this);
        }
    }
}