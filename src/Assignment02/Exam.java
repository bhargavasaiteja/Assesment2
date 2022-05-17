package Assignment02;

public class Exam {
    private Long hallticket;
    private String name;
    private String fname;
    private String lname;
    private String examcentr;
    private String collcentr;
    private String course;
    private Long phno;
    private String addrs;

    public void printdata() {
        System.out.println(hallticket);
        System.out.println(name);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(examcentr);
        System.out.println(collcentr);
        System.out.println(course);
        System.out.println(phno);
        System.out.println(addrs);
    }

    public Long getHallticket()
    {
        return hallticket;
    }

    public void setHallticket(Long hallticket) {

        this.hallticket = hallticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getExamcentr() {
        return examcentr;
    }

    public void setExamcentr(String examcentr) {
        this.examcentr = examcentr;
    }

    public String getCollcentr() {
        return collcentr;
    }

    public void setCollcentr(String collcentr) {
        this.collcentr = collcentr;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Long getPhno() {
        return phno;
    }



    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }
}



