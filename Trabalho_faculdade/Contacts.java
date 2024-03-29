public class Contacts {
        private String name;
        private String phone;
        Contacts(String name,String phone){
            this.name = name;
            this.phone = phone;
        }
        public String getPhone(){
            return this.phone;
        }
        public String getName(){
            return this.name;
        }
}
