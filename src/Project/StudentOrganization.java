package Project;

class StudentOrganizations {
    private String name;
    private Student[] members;
    private Student head;

    public StudentOrganizations(String name, Student[] members, Student head) {
        this.name = name;
        this.members = members;
        this.head = head;
    }
}