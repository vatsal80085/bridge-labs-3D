class Student {
    private int studentRollnumber;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    //setter1
    public void setstudentRollnumber(int studentRollnumber){
        this.studentRollnumber=studentRollnumber;
    }

    //getter2
    public int getstudentRollnumber(){
        return studentRollnumber;
    }

    //2
    public String getstudentName(){
        return studentName;
    }
    public void setstudentName(String studentName){
        this.studentName=studentName;
    }

    //3
    public int getstudentAge(){
        return studentAge;
    }
    public void setstudentAge(int setstudentAge){
        this.studentAge=setstudentAge;
    }

    //4
    public String getstudentDepartment(){
        return studentDepartment;
    }
    public void setstudentDepartment(String studentDepartment){
        this.studentDepartment=studentDepartment;
    }

    @Override
    public String toString(){
        return "[Student Roll number: "+getstudentRollnumber()+"\nStudent name: "+getstudentName()+"\nStudent age: "+getstudentAge()+"\nStudent department: "+getstudentDepartment()+" ]\n";
    }

}