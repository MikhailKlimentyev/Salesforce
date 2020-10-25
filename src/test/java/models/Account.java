package models;

public class Account {

    private String accountName;
    private String webSite;
    private String type;

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

        public Account build() {
            return Account.this;
        }
    }
}
