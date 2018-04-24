package controller;

import data.model.Student;

import javax.faces.bean.ManagedBean;


@ManagedBean(name="studentcontroller")
public class studentcontroller {
    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }
}
