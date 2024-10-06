package com.example.app_test_helper.ui.map;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_test_helper.R;
import com.example.app_test_helper.databinding.FragmentMapBinding;
import com.kakao.vectormap.KakaoMap;
import com.kakao.vectormap.KakaoMapReadyCallback;
import com.kakao.vectormap.LatLng;
import com.kakao.vectormap.MapLifeCycleCallback;
import com.kakao.vectormap.MapView;
import com.kakao.vectormap.camera.CameraUpdate;
import com.kakao.vectormap.camera.CameraUpdateFactory;
import com.kakao.vectormap.label.Label;
import com.kakao.vectormap.label.LabelLayer;
import com.kakao.vectormap.label.LabelOptions;
import com.kakao.vectormap.label.LabelStyle;
import com.kakao.vectormap.label.LabelStyles;
import com.kakao.vectormap.label.LabelTextBuilder;
import com.kakao.vectormap.label.LabelTextStyle;
import com.kakao.vectormap.label.LabelTransition;

public class mapFragment extends Fragment {

    private FragmentMapBinding binding;

    MapView mapView;
    KakaoMap kakaoMap;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        View v = inflater.inflate(R.layout.fragment_map, container, false);

        //지도
//        MapView mapView = new MapView(getActivity());
//        ViewGroup mapViewContainer = (ViewGroup) v.findViewById(R.id.map_view);
//        mapViewContainer.addView(mapView);

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://222.236.2.214:8080/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();

        mapView = binding.mapView;
        mapView.start(new MapLifeCycleCallback() {
            @Override
            public void onMapDestroy() {
                // 지도 API가 정상적으로 종료될 때 호출
                Log.d("KakaoMap", "onMapDestroy: ");
            }

            @Override
            public void onMapError(Exception error) {
                // 인증 실패 및 지도 사용 중 에러가 발생할 때 호출
                Log.e("KakaoMap", "onMapError: ", error);
            }
        }, new KakaoMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull KakaoMap map) {
                // 정상적으로 인증이 완료되었을 때 호출
                // KakaoMap 객체를 얻어 옵니다.
                kakaoMap = map;
                CameraUpdate cameraUpdate = CameraUpdateFactory.newCenterPosition(LatLng.from(35.963727, 126.959107));
                kakaoMap.moveCamera(cameraUpdate);

                LabelStyle style = LabelStyle.from(R.drawable.ic_map_pin).setTextStyles(LabelTextStyle.from(37, Color.parseColor("#DB5461"),2, Color.DKGRAY)).setApplyDpScale(false);

// 2. LabelOptions 생성하기
                LabelTextBuilder labelTextBuilder = new LabelTextBuilder();
                labelTextBuilder.setTexts("신동 A 약국");
                LabelOptions options = LabelOptions.from(LatLng.from(35.963727,126.959107))
                        .setStyles(style).setTexts(labelTextBuilder);

// 3. LabelLayer 가져오기 (또는 커스텀 Layer 생성)
                LabelLayer layer = kakaoMap.getLabelManager().getLayer();

// 4. LabelLayer 에 LabelOptions 을 넣어 Label 생성하기
                Label label = layer.addLabel(options);

//                RestApi restApi = retrofit.create(RestApi.class);
//                Call<List<map>> call = restApi.getMap();
//                call.enqueue(new Callback<List<map>>() {
//                    @Override
//                    public void onResponse(Call<List<map>> call, Response<List<map>> response) {
//                        List<map> res = response.body();
//                        double lat;
//                        double lon;
//                        for (map mm : res) {
//                            lat = mm.getLat();
//                            lon = mm.getLon();
//                            Log.d("abcd", "Response: " + lat + "  b: " + lon);
//                            LabelStyles styles = kakaoMap.getLabelManager()
//                                    .addLabelStyles(LabelStyles.from(LabelStyle.from(R.drawable.mark)));
//
//                            LabelStyle style = LabelStyle.from(R.drawable.mark).setApplyDpScale(true);
//// 2. LabelOptions 생성하기
//                            LabelOptions options = LabelOptions.from(LatLng.from(lat,lon))
//                                    .setStyles(style);
//
//// 3. LabelLayer 가져오기 (또는 커스텀 Layer 생성)
//                            LabelLayer layer = kakaoMap.getLabelManager().getLayer();
//
//// 4. LabelLayer 에 LabelOptions 을 넣어 Label 생성하기
//                            Label label = layer.addLabel(options);
//                        }
//
//                    }

//                    @Override
//                    public void onFailure(Call<List<map>> call, Throwable t) {
//
//                    }
//                });
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}