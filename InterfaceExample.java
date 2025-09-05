import java.util.Scanner;

// Interface defining common methods for all shapes
interface Shape {
    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

// Cube class implementing Shape interface
class Cube implements Shape {
    private int side; // Side of the cube

    Cube(int side) {
        this.side = side; // Initialize side
    }

    @Override
    public double area() {
        return 6 * side * side; // Surface area of cube
    }

    @Override
    public double volume() {
        return side * side * side; // Volume of cube
    }
}

// Cuboid class implementing Shape interface
class Cuboid implements Shape {
    private int l, b, h; // Length, breadth, height

    Cuboid(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return 2 * (l * b + b * h + h * l); // Surface area of cuboid
    }

    @Override
    public double volume() {
        return l * b * h; // Volume of cuboid
    }
}

// Cylinder class implementing Shape interface
class Cylinder implements Shape {
    private double r;       // Radius
    private int h;          // Height
    private final double PI = Math.PI;

    Cylinder(double r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double area() {
        return 2 * PI * r * h + 2 * PI * r * r; // Surface area of cylinder
    }

    @Override
    public double volume() {
        return PI * r * r * h; // Volume of cylinder
    }
}

// Main class containing menu logic
class InterfaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== Shape Calculator ===");
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Cylinder");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Shape shape; // Interface reference for polymorphism

            switch (choice) {
                case 1:
                    System.out.print("Enter side of Cube: ");
                    int side = sc.nextInt();
                    shape = new Cube(side); // Create Cube object
                    System.out.printf("Area of Cube = %.2f\n", shape.area());
                    System.out.printf("Volume of Cube = %.2f\n", shape.volume());
                    break;

                case 2:
                    System.out.print("Enter length of Cuboid: ");
                    int l = sc.nextInt();
                    System.out.print("Enter breadth of Cuboid: ");
                    int b = sc.nextInt();
                    System.out.print("Enter height of Cuboid: ");
                    int h = sc.nextInt();
                    shape = new Cuboid(l, b, h); // Create Cuboid object
                    System.out.printf("Area of Cuboid = %.2f\n", shape.area());
                    System.out.printf("Volume of Cuboid = %.2f\n", shape.volume());
                    break;

                case 3:
                    System.out.print("Enter radius of Cylinder: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    int hc = sc.nextInt();
                    shape = new Cylinder(r, hc); // Create Cylinder object
                    System.out.printf("Area of Cylinder = %.2f\n", shape.area());
                    System.out.printf("Volume of Cylinder = %.2f\n", shape.volume());
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!"); // Exit message
                    break;

                default:
                    System.out.println("Invalid choice! Please try again."); // Handle wrong input
            }

        } while (choice != 4); // Loop until user chooses to exit

        sc.close(); // Close scanner
    }
          }
