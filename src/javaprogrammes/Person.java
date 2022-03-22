package javaprogrammes;

public class Person {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("result of empty string");
        person.setFirstName("");//set the value
        person.setlastName(""); // set value
        System.out.println("get firstname ="+person.getFirstName());
        System.out.println("get lastname = "+person.getLastName());
        System.out.println("result of fullname with empty string");
        System.out.println("fullname = "+ person.getFullname());
        System.out.println("result of age is not teen between 12 to 20" );
        person.setAge(10);
        System.out.println("teen = ");
        System.out.println("age = "+person.getAge());
        person.setAge(18);
        System.out.println("result of age is teen between 12 to 20 ");
        System.out.println("age = " +person.getAge());
        person.setlastName("Smith");
        System.out.println("result of lastname is empty");
        System.out.println("fullname = "+ person.getFullname());



    }
        //instance variables
        String firstName;
        String lastName;
        int age;
        String fullname;

        public String getFirstName(){
            return firstName ;
        }

        public String getLastName(){
            return lastName;
        }

        public int getAge(){
            return age;
        }

        public String getFullname(){
            return fullname;
        }



        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setAge(int age){
            if (age<=0 || age >=100){
                this.age=0;
            }else{
                this.age = age;
            }
        }
        public void setlastName(String lastName){
            this.lastName = lastName;


























}

}
