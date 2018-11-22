package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userUniqueID;
    private final String userName;
    private final char userGender;
    private final LocalDate userBirthDate;
    private final int postsCount;

    public ForumUser(final int userUniqueID, final String userName, final char userGender, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.userUniqueID = userUniqueID;
        this.userName = userName;
        this.userGender = userGender;
        this.userBirthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getUserUniqueID() {
        return userUniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userUniqueID=" + userUniqueID +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userBirthDate=" + userBirthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}
