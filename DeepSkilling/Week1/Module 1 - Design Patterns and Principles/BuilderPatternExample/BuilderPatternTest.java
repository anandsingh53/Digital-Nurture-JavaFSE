public class BuilderPatternTest {

    public static void main(String[] args) {

        // Gaming Computer
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .setBluetooth(true)
                .build();

        gamingPC.display();

        // Office Computer
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setOperatingSystem("Windows 11")
                .build();

        officePC.display();

        // Budget Computer
        Computer budgetPC = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM(16)
                .setStorage(512)
                .build();

        budgetPC.display();
    }
}