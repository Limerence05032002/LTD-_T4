package com.example.kimtragiak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class menu extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Shop");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home:
                    toolbar.setTitle("Shop");
                    return true;
                case R.id.cart:
                    toolbar.setTitle("My Gifts");
                    return true;
                case R.id.notification:
                    toolbar.setTitle("Cart");
                    return true;
                case R.id.setting:
                    toolbar.setTitle("Profile");
                    return true;
            }
            return false;
        }
    };






//    private BottomNavigationView bottomNavigationView;
//    CartFragment cartFragment = new CartFragment();
//    NotificationFragment notificationFragment = new NotificationFragment();
//    SettingFragment settingFragment = new SettingFragment();
//    HomeFragment home_fragment = new HomeFragment();
//    private RecyclerView rcvCAtegory;
//    private FoodAdapter mFoodAdapter;
//    private ImageView profile;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_menu);
//
//        Fragment fragment = FragmentHome.newInstance();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.container, fragment,"Menu Fragment");
//        transaction.commit();
//
//        bottomNavigationView = findViewById(R.id.bottom_navbar);
//        getSupportFragmentManager().beginTransaction().replace(R.id.container, home_fragment).commit();
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.home:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,home_fragment).commit();
//                        return true;
//                    case R.id.cart:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,cartFragment).commit();
//                        return true;
//                    case R.id.notification:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,notificationFragment).commit();
//                        return true;
//                    case R.id.setting:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,settingFragment).commit();
//                        return true;
//                }
//                return false;
//            }
//        });

//        rcvCAtegory = findViewById(R.id.rcv_category);
//        mFoodAdapter = new FoodAdapter(this);
//
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
//        rcvCAtegory.setLayoutManager(gridLayoutManager);
//
//        mFoodAdapter.setData(this,getListFood());
//        rcvCAtegory.setAdapter(mFoodAdapter);
//
//        profile = findViewById(R.id.profile);
//        profile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                OpenProfile();
//            }
//        });
//    }

//    private void OpenProfile() {
//        Intent intent = new Intent(this, Profile.class);
//        startActivity(intent);
//    }

//    private List<Food> getListFood() {
//        List<Food> list = new ArrayList<>();
//        list.add(new Food("Nui l???c xo??y",R.drawable.monan_nui, R.drawable.star,"Nui l?? 1 t??? ti???ng Vi???t ????? ch??? c??c lo???i s???i m?? c?? ngu???n g???c t??? ph????ng T??y. C??c lo???i nui ph??? bi???n ??? Vi???t Nam hi???n nay l?? d???ng m?? ???ng, h??nh xo???n ... ","N??ng l?????ng:  650 calo", "Calories:  130-150 cal/100g", "Dinh d?????ng:  Protein, Canxi, S???t, Ch???t x??, ...", "150.000 VND"));
//        list.add(new Food("T??m ch??y t???i",R.drawable.monan_tom, R.drawable.star,"C??c m??n ??n l??m t??? t??m th?? nh???t ?????nh kh??ng ???????c b??? qua t??m chi??n b?? t???i ????u ?????y. V???i c??ch l??m ????n gi???n nh??ng l???i ??em ?????n h????ng v??? th??m ngon b??o ng???y.","N??ng l?????ng:  550 calo", "Calories:  50 kcal/100g", "Dinh d?????ng:  Protein, Lipit, B12, S???t ...", "170.000 VND"));
//        list.add(new Food("Spaghetti v???m",R.drawable.monan_spaghetti, R.drawable.star,"Spaghetti hay th?????ng ???????c g???i l?? m?? ?? l?? 1 lo???i pasta s???i d??i, nh???, h??nh tru. N?? l?? th???c ph???m thi???t y???u c???a n???n ???m th???c ?? truy???n th???ng. Spaghetti ???????c l??m t??? b???t m?? xay.","N??ng l?????ng:  680 calo", "Calories:  68 kcal/100g", "Dinh d?????ng:  Protein, Lipit, Tinh b???t, ...", "250.000 VND"));
//        list.add(new Food("X??i g?? ??c",R.drawable.monan_xoi, R.drawable.star,"X??i l?? ????? ??n th??ng d???ng ???????c l??m t??? nguy??n li???u ch??nh l?? g???o n???p, ?????/h???p ch??n b???ng h??i n?????c, th???nh h??nh trong ???m th???c nhi???u n?????c Ch??u ??. Nguy??n li???u ch??nh l?? c??c lo???i g???o n???p","N??ng l?????ng:  420 calo", "Calories:  125 kcal/100g", "Dinh d?????ng:  Protein, Lipit, ...", "100.000 VND"));
//        list.add(new Food("Gh??? h???p c???",R.drawable.monan_ghe, R.drawable.star,"Gh??? l?? m???t lo???i cua l???n t??m th???y ??? c??c c???a s??ng c???a ???n ????? D????ng v?? Th??i B??nh D????ng c??ng nh?? v??ng duy??n h???i Trung - ????ng c???a ?????a Trung H???i. Lo??i Gh??? n??y ph??n b??? r???ng r??i ??? Vi???t Nam.","N??ng l?????ng:  650 calo", "Calories:  111 kcal/100g", "Dinh d?????ng:  Protein, Canxi, S???t, Sea, ...", "160.000 VND"));
//        list.add(new Food("Beef Steak",R.drawable.monan_beef, R.drawable.star,"M??n Beef Steak ????ng ngh??a th?????ng ch??? ???????c ph???c v??? trong c??c nh?? h??ng lo???i sang trongj v?? nguy??n li???u th???t b?? ??? ????y kh?? ?????t ?????. M??n b?? th?????ng b??? nh???m l???n v???i b??t t???t l?? b?? n??.","N??ng l?????ng:  750 calo", "Calories:  133,8 kcal/100g", "Dinh d?????ng:  Protein, lipit, B12, B6, ...", "180.000 VND"));
//
//
//        return list;
//    }
}