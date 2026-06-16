package com.google.android.material.motion;

import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull BackEventCompat backEventCompat);

    void updateBackProgress(@NonNull BackEventCompat backEventCompat);
}
