package com.example.circletesting;
import de.hdodenhof.circleimageview.CircleImageView;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import com.example.circletesting.slice.MainAbilitySlice;
import ohos.agp.utils.Color;

public class MainAbility extends Ability {
        @Override
        public void onStart(Intent intent) {
            super.onStart(intent);
            super.setMainRoute(MainAbilitySlice.class.getName());
        }

        @Override
        public void onStop() {
            super.onStop();
        }
    }

