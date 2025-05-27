package Classes.Members;

import Classes.Enums.MemberType;

public class Student extends Member{
    private MemberType memberType = MemberType.HEADMASTER;

    Student(String firstName,String middleName, String lastName, String mail, String phoneNumber){
        super(firstName, middleName, lastName, mail, phoneNumber);
    }
}
