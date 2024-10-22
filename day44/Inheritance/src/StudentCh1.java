class Account {
    private long accNo;
    private String name;
    private String address;
    private String phoneNo;
    private String DoB;

    public Account(long accNo, String name, String address, String phoneNo, String doB) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        DoB = doB;
    }

    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getDoB() {
        return DoB;
    }
    public void setDoB(String doB) {
        DoB = doB;
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", DoB="
                + DoB + "]";
    }

    
}
public class StudentCh1 {
    
}
