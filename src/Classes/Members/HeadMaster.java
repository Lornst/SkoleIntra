package Classes.Members;

import Classes.Enums.MemberType;

public class HeadMaster extends Member{
    private MemberType memberType = MemberType.HEADMASTER;

    HeadMaster(String firstName,String middleName, String lastName, String mail, String phoneNumber){
        super(firstName, middleName, lastName, mail, phoneNumber);
    }
}
