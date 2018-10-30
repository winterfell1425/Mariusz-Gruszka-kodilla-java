package com.kodilla.testing.forum.statistics;

public class StatisticsComputation {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double aveNumOfPostPerUser;
    private double aveNumOfCommPerUser;
    private double aveNumOfCommPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();

        postsCount = statistics.postsCount();

        commentsCount = statistics.commentsCount();

        aveNumOfPostPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        if (statistics.usersNames().size() == 0.0) {
            aveNumOfPostPerUser = 0;
        }
        aveNumOfCommPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        if (statistics.usersNames().size() == 0.0) {
            aveNumOfCommPerUser = 0;
        }
        aveNumOfCommPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        if (statistics.postsCount() == 0.0) {
            aveNumOfCommPerPost  = 0;
        }
    }
    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveNumOfPostPerUser() {
        return aveNumOfPostPerUser;
    }

    public double getAveNumOfCommPerUser() {
        return aveNumOfCommPerUser;
    }

    public double getAveNumOfCommPerPost() {
        return aveNumOfCommPerPost;
    }
}