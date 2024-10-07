package com.example.app_test_helper.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class notificationsSetViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<List<String>> notificationsList;

    public notificationsSetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the set notification fragment");

        // 알림 데이터를 저장할 리스트 초기화
        notificationsList = new MutableLiveData<>(new ArrayList<>());
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<List<String>> getNotificationsList() {
        return notificationsList;
    }

    public void addNotification(String notification) {
        List<String> currentList = notificationsList.getValue();
        if (currentList != null) {
            currentList.add(notification);
            notificationsList.setValue(currentList);
        }
    }

    // 항목 삭제 메서드 추가
    public void removeNotification(String notification) {
        List<String> currentList = notificationsList.getValue();
        if (currentList != null) {
            currentList.remove(notification);
            notificationsList.setValue(currentList);
        }
    }
}
