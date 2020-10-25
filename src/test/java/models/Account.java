package models;

public class Account {

    private String accountName;
    private String webSite;
    private String type;
    private String description;
    private String billingStreet;

    private Account() {
        // private constructor
    }

    public static Builder newBuilder() {
        return new Account().new Builder();
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
