package com.google.android.material.chip;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import j5.n;
import q4.w;
import z5.a2;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4089b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4088a = i;
        this.f4089b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        boolean z11;
        SharedPreferences sharedPreferences;
        int i = this.f4088a;
        boolean z12 = true;
        Object obj = this.f4089b;
        switch (i) {
            case 0:
                ((Chip) obj).lambda$new$0(compoundButton, z10);
                return;
            case 1:
                int i3 = OldVersionsActivity.S;
                boolean z13 = !z10;
                SharedPreferences sharedPreferences2 = ((OldVersionsActivity) obj).getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putBoolean("show_warning_download_incompatible", z13);
                edit.apply();
                return;
            case 2:
                MobileDataUsageActivity mobileDataUsageActivity = (MobileDataUsageActivity) obj;
                int i8 = MobileDataUsageActivity.Q;
                if (mobileDataUsageActivity.z0().f9963b.getValue() == w.f9958a) {
                    try {
                        sharedPreferences = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception unused) {
                    }
                    if (sharedPreferences.contains("autoplay_mobile_data")) {
                        z11 = sharedPreferences.getBoolean("autoplay_mobile_data", false);
                        if (z10 == z11) {
                            SharedPreferences sharedPreferences3 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences3.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                            edit2.putBoolean("autoplay_mobile_data", z10);
                            edit2.apply();
                            mobileDataUsageActivity.A0("autoplay", "mobile", String.valueOf(z10));
                            return;
                        }
                        return;
                    }
                    z11 = false;
                    if (z10 == z11) {
                    }
                } else {
                    try {
                        SharedPreferences sharedPreferences4 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences4.contains("autoplay_wifi")) {
                            z12 = sharedPreferences4.getBoolean("autoplay_wifi", true);
                        }
                    } catch (Exception unused2) {
                    }
                    if (z10 != z12) {
                        SharedPreferences sharedPreferences5 = mobileDataUsageActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                        edit3.putBoolean("autoplay_wifi", z10);
                        edit3.apply();
                        mobileDataUsageActivity.A0("autoplay", "wifi", String.valueOf(z10));
                        return;
                    }
                    return;
                }
            default:
                a2 a2Var = (a2) obj;
                n nVar = a2Var.f11539b;
                if (nVar != null) {
                    nVar.c(a2Var.getBindingAdapterPosition());
                    return;
                }
                return;
        }
    }
}
