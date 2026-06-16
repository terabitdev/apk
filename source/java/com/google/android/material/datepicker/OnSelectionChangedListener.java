package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public abstract class OnSelectionChangedListener<S> {
    public abstract void onSelectionChanged(@NonNull S s);

    public void onIncompleteSelectionChanged() {
    }
}
