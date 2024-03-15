package Accessmodifiers;

public class Student {

        private String name;
        int age;
        protected String batchName;
        public String courseName;
        String collegeName;

        void changeBatch(String newBatchName) {
            this.batchName = newBatchName;
        }

        void changename(String newName) {
            this.name = newName;
        }

        void give_mock_test() {
            System.out.println("Mock test is being conducted");
        }


}
