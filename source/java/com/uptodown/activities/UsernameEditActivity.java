package com.uptodown.activities;

import a5.k;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import c7.n;
import c8.f0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.activities.UsernameEditActivity;
import com.uptodown.util.views.UsernameTextView;
import g5.g1;
import g7.c;
import j8.d;
import j8.e;
import java.util.ArrayList;
import java.util.regex.Pattern;
import k5.v2;
import kotlin.jvm.internal.i0;
import o4.b0;
import o4.ec;
import o4.g6;
import o4.mc;
import o4.nc;
import o4.oc;
import o4.qc;
import y5.m;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UsernameEditActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public v2 O;
    public final ViewModelLazy P = new ViewModelLazy(i0.a(qc.class), new oc(this, 0), new nc(this), new oc(this, 1));
    public final n Q = new n(new ec(this, 1));

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        UsernameEditActivity usernameEditActivity;
        String str;
        Bundle extras;
        Parcelable parcelable;
        Spanned fromHtml;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5468a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        final int i = 5;
        final int i3 = 2;
        c cVar = null;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user")) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                parcelable = (Parcelable) extras.getParcelable("user", v2.class);
            } else {
                parcelable = extras.getParcelable("user");
            }
            this.O = (v2) parcelable;
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            final int i10 = 0;
            if (drawable != null) {
                w0().f5472x.setNavigationIcon(drawable);
                w0().f5472x.setNavigationContentDescription(getString(R.string.back));
                w0().f5472x.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var;
                        SharedPreferences sharedPreferences;
                        int i11 = i10;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i11) {
                            case 0:
                                int i12 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i13 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i14 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var = usernameEditActivity2.O;
                                            v2Var.getClass();
                                            if (v2Var.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var = usernameEditActivity2.O;
                                    v2Var.getClass();
                                    if (v2Var.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
            }
            w0().A.setTypeface(s4.c.u);
            w0().C.setTypeface(s4.c.v);
            w0().B.setTypeface(s4.c.v);
            final int i11 = 4;
            w0().o.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8836b;

                {
                    this.f8836b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    String str2;
                    k5.v2 v2Var;
                    SharedPreferences sharedPreferences;
                    int i112 = i11;
                    UsernameEditActivity usernameEditActivity2 = this.f8836b;
                    switch (i112) {
                        case 0:
                            int i12 = UsernameEditActivity.R;
                            usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                            return;
                        case 1:
                            int i13 = UsernameEditActivity.R;
                            usernameEditActivity2.u0();
                            return;
                        case 2:
                            int i14 = UsernameEditActivity.R;
                            usernameEditActivity2.u0();
                            return;
                        case 3:
                            int i15 = UsernameEditActivity.R;
                            usernameEditActivity2.u0();
                            return;
                        case 4:
                            if (usernameEditActivity2.O != null) {
                                SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                try {
                                    sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                if (sharedPreferences.contains("UTOKEN")) {
                                    str2 = sharedPreferences.getString("UTOKEN", null);
                                    if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                        v2Var = usernameEditActivity2.O;
                                        v2Var.getClass();
                                        if (v2Var.d()) {
                                            return;
                                        }
                                    }
                                }
                                str2 = null;
                                if (str2 == null) {
                                }
                                v2Var = usernameEditActivity2.O;
                                v2Var.getClass();
                                if (v2Var.d()) {
                                }
                            }
                            w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                            return;
                        case 5:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.u0();
                            return;
                        default:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.u0();
                            return;
                    }
                }
            });
            w0().f5469b.setTypeface(s4.c.v);
            EditText editText = w0().f5469b;
            v2 v2Var = this.O;
            v2Var.getClass();
            editText.setText(v2Var.m);
            w0().E.setTypeface(s4.c.u);
            w0().f5474z.setTypeface(s4.c.v);
            w0().f5473y.setTypeface(s4.c.v);
            w0().D.setTypeface(s4.c.v);
            w0().F.setTypeface(s4.c.u);
            w0().G.setTypeface(s4.c.u);
            w0().H.setTypeface(s4.c.u);
            w0().I.setTypeface(s4.c.u);
            UsernameTextView usernameTextView = w0().F;
            v2 v2Var2 = this.O;
            v2Var2.getClass();
            usernameTextView.setText(v2Var2.m);
            UsernameTextView usernameTextView2 = w0().G;
            v2 v2Var3 = this.O;
            v2Var3.getClass();
            usernameTextView2.setText(v2Var3.m);
            UsernameTextView usernameTextView3 = w0().H;
            v2 v2Var4 = this.O;
            v2Var4.getClass();
            usernameTextView3.setText(v2Var4.m);
            UsernameTextView usernameTextView4 = w0().I;
            v2 v2Var5 = this.O;
            v2Var5.getClass();
            usernameTextView4.setText(v2Var5.m);
            final ?? obj = new Object();
            final ?? obj2 = new Object();
            obj2.f7675a = "type0";
            final int i12 = 1;
            w0().t.setOnClickListener(new View.OnClickListener(this) { // from class: o4.lc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8870b;

                {
                    this.f8870b = this;
                }

                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i12;
                    UsernameEditActivity usernameEditActivity2 = this.f8870b;
                    kotlin.jvm.internal.h0 h0Var = obj2;
                    kotlin.jvm.internal.f0 f0Var = obj;
                    switch (i13) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = s4.c.o;
                            UsernameEditActivity usernameEditActivity3 = this.f8870b;
                            z1.b.r(usernameEditActivity3, usernameEditActivity3.w0().f5469b);
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() > 99) {
                                String string3 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                usernameEditActivity3.A(string3);
                                return;
                            }
                            String obj3 = usernameEditActivity3.w0().f5469b.getText().toString();
                            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
                            compile.getClass();
                            obj3.getClass();
                            if (!compile.matcher(obj3).matches()) {
                                String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                string4.getClass();
                                usernameEditActivity3.A(string4);
                                return;
                            }
                            qc qcVar = (qc) usernameEditActivity3.P.getValue();
                            String obj4 = usernameEditActivity3.w0().f5469b.getText().toString();
                            k5.v2 v2Var6 = usernameEditActivity3.O;
                            int i15 = f0Var.f7671a;
                            String str2 = (String) h0Var.f7675a;
                            qcVar.getClass();
                            obj4.getClass();
                            str2.getClass();
                            ?? obj5 = new Object();
                            ?? obj6 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(qcVar);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.h0(qcVar, usernameEditActivity3, obj4, i15, obj6, obj5, v2Var6, str2, null), 2);
                            return;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 0;
                            h0Var.f7675a = "type0";
                            return;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 1;
                            h0Var.f7675a = "type1";
                            return;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 2;
                            h0Var.f7675a = "type2";
                            return;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            f0Var.f7671a = 3;
                            h0Var.f7675a = "type3";
                            return;
                    }
                }
            });
            w0().u.setOnClickListener(new View.OnClickListener(this) { // from class: o4.lc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8870b;

                {
                    this.f8870b = this;
                }

                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13 = i3;
                    UsernameEditActivity usernameEditActivity2 = this.f8870b;
                    kotlin.jvm.internal.h0 h0Var = obj2;
                    kotlin.jvm.internal.f0 f0Var = obj;
                    switch (i13) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = s4.c.o;
                            UsernameEditActivity usernameEditActivity3 = this.f8870b;
                            z1.b.r(usernameEditActivity3, usernameEditActivity3.w0().f5469b);
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() > 99) {
                                String string3 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                usernameEditActivity3.A(string3);
                                return;
                            }
                            String obj3 = usernameEditActivity3.w0().f5469b.getText().toString();
                            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
                            compile.getClass();
                            obj3.getClass();
                            if (!compile.matcher(obj3).matches()) {
                                String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                string4.getClass();
                                usernameEditActivity3.A(string4);
                                return;
                            }
                            qc qcVar = (qc) usernameEditActivity3.P.getValue();
                            String obj4 = usernameEditActivity3.w0().f5469b.getText().toString();
                            k5.v2 v2Var6 = usernameEditActivity3.O;
                            int i15 = f0Var.f7671a;
                            String str2 = (String) h0Var.f7675a;
                            qcVar.getClass();
                            obj4.getClass();
                            str2.getClass();
                            ?? obj5 = new Object();
                            ?? obj6 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(qcVar);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.h0(qcVar, usernameEditActivity3, obj4, i15, obj6, obj5, v2Var6, str2, null), 2);
                            return;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 0;
                            h0Var.f7675a = "type0";
                            return;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 1;
                            h0Var.f7675a = "type1";
                            return;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 2;
                            h0Var.f7675a = "type2";
                            return;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            f0Var.f7671a = 3;
                            h0Var.f7675a = "type3";
                            return;
                    }
                }
            });
            final int i13 = 3;
            w0().v.setOnClickListener(new View.OnClickListener(this) { // from class: o4.lc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8870b;

                {
                    this.f8870b = this;
                }

                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i13;
                    UsernameEditActivity usernameEditActivity2 = this.f8870b;
                    kotlin.jvm.internal.h0 h0Var = obj2;
                    kotlin.jvm.internal.f0 f0Var = obj;
                    switch (i132) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = s4.c.o;
                            UsernameEditActivity usernameEditActivity3 = this.f8870b;
                            z1.b.r(usernameEditActivity3, usernameEditActivity3.w0().f5469b);
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() > 99) {
                                String string3 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                usernameEditActivity3.A(string3);
                                return;
                            }
                            String obj3 = usernameEditActivity3.w0().f5469b.getText().toString();
                            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
                            compile.getClass();
                            obj3.getClass();
                            if (!compile.matcher(obj3).matches()) {
                                String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                string4.getClass();
                                usernameEditActivity3.A(string4);
                                return;
                            }
                            qc qcVar = (qc) usernameEditActivity3.P.getValue();
                            String obj4 = usernameEditActivity3.w0().f5469b.getText().toString();
                            k5.v2 v2Var6 = usernameEditActivity3.O;
                            int i15 = f0Var.f7671a;
                            String str2 = (String) h0Var.f7675a;
                            qcVar.getClass();
                            obj4.getClass();
                            str2.getClass();
                            ?? obj5 = new Object();
                            ?? obj6 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(qcVar);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.h0(qcVar, usernameEditActivity3, obj4, i15, obj6, obj5, v2Var6, str2, null), 2);
                            return;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 0;
                            h0Var.f7675a = "type0";
                            return;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 1;
                            h0Var.f7675a = "type1";
                            return;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 2;
                            h0Var.f7675a = "type2";
                            return;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            f0Var.f7671a = 3;
                            h0Var.f7675a = "type3";
                            return;
                    }
                }
            });
            w0().f5471w.setOnClickListener(new View.OnClickListener(this) { // from class: o4.lc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8870b;

                {
                    this.f8870b = this;
                }

                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i11;
                    UsernameEditActivity usernameEditActivity2 = this.f8870b;
                    kotlin.jvm.internal.h0 h0Var = obj2;
                    kotlin.jvm.internal.f0 f0Var = obj;
                    switch (i132) {
                        case 0:
                            int i14 = UsernameEditActivity.R;
                            Activity activity = s4.c.o;
                            UsernameEditActivity usernameEditActivity3 = this.f8870b;
                            z1.b.r(usernameEditActivity3, usernameEditActivity3.w0().f5469b);
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() == 0) {
                                String string = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                usernameEditActivity3.A(string);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() < 3) {
                                String string2 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() > 99) {
                                String string3 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                usernameEditActivity3.A(string3);
                                return;
                            }
                            String obj3 = usernameEditActivity3.w0().f5469b.getText().toString();
                            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
                            compile.getClass();
                            obj3.getClass();
                            if (!compile.matcher(obj3).matches()) {
                                String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                string4.getClass();
                                usernameEditActivity3.A(string4);
                                return;
                            }
                            qc qcVar = (qc) usernameEditActivity3.P.getValue();
                            String obj4 = usernameEditActivity3.w0().f5469b.getText().toString();
                            k5.v2 v2Var6 = usernameEditActivity3.O;
                            int i15 = f0Var.f7671a;
                            String str2 = (String) h0Var.f7675a;
                            qcVar.getClass();
                            obj4.getClass();
                            str2.getClass();
                            ?? obj5 = new Object();
                            ?? obj6 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(qcVar);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.h0(qcVar, usernameEditActivity3, obj4, i15, obj6, obj5, v2Var6, str2, null), 2);
                            return;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 0;
                            h0Var.f7675a = "type0";
                            return;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 1;
                            h0Var.f7675a = "type1";
                            return;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 2;
                            h0Var.f7675a = "type2";
                            return;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            f0Var.f7671a = 3;
                            h0Var.f7675a = "type3";
                            return;
                    }
                }
            });
            v2 v2Var6 = this.O;
            v2Var6.getClass();
            if (!v2Var6.d()) {
                w0().B.setVisibility(0);
                TextView textView = w0().B;
                String string = getString(R.string.username_turbo_styles_locked);
                string.getClass();
                if (i8 >= 24) {
                    fromHtml = Html.fromHtml(string, 0, null, new m(this));
                    fromHtml.getClass();
                } else {
                    fromHtml = Html.fromHtml(string, null, new m(this));
                    fromHtml.getClass();
                }
                textView.setText(fromHtml);
                w0().B.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var7;
                        SharedPreferences sharedPreferences;
                        int i112 = i;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i14 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var7 = usernameEditActivity2.O;
                                            v2Var7.getClass();
                                            if (v2Var7.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var7 = usernameEditActivity2.O;
                                    v2Var7.getClass();
                                    if (v2Var7.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
                final int i14 = 6;
                w0().C.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var7;
                        SharedPreferences sharedPreferences;
                        int i112 = i14;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var7 = usernameEditActivity2.O;
                                            v2Var7.getClass();
                                            if (v2Var7.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var7 = usernameEditActivity2.O;
                                    v2Var7.getClass();
                                    if (v2Var7.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
                w0().o.setVisibility(8);
                w0().t.setChecked(true);
                w0().l.setVisibility(0);
                w0().u.setEnabled(false);
                w0().m.setVisibility(0);
                w0().v.setEnabled(false);
                w0().f5470n.setVisibility(0);
                w0().f5471w.setEnabled(false);
                w0().p.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var7;
                        SharedPreferences sharedPreferences;
                        int i112 = i12;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var7 = usernameEditActivity2.O;
                                            v2Var7.getClass();
                                            if (v2Var7.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var7 = usernameEditActivity2.O;
                                    v2Var7.getClass();
                                    if (v2Var7.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
                w0().q.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var7;
                        SharedPreferences sharedPreferences;
                        int i112 = i3;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var7 = usernameEditActivity2.O;
                                            v2Var7.getClass();
                                            if (v2Var7.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var7 = usernameEditActivity2.O;
                                    v2Var7.getClass();
                                    if (v2Var7.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
                w0().r.setOnClickListener(new View.OnClickListener(this) { // from class: o4.kc

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UsernameEditActivity f8836b;

                    {
                        this.f8836b = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onClick(View view) {
                        String str2;
                        k5.v2 v2Var7;
                        SharedPreferences sharedPreferences;
                        int i112 = i13;
                        UsernameEditActivity usernameEditActivity2 = this.f8836b;
                        switch (i112) {
                            case 0:
                                int i122 = UsernameEditActivity.R;
                                usernameEditActivity2.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            case 1:
                                int i132 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 2:
                                int i142 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 3:
                                int i15 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            case 4:
                                if (usernameEditActivity2.O != null) {
                                    SharedPreferences sharedPreferences2 = usernameEditActivity2.getSharedPreferences("SharedPreferencesUser", 0);
                                    try {
                                        sharedPreferences = usernameEditActivity2.getSharedPreferences("SettingsPreferences", 0);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    if (sharedPreferences.contains("UTOKEN")) {
                                        str2 = sharedPreferences.getString("UTOKEN", null);
                                        if (str2 == null || sharedPreferences2.getString("is_turbo", null) != null) {
                                            v2Var7 = usernameEditActivity2.O;
                                            v2Var7.getClass();
                                            if (v2Var7.d()) {
                                                return;
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    v2Var7 = usernameEditActivity2.O;
                                    v2Var7.getClass();
                                    if (v2Var7.d()) {
                                    }
                                }
                                w5.c.e(usernameEditActivity2, f1.g.C(usernameEditActivity2), null);
                                return;
                            case 5:
                                int i16 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                            default:
                                int i17 = UsernameEditActivity.R;
                                usernameEditActivity2.u0();
                                return;
                        }
                    }
                });
            }
            w0().f5469b.addTextChangedListener(new mc(this, 1));
            w0().E.setOnClickListener(new View.OnClickListener(this) { // from class: o4.lc

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UsernameEditActivity f8870b;

                {
                    this.f8870b = this;
                }

                /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132 = i10;
                    UsernameEditActivity usernameEditActivity2 = this.f8870b;
                    kotlin.jvm.internal.h0 h0Var = obj2;
                    kotlin.jvm.internal.f0 f0Var = obj;
                    switch (i132) {
                        case 0:
                            int i142 = UsernameEditActivity.R;
                            Activity activity = s4.c.o;
                            UsernameEditActivity usernameEditActivity3 = this.f8870b;
                            z1.b.r(usernameEditActivity3, usernameEditActivity3.w0().f5469b);
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() == 0) {
                                String string2 = usernameEditActivity3.getString(R.string.error_email_vacio_recuperar_pass);
                                string2.getClass();
                                usernameEditActivity3.A(string2);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() < 3) {
                                String string22 = usernameEditActivity3.getString(R.string.validation_three_chars_min);
                                string22.getClass();
                                usernameEditActivity3.A(string22);
                                return;
                            }
                            if (usernameEditActivity3.w0().f5469b.getText().toString().length() > 99) {
                                String string3 = usernameEditActivity3.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                usernameEditActivity3.A(string3);
                                return;
                            }
                            String obj3 = usernameEditActivity3.w0().f5469b.getText().toString();
                            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
                            compile.getClass();
                            obj3.getClass();
                            if (!compile.matcher(obj3).matches()) {
                                String string4 = usernameEditActivity3.getString(R.string.validation_username_chars_type);
                                string4.getClass();
                                usernameEditActivity3.A(string4);
                                return;
                            }
                            qc qcVar = (qc) usernameEditActivity3.P.getValue();
                            String obj4 = usernameEditActivity3.w0().f5469b.getText().toString();
                            k5.v2 v2Var62 = usernameEditActivity3.O;
                            int i15 = f0Var.f7671a;
                            String str2 = (String) h0Var.f7675a;
                            qcVar.getClass();
                            obj4.getClass();
                            str2.getClass();
                            ?? obj5 = new Object();
                            ?? obj6 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(qcVar);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.h0(qcVar, usernameEditActivity3, obj4, i15, obj6, obj5, v2Var62, str2, null), 2);
                            return;
                        case 1:
                            int i16 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 0;
                            h0Var.f7675a = "type0";
                            return;
                        case 2:
                            int i17 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 1;
                            h0Var.f7675a = "type1";
                            return;
                        case 3:
                            int i18 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().f5471w.setChecked(false);
                            f0Var.f7671a = 2;
                            h0Var.f7675a = "type2";
                            return;
                        default:
                            int i19 = UsernameEditActivity.R;
                            usernameEditActivity2.w0().t.setChecked(false);
                            usernameEditActivity2.w0().u.setChecked(false);
                            usernameEditActivity2.w0().v.setChecked(false);
                            f0Var.f7671a = 3;
                            h0Var.f7675a = "type3";
                            return;
                    }
                }
            });
            w0().f5469b.addTextChangedListener(new mc(this, 0));
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            e eVar = p0.f3588a;
            int i15 = 22;
            usernameEditActivity = this;
            f0.z(lifecycleScope, h8.n.f6148a, null, new k(usernameEditActivity, (Object) obj, (Object) obj2, cVar, i15), 2);
            qc qcVar = (qc) usernameEditActivity.P.getValue();
            qcVar.getClass();
            f0.z(ViewModelKt.getViewModelScope(qcVar), d.f7053a, null, new a5.e(usernameEditActivity, new ArrayList(), qcVar, cVar, i15), 2);
        } else {
            usernameEditActivity = this;
        }
        v2 v2Var7 = usernameEditActivity.O;
        if (v2Var7 != null && (str = v2Var7.m) != null && str.length() != 0) {
            v2 v2Var8 = usernameEditActivity.O;
            v2Var8.getClass();
            String str2 = v2Var8.m;
            str2.getClass();
            x0(str2);
        }
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, cVar, i), 2);
    }

    public final g1 w0() {
        return (g1) this.Q.getValue();
    }

    public final void x0(String str) {
        if (str.length() > 0 && str.length() >= 3) {
            w0().f5474z.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            w0().f5474z.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.length() <= 99) {
            w0().f5473y.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            w0().f5473y.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.length() > 0) {
            Pattern compile = Pattern.compile("^[a-zA-Z0-9_]+$");
            compile.getClass();
            if (compile.matcher(str).matches()) {
                w0().D.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        w0().D.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
