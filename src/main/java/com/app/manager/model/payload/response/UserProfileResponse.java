package com.app.manager.model.payload.response;

import com.app.manager.entity.EVisibility;
import com.app.manager.entity.User;

public class UserProfileResponse {
    private String id;
    private String username; //search
    private String email = "";
    private String fullname = ""; //search
    private String phone = "";
    private String avatar_file_id = "";
    private String address = "";
    private String civil_id = "";
    private Long birthday = 0L;
    private User.GenderEnum gender = User.GenderEnum.UNKNOWN;
    private EVisibility profile_visibility = EVisibility.PRIVATE;
    private boolean face_definition = false;

    public UserProfileResponse() {
    }

    public UserProfileResponse(String id, String username,
                               String avatar_file_id,
                               EVisibility profile_visibility,
                               boolean face_definition) {
        this.id = id;
        this.username = username;
        this.avatar_file_id = avatar_file_id;
        this.profile_visibility = profile_visibility;
        this.face_definition = face_definition;
    }

    public UserProfileResponse(String id, String username, String email, String fullname,
                               String phone, String avatar_file_id, String address,
                               String civil_id, Long birthday, User.GenderEnum gender,
                               EVisibility profile_visibility, boolean face_definition) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.avatar_file_id = avatar_file_id;
        this.address = address;
        this.civil_id = civil_id;
        this.birthday = birthday;
        this.gender = gender;
        this.profile_visibility = profile_visibility;
        this.face_definition = face_definition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCivil_id() {
        return civil_id;
    }

    public void setCivil_id(String civil_id) {
        this.civil_id = civil_id;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public User.GenderEnum getGender() {
        return gender;
    }

    public void setGender(User.GenderEnum gender) {
        this.gender = gender;
    }

    public String getAvatar_file_id() {
        return avatar_file_id;
    }

    public void setAvatar_file_id(String avatar_file_id) {
        this.avatar_file_id = avatar_file_id;
    }

    public EVisibility getProfile_visibility() {
        return profile_visibility;
    }

    public void setProfile_visibility(EVisibility profile_visibility) {
        this.profile_visibility = profile_visibility;
    }

    public boolean isFace_definition() {
        return face_definition;
    }

    public void setFace_definition(boolean face_definition) {
        this.face_definition = face_definition;
    }
}
