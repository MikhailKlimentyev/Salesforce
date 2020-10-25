package models;

public class Account {

    private String accountName;
    private String webSite;
    private String type;
    private String description;
    private String billingStreet;
    private String parentAccount;
    private String phone;
    private int employees;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;
    private String shippingCity;
    private String shippingStateProvince;
    private String shippingZipPostalCode;
    private String shippingCountry;
    private String industry;
    private String shippingStreet;

    private Account() {
        // private constructor
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public class Builder {

        private Builder() {
            // private constructor
        }

        public Builder setShippingStreet(String shippingStreet) {
            Account.this.shippingStreet = shippingStreet;
            return this;
        }

        public Builder setIndustry(String industry) {
            Account.this.industry = industry;
            return this;
        }

        public Builder setShippingCountry(String shippingCountry) {
            Account.this.shippingCountry = shippingCountry;
            return this;
        }

        public Builder setShippingZipPostalCode(String shippingZipPostalCode) {
            Account.this.shippingZipPostalCode = shippingZipPostalCode;
            return this;
        }

        public Builder setShippingStateProvince(String shippingStateProvince) {
            Account.this.shippingStateProvince = shippingStateProvince;
            return this;
        }

        public Builder setShippingCity(String shippingCity) {
            Account.this.shippingCity = shippingCity;
            return this;
        }

        public Builder setBillingCountry(String billingCountry) {
            Account.this.billingCountry = billingCountry;
            return this;
        }

        public Builder setBillingZipPostalCode(String billingZipPostalCode) {
            Account.this.billingZipPostalCode = billingZipPostalCode;
            return this;
        }

        public Builder setBillingStateProvince(String billingStateProvince) {
            Account.this.billingStateProvince = billingStateProvince;
            return this;
        }

        public Builder setBillingCity(String billingCity) {
            Account.this.billingCity = billingCity;
            return this;
        }

        public Builder setEmployees(int employees) {
            Account.this.employees = employees;
            return this;
        }

        public Builder setPhone(String phone) {
            Account.this.phone = phone;
            return this;
        }

        public Builder setParentAccount(String parentAccount) {
            Account.this.parentAccount = parentAccount;
            return this;
        }

        public Builder setAccountName(String accountName) {
            Account.this.accountName = accountName;
            return this;
        }

        public Builder setWebSite(String webSite) {
            Account.this.webSite = webSite;
            return this;
        }

        public Builder setType(String type) {
            Account.this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            Account.this.description = description;
            return this;
        }

        public Builder setBillingStreet(String billingStreet) {
            Account.this.billingStreet = billingStreet;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }
}
