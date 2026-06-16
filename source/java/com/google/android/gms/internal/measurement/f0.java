package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3766a;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = GroupFlagsKt.HasAuxSlotFlag;
        } else {
            i = 0;
        }
        f3766a = i;
    }
}
