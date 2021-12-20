package vn.codegym.c0821g1.model;

import vn.codegym.c0821g1.utils.DateUtils;

import java.util.Date;

public class UserParse {

    public static User parse(String raw) {
        String[] fields = raw.split(",");
        long id = Long.parseLong(fields[0]);
        String fullName = fields[1];
        UserStatus status = UserStatus.fromValue(Integer.parseInt(fields[2]));
        Role role = Role.fromValue(fields[3]);
        Date birthDay = DateUtils.stringToDate(fields[4]);
        String phoneNumber = fields[5];
        String address = fields[6];
        return new User(id, fullName, status, role, birthDay, phoneNumber, address);
    }

//    @Override
//    public String toString() {
//        return String.format("%d,%s,%d,%s,%s,%s,%s",
//                id,
//                fullName,
//                status.getValue(),
//                role.getValue(),
//                DateUtils.dateToString(birthDay),
//                phoneNumber, address);
//    }

    public static void transferFields(User oldUser, User newUser) {
        oldUser.setId(newUser.getId());
        oldUser.setStatus(newUser.getStatus());
        oldUser.setFullName(newUser.getFullName());
        oldUser.setBirthDay(newUser.getBirthDay());
        oldUser.setPhoneNumber(newUser.getPhoneNumber());
        oldUser.setAddress(newUser.getAddress());
    }
}
