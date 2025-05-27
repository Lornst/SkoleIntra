package Classes.Members;

import Classes.Enums.MemberType;

public class Member {
    private MemberType memberType = MemberType.MEMBER;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mail;
    private String phoneNumber;

    Member(String firstName,String middleName, String lastName, String mail, String phoneNumber){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }
}
