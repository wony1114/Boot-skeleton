package com.example.demo.cmm.enm;

public enum Path {
    DEFAULT_PROFILE;
    @Override
    public String toString() {
        String result = "";
        switch (this) {
            case DEFAULT_PROFILE:
                result = "https://thumbs.dreamstime.com/b/default-avatar-profile-icon-vector-social-media-user-image-182145777.jpg";
                break;

            default:
                break;
        }
        return result;
    }
}