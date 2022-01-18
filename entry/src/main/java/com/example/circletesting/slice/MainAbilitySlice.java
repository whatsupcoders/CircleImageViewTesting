package com.example.circletesting.slice;

import com.example.circletesting.ResourceTable;
import de.hdodenhof.circleimageview.CircleImageView;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.utils.Color;

public class MainAbilitySlice extends AbilitySlice {

    public void onStart(Intent intent) {
       super.onStart(intent);
     super.setUIContent(ResourceTable.Layout_ability_main);
      CircleImageView civ;
       civ = (CircleImageView)findComponentById(ResourceTable.Id_tempciv);
        civ.setBorderColor(Color.BLACK);

  }
}
