import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;
        String patientName;
        String appointmentDate;
        String appointmentTime;
        String selectedService = "";
        int serviceFee = 0;

        boolean isRunning = true;

        // Sample appointment records
        String bookedDate = "September 20";
        String bookedTime = "9:00 AM";

        while (isRunning) {

            System.out.println("\n======================================");
            System.out.println("       DENTALCARE APPOINTMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("[1] View Dental Services");
            System.out.println("[2] Book an Appointment");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nAVAILABLE DENTAL SERVICES");
                    System.out.println("[1] Dental Check-up - PHP 300");
                    System.out.println("[2] Teeth Cleaning - PHP 500");
                    System.out.println("[3] Tooth Extraction - PHP 800");
                    System.out.println("[4] Dental Filling - PHP 1000");
                    break;

                case 2:
                    System.out.println("\nBOOK AN APPOINTMENT");

                    System.out.print("Enter patient name: ");
                    patientName = input.nextLine();

                    System.out.println("\nSelect a dental service:");
                    System.out.println("[1] Dental Check-up - PHP 300");
                    System.out.println("[2] Teeth Cleaning - PHP 500");
                    System.out.println("[3] Tooth Extraction - PHP 800");
                    System.out.println("[4] Dental Filling - PHP 1000");
                    System.out.print("Enter service choice: ");

                    int serviceChoice = input.nextInt();
                    input.nextLine();

                    switch (serviceChoice) {
                        case 1:
                            selectedService = "Dental Check-up";
                            serviceFee = 300;
                            break;

                        case 2:
                            selectedService = "Teeth Cleaning";
                            serviceFee = 500;
                            break;

                        case 3:
                            selectedService = "Tooth Extraction";
                            serviceFee = 800;
                            break;

                        case 4:
                            selectedService = "Dental Filling";
                            serviceFee = 1000;
                            break;

                        default:
                            System.out.println("Invalid service choice.");
                            continue;
                    }

                    System.out.print("Enter preferred appointment date: ");
                    appointmentDate = input.nextLine();

                    System.out.print("Enter preferred appointment time: ");
                    appointmentTime = input.nextLine();

                    if (appointmentDate.equalsIgnoreCase(bookedDate)
                            && appointmentTime.equalsIgnoreCase(bookedTime)) {

                        System.out.println("\nSorry, that schedule is already booked.");
                        System.out.println("Please choose another appointment schedule.");

                    } else {

                        System.out.println("\n======================================");
                        System.out.println("       APPOINTMENT CONFIRMED");
                        System.out.println("======================================");
                        System.out.println("Patient Name: " + patientName);
                        System.out.println("Service: " + selectedService);
                        System.out.println("Date: " + appointmentDate);
                        System.out.println("Time: " + appointmentTime);
                        System.out.println("Estimated Fee: PHP " + serviceFee);
                        System.out.println("Status: Confirmed");
                        System.out.println("======================================");
                    }

                    break;

                case 3:
                    isRunning = false;
                    System.out.println("\nThank you for using DentalCare!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}