package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import f2.i;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_MaterialSplitButton;
    private static final int REQUIRED_BUTTON_COUNT = 2;

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addView$0(MaterialButton materialButton, boolean z10) {
        int i;
        Resources resources = getResources();
        if (z10) {
            i = R.string.mtrl_button_expanded_content_description;
        } else {
            i = R.string.mtrl_button_collapsed_content_description;
        }
        materialButton.setStateDescription(resources.getString(i));
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        int i3;
        if (view instanceof MaterialButton) {
            if (getChildCount() <= 2) {
                MaterialButton materialButton = (MaterialButton) view;
                super.addView(view, i, layoutParams);
                if (indexOfChild(view) == 1) {
                    materialButton.setCheckable(true);
                    materialButton.setA11yClassName(Button.class.getName());
                    if (Build.VERSION.SDK_INT >= 30) {
                        Resources resources = getResources();
                        if (materialButton.isChecked()) {
                            i3 = R.string.mtrl_button_expanded_content_description;
                        } else {
                            i3 = R.string.mtrl_button_collapsed_content_description;
                        }
                        materialButton.setStateDescription(resources.getString(i3));
                        materialButton.addOnCheckedChangeListener(new MaterialButton.OnCheckedChangeListener() { // from class: com.google.android.material.button.a
                            @Override // com.google.android.material.button.MaterialButton.OnCheckedChangeListener
                            public final void onCheckedChanged(MaterialButton materialButton2, boolean z10) {
                                MaterialSplitButton.this.lambda$addView$0(materialButton2, z10);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            i.k("MaterialSplitButton can only hold two MaterialButtons.");
            return;
        }
        i.k("MaterialSplitButton can only hold MaterialButtons.");
    }

    public MaterialSplitButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSplitButtonStyle);
    }

    public MaterialSplitButton(@NonNull Context context) {
        this(context, null);
    }
}
