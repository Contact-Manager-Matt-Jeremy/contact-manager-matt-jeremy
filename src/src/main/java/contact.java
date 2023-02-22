public class contact {

    String contactName;
    String contactNumber;

    public contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "contact{" +
                "contactName='" + contactName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
