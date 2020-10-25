package models;

public class Contact {

    private String salutation;
    private String mailingStreet;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String accountName;
    private String reportsTo;
    private String title;
    private String email;
    private String phone;
    private String mobile;
    private String department;
    private String fax;
    private String mailingCity;
    private String mailingStateProvince;
    private String mailingZipPostalCode;
    private String mailingCountry;

    private Contact() {
        // private constructor
    }

    public static Contact.Builder newBuilder() {
        return new Contact().new Builder();
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Contact.Builder setMailingCountry(String mailingCountry) {
            Contact.this.mailingCountry = mailingCountry;
            return this;
        }

        public Contact.Builder setMailingZipPostalCode(String mailingZipPostalCode) {
            Contact.this.mailingZipPostalCode = mailingZipPostalCode;
            return this;
        }

        public Contact.Builder setMailingStateProvince(String mailingStateProvince) {
            Contact.this.mailingStateProvince = mailingStateProvince;
            return this;
        }

        public Contact.Builder setMailingCity(String mailingCity) {
            Contact.this.mailingCity = mailingCity;
            return this;
        }

        public Contact.Builder setFax(String fax) {
            Contact.this.fax = fax;
            return this;
        }

        public Contact.Builder setDepartment(String department) {
            Contact.this.department = department;
            return this;
        }

        public Contact.Builder setMobile(String mobile) {
            Contact.this.mobile = mobile;
            return this;
        }

        public Contact.Builder setPhone(String phone) {
            Contact.this.phone = phone;
            return this;
        }

        public Contact.Builder setEmail(String email) {
            Contact.this.email = email;
            return this;
        }

        public Contact.Builder setTitle(String title) {
            Contact.this.title = title;
            return this;
        }

        public Contact.Builder setReportsTo(String reportsTo) {
            Contact.this.reportsTo = reportsTo;
            return this;
        }

        public Contact.Builder setAccountName(String accountName) {
            Contact.this.accountName = accountName;
            return this;
        }

        public Contact.Builder setSuffix(String suffix) {
            Contact.this.suffix = suffix;
            return this;
        }

        public Contact.Builder setLastName(String lastName) {
            Contact.this.lastName = lastName;
            return this;
        }

        public Contact.Builder setMiddleName(String middleName) {
            Contact.this.middleName = middleName;
            return this;
        }

        public Contact.Builder setFirstName(String firstName) {
            Contact.this.firstName = firstName;
            return this;
        }

        public Contact.Builder setMailingStreet(String mailingStreet) {
            Contact.this.mailingStreet = mailingStreet;
            return this;
        }

        public Contact.Builder setSalutation(String salutation) {
            Contact.this.salutation = salutation;
            return this;
        }

        public Contact build() {
            return Contact.this;
        }
    }
}
