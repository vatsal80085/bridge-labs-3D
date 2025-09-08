class StudentService {

    private Student studentOne;
    private Student studentTwo;
    private Student studentThree;
    private Student studentFour;
    private Student studentFive;
    private Student studentSix;
    private Student studentSeven;
    private Student studentEight;
    
    public void setStudentDetails(){

        studentOne = new Student();
        studentOne.setstudentRollnumber(8);
        studentOne.setstudentName("Vatsal");
        studentOne.setstudentAge(17);
        studentOne.setstudentDepartment("CSE");
           
        studentTwo = new Student();
        studentTwo.setstudentRollnumber(7);
        studentTwo.setstudentName("Avinay");
        studentTwo.setstudentAge(17);
        studentTwo.setstudentDepartment("CSE");

        studentThree = new Student();
        studentThree.setstudentRollnumber(6);
        studentThree.setstudentName("Parichay");
        studentThree.setstudentAge(19);
        studentThree.setstudentDepartment("CSE");

        studentFour = new Student();
        studentFour.setstudentRollnumber(5);
        studentFour.setstudentName("Shashwat");
        studentFour.setstudentAge(18);
        studentFour.setstudentDepartment("CSE");

        studentFive = new Student();
        studentFive.setstudentRollnumber(4);
        studentFive.setstudentName("Kratagya");
        studentFive.setstudentAge(20);
        studentFive.setstudentDepartment("CSE");

        studentSix = new Student();
        studentSix.setstudentRollnumber(3);
        studentSix.setstudentName("Vivek");
        studentSix.setstudentAge(22);
        studentSix.setstudentDepartment("CSE");

        studentSeven = new Student();
        studentSeven.setstudentRollnumber(2);
        studentSeven.setstudentName("Hinata");
        studentSeven.setstudentAge(15);
        studentSeven.setstudentDepartment("CSE");

        studentEight = new Student();
        studentEight.setstudentRollnumber(1);
        studentEight.setstudentName("Kageyama");
        studentEight.setstudentAge(15);
        studentEight.setstudentDepartment("CSE");
    }

    public void displayStudentDetails(){
        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(studentFour);
        System.out.println(studentFive);
        System.out.println(studentSix);
        System.out.println(studentSeven);
        System.out.println(studentEight);
    }
    
}
