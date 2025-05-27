package Classes.Members;

import Classes.Enums.MemberType;

public class Professor extends Member{
    private MemberType memberType = MemberType.HEADMASTER;

    Professor(String firstName,String middleName, String lastName, String mail, String phoneNumber){
        super(firstName, middleName, lastName, mail, phoneNumber);
    }
}
