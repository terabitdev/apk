package com.uptodown.activities.preferences;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c7.k;
import com.uptodown.UptodownApp;
import n4.e;
import o4.b0;
import q4.a;
import q4.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class AdvancedPreferencesComposeActivity extends b0 {
    public static final /* synthetic */ int O = 0;

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object kVar;
        super.onCreate(bundle);
        float f7 = UptodownApp.G;
        if (e.m(this)) {
            setRequestedOrientation(0);
        }
        String stringExtra = getIntent().getStringExtra("advanced_settings_section");
        if (stringExtra != null) {
            try {
                kVar = b.valueOf(stringExtra);
            } catch (Throwable th) {
                kVar = new k(th);
            }
            if (kVar instanceof k) {
                kVar = null;
            }
            b bVar = (b) kVar;
            if (bVar != null) {
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1500554066, true, new a(this, bVar)), 1, null);
                return;
            }
        }
        finish();
    }
}
