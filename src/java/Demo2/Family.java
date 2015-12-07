/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo2;

/**
 *
 * @author yunfan
 */
public class Family extends AnyParty {

    private final int MaxUnits = 15;
    private int StudentUnits;
    private Adoptation enroll = new Adoptation();
    private AdoptationRule rule = new AdoptationRule();
    private Custody schedule = new Custody();

    public Custody getSchedule() {
        return schedule;
    }

    public String getPsd() {
        return super.getPassword();
    }

    public Adoptation getEnroll() {
        return enroll;
    }

    public AdoptationRule getRule() {
        return rule;
    }

    public int getMaxUnits() {
        return MaxUnits;
    }

    public int getStudentUnits() {
        return StudentUnits;
    }

    public void setStudentUnits(int StudentUnits) {
        this.StudentUnits = StudentUnits;
    }

    public String CheckUnits() {
        if (getMaxUnits() <= getStudentUnits()) {
            return "Can't add anymore";
        } else {
            return "You have " + getStudentUnits() + " units left for fulltime";
        }
    }
}
