package com.google.android.material.textfield;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(@NonNull EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }
}
