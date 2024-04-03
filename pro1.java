//Java program code to do cloning, let us take a class Organization, which has properties like organizationCode, organizationName and organizationAddress, and take method
to print the object details.

class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;
    public Organization(String code, String name, String address) {
        this.organizationCode = code;
        this.organizationName = name;
        this.organizationAddress = address;
    }
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization("001", "ABC Corp", "123 Main St");
        System.out.println("Details of org1:");
        org1.printDetails();
        try {
            Organization org2 = (Organization) org1.clone();
            System.out.println("\nDetails of org2 (cloned from org1):");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
