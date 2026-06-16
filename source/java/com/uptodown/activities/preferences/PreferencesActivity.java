package com.uptodown.activities.preferences;

import a5.k;
import a6.s;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBindings;
import c7.j;
import c7.n;
import c8.f0;
import com.google.android.gms.internal.measurement.a4;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.AdvancedPreferencesComposeActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import com.uptodown.activities.preferences.PreferencesActivity;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import f1.g;
import g5.h0;
import g5.i0;
import g7.c;
import j$.time.Year;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k3.t;
import k5.l2;
import n2.t1;
import n4.e;
import o4.b0;
import o4.b1;
import o4.g4;
import o4.n2;
import o4.q2;
import q7.a;
import w5.l;
import y4.o;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PreferencesActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public final n O;
    public final n P;
    public l2 Q;
    public final ActivityResultLauncher R;
    public final ActivityResultLauncher S;

    public PreferencesActivity() {
        final int i = 0;
        this.O = new n(new a(this) { // from class: q4.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9901b;

            {
                this.f9901b = this;
            }

            @Override // q7.a
            public final Object invoke() {
                int i3 = i;
                PreferencesActivity preferencesActivity = this.f9901b;
                switch (i3) {
                    case 0:
                        int i8 = PreferencesActivity.T;
                        View inflate = preferencesActivity.getLayoutInflater().inflate(R.layout.preferences_activity, (ViewGroup) null, false);
                        int i10 = R.id.about_app_setting;
                        View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.about_app_setting);
                        if (findChildViewById != null) {
                            h0 a10 = h0.a(findChildViewById);
                            i10 = R.id.about_uptodown_setting;
                            View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.about_uptodown_setting);
                            if (findChildViewById2 != null) {
                                h0 a11 = h0.a(findChildViewById2);
                                i10 = R.id.ads_setting;
                                View findChildViewById3 = ViewBindings.findChildViewById(inflate, R.id.ads_setting);
                                if (findChildViewById3 != null) {
                                    h0 a12 = h0.a(findChildViewById3);
                                    i10 = R.id.advanced_setting;
                                    View findChildViewById4 = ViewBindings.findChildViewById(inflate, R.id.advanced_setting);
                                    if (findChildViewById4 != null) {
                                        h0 a13 = h0.a(findChildViewById4);
                                        i10 = R.id.age_verification_setting;
                                        View findChildViewById5 = ViewBindings.findChildViewById(inflate, R.id.age_verification_setting);
                                        if (findChildViewById5 != null) {
                                            h0 b10 = h0.b(findChildViewById5);
                                            i10 = R.id.auto_update_root_switch_setting;
                                            View findChildViewById6 = ViewBindings.findChildViewById(inflate, R.id.auto_update_root_switch_setting);
                                            if (findChildViewById6 != null) {
                                                a5.w a14 = a5.w.a(findChildViewById6);
                                                i10 = R.id.downloads_notification_setting;
                                                View findChildViewById7 = ViewBindings.findChildViewById(inflate, R.id.downloads_notification_setting);
                                                if (findChildViewById7 != null) {
                                                    a5.w a15 = a5.w.a(findChildViewById7);
                                                    i10 = R.id.file_management_category;
                                                    View findChildViewById8 = ViewBindings.findChildViewById(inflate, R.id.file_management_category);
                                                    if (findChildViewById8 != null) {
                                                        a5.z l = a5.z.l(findChildViewById8);
                                                        i10 = R.id.installable_files_notification_setting;
                                                        View findChildViewById9 = ViewBindings.findChildViewById(inflate, R.id.installable_files_notification_setting);
                                                        if (findChildViewById9 != null) {
                                                            a5.w a16 = a5.w.a(findChildViewById9);
                                                            i10 = R.id.installations_notification_setting;
                                                            View findChildViewById10 = ViewBindings.findChildViewById(inflate, R.id.installations_notification_setting);
                                                            if (findChildViewById10 != null) {
                                                                a5.w a17 = a5.w.a(findChildViewById10);
                                                                i10 = R.id.language_setting;
                                                                View findChildViewById11 = ViewBindings.findChildViewById(inflate, R.id.language_setting);
                                                                if (findChildViewById11 != null) {
                                                                    h0 a18 = h0.a(findChildViewById11);
                                                                    i10 = R.id.ll_preferences_list;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_preferences_list);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.mobile_data_usage_setting;
                                                                        View findChildViewById12 = ViewBindings.findChildViewById(inflate, R.id.mobile_data_usage_setting);
                                                                        if (findChildViewById12 != null) {
                                                                            h0 b11 = h0.b(findChildViewById12);
                                                                            i10 = R.id.more_info_category;
                                                                            View findChildViewById13 = ViewBindings.findChildViewById(inflate, R.id.more_info_category);
                                                                            if (findChildViewById13 != null) {
                                                                                a5.z l10 = a5.z.l(findChildViewById13);
                                                                                i10 = R.id.notifications_category;
                                                                                View findChildViewById14 = ViewBindings.findChildViewById(inflate, R.id.notifications_category);
                                                                                if (findChildViewById14 != null) {
                                                                                    a5.z l11 = a5.z.l(findChildViewById14);
                                                                                    i10 = R.id.performance_category;
                                                                                    View findChildViewById15 = ViewBindings.findChildViewById(inflate, R.id.performance_category);
                                                                                    if (findChildViewById15 != null) {
                                                                                        a5.z l12 = a5.z.l(findChildViewById15);
                                                                                        i10 = R.id.privacy_and_policy_category;
                                                                                        View findChildViewById16 = ViewBindings.findChildViewById(inflate, R.id.privacy_and_policy_category);
                                                                                        if (findChildViewById16 != null) {
                                                                                            a5.z l13 = a5.z.l(findChildViewById16);
                                                                                            i10 = R.id.privacy_setting;
                                                                                            View findChildViewById17 = ViewBindings.findChildViewById(inflate, R.id.privacy_setting);
                                                                                            if (findChildViewById17 != null) {
                                                                                                h0 a19 = h0.a(findChildViewById17);
                                                                                                i10 = R.id.quick_install_root_switch_setting;
                                                                                                View findChildViewById18 = ViewBindings.findChildViewById(inflate, R.id.quick_install_root_switch_setting);
                                                                                                if (findChildViewById18 != null) {
                                                                                                    a5.w a20 = a5.w.a(findChildViewById18);
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                                                                    i10 = R.id.root_category;
                                                                                                    View findChildViewById19 = ViewBindings.findChildViewById(inflate, R.id.root_category);
                                                                                                    if (findChildViewById19 != null) {
                                                                                                        a5.z l14 = a5.z.l(findChildViewById19);
                                                                                                        i10 = R.id.show_notifications_setting;
                                                                                                        View findChildViewById20 = ViewBindings.findChildViewById(inflate, R.id.show_notifications_setting);
                                                                                                        if (findChildViewById20 != null) {
                                                                                                            a5.w a21 = a5.w.a(findChildViewById20);
                                                                                                            i10 = R.id.support_setting;
                                                                                                            View findChildViewById21 = ViewBindings.findChildViewById(inflate, R.id.support_setting);
                                                                                                            if (findChildViewById21 != null) {
                                                                                                                h0 a22 = h0.a(findChildViewById21);
                                                                                                                i10 = R.id.toolbar_preferences;
                                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar_preferences);
                                                                                                                if (toolbar != null) {
                                                                                                                    i10 = R.id.tos_setting;
                                                                                                                    View findChildViewById22 = ViewBindings.findChildViewById(inflate, R.id.tos_setting);
                                                                                                                    if (findChildViewById22 != null) {
                                                                                                                        h0 a23 = h0.a(findChildViewById22);
                                                                                                                        i10 = R.id.tv_toolbar_title_preferences;
                                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_toolbar_title_preferences);
                                                                                                                        if (textView != null) {
                                                                                                                            i10 = R.id.updates_category;
                                                                                                                            View findChildViewById23 = ViewBindings.findChildViewById(inflate, R.id.updates_category);
                                                                                                                            if (findChildViewById23 != null) {
                                                                                                                                a5.z l15 = a5.z.l(findChildViewById23);
                                                                                                                                i10 = R.id.updates_notification_setting;
                                                                                                                                View findChildViewById24 = ViewBindings.findChildViewById(inflate, R.id.updates_notification_setting);
                                                                                                                                if (findChildViewById24 != null) {
                                                                                                                                    h0 b12 = h0.b(findChildViewById24);
                                                                                                                                    i10 = R.id.updates_setting;
                                                                                                                                    View findChildViewById25 = ViewBindings.findChildViewById(inflate, R.id.updates_setting);
                                                                                                                                    if (findChildViewById25 != null) {
                                                                                                                                        return new i0(linearLayout2, a10, a11, a12, a13, b10, a14, a15, l, a16, a17, a18, linearLayout, b11, l10, l11, l12, l13, a19, a20, l14, a21, a22, toolbar, a23, textView, l15, b12, a5.w.a(findChildViewById25));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    default:
                        int i11 = PreferencesActivity.T;
                        return new u4.a(preferencesActivity);
                }
            }
        });
        final int i3 = 1;
        this.P = new n(new a(this) { // from class: q4.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9901b;

            {
                this.f9901b = this;
            }

            @Override // q7.a
            public final Object invoke() {
                int i32 = i3;
                PreferencesActivity preferencesActivity = this.f9901b;
                switch (i32) {
                    case 0:
                        int i8 = PreferencesActivity.T;
                        View inflate = preferencesActivity.getLayoutInflater().inflate(R.layout.preferences_activity, (ViewGroup) null, false);
                        int i10 = R.id.about_app_setting;
                        View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.about_app_setting);
                        if (findChildViewById != null) {
                            h0 a10 = h0.a(findChildViewById);
                            i10 = R.id.about_uptodown_setting;
                            View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.about_uptodown_setting);
                            if (findChildViewById2 != null) {
                                h0 a11 = h0.a(findChildViewById2);
                                i10 = R.id.ads_setting;
                                View findChildViewById3 = ViewBindings.findChildViewById(inflate, R.id.ads_setting);
                                if (findChildViewById3 != null) {
                                    h0 a12 = h0.a(findChildViewById3);
                                    i10 = R.id.advanced_setting;
                                    View findChildViewById4 = ViewBindings.findChildViewById(inflate, R.id.advanced_setting);
                                    if (findChildViewById4 != null) {
                                        h0 a13 = h0.a(findChildViewById4);
                                        i10 = R.id.age_verification_setting;
                                        View findChildViewById5 = ViewBindings.findChildViewById(inflate, R.id.age_verification_setting);
                                        if (findChildViewById5 != null) {
                                            h0 b10 = h0.b(findChildViewById5);
                                            i10 = R.id.auto_update_root_switch_setting;
                                            View findChildViewById6 = ViewBindings.findChildViewById(inflate, R.id.auto_update_root_switch_setting);
                                            if (findChildViewById6 != null) {
                                                a5.w a14 = a5.w.a(findChildViewById6);
                                                i10 = R.id.downloads_notification_setting;
                                                View findChildViewById7 = ViewBindings.findChildViewById(inflate, R.id.downloads_notification_setting);
                                                if (findChildViewById7 != null) {
                                                    a5.w a15 = a5.w.a(findChildViewById7);
                                                    i10 = R.id.file_management_category;
                                                    View findChildViewById8 = ViewBindings.findChildViewById(inflate, R.id.file_management_category);
                                                    if (findChildViewById8 != null) {
                                                        a5.z l = a5.z.l(findChildViewById8);
                                                        i10 = R.id.installable_files_notification_setting;
                                                        View findChildViewById9 = ViewBindings.findChildViewById(inflate, R.id.installable_files_notification_setting);
                                                        if (findChildViewById9 != null) {
                                                            a5.w a16 = a5.w.a(findChildViewById9);
                                                            i10 = R.id.installations_notification_setting;
                                                            View findChildViewById10 = ViewBindings.findChildViewById(inflate, R.id.installations_notification_setting);
                                                            if (findChildViewById10 != null) {
                                                                a5.w a17 = a5.w.a(findChildViewById10);
                                                                i10 = R.id.language_setting;
                                                                View findChildViewById11 = ViewBindings.findChildViewById(inflate, R.id.language_setting);
                                                                if (findChildViewById11 != null) {
                                                                    h0 a18 = h0.a(findChildViewById11);
                                                                    i10 = R.id.ll_preferences_list;
                                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_preferences_list);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.mobile_data_usage_setting;
                                                                        View findChildViewById12 = ViewBindings.findChildViewById(inflate, R.id.mobile_data_usage_setting);
                                                                        if (findChildViewById12 != null) {
                                                                            h0 b11 = h0.b(findChildViewById12);
                                                                            i10 = R.id.more_info_category;
                                                                            View findChildViewById13 = ViewBindings.findChildViewById(inflate, R.id.more_info_category);
                                                                            if (findChildViewById13 != null) {
                                                                                a5.z l10 = a5.z.l(findChildViewById13);
                                                                                i10 = R.id.notifications_category;
                                                                                View findChildViewById14 = ViewBindings.findChildViewById(inflate, R.id.notifications_category);
                                                                                if (findChildViewById14 != null) {
                                                                                    a5.z l11 = a5.z.l(findChildViewById14);
                                                                                    i10 = R.id.performance_category;
                                                                                    View findChildViewById15 = ViewBindings.findChildViewById(inflate, R.id.performance_category);
                                                                                    if (findChildViewById15 != null) {
                                                                                        a5.z l12 = a5.z.l(findChildViewById15);
                                                                                        i10 = R.id.privacy_and_policy_category;
                                                                                        View findChildViewById16 = ViewBindings.findChildViewById(inflate, R.id.privacy_and_policy_category);
                                                                                        if (findChildViewById16 != null) {
                                                                                            a5.z l13 = a5.z.l(findChildViewById16);
                                                                                            i10 = R.id.privacy_setting;
                                                                                            View findChildViewById17 = ViewBindings.findChildViewById(inflate, R.id.privacy_setting);
                                                                                            if (findChildViewById17 != null) {
                                                                                                h0 a19 = h0.a(findChildViewById17);
                                                                                                i10 = R.id.quick_install_root_switch_setting;
                                                                                                View findChildViewById18 = ViewBindings.findChildViewById(inflate, R.id.quick_install_root_switch_setting);
                                                                                                if (findChildViewById18 != null) {
                                                                                                    a5.w a20 = a5.w.a(findChildViewById18);
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                                                                    i10 = R.id.root_category;
                                                                                                    View findChildViewById19 = ViewBindings.findChildViewById(inflate, R.id.root_category);
                                                                                                    if (findChildViewById19 != null) {
                                                                                                        a5.z l14 = a5.z.l(findChildViewById19);
                                                                                                        i10 = R.id.show_notifications_setting;
                                                                                                        View findChildViewById20 = ViewBindings.findChildViewById(inflate, R.id.show_notifications_setting);
                                                                                                        if (findChildViewById20 != null) {
                                                                                                            a5.w a21 = a5.w.a(findChildViewById20);
                                                                                                            i10 = R.id.support_setting;
                                                                                                            View findChildViewById21 = ViewBindings.findChildViewById(inflate, R.id.support_setting);
                                                                                                            if (findChildViewById21 != null) {
                                                                                                                h0 a22 = h0.a(findChildViewById21);
                                                                                                                i10 = R.id.toolbar_preferences;
                                                                                                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(inflate, R.id.toolbar_preferences);
                                                                                                                if (toolbar != null) {
                                                                                                                    i10 = R.id.tos_setting;
                                                                                                                    View findChildViewById22 = ViewBindings.findChildViewById(inflate, R.id.tos_setting);
                                                                                                                    if (findChildViewById22 != null) {
                                                                                                                        h0 a23 = h0.a(findChildViewById22);
                                                                                                                        i10 = R.id.tv_toolbar_title_preferences;
                                                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_toolbar_title_preferences);
                                                                                                                        if (textView != null) {
                                                                                                                            i10 = R.id.updates_category;
                                                                                                                            View findChildViewById23 = ViewBindings.findChildViewById(inflate, R.id.updates_category);
                                                                                                                            if (findChildViewById23 != null) {
                                                                                                                                a5.z l15 = a5.z.l(findChildViewById23);
                                                                                                                                i10 = R.id.updates_notification_setting;
                                                                                                                                View findChildViewById24 = ViewBindings.findChildViewById(inflate, R.id.updates_notification_setting);
                                                                                                                                if (findChildViewById24 != null) {
                                                                                                                                    h0 b12 = h0.b(findChildViewById24);
                                                                                                                                    i10 = R.id.updates_setting;
                                                                                                                                    View findChildViewById25 = ViewBindings.findChildViewById(inflate, R.id.updates_setting);
                                                                                                                                    if (findChildViewById25 != null) {
                                                                                                                                        return new i0(linearLayout2, a10, a11, a12, a13, b10, a14, a15, l, a16, a17, a18, linearLayout, b11, l10, l11, l12, l13, a19, a20, l14, a21, a22, toolbar, a23, textView, l15, b12, a5.w.a(findChildViewById25));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                        return null;
                    default:
                        int i11 = PreferencesActivity.T;
                        return new u4.a(preferencesActivity);
                }
            }
        });
        final int i8 = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: q4.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9909b;

            {
                this.f9909b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i10 = i8;
                PreferencesActivity preferencesActivity = this.f9909b;
                switch (i10) {
                    case 0:
                        int i11 = PreferencesActivity.T;
                        if (((ActivityResult) obj).getResultCode() == 1003) {
                            preferencesActivity.setResult(PointerIconCompat.TYPE_HELP);
                            preferencesActivity.finish();
                            preferencesActivity.startActivity(preferencesActivity.getIntent());
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i12 = PreferencesActivity.T;
                        int i13 = 0;
                        if (booleanValue) {
                            SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putBoolean("recibir_notificaciones", true);
                            edit.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        ((SwitchCompat) preferencesActivity.x0().E.m).setChecked(false);
                        preferencesActivity.z0();
                        int i14 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("notification_permission_request_api33", -1) + 1;
                        SharedPreferences sharedPreferences2 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences2.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.putInt("notification_permission_request_api33", i14);
                        edit2.apply();
                        if (Build.VERSION.SDK_INT >= 33 && i14 >= 2 && ContextCompat.checkSelfPermission(preferencesActivity, "android.permission.POST_NOTIFICATIONS") != 0) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            builder.setTitle(R.string.title_notification_dialog_permission);
                            builder.setMessage(R.string.description_notification_dialog_permission);
                            builder.setPositiveButton(R.string.button_notification_dialog_permission, new c0(preferencesActivity, i13));
                            builder.create().show();
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.R = registerForActivityResult;
        final int i10 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback(this) { // from class: q4.d0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9909b;

            {
                this.f9909b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i102 = i10;
                PreferencesActivity preferencesActivity = this.f9909b;
                switch (i102) {
                    case 0:
                        int i11 = PreferencesActivity.T;
                        if (((ActivityResult) obj).getResultCode() == 1003) {
                            preferencesActivity.setResult(PointerIconCompat.TYPE_HELP);
                            preferencesActivity.finish();
                            preferencesActivity.startActivity(preferencesActivity.getIntent());
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i12 = PreferencesActivity.T;
                        int i13 = 0;
                        if (booleanValue) {
                            SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putBoolean("recibir_notificaciones", true);
                            edit.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        ((SwitchCompat) preferencesActivity.x0().E.m).setChecked(false);
                        preferencesActivity.z0();
                        int i14 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("notification_permission_request_api33", -1) + 1;
                        SharedPreferences sharedPreferences2 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences2.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.putInt("notification_permission_request_api33", i14);
                        edit2.apply();
                        if (Build.VERSION.SDK_INT >= 33 && i14 >= 2 && ContextCompat.checkSelfPermission(preferencesActivity, "android.permission.POST_NOTIFICATIONS") != 0) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            builder.setTitle(R.string.title_notification_dialog_permission);
                            builder.setMessage(R.string.description_notification_dialog_permission);
                            builder.setPositiveButton(R.string.button_notification_dialog_permission, new c0(preferencesActivity, i13));
                            builder.create().show();
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.S = registerForActivityResult2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        boolean z10;
        SharedPreferences sharedPreferences;
        ((TextView) x0().E.f185n).setText(getString(R.string.enabled));
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences.contains("updates_active")) {
            z10 = sharedPreferences.getBoolean("updates_active", true);
            if (!z10) {
                s sVar = new s(this);
                RelativeLayout relativeLayout = x0().K.f5479b;
                relativeLayout.getClass();
                sVar.c(relativeLayout, 1.0f);
            } else {
                s sVar2 = new s(this);
                RelativeLayout relativeLayout2 = x0().K.f5479b;
                relativeLayout2.getClass();
                sVar2.c(relativeLayout2, 0.3f);
            }
            new s(this).c((RelativeLayout) x0().q.f184b, 1.0f);
            ((SwitchCompat) x0().q.m).setClickable(true);
            new s(this).c((RelativeLayout) x0().t.f184b, 1.0f);
            ((SwitchCompat) x0().t.m).setClickable(true);
            new s(this).c((RelativeLayout) x0().s.f184b, 1.0f);
            ((SwitchCompat) x0().s.m).setClickable(true);
        }
        z10 = true;
        if (!z10) {
        }
        new s(this).c((RelativeLayout) x0().q.f184b, 1.0f);
        ((SwitchCompat) x0().q.m).setClickable(true);
        new s(this).c((RelativeLayout) x0().t.f184b, 1.0f);
        ((SwitchCompat) x0().t.m).setClickable(true);
        new s(this).c((RelativeLayout) x0().s.f184b, 1.0f);
        ((SwitchCompat) x0().s.m).setClickable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r2.equalsIgnoreCase(r3) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r3 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0.f7436b != r1.f7436b) goto L13;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k5.p] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void finish() {
        l2 l2Var = new l2(this);
        l2 l2Var2 = this.Q;
        if (l2Var2 != null) {
            String str = l2Var2.f7435a;
            String str2 = l2Var.f7435a;
            if (str == null) {
            }
            if (str != null) {
            }
        }
        ?? obj = new Object();
        obj.f(this);
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(l2Var, this, (Object) obj, (c) null, 24), 3);
        super.finish();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:1|(1:3)|4|(1:6)|7|8|9|(34:11|12|(1:(2:14|(2:17|18)(1:16))(2:84|85))|19|(1:21)(1:83)|22|23|24|(24:26|27|(1:79)(1:31)|32|(1:34)(1:78)|35|(1:37)(1:77)|38|(1:40)(2:74|(1:76))|41|(2:43|(1:45)(1:72))(1:73)|46|(1:48)|49|(1:51)|52|(4:54|(2:57|55)|58|59)|60|61|62|(1:64)|(1:67)|68|69)|81|27|(1:29)|79|32|(0)(0)|35|(0)(0)|38|(0)(0)|41|(0)(0)|46|(0)|49|(0)|52|(0)|60|61|62|(0)|(0)|68|69)|87|12|(2:(0)(0)|16)|19|(0)(0)|22|23|24|(0)|81|27|(0)|79|32|(0)(0)|35|(0)(0)|38|(0)(0)|41|(0)(0)|46|(0)|49|(0)|52|(0)|60|61|62|(0)|(0)|68|69) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0251 A[Catch: Exception -> 0x0256, TRY_LEAVE, TryCatch #1 {Exception -> 0x0256, blocks: (B:24:0x0245, B:26:0x0251), top: B:23:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x07ee A[Catch: Exception -> 0x07f2, TRY_LEAVE, TryCatch #2 {Exception -> 0x07f2, blocks: (B:62:0x07e4, B:64:0x07ee), top: B:61:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v314, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        int length;
        int i;
        String str2;
        boolean z10;
        int i3;
        int i8;
        HashMap hashMap;
        File file;
        u4.a aVar;
        File externalFilesDir;
        ArrayList F;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        boolean z11 = true;
        z11 = true;
        super.onCreate(bundle);
        LinearLayout linearLayout = x0().f5485a;
        linearLayout.getClass();
        setContentView(linearLayout);
        float f7 = UptodownApp.G;
        final int i10 = 0;
        if (e.m(this)) {
            setRequestedOrientation(0);
        }
        this.Q = new l2(this);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            x0().G.setNavigationIcon(drawable);
            x0().G.setNavigationContentDescription(getString(R.string.back));
        }
        final int i11 = 16;
        x0().G.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i12) {
                    case 0:
                        int i13 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i14 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i15 = PreferencesActivity.T;
                        ?? obj = new Object();
                        obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView = c10.p;
                        textView.setTypeface(s4.c.v);
                        textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView2 = c10.m;
                        textView2.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16 = obj.f7671a;
                        if (i16 > 0) {
                            editText.setText(String.valueOf(i16));
                        }
                        textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22 = PreferencesActivity.T;
                        String string = preferencesActivity.getString(R.string.privacy_policy_title);
                        string.getClass();
                        String string2 = preferencesActivity.getString(R.string.url_advertising);
                        string2.getClass();
                        w5.c.e(preferencesActivity, string2, string);
                        return;
                    case 9:
                        int i23 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i28 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i29 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i30 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().I.setTypeface(s4.c.u);
        x0().u.m.setTypeface(s4.c.u);
        b1.h(this, R.string.item_menu_idioma, x0().u.m).u.l.setTypeface(s4.c.v);
        x0().u.l.setVisibility(0);
        try {
            sharedPreferences3 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (sharedPreferences3.contains("Language")) {
            str = sharedPreferences3.getString("Language", null);
            String[] stringArray = getResources().getStringArray(R.array.languageCodes);
            stringArray.getClass();
            String[] stringArray2 = getResources().getStringArray(R.array.localizedLang);
            stringArray2.getClass();
            length = stringArray.length;
            i = 0;
            while (true) {
                if (i >= length) {
                    if (stringArray[i].equals(str)) {
                        str2 = stringArray2[i];
                        str2.getClass();
                        break;
                    }
                    i++;
                } else {
                    str2 = "";
                    break;
                }
            }
            x0().u.l.setText(str2);
            final int i12 = 3;
            x0().u.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i12;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i13 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i14 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i15 = PreferencesActivity.T;
                            ?? obj = new Object();
                            obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj2 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView = c10.p;
                            textView.setTypeface(s4.c.v);
                            textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView2 = c10.m;
                            textView2.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i16 = obj.f7671a;
                            if (i16 > 0) {
                                editText.setText(String.valueOf(i16));
                            }
                            textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj2.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj2.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i17 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i18 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i19 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i20 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i21 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i22 = PreferencesActivity.T;
                            String string = preferencesActivity.getString(R.string.privacy_policy_title);
                            string.getClass();
                            String string2 = preferencesActivity.getString(R.string.url_advertising);
                            string2.getClass();
                            w5.c.e(preferencesActivity, string2, string);
                            return;
                        case 9:
                            int i23 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i24 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i25 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i26 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i27 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i28 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i29 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i30 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().J.l).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.updates, (TextView) x0().J.l).L.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.updates, (TextView) x0().L.o).L.f185n).setTypeface(s4.c.v);
            final int i13 = 11;
            ((RelativeLayout) x0().L.l).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i13;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i14 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i15 = PreferencesActivity.T;
                            ?? obj = new Object();
                            obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj2 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView = c10.p;
                            textView.setTypeface(s4.c.v);
                            textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView2 = c10.m;
                            textView2.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i16 = obj.f7671a;
                            if (i16 > 0) {
                                editText.setText(String.valueOf(i16));
                            }
                            textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj2.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj2.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i17 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i18 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i19 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i20 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i21 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i22 = PreferencesActivity.T;
                            String string = preferencesActivity.getString(R.string.privacy_policy_title);
                            string.getClass();
                            String string2 = preferencesActivity.getString(R.string.url_advertising);
                            string2.getClass();
                            w5.c.e(preferencesActivity, string2, string);
                            return;
                        case 9:
                            int i23 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i24 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i25 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i26 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i27 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i28 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i29 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i30 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            if (!s7.a.v(this, "updates_active", true)) {
                s sVar = new s(this);
                RelativeLayout relativeLayout = x0().K.f5479b;
                relativeLayout.getClass();
                sVar.c(relativeLayout, 1.0f);
                ((SwitchCompat) b1.h(this, R.string.enabled, (TextView) x0().L.f185n).L.m).setChecked(true);
            } else {
                s sVar2 = new s(this);
                RelativeLayout relativeLayout2 = x0().K.f5479b;
                relativeLayout2.getClass();
                sVar2.c(relativeLayout2, 0.3f);
                ((SwitchCompat) b1.h(this, R.string.disabled, (TextView) x0().L.f185n).L.m).setChecked(false);
            }
            final int i14 = 2;
            ((SwitchCompat) x0().L.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i15 = i14;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i15) {
                        case 0:
                            int i16 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i17 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i18 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                relativeLayout3.getClass();
                                sVar3.c(relativeLayout3, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                            relativeLayout4.getClass();
                            sVar4.c(relativeLayout4, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i19 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i20 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i21 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i22 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            ((TextView) x0().r.l).setTypeface(s4.c.u);
            final int i15 = 12;
            ((RelativeLayout) b1.h(this, R.string.preference_file_management, (TextView) x0().r.l).s.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i15;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj = new Object();
                            obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj2 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView = c10.p;
                            textView.setTypeface(s4.c.v);
                            textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView2 = c10.m;
                            textView2.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i16 = obj.f7671a;
                            if (i16 > 0) {
                                editText.setText(String.valueOf(i16));
                            }
                            textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj2.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj2.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i17 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i18 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i19 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i20 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i21 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i22 = PreferencesActivity.T;
                            String string = preferencesActivity.getString(R.string.privacy_policy_title);
                            string.getClass();
                            String string2 = preferencesActivity.getString(R.string.url_advertising);
                            string2.getClass();
                            w5.c.e(preferencesActivity, string2, string);
                            return;
                        case 9:
                            int i23 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i24 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i25 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i26 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i27 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i28 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i29 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i30 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().s.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.search_apk_file_worker_preference_title, (TextView) x0().s.o).s.f185n).setTypeface(s4.c.v);
            SwitchCompat switchCompat = (SwitchCompat) b1.h(this, R.string.preference_locate_files_in_storage, (TextView) x0().s.f185n).s.m;
            sharedPreferences2 = getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences2.contains("search_apk_worker_active")) {
                z10 = sharedPreferences2.getBoolean("search_apk_worker_active", true);
                switchCompat.setChecked(z10);
                ((SwitchCompat) x0().s.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9897b;

                    {
                        this.f9897b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                        int i152 = i12;
                        PreferencesActivity preferencesActivity = this.f9897b;
                        switch (i152) {
                            case 0:
                                int i16 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences4.getClass();
                                SharedPreferences.Editor edit = sharedPreferences4.edit();
                                edit.putBoolean("download_notification", z12);
                                edit.apply();
                                return;
                            case 1:
                                int i17 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                edit2.putBoolean("installation_notification", z12);
                                edit2.apply();
                                return;
                            case 2:
                                int i18 = PreferencesActivity.T;
                                if (z12) {
                                    a6.s sVar3 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout3.getClass();
                                    sVar3.c(relativeLayout3, 1.0f);
                                    SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences6.getClass();
                                    SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                    edit3.putBoolean("updates_active", true);
                                    edit3.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                    return;
                                }
                                a6.s sVar4 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                relativeLayout4.getClass();
                                sVar4.c(relativeLayout4, 0.3f);
                                SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences7.getClass();
                                SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                edit4.putBoolean("updates_active", false);
                                edit4.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                return;
                            case 3:
                                int i19 = PreferencesActivity.T;
                                try {
                                    SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                    edit5.putBoolean("search_apk_worker_active", z12);
                                    edit5.apply();
                                    return;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            case 4:
                                int i20 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences8.getClass();
                                SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                edit6.putBoolean("install_apk_rooted", z12);
                                edit6.apply();
                                if (z12) {
                                    try {
                                        f1.g.D();
                                        return;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                int i21 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                edit7.putBoolean("install_apk_as_root_system", z12);
                                edit7.apply();
                                if (z12) {
                                    ((u4.a) preferencesActivity.P.getValue()).i(true);
                                    return;
                                }
                                return;
                            default:
                                int i22 = PreferencesActivity.T;
                                if (z12) {
                                    preferencesActivity.A0();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                        return;
                                    }
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                    edit8.putBoolean("recibir_notificaciones", true);
                                    edit8.apply();
                                    preferencesActivity.A0();
                                    return;
                                }
                                preferencesActivity.z0();
                                SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences11.getClass();
                                SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                edit9.putBoolean("recibir_notificaciones", false);
                                edit9.apply();
                                return;
                        }
                    }
                });
                ((TextView) x0().f5491z.l).setTypeface(s4.c.u);
                b1.h(this, R.string.data_saver_preference_title, (TextView) x0().f5491z.l).f5488w.m.setTypeface(s4.c.u);
                b1.h(this, R.string.data_usage_title, x0().f5488w.m).f5488w.l.setTypeface(s4.c.v);
                final int i16 = 13;
                b1.h(this, R.string.data_saver_preference_description, x0().f5488w.l).f5488w.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i16;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj = new Object();
                                obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj2 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView = c10.p;
                                textView.setTypeface(s4.c.v);
                                textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView2 = c10.m;
                                textView2.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj2.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj2.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i17 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i18 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i19 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i20 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i21 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i22 = PreferencesActivity.T;
                                String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                string.getClass();
                                String string2 = preferencesActivity.getString(R.string.url_advertising);
                                string2.getClass();
                                w5.c.e(preferencesActivity, string2, string);
                                return;
                            case 9:
                                int i23 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i24 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i25 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i26 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                final int i17 = 5;
                final int i18 = 15;
                final int i19 = 4;
                final int i20 = 8;
                if (((u4.a) this.P.getValue()).c("system_app", false) && !g.D()) {
                    ((TextView) x0().D.l).setVisibility(8);
                    ((RelativeLayout) x0().p.f184b).setVisibility(8);
                    ((RelativeLayout) x0().C.f184b).setVisibility(8);
                    i3 = 3;
                    i8 = 2;
                } else {
                    i3 = 3;
                    ((TextView) x0().D.l).setTypeface(s4.c.u);
                    i8 = 2;
                    final int i21 = 14;
                    ((RelativeLayout) b1.h(this, R.string.pref_category_title_install_as_root_system, (TextView) x0().D.l).p.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PreferencesActivity f9969b;

                        {
                            this.f9969b = this;
                        }

                        /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i122 = i21;
                            PreferencesActivity preferencesActivity = this.f9969b;
                            switch (i122) {
                                case 0:
                                    int i132 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                    return;
                                case 1:
                                    int i142 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                    return;
                                case 2:
                                    int i152 = PreferencesActivity.T;
                                    ?? obj = new Object();
                                    obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                    int value = Year.now().getValue();
                                    preferencesActivity.P();
                                    AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                    ?? obj2 = new Object();
                                    g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                    ((TextView) c10.r).setTypeface(s4.c.u);
                                    TextView textView = c10.p;
                                    textView.setTypeface(s4.c.v);
                                    textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                    c10.o.setTypeface(s4.c.v);
                                    EditText editText = c10.f5476b;
                                    editText.setTypeface(s4.c.v);
                                    ((TextView) c10.q).setTypeface(s4.c.v);
                                    TextView textView2 = c10.m;
                                    textView2.setTypeface(s4.c.u);
                                    TextView textView3 = c10.f5477n;
                                    textView3.setTypeface(s4.c.u);
                                    int i162 = obj.f7671a;
                                    if (i162 > 0) {
                                        editText.setText(String.valueOf(i162));
                                    }
                                    textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                    s7.a.J(textView3);
                                    textView3.setText(preferencesActivity.getString(R.string.reset));
                                    textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                    builder.setView(c10.l);
                                    builder.setCancelable(true);
                                    AlertDialog create = builder.create();
                                    obj2.f7675a = create;
                                    if (create != null) {
                                        Window window = create.getWindow();
                                        if (window != null) {
                                            android.support.v4.media.session.m.z(window, 0);
                                        }
                                        ((AlertDialog) obj2.f7675a).show();
                                        return;
                                    }
                                    return;
                                case 3:
                                    int i172 = PreferencesActivity.T;
                                    Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                    ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                    float f10 = UptodownApp.G;
                                    activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                    return;
                                case 4:
                                    int i182 = PreferencesActivity.T;
                                    float f11 = UptodownApp.G;
                                    if (n4.e.m(preferencesActivity)) {
                                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                        return;
                                    } else {
                                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                        return;
                                    }
                                case 5:
                                    int i192 = PreferencesActivity.T;
                                    Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                    putExtra.getClass();
                                    float f12 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                    return;
                                case 6:
                                    int i202 = PreferencesActivity.T;
                                    Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                    putExtra2.getClass();
                                    float f13 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                    return;
                                case 7:
                                    int i212 = PreferencesActivity.T;
                                    Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                    putExtra3.getClass();
                                    float f14 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                    return;
                                case 8:
                                    int i22 = PreferencesActivity.T;
                                    String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                    string.getClass();
                                    String string2 = preferencesActivity.getString(R.string.url_advertising);
                                    string2.getClass();
                                    w5.c.e(preferencesActivity, string2, string);
                                    return;
                                case 9:
                                    int i23 = PreferencesActivity.T;
                                    Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                    putExtra4.getClass();
                                    float f15 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                    return;
                                case 10:
                                    int i24 = PreferencesActivity.T;
                                    Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                    putExtra5.getClass();
                                    float f16 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                    return;
                                case 11:
                                    int i25 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                    return;
                                case 12:
                                    int i26 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                    return;
                                case 13:
                                    int i27 = PreferencesActivity.T;
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                    return;
                                case 14:
                                    int i28 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                    return;
                                case 15:
                                    int i29 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                    return;
                                case 16:
                                    int i30 = PreferencesActivity.T;
                                    preferencesActivity.finish();
                                    return;
                                default:
                                    int i31 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                    return;
                            }
                        }
                    });
                    ((TextView) x0().p.o).setTypeface(s4.c.u);
                    ((TextView) b1.h(this, R.string.pref_auto_update_title, (TextView) x0().p.o).p.f185n).setTypeface(s4.c.v);
                    ((SwitchCompat) b1.h(this, R.string.pref_auto_update_sumary, (TextView) x0().p.f185n).p.m).setChecked(s7.a.v(this, "install_apk_rooted", false));
                    ((SwitchCompat) x0().p.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PreferencesActivity f9897b;

                        {
                            this.f9897b = this;
                        }

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                            int i152 = i19;
                            PreferencesActivity preferencesActivity = this.f9897b;
                            switch (i152) {
                                case 0:
                                    int i162 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences4.getClass();
                                    SharedPreferences.Editor edit = sharedPreferences4.edit();
                                    edit.putBoolean("download_notification", z12);
                                    edit.apply();
                                    return;
                                case 1:
                                    int i172 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences5.getClass();
                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putBoolean("installation_notification", z12);
                                    edit2.apply();
                                    return;
                                case 2:
                                    int i182 = PreferencesActivity.T;
                                    if (z12) {
                                        a6.s sVar3 = new a6.s(preferencesActivity);
                                        RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                        relativeLayout3.getClass();
                                        sVar3.c(relativeLayout3, 1.0f);
                                        SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                        sharedPreferences6.getClass();
                                        SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                        edit3.putBoolean("updates_active", true);
                                        edit3.apply();
                                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                        return;
                                    }
                                    a6.s sVar4 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout4.getClass();
                                    sVar4.c(relativeLayout4, 0.3f);
                                    SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences7.getClass();
                                    SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                    edit4.putBoolean("updates_active", false);
                                    edit4.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                    return;
                                case 3:
                                    int i192 = PreferencesActivity.T;
                                    try {
                                        SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                        edit5.putBoolean("search_apk_worker_active", z12);
                                        edit5.apply();
                                        return;
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        return;
                                    }
                                case 4:
                                    int i202 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences8.getClass();
                                    SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                    edit6.putBoolean("install_apk_rooted", z12);
                                    edit6.apply();
                                    if (z12) {
                                        try {
                                            f1.g.D();
                                            return;
                                        } catch (Exception e12) {
                                            e12.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                case 5:
                                    int i212 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences9.getClass();
                                    SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                    edit7.putBoolean("install_apk_as_root_system", z12);
                                    edit7.apply();
                                    if (z12) {
                                        ((u4.a) preferencesActivity.P.getValue()).i(true);
                                        return;
                                    }
                                    return;
                                default:
                                    int i22 = PreferencesActivity.T;
                                    if (z12) {
                                        preferencesActivity.A0();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                            return;
                                        }
                                        SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                        sharedPreferences10.getClass();
                                        SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                        edit8.putBoolean("recibir_notificaciones", true);
                                        edit8.apply();
                                        preferencesActivity.A0();
                                        return;
                                    }
                                    preferencesActivity.z0();
                                    SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences11.getClass();
                                    SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                    edit9.putBoolean("recibir_notificaciones", false);
                                    edit9.apply();
                                    return;
                            }
                        }
                    });
                    ((RelativeLayout) x0().C.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PreferencesActivity f9969b;

                        {
                            this.f9969b = this;
                        }

                        /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i122 = i18;
                            PreferencesActivity preferencesActivity = this.f9969b;
                            switch (i122) {
                                case 0:
                                    int i132 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                    return;
                                case 1:
                                    int i142 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                    return;
                                case 2:
                                    int i152 = PreferencesActivity.T;
                                    ?? obj = new Object();
                                    obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                    int value = Year.now().getValue();
                                    preferencesActivity.P();
                                    AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                    ?? obj2 = new Object();
                                    g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                    ((TextView) c10.r).setTypeface(s4.c.u);
                                    TextView textView = c10.p;
                                    textView.setTypeface(s4.c.v);
                                    textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                    c10.o.setTypeface(s4.c.v);
                                    EditText editText = c10.f5476b;
                                    editText.setTypeface(s4.c.v);
                                    ((TextView) c10.q).setTypeface(s4.c.v);
                                    TextView textView2 = c10.m;
                                    textView2.setTypeface(s4.c.u);
                                    TextView textView3 = c10.f5477n;
                                    textView3.setTypeface(s4.c.u);
                                    int i162 = obj.f7671a;
                                    if (i162 > 0) {
                                        editText.setText(String.valueOf(i162));
                                    }
                                    textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                    s7.a.J(textView3);
                                    textView3.setText(preferencesActivity.getString(R.string.reset));
                                    textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                    builder.setView(c10.l);
                                    builder.setCancelable(true);
                                    AlertDialog create = builder.create();
                                    obj2.f7675a = create;
                                    if (create != null) {
                                        Window window = create.getWindow();
                                        if (window != null) {
                                            android.support.v4.media.session.m.z(window, 0);
                                        }
                                        ((AlertDialog) obj2.f7675a).show();
                                        return;
                                    }
                                    return;
                                case 3:
                                    int i172 = PreferencesActivity.T;
                                    Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                    ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                    float f10 = UptodownApp.G;
                                    activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                    return;
                                case 4:
                                    int i182 = PreferencesActivity.T;
                                    float f11 = UptodownApp.G;
                                    if (n4.e.m(preferencesActivity)) {
                                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                        return;
                                    } else {
                                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                        return;
                                    }
                                case 5:
                                    int i192 = PreferencesActivity.T;
                                    Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                    putExtra.getClass();
                                    float f12 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                    return;
                                case 6:
                                    int i202 = PreferencesActivity.T;
                                    Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                    putExtra2.getClass();
                                    float f13 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                    return;
                                case 7:
                                    int i212 = PreferencesActivity.T;
                                    Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                    putExtra3.getClass();
                                    float f14 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                    return;
                                case 8:
                                    int i22 = PreferencesActivity.T;
                                    String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                    string.getClass();
                                    String string2 = preferencesActivity.getString(R.string.url_advertising);
                                    string2.getClass();
                                    w5.c.e(preferencesActivity, string2, string);
                                    return;
                                case 9:
                                    int i23 = PreferencesActivity.T;
                                    Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                    putExtra4.getClass();
                                    float f15 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                    return;
                                case 10:
                                    int i24 = PreferencesActivity.T;
                                    Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                    putExtra5.getClass();
                                    float f16 = UptodownApp.G;
                                    preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                    return;
                                case 11:
                                    int i25 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                    return;
                                case 12:
                                    int i26 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                    return;
                                case 13:
                                    int i27 = PreferencesActivity.T;
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                    return;
                                case 14:
                                    int i28 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                    return;
                                case 15:
                                    int i29 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                    return;
                                case 16:
                                    int i30 = PreferencesActivity.T;
                                    preferencesActivity.finish();
                                    return;
                                default:
                                    int i31 = PreferencesActivity.T;
                                    ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                    return;
                            }
                        }
                    });
                    ((TextView) x0().C.o).setTypeface(s4.c.u);
                    ((TextView) b1.h(this, R.string.pref_install_apk_as_root_system_title, (TextView) x0().C.o).C.f185n).setTypeface(s4.c.v);
                    ((SwitchCompat) b1.h(this, R.string.pref_install_apk_as_root_system_summary, (TextView) x0().C.f185n).C.m).setChecked(s7.a.v(this, "install_apk_as_root_system", false));
                    ((SwitchCompat) x0().C.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PreferencesActivity f9897b;

                        {
                            this.f9897b = this;
                        }

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                            int i152 = i17;
                            PreferencesActivity preferencesActivity = this.f9897b;
                            switch (i152) {
                                case 0:
                                    int i162 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences4.getClass();
                                    SharedPreferences.Editor edit = sharedPreferences4.edit();
                                    edit.putBoolean("download_notification", z12);
                                    edit.apply();
                                    return;
                                case 1:
                                    int i172 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences5.getClass();
                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putBoolean("installation_notification", z12);
                                    edit2.apply();
                                    return;
                                case 2:
                                    int i182 = PreferencesActivity.T;
                                    if (z12) {
                                        a6.s sVar3 = new a6.s(preferencesActivity);
                                        RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                        relativeLayout3.getClass();
                                        sVar3.c(relativeLayout3, 1.0f);
                                        SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                        sharedPreferences6.getClass();
                                        SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                        edit3.putBoolean("updates_active", true);
                                        edit3.apply();
                                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                        return;
                                    }
                                    a6.s sVar4 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout4.getClass();
                                    sVar4.c(relativeLayout4, 0.3f);
                                    SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences7.getClass();
                                    SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                    edit4.putBoolean("updates_active", false);
                                    edit4.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                    return;
                                case 3:
                                    int i192 = PreferencesActivity.T;
                                    try {
                                        SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                        edit5.putBoolean("search_apk_worker_active", z12);
                                        edit5.apply();
                                        return;
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        return;
                                    }
                                case 4:
                                    int i202 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences8.getClass();
                                    SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                    edit6.putBoolean("install_apk_rooted", z12);
                                    edit6.apply();
                                    if (z12) {
                                        try {
                                            f1.g.D();
                                            return;
                                        } catch (Exception e12) {
                                            e12.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                case 5:
                                    int i212 = PreferencesActivity.T;
                                    SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences9.getClass();
                                    SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                    edit7.putBoolean("install_apk_as_root_system", z12);
                                    edit7.apply();
                                    if (z12) {
                                        ((u4.a) preferencesActivity.P.getValue()).i(true);
                                        return;
                                    }
                                    return;
                                default:
                                    int i22 = PreferencesActivity.T;
                                    if (z12) {
                                        preferencesActivity.A0();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                            return;
                                        }
                                        SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                        sharedPreferences10.getClass();
                                        SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                        edit8.putBoolean("recibir_notificaciones", true);
                                        edit8.apply();
                                        preferencesActivity.A0();
                                        return;
                                    }
                                    preferencesActivity.z0();
                                    SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences11.getClass();
                                    SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                    edit9.putBoolean("recibir_notificaciones", false);
                                    edit9.apply();
                                    return;
                            }
                        }
                    });
                }
                ((TextView) x0().f5490y.l).setTypeface(s4.c.u);
                final int i22 = 17;
                ((RelativeLayout) b1.h(this, R.string.recibir_notificaciones, (TextView) x0().f5490y.l).E.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i22;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj = new Object();
                                obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj2 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView = c10.p;
                                textView.setTypeface(s4.c.v);
                                textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView2 = c10.m;
                                textView2.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj2.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj2.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                string.getClass();
                                String string2 = preferencesActivity.getString(R.string.url_advertising);
                                string2.getClass();
                                w5.c.e(preferencesActivity, string2, string);
                                return;
                            case 9:
                                int i23 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i24 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i25 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i26 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                ((TextView) x0().E.o).setTypeface(s4.c.u);
                ((TextView) b1.h(this, R.string.preference_notifications, (TextView) x0().E.o).E.f185n).setTypeface(s4.c.v);
                if (s7.a.v(this, "recibir_notificaciones", true)) {
                    ((TextView) x0().E.f185n).setText(getString(R.string.enabled));
                } else {
                    ((TextView) x0().E.f185n).setText(getString(R.string.disabled));
                }
                final int i23 = 6;
                ((SwitchCompat) x0().E.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9897b;

                    {
                        this.f9897b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                        int i152 = i23;
                        PreferencesActivity preferencesActivity = this.f9897b;
                        switch (i152) {
                            case 0:
                                int i162 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences4.getClass();
                                SharedPreferences.Editor edit = sharedPreferences4.edit();
                                edit.putBoolean("download_notification", z12);
                                edit.apply();
                                return;
                            case 1:
                                int i172 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                edit2.putBoolean("installation_notification", z12);
                                edit2.apply();
                                return;
                            case 2:
                                int i182 = PreferencesActivity.T;
                                if (z12) {
                                    a6.s sVar3 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout3.getClass();
                                    sVar3.c(relativeLayout3, 1.0f);
                                    SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences6.getClass();
                                    SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                    edit3.putBoolean("updates_active", true);
                                    edit3.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                    return;
                                }
                                a6.s sVar4 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                relativeLayout4.getClass();
                                sVar4.c(relativeLayout4, 0.3f);
                                SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences7.getClass();
                                SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                edit4.putBoolean("updates_active", false);
                                edit4.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                return;
                            case 3:
                                int i192 = PreferencesActivity.T;
                                try {
                                    SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                    edit5.putBoolean("search_apk_worker_active", z12);
                                    edit5.apply();
                                    return;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            case 4:
                                int i202 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences8.getClass();
                                SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                edit6.putBoolean("install_apk_rooted", z12);
                                edit6.apply();
                                if (z12) {
                                    try {
                                        f1.g.D();
                                        return;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                int i212 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                edit7.putBoolean("install_apk_as_root_system", z12);
                                edit7.apply();
                                if (z12) {
                                    ((u4.a) preferencesActivity.P.getValue()).i(true);
                                    return;
                                }
                                return;
                            default:
                                int i222 = PreferencesActivity.T;
                                if (z12) {
                                    preferencesActivity.A0();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                        return;
                                    }
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                    edit8.putBoolean("recibir_notificaciones", true);
                                    edit8.apply();
                                    preferencesActivity.A0();
                                    return;
                                }
                                preferencesActivity.z0();
                                SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences11.getClass();
                                SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                edit9.putBoolean("recibir_notificaciones", false);
                                edit9.apply();
                                return;
                        }
                    }
                });
                x0().K.m.setTypeface(s4.c.u);
                b1.h(this, R.string.updates, x0().K.m).K.l.setTypeface(s4.c.v);
                x0().K.l.setText(y0());
                j jVar = new j(1, getString(R.string.answer_always));
                j jVar2 = new j(Integer.valueOf(i8), getString(R.string.answer_daily));
                j jVar3 = new j(Integer.valueOf(i3), getString(R.string.answer_weekly));
                j jVar4 = new j(4, getString(R.string.answer_never));
                j[] jVarArr = new j[4];
                jVarArr[0] = jVar;
                jVarArr[1] = jVar2;
                jVarArr[i8] = jVar3;
                jVarArr[i3] = jVar4;
                HashMap hashMap2 = new HashMap(d7.i0.T(4));
                d7.i0.W(hashMap2, jVarArr);
                x0().K.f5479b.setOnClickListener(new q2(i18, this, hashMap2));
                ((RelativeLayout) x0().q.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i10;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj = new Object();
                                obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj2 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView = c10.p;
                                textView.setTypeface(s4.c.v);
                                textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView2 = c10.m;
                                textView2.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj2.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj2.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                string.getClass();
                                String string2 = preferencesActivity.getString(R.string.url_advertising);
                                string2.getClass();
                                w5.c.e(preferencesActivity, string2, string);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i24 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i25 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i26 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                ((TextView) x0().q.o).setTypeface(s4.c.u);
                ((TextView) b1.h(this, R.string.downloads_title, (TextView) x0().q.o).q.f185n).setTypeface(s4.c.v);
                ((SwitchCompat) b1.h(this, R.string.downloads_notification_permission_description, (TextView) x0().q.f185n).q.m).setChecked(s7.a.v(this, "download_notification", true));
                ((SwitchCompat) x0().q.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9897b;

                    {
                        this.f9897b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                        int i152 = i10;
                        PreferencesActivity preferencesActivity = this.f9897b;
                        switch (i152) {
                            case 0:
                                int i162 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences4.getClass();
                                SharedPreferences.Editor edit = sharedPreferences4.edit();
                                edit.putBoolean("download_notification", z12);
                                edit.apply();
                                return;
                            case 1:
                                int i172 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                edit2.putBoolean("installation_notification", z12);
                                edit2.apply();
                                return;
                            case 2:
                                int i182 = PreferencesActivity.T;
                                if (z12) {
                                    a6.s sVar3 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout3 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout3.getClass();
                                    sVar3.c(relativeLayout3, 1.0f);
                                    SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences6.getClass();
                                    SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                    edit3.putBoolean("updates_active", true);
                                    edit3.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                    return;
                                }
                                a6.s sVar4 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                relativeLayout4.getClass();
                                sVar4.c(relativeLayout4, 0.3f);
                                SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences7.getClass();
                                SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                edit4.putBoolean("updates_active", false);
                                edit4.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                return;
                            case 3:
                                int i192 = PreferencesActivity.T;
                                try {
                                    SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                    edit5.putBoolean("search_apk_worker_active", z12);
                                    edit5.apply();
                                    return;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            case 4:
                                int i202 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences8.getClass();
                                SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                edit6.putBoolean("install_apk_rooted", z12);
                                edit6.apply();
                                if (z12) {
                                    try {
                                        f1.g.D();
                                        return;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                int i212 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                edit7.putBoolean("install_apk_as_root_system", z12);
                                edit7.apply();
                                if (z12) {
                                    ((u4.a) preferencesActivity.P.getValue()).i(true);
                                    return;
                                }
                                return;
                            default:
                                int i222 = PreferencesActivity.T;
                                if (z12) {
                                    preferencesActivity.A0();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                        return;
                                    }
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                    edit8.putBoolean("recibir_notificaciones", true);
                                    edit8.apply();
                                    preferencesActivity.A0();
                                    return;
                                }
                                preferencesActivity.z0();
                                SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences11.getClass();
                                SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                edit9.putBoolean("recibir_notificaciones", false);
                                edit9.apply();
                                return;
                        }
                    }
                });
                RelativeLayout relativeLayout3 = (RelativeLayout) x0().t.f184b;
                final int i24 = true ? 1 : 0;
                relativeLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i24;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj = new Object();
                                obj.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj2 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView = c10.p;
                                textView.setTypeface(s4.c.v);
                                textView.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView2 = c10.m;
                                textView2.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView2.setOnClickListener(new g4(c10, value, preferencesActivity, obj2));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj2.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj2.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string = preferencesActivity.getString(R.string.privacy_policy_title);
                                string.getClass();
                                String string2 = preferencesActivity.getString(R.string.url_advertising);
                                string2.getClass();
                                w5.c.e(preferencesActivity, string2, string);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i25 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i26 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                ((TextView) x0().t.o).setTypeface(s4.c.u);
                ((TextView) b1.h(this, R.string.installations, (TextView) x0().t.o).t.f185n).setTypeface(s4.c.v);
                ((SwitchCompat) b1.h(this, R.string.installs_notification_permission_description, (TextView) x0().t.f185n).t.m).setChecked(s7.a.v(this, "installation_notification", true));
                SwitchCompat switchCompat2 = (SwitchCompat) x0().t.m;
                final int i25 = true ? 1 : 0;
                switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9897b;

                    {
                        this.f9897b = this;
                    }

                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                        int i152 = i25;
                        PreferencesActivity preferencesActivity = this.f9897b;
                        switch (i152) {
                            case 0:
                                int i162 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences4.getClass();
                                SharedPreferences.Editor edit = sharedPreferences4.edit();
                                edit.putBoolean("download_notification", z12);
                                edit.apply();
                                return;
                            case 1:
                                int i172 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences5.getClass();
                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                edit2.putBoolean("installation_notification", z12);
                                edit2.apply();
                                return;
                            case 2:
                                int i182 = PreferencesActivity.T;
                                if (z12) {
                                    a6.s sVar3 = new a6.s(preferencesActivity);
                                    RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                    relativeLayout32.getClass();
                                    sVar3.c(relativeLayout32, 1.0f);
                                    SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences6.getClass();
                                    SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                    edit3.putBoolean("updates_active", true);
                                    edit3.apply();
                                    ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                    return;
                                }
                                a6.s sVar4 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout4 = preferencesActivity.x0().K.f5479b;
                                relativeLayout4.getClass();
                                sVar4.c(relativeLayout4, 0.3f);
                                SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences7.getClass();
                                SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                                edit4.putBoolean("updates_active", false);
                                edit4.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                                return;
                            case 3:
                                int i192 = PreferencesActivity.T;
                                try {
                                    SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                    edit5.putBoolean("search_apk_worker_active", z12);
                                    edit5.apply();
                                    return;
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    return;
                                }
                            case 4:
                                int i202 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences8.getClass();
                                SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                                edit6.putBoolean("install_apk_rooted", z12);
                                edit6.apply();
                                if (z12) {
                                    try {
                                        f1.g.D();
                                        return;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                int i212 = PreferencesActivity.T;
                                SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences9.getClass();
                                SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                                edit7.putBoolean("install_apk_as_root_system", z12);
                                edit7.apply();
                                if (z12) {
                                    ((u4.a) preferencesActivity.P.getValue()).i(true);
                                    return;
                                }
                                return;
                            default:
                                int i222 = PreferencesActivity.T;
                                if (z12) {
                                    preferencesActivity.A0();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                        return;
                                    }
                                    SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                    sharedPreferences10.getClass();
                                    SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                    edit8.putBoolean("recibir_notificaciones", true);
                                    edit8.apply();
                                    preferencesActivity.A0();
                                    return;
                                }
                                preferencesActivity.z0();
                                SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences11.getClass();
                                SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                                edit9.putBoolean("recibir_notificaciones", false);
                                edit9.apply();
                                return;
                        }
                    }
                });
                if (l.a(this)) {
                    A0();
                    ((SwitchCompat) x0().E.m).setChecked(true);
                } else {
                    z0();
                    ((SwitchCompat) x0().E.m).setChecked(false);
                }
                ?? obj = new Object();
                String string = getString(R.string.internal_storage);
                string.getClass();
                if (!s7.a.C(this, "storage_sdcard")) {
                    string = getString(R.string.internal_storage);
                    string.getClass();
                    obj.f7671a = 0;
                } else if (s7.a.v(this, "storage_sdcard", false)) {
                    string = getString(R.string.sd_card);
                    string.getClass();
                    obj.f7671a = 1;
                }
                hashMap = new HashMap();
                aVar = new u4.a(this);
                if (aVar.d()) {
                    File[] externalFilesDirs = getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 1) {
                        externalFilesDir = externalFilesDirs[1];
                    } else {
                        File externalFilesDir2 = getExternalFilesDir(null);
                        aVar.g();
                        aVar.f();
                        externalFilesDir = externalFilesDir2;
                    }
                } else {
                    externalFilesDir = getExternalFilesDir(null);
                }
                file = new File(externalFilesDir, "Apps");
                if (!file.exists()) {
                    file.mkdirs();
                }
                hashMap.put(0, getString(R.string.internal_memory_free, a4.x(this, file.getFreeSpace())));
                F = t1.F(this);
                if (!F.isEmpty()) {
                    hashMap.put(1, getString(R.string.sd_card_free, a4.x(this, ((o) F.get(0)).f11424d)));
                }
                if (hashMap.size() > 1) {
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        hashMap3.put(entry.getKey(), entry.getValue());
                    }
                    h0 b10 = h0.b(getLayoutInflater().inflate(R.layout.preference_list, (ViewGroup) null, false));
                    RelativeLayout relativeLayout4 = b10.f5479b;
                    TextView textView = b10.m;
                    textView.setTypeface(s4.c.u);
                    textView.setText(getString(R.string.download_path));
                    b10.l.setText(string);
                    relativeLayout4.setOnClickListener(new n2(this, hashMap3, obj, b10, 2));
                    x0().v.addView(relativeLayout4, x0().v.indexOfChild((RelativeLayout) x0().s.f184b));
                }
                ((TextView) x0().A.l).setTypeface(s4.c.u);
                b1.h(this, R.string.preference_privacy_and_security, (TextView) x0().A.l).o.m.setTypeface(s4.c.u);
                b1.h(this, R.string.age_verification_title, x0().o.m).o.l.setVisibility(8);
                final int i26 = i8;
                x0().o.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i26;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                x0().B.m.setTypeface(s4.c.u);
                b1.h(this, R.string.gdpr_title, x0().B.m).B.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i19;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                if (sharedPreferences.contains("is_in_eea")) {
                    z11 = sharedPreferences.getBoolean("is_in_eea", true);
                }
                if (!z11) {
                    x0().B.f5479b.setVisibility(8);
                }
                x0().f5487n.m.setTypeface(s4.c.u);
                b1.h(this, R.string.advanced_settings, x0().f5487n.m).f5487n.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i17;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i27 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                ((TextView) x0().f5489x.l).setTypeface(s4.c.u);
                b1.h(this, R.string.app_detail_more_info_title, (TextView) x0().f5489x.l).H.m.setTypeface(s4.c.u);
                final int i27 = 6;
                b1.h(this, R.string.preference_tos_and_pp, x0().H.m).H.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i27;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i272 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i28 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                x0().F.m.setTypeface(s4.c.u);
                final int i28 = 7;
                b1.h(this, R.string.support, x0().F.m).F.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i28;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i272 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i282 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                x0().m.m.setTypeface(s4.c.u);
                b1.h(this, R.string.advertising, x0().m.m).m.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i20;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i272 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i282 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i29 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                x0().f5486b.m.setTypeface(s4.c.u);
                final int i29 = 9;
                b1.h(this, R.string.about, x0().f5486b.m).f5486b.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i29;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i272 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i282 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i292 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i30 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
                x0().l.m.setTypeface(s4.c.u);
                final int i30 = 10;
                b1.h(this, R.string.about_uptodown, x0().l.m).l.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PreferencesActivity f9969b;

                    {
                        this.f9969b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i122 = i30;
                        PreferencesActivity preferencesActivity = this.f9969b;
                        switch (i122) {
                            case 0:
                                int i132 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                                return;
                            case 1:
                                int i142 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                                return;
                            case 2:
                                int i152 = PreferencesActivity.T;
                                ?? obj2 = new Object();
                                obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                                int value = Year.now().getValue();
                                preferencesActivity.P();
                                AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                                ?? obj22 = new Object();
                                g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                                ((TextView) c10.r).setTypeface(s4.c.u);
                                TextView textView2 = c10.p;
                                textView2.setTypeface(s4.c.v);
                                textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                                c10.o.setTypeface(s4.c.v);
                                EditText editText = c10.f5476b;
                                editText.setTypeface(s4.c.v);
                                ((TextView) c10.q).setTypeface(s4.c.v);
                                TextView textView22 = c10.m;
                                textView22.setTypeface(s4.c.u);
                                TextView textView3 = c10.f5477n;
                                textView3.setTypeface(s4.c.u);
                                int i162 = obj2.f7671a;
                                if (i162 > 0) {
                                    editText.setText(String.valueOf(i162));
                                }
                                textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                                s7.a.J(textView3);
                                textView3.setText(preferencesActivity.getString(R.string.reset));
                                textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                                builder.setView(c10.l);
                                builder.setCancelable(true);
                                AlertDialog create = builder.create();
                                obj22.f7675a = create;
                                if (create != null) {
                                    Window window = create.getWindow();
                                    if (window != null) {
                                        android.support.v4.media.session.m.z(window, 0);
                                    }
                                    ((AlertDialog) obj22.f7675a).show();
                                    return;
                                }
                                return;
                            case 3:
                                int i172 = PreferencesActivity.T;
                                Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                                ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                                float f10 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                                return;
                            case 4:
                                int i182 = PreferencesActivity.T;
                                float f11 = UptodownApp.G;
                                if (n4.e.m(preferencesActivity)) {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                    return;
                                } else {
                                    preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                    return;
                                }
                            case 5:
                                int i192 = PreferencesActivity.T;
                                Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                                putExtra.getClass();
                                float f12 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                                return;
                            case 6:
                                int i202 = PreferencesActivity.T;
                                Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                                putExtra2.getClass();
                                float f13 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                                return;
                            case 7:
                                int i212 = PreferencesActivity.T;
                                Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                                putExtra3.getClass();
                                float f14 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                                return;
                            case 8:
                                int i222 = PreferencesActivity.T;
                                String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                                string2.getClass();
                                String string22 = preferencesActivity.getString(R.string.url_advertising);
                                string22.getClass();
                                w5.c.e(preferencesActivity, string22, string2);
                                return;
                            case 9:
                                int i232 = PreferencesActivity.T;
                                Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                                putExtra4.getClass();
                                float f15 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                                return;
                            case 10:
                                int i242 = PreferencesActivity.T;
                                Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                                putExtra5.getClass();
                                float f16 = UptodownApp.G;
                                preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                                return;
                            case 11:
                                int i252 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                                return;
                            case 12:
                                int i262 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                                return;
                            case 13:
                                int i272 = PreferencesActivity.T;
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                                return;
                            case 14:
                                int i282 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                                return;
                            case 15:
                                int i292 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                                return;
                            case 16:
                                int i302 = PreferencesActivity.T;
                                preferencesActivity.finish();
                                return;
                            default:
                                int i31 = PreferencesActivity.T;
                                ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                                return;
                        }
                    }
                });
            }
            z10 = true;
            switchCompat.setChecked(z10);
            ((SwitchCompat) x0().s.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i12;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i162 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i172 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i182 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                relativeLayout32.getClass();
                                sVar3.c(relativeLayout32, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i192 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i202 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i212 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            ((TextView) x0().f5491z.l).setTypeface(s4.c.u);
            b1.h(this, R.string.data_saver_preference_title, (TextView) x0().f5491z.l).f5488w.m.setTypeface(s4.c.u);
            b1.h(this, R.string.data_usage_title, x0().f5488w.m).f5488w.l.setTypeface(s4.c.v);
            final int i162 = 13;
            b1.h(this, R.string.data_saver_preference_description, x0().f5488w.l).f5488w.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i162;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i172 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i182 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i192 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i202 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i212 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i232 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i242 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            final int i172 = 5;
            final int i182 = 15;
            final int i192 = 4;
            final int i202 = 8;
            if (((u4.a) this.P.getValue()).c("system_app", false)) {
            }
            i3 = 3;
            ((TextView) x0().D.l).setTypeface(s4.c.u);
            i8 = 2;
            final int i212 = 14;
            ((RelativeLayout) b1.h(this, R.string.pref_category_title_install_as_root_system, (TextView) x0().D.l).p.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i212;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i232 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i242 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().p.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.pref_auto_update_title, (TextView) x0().p.o).p.f185n).setTypeface(s4.c.v);
            ((SwitchCompat) b1.h(this, R.string.pref_auto_update_sumary, (TextView) x0().p.f185n).p.m).setChecked(s7.a.v(this, "install_apk_rooted", false));
            ((SwitchCompat) x0().p.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i192;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i1622 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i1722 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i1822 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                relativeLayout32.getClass();
                                sVar3.c(relativeLayout32, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i1922 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i2022 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i2122 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            ((RelativeLayout) x0().C.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i182;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i232 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i242 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().C.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.pref_install_apk_as_root_system_title, (TextView) x0().C.o).C.f185n).setTypeface(s4.c.v);
            ((SwitchCompat) b1.h(this, R.string.pref_install_apk_as_root_system_summary, (TextView) x0().C.f185n).C.m).setChecked(s7.a.v(this, "install_apk_as_root_system", false));
            ((SwitchCompat) x0().C.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i172;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i1622 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i1722 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i1822 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                relativeLayout32.getClass();
                                sVar3.c(relativeLayout32, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i1922 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i2022 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i2122 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            ((TextView) x0().f5490y.l).setTypeface(s4.c.u);
            final int i222 = 17;
            ((RelativeLayout) b1.h(this, R.string.recibir_notificaciones, (TextView) x0().f5490y.l).E.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i222;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i232 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i242 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().E.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.preference_notifications, (TextView) x0().E.o).E.f185n).setTypeface(s4.c.v);
            if (s7.a.v(this, "recibir_notificaciones", true)) {
            }
            final int i232 = 6;
            ((SwitchCompat) x0().E.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i232;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i1622 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i1722 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i1822 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                relativeLayout32.getClass();
                                sVar3.c(relativeLayout32, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i1922 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i2022 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i2122 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i2222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            x0().K.m.setTypeface(s4.c.u);
            b1.h(this, R.string.updates, x0().K.m).K.l.setTypeface(s4.c.v);
            x0().K.l.setText(y0());
            j jVar5 = new j(1, getString(R.string.answer_always));
            j jVar22 = new j(Integer.valueOf(i8), getString(R.string.answer_daily));
            j jVar32 = new j(Integer.valueOf(i3), getString(R.string.answer_weekly));
            j jVar42 = new j(4, getString(R.string.answer_never));
            j[] jVarArr2 = new j[4];
            jVarArr2[0] = jVar5;
            jVarArr2[1] = jVar22;
            jVarArr2[i8] = jVar32;
            jVarArr2[i3] = jVar42;
            HashMap hashMap22 = new HashMap(d7.i0.T(4));
            d7.i0.W(hashMap22, jVarArr2);
            x0().K.f5479b.setOnClickListener(new q2(i182, this, hashMap22));
            ((RelativeLayout) x0().q.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i10;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i242 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().q.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.downloads_title, (TextView) x0().q.o).q.f185n).setTypeface(s4.c.v);
            ((SwitchCompat) b1.h(this, R.string.downloads_notification_permission_description, (TextView) x0().q.f185n).q.m).setChecked(s7.a.v(this, "download_notification", true));
            ((SwitchCompat) x0().q.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i10;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i1622 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i1722 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i1822 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout32 = preferencesActivity.x0().K.f5479b;
                                relativeLayout32.getClass();
                                sVar3.c(relativeLayout32, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i1922 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i2022 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i2122 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i2222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            RelativeLayout relativeLayout32 = (RelativeLayout) x0().t.f184b;
            final int i242 = true ? 1 : 0;
            relativeLayout32.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i242;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj2 = new Object();
                            obj2.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj22 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj2.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj22));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj2, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj22.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj22.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string2 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string2.getClass();
                            String string22 = preferencesActivity.getString(R.string.url_advertising);
                            string22.getClass();
                            w5.c.e(preferencesActivity, string22, string2);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i252 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i262 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().t.o).setTypeface(s4.c.u);
            ((TextView) b1.h(this, R.string.installations, (TextView) x0().t.o).t.f185n).setTypeface(s4.c.v);
            ((SwitchCompat) b1.h(this, R.string.installs_notification_permission_description, (TextView) x0().t.f185n).t.m).setChecked(s7.a.v(this, "installation_notification", true));
            SwitchCompat switchCompat22 = (SwitchCompat) x0().t.m;
            final int i252 = true ? 1 : 0;
            switchCompat22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9897b;

                {
                    this.f9897b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    int i152 = i252;
                    PreferencesActivity preferencesActivity = this.f9897b;
                    switch (i152) {
                        case 0:
                            int i1622 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences4.getClass();
                            SharedPreferences.Editor edit = sharedPreferences4.edit();
                            edit.putBoolean("download_notification", z12);
                            edit.apply();
                            return;
                        case 1:
                            int i1722 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences5.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                            edit2.putBoolean("installation_notification", z12);
                            edit2.apply();
                            return;
                        case 2:
                            int i1822 = PreferencesActivity.T;
                            if (z12) {
                                a6.s sVar3 = new a6.s(preferencesActivity);
                                RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                                relativeLayout322.getClass();
                                sVar3.c(relativeLayout322, 1.0f);
                                SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences6.getClass();
                                SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                                edit3.putBoolean("updates_active", true);
                                edit3.apply();
                                ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                                return;
                            }
                            a6.s sVar4 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                            relativeLayout42.getClass();
                            sVar4.c(relativeLayout42, 0.3f);
                            SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences7.getClass();
                            SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                            edit4.putBoolean("updates_active", false);
                            edit4.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                            return;
                        case 3:
                            int i1922 = PreferencesActivity.T;
                            try {
                                SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                                edit5.putBoolean("search_apk_worker_active", z12);
                                edit5.apply();
                                return;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        case 4:
                            int i2022 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences8.getClass();
                            SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                            edit6.putBoolean("install_apk_rooted", z12);
                            edit6.apply();
                            if (z12) {
                                try {
                                    f1.g.D();
                                    return;
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 5:
                            int i2122 = PreferencesActivity.T;
                            SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences9.getClass();
                            SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                            edit7.putBoolean("install_apk_as_root_system", z12);
                            edit7.apply();
                            if (z12) {
                                ((u4.a) preferencesActivity.P.getValue()).i(true);
                                return;
                            }
                            return;
                        default:
                            int i2222 = PreferencesActivity.T;
                            if (z12) {
                                preferencesActivity.A0();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                    return;
                                }
                                SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                                sharedPreferences10.getClass();
                                SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                                edit8.putBoolean("recibir_notificaciones", true);
                                edit8.apply();
                                preferencesActivity.A0();
                                return;
                            }
                            preferencesActivity.z0();
                            SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences11.getClass();
                            SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                            edit9.putBoolean("recibir_notificaciones", false);
                            edit9.apply();
                            return;
                    }
                }
            });
            if (l.a(this)) {
            }
            ?? obj2 = new Object();
            String string2 = getString(R.string.internal_storage);
            string2.getClass();
            if (!s7.a.C(this, "storage_sdcard")) {
            }
            hashMap = new HashMap();
            aVar = new u4.a(this);
            if (aVar.d()) {
            }
            file = new File(externalFilesDir, "Apps");
            if (!file.exists()) {
            }
            hashMap.put(0, getString(R.string.internal_memory_free, a4.x(this, file.getFreeSpace())));
            F = t1.F(this);
            if (!F.isEmpty()) {
            }
            if (hashMap.size() > 1) {
            }
            ((TextView) x0().A.l).setTypeface(s4.c.u);
            b1.h(this, R.string.preference_privacy_and_security, (TextView) x0().A.l).o.m.setTypeface(s4.c.u);
            b1.h(this, R.string.age_verification_title, x0().o.m).o.l.setVisibility(8);
            final int i262 = i8;
            x0().o.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i262;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            x0().B.m.setTypeface(s4.c.u);
            b1.h(this, R.string.gdpr_title, x0().B.m).B.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i192;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("is_in_eea")) {
            }
            if (!z11) {
            }
            x0().f5487n.m.setTypeface(s4.c.u);
            b1.h(this, R.string.advanced_settings, x0().f5487n.m).f5487n.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i172;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i272 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            ((TextView) x0().f5489x.l).setTypeface(s4.c.u);
            b1.h(this, R.string.app_detail_more_info_title, (TextView) x0().f5489x.l).H.m.setTypeface(s4.c.u);
            final int i272 = 6;
            b1.h(this, R.string.preference_tos_and_pp, x0().H.m).H.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i272;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i2722 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i282 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            x0().F.m.setTypeface(s4.c.u);
            final int i282 = 7;
            b1.h(this, R.string.support, x0().F.m).F.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i282;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i2722 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i2822 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            x0().m.m.setTypeface(s4.c.u);
            b1.h(this, R.string.advertising, x0().m.m).m.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i202;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i2722 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i2822 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i292 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            x0().f5486b.m.setTypeface(s4.c.u);
            final int i292 = 9;
            b1.h(this, R.string.about, x0().f5486b.m).f5486b.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i292;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i2722 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i2822 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i2922 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i302 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
            x0().l.m.setTypeface(s4.c.u);
            final int i302 = 10;
            b1.h(this, R.string.about_uptodown, x0().l.m).l.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferencesActivity f9969b;

                {
                    this.f9969b = this;
                }

                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i302;
                    PreferencesActivity preferencesActivity = this.f9969b;
                    switch (i122) {
                        case 0:
                            int i132 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                            return;
                        case 1:
                            int i142 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                            return;
                        case 2:
                            int i152 = PreferencesActivity.T;
                            ?? obj22 = new Object();
                            obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                            int value = Year.now().getValue();
                            preferencesActivity.P();
                            AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                            ?? obj222 = new Object();
                            g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                            ((TextView) c10.r).setTypeface(s4.c.u);
                            TextView textView2 = c10.p;
                            textView2.setTypeface(s4.c.v);
                            textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                            c10.o.setTypeface(s4.c.v);
                            EditText editText = c10.f5476b;
                            editText.setTypeface(s4.c.v);
                            ((TextView) c10.q).setTypeface(s4.c.v);
                            TextView textView22 = c10.m;
                            textView22.setTypeface(s4.c.u);
                            TextView textView3 = c10.f5477n;
                            textView3.setTypeface(s4.c.u);
                            int i1622 = obj22.f7671a;
                            if (i1622 > 0) {
                                editText.setText(String.valueOf(i1622));
                            }
                            textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                            s7.a.J(textView3);
                            textView3.setText(preferencesActivity.getString(R.string.reset));
                            textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                            builder.setView(c10.l);
                            builder.setCancelable(true);
                            AlertDialog create = builder.create();
                            obj222.f7675a = create;
                            if (create != null) {
                                Window window = create.getWindow();
                                if (window != null) {
                                    android.support.v4.media.session.m.z(window, 0);
                                }
                                ((AlertDialog) obj222.f7675a).show();
                                return;
                            }
                            return;
                        case 3:
                            int i1722 = PreferencesActivity.T;
                            Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                            ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                            float f10 = UptodownApp.G;
                            activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                            return;
                        case 4:
                            int i1822 = PreferencesActivity.T;
                            float f11 = UptodownApp.G;
                            if (n4.e.m(preferencesActivity)) {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                                return;
                            } else {
                                preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                                return;
                            }
                        case 5:
                            int i1922 = PreferencesActivity.T;
                            Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                            putExtra.getClass();
                            float f12 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                            return;
                        case 6:
                            int i2022 = PreferencesActivity.T;
                            Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                            putExtra2.getClass();
                            float f13 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                            return;
                        case 7:
                            int i2122 = PreferencesActivity.T;
                            Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                            putExtra3.getClass();
                            float f14 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                            return;
                        case 8:
                            int i2222 = PreferencesActivity.T;
                            String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                            string22.getClass();
                            String string222 = preferencesActivity.getString(R.string.url_advertising);
                            string222.getClass();
                            w5.c.e(preferencesActivity, string222, string22);
                            return;
                        case 9:
                            int i2322 = PreferencesActivity.T;
                            Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                            putExtra4.getClass();
                            float f15 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                            return;
                        case 10:
                            int i2422 = PreferencesActivity.T;
                            Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                            putExtra5.getClass();
                            float f16 = UptodownApp.G;
                            preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                            return;
                        case 11:
                            int i2522 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                            return;
                        case 12:
                            int i2622 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                            return;
                        case 13:
                            int i2722 = PreferencesActivity.T;
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                            return;
                        case 14:
                            int i2822 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                            return;
                        case 15:
                            int i2922 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                            return;
                        case 16:
                            int i3022 = PreferencesActivity.T;
                            preferencesActivity.finish();
                            return;
                        default:
                            int i31 = PreferencesActivity.T;
                            ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                            return;
                    }
                }
            });
        }
        str = null;
        String[] stringArray3 = getResources().getStringArray(R.array.languageCodes);
        stringArray3.getClass();
        String[] stringArray22 = getResources().getStringArray(R.array.localizedLang);
        stringArray22.getClass();
        length = stringArray3.length;
        i = 0;
        while (true) {
            if (i >= length) {
            }
            i++;
        }
        x0().u.l.setText(str2);
        final int i122 = 3;
        x0().u.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i122;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i132 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i142 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i152 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i1622 = obj22.f7671a;
                        if (i1622 > 0) {
                            editText.setText(String.valueOf(i1622));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i1722 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i1822 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i1922 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i2022 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i2122 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().J.l).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.updates, (TextView) x0().J.l).L.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.updates, (TextView) x0().L.o).L.f185n).setTypeface(s4.c.v);
        final int i132 = 11;
        ((RelativeLayout) x0().L.l).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i132;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i142 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i152 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i1622 = obj22.f7671a;
                        if (i1622 > 0) {
                            editText.setText(String.valueOf(i1622));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i1722 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i1822 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i1922 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i2022 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i2122 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        if (!s7.a.v(this, "updates_active", true)) {
        }
        final int i142 = 2;
        ((SwitchCompat) x0().L.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i152 = i142;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i152) {
                    case 0:
                        int i1622 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i1722 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i1822 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i1922 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i2022 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i2122 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i2222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        ((TextView) x0().r.l).setTypeface(s4.c.u);
        final int i152 = 12;
        ((RelativeLayout) b1.h(this, R.string.preference_file_management, (TextView) x0().r.l).s.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i152;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i1622 = obj22.f7671a;
                        if (i1622 > 0) {
                            editText.setText(String.valueOf(i1622));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i1722 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i1822 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i1922 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i2022 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i2122 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().s.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.search_apk_file_worker_preference_title, (TextView) x0().s.o).s.f185n).setTypeface(s4.c.v);
        SwitchCompat switchCompat3 = (SwitchCompat) b1.h(this, R.string.preference_locate_files_in_storage, (TextView) x0().s.f185n).s.m;
        sharedPreferences2 = getSharedPreferences("CoreSettings", 0);
        if (sharedPreferences2.contains("search_apk_worker_active")) {
        }
        z10 = true;
        switchCompat3.setChecked(z10);
        ((SwitchCompat) x0().s.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i122;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i1622 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i1722 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i1822 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i1922 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i2022 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i2122 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i2222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        ((TextView) x0().f5491z.l).setTypeface(s4.c.u);
        b1.h(this, R.string.data_saver_preference_title, (TextView) x0().f5491z.l).f5488w.m.setTypeface(s4.c.u);
        b1.h(this, R.string.data_usage_title, x0().f5488w.m).f5488w.l.setTypeface(s4.c.v);
        final int i1622 = 13;
        b1.h(this, R.string.data_saver_preference_description, x0().f5488w.l).f5488w.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i1622;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i1722 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i1822 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i1922 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i2022 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i2122 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        final int i1722 = 5;
        final int i1822 = 15;
        final int i1922 = 4;
        final int i2022 = 8;
        if (((u4.a) this.P.getValue()).c("system_app", false)) {
        }
        i3 = 3;
        ((TextView) x0().D.l).setTypeface(s4.c.u);
        i8 = 2;
        final int i2122 = 14;
        ((RelativeLayout) b1.h(this, R.string.pref_category_title_install_as_root_system, (TextView) x0().D.l).p.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2122;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().p.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.pref_auto_update_title, (TextView) x0().p.o).p.f185n).setTypeface(s4.c.v);
        ((SwitchCompat) b1.h(this, R.string.pref_auto_update_sumary, (TextView) x0().p.f185n).p.m).setChecked(s7.a.v(this, "install_apk_rooted", false));
        ((SwitchCompat) x0().p.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i1922;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i16222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i17222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i18222 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i19222 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i20222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i21222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i2222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        ((RelativeLayout) x0().C.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i1822;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i2222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().C.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.pref_install_apk_as_root_system_title, (TextView) x0().C.o).C.f185n).setTypeface(s4.c.v);
        ((SwitchCompat) b1.h(this, R.string.pref_install_apk_as_root_system_summary, (TextView) x0().C.f185n).C.m).setChecked(s7.a.v(this, "install_apk_as_root_system", false));
        ((SwitchCompat) x0().C.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i1722;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i16222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i17222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i18222 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i19222 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i20222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i21222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i2222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        ((TextView) x0().f5490y.l).setTypeface(s4.c.u);
        final int i2222 = 17;
        ((RelativeLayout) b1.h(this, R.string.recibir_notificaciones, (TextView) x0().f5490y.l).E.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2222;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i2322 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().E.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.preference_notifications, (TextView) x0().E.o).E.f185n).setTypeface(s4.c.v);
        if (s7.a.v(this, "recibir_notificaciones", true)) {
        }
        final int i2322 = 6;
        ((SwitchCompat) x0().E.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i2322;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i16222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i17222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i18222 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i19222 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i20222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i21222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i22222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        x0().K.m.setTypeface(s4.c.u);
        b1.h(this, R.string.updates, x0().K.m).K.l.setTypeface(s4.c.v);
        x0().K.l.setText(y0());
        j jVar52 = new j(1, getString(R.string.answer_always));
        j jVar222 = new j(Integer.valueOf(i8), getString(R.string.answer_daily));
        j jVar322 = new j(Integer.valueOf(i3), getString(R.string.answer_weekly));
        j jVar422 = new j(4, getString(R.string.answer_never));
        j[] jVarArr22 = new j[4];
        jVarArr22[0] = jVar52;
        jVarArr22[1] = jVar222;
        jVarArr22[i8] = jVar322;
        jVarArr22[i3] = jVar422;
        HashMap hashMap222 = new HashMap(d7.i0.T(4));
        d7.i0.W(hashMap222, jVarArr22);
        x0().K.f5479b.setOnClickListener(new q2(i1822, this, hashMap222));
        ((RelativeLayout) x0().q.f184b).setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i10;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i2422 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().q.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.downloads_title, (TextView) x0().q.o).q.f185n).setTypeface(s4.c.v);
        ((SwitchCompat) b1.h(this, R.string.downloads_notification_permission_description, (TextView) x0().q.f185n).q.m).setChecked(s7.a.v(this, "download_notification", true));
        ((SwitchCompat) x0().q.m).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i10;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i16222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i17222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i18222 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout322 = preferencesActivity.x0().K.f5479b;
                            relativeLayout322.getClass();
                            sVar3.c(relativeLayout322, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i19222 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i20222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i21222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i22222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        RelativeLayout relativeLayout322 = (RelativeLayout) x0().t.f184b;
        final int i2422 = true ? 1 : 0;
        relativeLayout322.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2422;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj22 = new Object();
                        obj22.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj22.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj22, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string22 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string22.getClass();
                        String string222 = preferencesActivity.getString(R.string.url_advertising);
                        string222.getClass();
                        w5.c.e(preferencesActivity, string222, string22);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i2522 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i2622 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().t.o).setTypeface(s4.c.u);
        ((TextView) b1.h(this, R.string.installations, (TextView) x0().t.o).t.f185n).setTypeface(s4.c.v);
        ((SwitchCompat) b1.h(this, R.string.installs_notification_permission_description, (TextView) x0().t.f185n).t.m).setChecked(s7.a.v(this, "installation_notification", true));
        SwitchCompat switchCompat222 = (SwitchCompat) x0().t.m;
        final int i2522 = true ? 1 : 0;
        switchCompat222.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q4.a0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9897b;

            {
                this.f9897b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                int i1522 = i2522;
                PreferencesActivity preferencesActivity = this.f9897b;
                switch (i1522) {
                    case 0:
                        int i16222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences4 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences4.getClass();
                        SharedPreferences.Editor edit = sharedPreferences4.edit();
                        edit.putBoolean("download_notification", z12);
                        edit.apply();
                        return;
                    case 1:
                        int i17222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences5 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences5.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                        edit2.putBoolean("installation_notification", z12);
                        edit2.apply();
                        return;
                    case 2:
                        int i18222 = PreferencesActivity.T;
                        if (z12) {
                            a6.s sVar3 = new a6.s(preferencesActivity);
                            RelativeLayout relativeLayout3222 = preferencesActivity.x0().K.f5479b;
                            relativeLayout3222.getClass();
                            sVar3.c(relativeLayout3222, 1.0f);
                            SharedPreferences sharedPreferences6 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences6.getClass();
                            SharedPreferences.Editor edit3 = sharedPreferences6.edit();
                            edit3.putBoolean("updates_active", true);
                            edit3.apply();
                            ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.enabled));
                            return;
                        }
                        a6.s sVar4 = new a6.s(preferencesActivity);
                        RelativeLayout relativeLayout42 = preferencesActivity.x0().K.f5479b;
                        relativeLayout42.getClass();
                        sVar4.c(relativeLayout42, 0.3f);
                        SharedPreferences sharedPreferences7 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences7.getClass();
                        SharedPreferences.Editor edit4 = sharedPreferences7.edit();
                        edit4.putBoolean("updates_active", false);
                        edit4.apply();
                        ((TextView) preferencesActivity.x0().L.f185n).setText(preferencesActivity.getString(R.string.disabled));
                        return;
                    case 3:
                        int i19222 = PreferencesActivity.T;
                        try {
                            SharedPreferences.Editor edit5 = preferencesActivity.getSharedPreferences("CoreSettings", 0).edit();
                            edit5.putBoolean("search_apk_worker_active", z12);
                            edit5.apply();
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    case 4:
                        int i20222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences8 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences8.getClass();
                        SharedPreferences.Editor edit6 = sharedPreferences8.edit();
                        edit6.putBoolean("install_apk_rooted", z12);
                        edit6.apply();
                        if (z12) {
                            try {
                                f1.g.D();
                                return;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 5:
                        int i21222 = PreferencesActivity.T;
                        SharedPreferences sharedPreferences9 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences9.getClass();
                        SharedPreferences.Editor edit7 = sharedPreferences9.edit();
                        edit7.putBoolean("install_apk_as_root_system", z12);
                        edit7.apply();
                        if (z12) {
                            ((u4.a) preferencesActivity.P.getValue()).i(true);
                            return;
                        }
                        return;
                    default:
                        int i22222 = PreferencesActivity.T;
                        if (z12) {
                            preferencesActivity.A0();
                            if (Build.VERSION.SDK_INT >= 33) {
                                preferencesActivity.S.launch("android.permission.POST_NOTIFICATIONS");
                                return;
                            }
                            SharedPreferences sharedPreferences10 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences10.getClass();
                            SharedPreferences.Editor edit8 = sharedPreferences10.edit();
                            edit8.putBoolean("recibir_notificaciones", true);
                            edit8.apply();
                            preferencesActivity.A0();
                            return;
                        }
                        preferencesActivity.z0();
                        SharedPreferences sharedPreferences11 = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                        sharedPreferences11.getClass();
                        SharedPreferences.Editor edit9 = sharedPreferences11.edit();
                        edit9.putBoolean("recibir_notificaciones", false);
                        edit9.apply();
                        return;
                }
            }
        });
        if (l.a(this)) {
        }
        ?? obj22 = new Object();
        String string22 = getString(R.string.internal_storage);
        string22.getClass();
        if (!s7.a.C(this, "storage_sdcard")) {
        }
        hashMap = new HashMap();
        aVar = new u4.a(this);
        if (aVar.d()) {
        }
        file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
        }
        hashMap.put(0, getString(R.string.internal_memory_free, a4.x(this, file.getFreeSpace())));
        F = t1.F(this);
        if (!F.isEmpty()) {
        }
        if (hashMap.size() > 1) {
        }
        ((TextView) x0().A.l).setTypeface(s4.c.u);
        b1.h(this, R.string.preference_privacy_and_security, (TextView) x0().A.l).o.m.setTypeface(s4.c.u);
        b1.h(this, R.string.age_verification_title, x0().o.m).o.l.setVisibility(8);
        final int i2622 = i8;
        x0().o.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2622;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().B.m.setTypeface(s4.c.u);
        b1.h(this, R.string.gdpr_title, x0().B.m).B.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i1922;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        if (sharedPreferences.contains("is_in_eea")) {
        }
        if (!z11) {
        }
        x0().f5487n.m.setTypeface(s4.c.u);
        b1.h(this, R.string.advanced_settings, x0().f5487n.m).f5487n.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i1722;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i2722 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        ((TextView) x0().f5489x.l).setTypeface(s4.c.u);
        b1.h(this, R.string.app_detail_more_info_title, (TextView) x0().f5489x.l).H.m.setTypeface(s4.c.u);
        final int i2722 = 6;
        b1.h(this, R.string.preference_tos_and_pp, x0().H.m).H.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2722;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27222 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i2822 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().F.m.setTypeface(s4.c.u);
        final int i2822 = 7;
        b1.h(this, R.string.support, x0().F.m).F.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2822;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27222 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i28222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().m.m.setTypeface(s4.c.u);
        b1.h(this, R.string.advertising, x0().m.m).m.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2022;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27222 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i28222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i2922 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().f5486b.m.setTypeface(s4.c.u);
        final int i2922 = 9;
        b1.h(this, R.string.about, x0().f5486b.m).f5486b.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i2922;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27222 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i28222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i29222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i3022 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
        x0().l.m.setTypeface(s4.c.u);
        final int i3022 = 10;
        b1.h(this, R.string.about_uptodown, x0().l.m).l.f5479b.setOnClickListener(new View.OnClickListener(this) { // from class: q4.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreferencesActivity f9969b;

            {
                this.f9969b = this;
            }

            /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i1222 = i3022;
                PreferencesActivity preferencesActivity = this.f9969b;
                switch (i1222) {
                    case 0:
                        int i1322 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().q.m).performClick();
                        return;
                    case 1:
                        int i1422 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().t.m).performClick();
                        return;
                    case 2:
                        int i1522 = PreferencesActivity.T;
                        ?? obj222 = new Object();
                        obj222.f7671a = preferencesActivity.getSharedPreferences("SettingsPreferences", 0).getInt("ageVerificationYear", -1);
                        int value = Year.now().getValue();
                        preferencesActivity.P();
                        AlertDialog.Builder builder = new AlertDialog.Builder(preferencesActivity);
                        ?? obj2222 = new Object();
                        g5.h c10 = g5.h.c(preferencesActivity.getLayoutInflater());
                        ((TextView) c10.r).setTypeface(s4.c.u);
                        TextView textView2 = c10.p;
                        textView2.setTypeface(s4.c.v);
                        textView2.setText(preferencesActivity.getString(R.string.age_verification_setting_desc));
                        c10.o.setTypeface(s4.c.v);
                        EditText editText = c10.f5476b;
                        editText.setTypeface(s4.c.v);
                        ((TextView) c10.q).setTypeface(s4.c.v);
                        TextView textView22 = c10.m;
                        textView22.setTypeface(s4.c.u);
                        TextView textView3 = c10.f5477n;
                        textView3.setTypeface(s4.c.u);
                        int i16222 = obj222.f7671a;
                        if (i16222 > 0) {
                            editText.setText(String.valueOf(i16222));
                        }
                        textView22.setOnClickListener(new g4(c10, value, preferencesActivity, obj2222));
                        s7.a.J(textView3);
                        textView3.setText(preferencesActivity.getString(R.string.reset));
                        textView3.setOnClickListener(new a6.c((Object) obj222, c10, preferencesActivity, 14));
                        builder.setView(c10.l);
                        builder.setCancelable(true);
                        AlertDialog create = builder.create();
                        obj2222.f7675a = create;
                        if (create != null) {
                            Window window = create.getWindow();
                            if (window != null) {
                                android.support.v4.media.session.m.z(window, 0);
                            }
                            ((AlertDialog) obj2222.f7675a).show();
                            return;
                        }
                        return;
                    case 3:
                        int i17222 = PreferencesActivity.T;
                        Intent intent = new Intent(preferencesActivity, (Class<?>) LanguageSettingsActivity.class);
                        ActivityResultLauncher activityResultLauncher = preferencesActivity.R;
                        float f10 = UptodownApp.G;
                        activityResultLauncher.launch(intent, n4.e.b(preferencesActivity));
                        return;
                    case 4:
                        int i18222 = PreferencesActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.m(preferencesActivity)) {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) TvPrivacyPreferences.class));
                            return;
                        } else {
                            preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) GdprPrivacySettings.class), n4.e.a(preferencesActivity));
                            return;
                        }
                    case 5:
                        int i19222 = PreferencesActivity.T;
                        Intent putExtra = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ADVANCED_SETTINGS");
                        putExtra.getClass();
                        float f12 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra, n4.e.a(preferencesActivity));
                        return;
                    case 6:
                        int i20222 = PreferencesActivity.T;
                        Intent putExtra2 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "TOS");
                        putExtra2.getClass();
                        float f13 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra2, n4.e.a(preferencesActivity));
                        return;
                    case 7:
                        int i21222 = PreferencesActivity.T;
                        Intent putExtra3 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "SUPPORT");
                        putExtra3.getClass();
                        float f14 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra3, n4.e.a(preferencesActivity));
                        return;
                    case 8:
                        int i22222 = PreferencesActivity.T;
                        String string222 = preferencesActivity.getString(R.string.privacy_policy_title);
                        string222.getClass();
                        String string2222 = preferencesActivity.getString(R.string.url_advertising);
                        string2222.getClass();
                        w5.c.e(preferencesActivity, string2222, string222);
                        return;
                    case 9:
                        int i23222 = PreferencesActivity.T;
                        Intent putExtra4 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_APP");
                        putExtra4.getClass();
                        float f15 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra4, n4.e.a(preferencesActivity));
                        return;
                    case 10:
                        int i24222 = PreferencesActivity.T;
                        Intent putExtra5 = new Intent(preferencesActivity, (Class<?>) AdvancedPreferencesComposeActivity.class).putExtra("advanced_settings_section", "ABOUT_UPTODOWN");
                        putExtra5.getClass();
                        float f16 = UptodownApp.G;
                        preferencesActivity.startActivity(putExtra5, n4.e.a(preferencesActivity));
                        return;
                    case 11:
                        int i25222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().L.m).performClick();
                        return;
                    case 12:
                        int i26222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().s.m).performClick();
                        return;
                    case 13:
                        int i27222 = PreferencesActivity.T;
                        preferencesActivity.startActivity(new Intent(preferencesActivity, (Class<?>) MobileDataUsageActivity.class));
                        return;
                    case 14:
                        int i28222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().p.m).performClick();
                        return;
                    case 15:
                        int i29222 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().C.m).performClick();
                        return;
                    case 16:
                        int i30222 = PreferencesActivity.T;
                        preferencesActivity.finish();
                        return;
                    default:
                        int i31 = PreferencesActivity.T;
                        ((SwitchCompat) preferencesActivity.x0().E.m).performClick();
                        return;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    public final void w0(String str, HashMap hashMap, int i, q7.c cVar) {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.F;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            t x5 = t.x(getLayoutInflater());
            TextView textView = (TextView) x5.m;
            TextView textView2 = (TextView) x5.f7248n;
            ?? obj = new Object();
            obj.f7671a = i;
            textView2.setTypeface(s4.c.u);
            textView2.setText(str);
            for (Map.Entry entry : hashMap.entrySet()) {
                View inflate = getLayoutInflater().inflate(R.layout.settings_radio_button, (ViewGroup) null, false);
                if (inflate != null) {
                    RadioButton radioButton = (RadioButton) inflate;
                    radioButton.setId(((Number) entry.getKey()).intValue());
                    radioButton.setTypeface(s4.c.v);
                    radioButton.setText((CharSequence) entry.getValue());
                    radioButton.setOnClickListener(new q2(14, obj, entry));
                    if (((Number) entry.getKey()).intValue() == i) {
                        radioButton.setChecked(true);
                    }
                    ((RadioGroup) x5.l).addView(radioButton);
                } else {
                    o2.a.h("rootView");
                    return;
                }
            }
            textView.setTypeface(s4.c.u);
            textView.setOnClickListener(new a6.c(cVar, (Object) obj, this, 15));
            builder.setView((LinearLayout) x5.f7247b);
            this.F = builder.create();
            if (!isFinishing() && (alertDialog = this.F) != null) {
                alertDialog.setCancelable(true);
                s0();
            }
        }
    }

    public final i0 x0() {
        return (i0) this.O.getValue();
    }

    public final String y0() {
        int parseInt = Integer.parseInt(s7.a.y(this));
        if (parseInt != 1) {
            if (parseInt != 2) {
                if (parseInt != 3) {
                    if (parseInt != 4) {
                        return "";
                    }
                    String string = getString(R.string.updates_notification_description_never);
                    string.getClass();
                    return string;
                }
                String string2 = getString(R.string.updates_notification_description_weekly);
                string2.getClass();
                return string2;
            }
            String string3 = getString(R.string.updates_notification_description_daily);
            string3.getClass();
            return string3;
        }
        String string4 = getString(R.string.updates_notification_description_always);
        string4.getClass();
        return string4;
    }

    public final void z0() {
        ((TextView) x0().E.f185n).setText(getString(R.string.disabled));
        s sVar = new s(this);
        RelativeLayout relativeLayout = x0().K.f5479b;
        relativeLayout.getClass();
        sVar.c(relativeLayout, 0.3f);
        new s(this).c((RelativeLayout) x0().q.f184b, 0.3f);
        ((SwitchCompat) x0().q.m).setClickable(false);
        new s(this).c((RelativeLayout) x0().t.f184b, 0.3f);
        ((SwitchCompat) x0().t.m).setClickable(false);
        new s(this).c((RelativeLayout) x0().s.f184b, 0.3f);
        ((SwitchCompat) x0().s.m).setClickable(false);
    }
}
