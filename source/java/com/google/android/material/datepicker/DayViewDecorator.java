package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class DayViewDecorator implements Parcelable {
    @Nullable
    public ColorStateList getBackgroundColor(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableBottom(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableLeft(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableRight(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    @Nullable
    public Drawable getCompoundDrawableTop(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    @Nullable
    public ColorStateList getTextColor(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11) {
        return null;
    }

    public void initialize(@NonNull Context context) {
    }

    @Nullable
    public CharSequence getContentDescription(@NonNull Context context, int i, int i3, int i8, boolean z10, boolean z11, @Nullable CharSequence charSequence) {
        return charSequence;
    }
}
