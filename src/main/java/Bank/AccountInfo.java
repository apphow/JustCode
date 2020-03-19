package Bank;

public final class AccountInfo {
        private final int id;
        private final String name;
        private final String email;
        private final float balance;
        private final String typeAccount;

        AccountInfo(int id, String name, String email, float balance, String typeAccount) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.balance = balance;
            this.typeAccount = typeAccount;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public float getBalance() {
            return balance;
        }

        public String getTypeAccount() {
            return typeAccount;
        }

    }

