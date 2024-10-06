package com.example.app_test_helper.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

// 알림 설정 화면의 ViewModel 클래스
public class notificationsSetViewModel extends ViewModel {

    // 설정 데이터를 저장하는 MutableLiveData
    private final MutableLiveData<String> mText;

    // 생성자에서 기본 설정 데이터 초기화
    public notificationsSetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the set notification fragment");
    }

    // 설정 데이터를 반환하는 메서드
    public LiveData<String> getText() {
        return mText;
    }
}
