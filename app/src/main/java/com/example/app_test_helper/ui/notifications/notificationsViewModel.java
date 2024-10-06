package com.example.app_test_helper.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

// 알림 화면의 ViewModel 클래스
public class notificationsViewModel extends ViewModel {

    // 텍스트 데이터를 저장하는 MutableLiveData
    private final MutableLiveData<String> mText;

    // 생성자에서 기본 텍스트 설정
    public notificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    // 텍스트 데이터를 반환하는 메서드
    public LiveData<String> getText() {
        return mText;
    }
}
