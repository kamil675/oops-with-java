class Employee {
        private int empID=2;
        private String name;
        private int salary=2000;
        private int ph=0;
        private int insent=200;

    public Employee() {
        ph=123;
        name="aamir";
    }
        
        Employee(String empName, int phoneNo){
            ph=phoneNo;
            name=empName;
        }
        private void countSalaries(){
            System.out.println(salary+insent);
        }
        //getter & setter
        int getPh(){
            return ph;
        }
        String getName(){
            return name;
        }
        void setPh(int phone){
            ph= phone;
        }
        void setName(String name){
            this.name=name;
        }
    }
