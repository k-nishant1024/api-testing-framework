package com.example.pojo2;

import java.util.List;

public class Preferences {
    private boolean notifications;
    private boolean newsletters;
    private List<String> themes;

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public boolean isNewsletters() {
        return newsletters;
    }

    public void setNewsletters(boolean newsletters) {
        this.newsletters = newsletters;
    }

    public List<String> getThemes() {
        return themes;
    }

    public void setThemes(List<String> themes) {
        this.themes = themes;
    }
}
