/*
 * Child extends AnyEntity
 * Shares get commands from it.
 * Using SSM pattern
 */
package Demo2;

public class Child extends AnyEntity {

    private String time;
    private String department;
    
    public Child(String id,String name,String time,String department){
        this.setId(id);
        this.setName(name);
        this.department=department;
        this.time = time;
    }

    public String getName() {
        return super.getName();

    }

    public String getNumber() {
        return super.getId();
    }

    public String getTime() {
        return time;
    }

    public String getDep() {
        return department;
    }

    public String toString() {
        return super.toString();
    }

}
