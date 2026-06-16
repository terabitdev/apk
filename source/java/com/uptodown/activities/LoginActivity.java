package com.uptodown.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.PasswordRecoveryActivity;
import g5.h;
import g5.v;
import g7.c;
import h5.o;
import h5.u;
import j8.d;
import j8.e;
import java.util.regex.Pattern;
import k5.v2;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.i0;
import o4.b;
import o4.b2;
import o4.c2;
import o4.d2;
import o4.f0;
import o4.h2;
import o4.k2;
import o4.l2;
import o4.y1;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class LoginActivity extends h2 {
    public static final /* synthetic */ int W = 0;
    public Drawable U;
    public final n S = new n(new f0(this, 8));
    public final ViewModelLazy T = new ViewModelLazy(i0.a(l2.class), new d2(this, 0), new c2(this), new d2(this, 1));
    public final b V = new b(this, 2);

    @Override // o4.h2
    public final void A0(v2 v2Var) {
        String str;
        if (v2Var != null) {
            v2Var.e(this);
        }
        if (v2Var != null) {
            try {
                str = v2Var.m;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            v2Var.getClass();
            String str2 = v2Var.m;
            str2.getClass();
            AccountManager.get(getBaseContext()).addAccountExplicitly(new Account(str2, getString(R.string.account)), null, null);
        }
    }

    @Override // o4.h2
    public final void B0(v2 v2Var, String str) {
        String str2;
        w0();
        EditText editText = (EditText) E0().m.o;
        String str3 = null;
        if (v2Var != null) {
            str2 = v2Var.m;
        } else {
            str2 = null;
        }
        editText.setText(str2);
        EditText editText2 = (EditText) E0().m.m;
        if (v2Var != null) {
            str3 = v2Var.f7543b;
        }
        editText2.setText(str3);
        ((EditText) E0().m.m).setEnabled(false);
        if (str != null) {
            A(str);
        }
    }

    @Override // o4.h2
    public final void C0() {
        E0().f5608b.setVisibility(0);
    }

    @Override // o4.h2
    public final void D0() {
        String string = getString(R.string.login_successful);
        string.getClass();
        A(string);
    }

    public final v E0() {
        return (v) this.S.getValue();
    }

    public final l2 F0() {
        return (l2) this.T.getValue();
    }

    public final void G0() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        inputMethodManager.hideSoftInputFromWindow(((EditText) E0().m.m).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) E0().m.o).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) E0().m.f4596n).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(((EditText) E0().l.r).getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(E0().l.f5476b.getWindowToken(), 0);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    public final void H0() {
        G0();
        l2 F0 = F0();
        String obj = ((EditText) E0().l.r).getText().toString();
        String obj2 = E0().l.f5476b.getText().toString();
        F0.getClass();
        obj.getClass();
        obj2.getClass();
        if (obj.length() > 0 && obj2.length() > 0) {
            String obj3 = ((EditText) E0().l.r).getText().toString();
            String obj4 = E0().l.f5476b.getText().toString();
            l2 F02 = F0();
            F02.getClass();
            obj3.getClass();
            obj4.getClass();
            ?? obj5 = new Object();
            obj5.f7671a = -2;
            ?? obj6 = new Object();
            ?? obj7 = new Object();
            ?? obj8 = new Object();
            c0 viewModelScope = ViewModelKt.getViewModelScope(F02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new k2(F02, this, obj3, obj4, (h0) obj8, (kotlin.jvm.internal.f0) obj5, (h0) obj6, (h0) obj7, (c) null), 2);
            return;
        }
        String string = getString(R.string.faltan_datos_login);
        string.getClass();
        A(string);
    }

    @Override // o4.h2, o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.V);
        RelativeLayout relativeLayout = E0().f5607a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        this.U = drawable;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, R.color.toolbar_icon));
            E0().f5609n.setNavigationIcon(this.U);
            E0().f5609n.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 0;
        E0().f5609n.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9195b;

            {
                this.f9195b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                LoginActivity loginActivity = this.f9195b;
                switch (i3) {
                    case 0:
                        int i8 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i10 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f7 = UptodownApp.G;
                        loginActivity.startActivity(intent, n4.e.a(loginActivity));
                        return;
                    case 2:
                        int i11 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f9195b;
                        loginActivity2.G0();
                        l2 F0 = loginActivity2.F0();
                        String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        F0.getClass();
                        obj.getClass();
                        boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                        l2 F02 = loginActivity2.F0();
                        String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                        String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                        F02.getClass();
                        obj2.getClass();
                        obj3.getClass();
                        obj4.getClass();
                        if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            l2 F03 = loginActivity2.F0();
                            F03.getClass();
                            obj5.getClass();
                            obj6.getClass();
                            obj7.getClass();
                            ?? obj8 = new Object();
                            ?? obj9 = new Object();
                            ?? obj10 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                            return;
                        }
                        if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                            string.getClass();
                            loginActivity2.A(string);
                            return;
                        }
                        if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                            String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            loginActivity2.A(string2);
                            return;
                        } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                            String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            loginActivity2.A(string3);
                            return;
                        } else if (!matches) {
                            String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                            string4.getClass();
                            loginActivity2.A(string4);
                            return;
                        } else {
                            String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                            string5.getClass();
                            loginActivity2.A(string5);
                            return;
                        }
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        return;
                    case 4:
                        int i12 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                            ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                            return;
                        }
                        return;
                    default:
                        int i13 = LoginActivity.W;
                        loginActivity.H0();
                        return;
                }
            }
        });
        E0().o.setTypeface(s4.c.u);
        E0().l.p.setTypeface(s4.c.u);
        E0().l.m.setTypeface(s4.c.v);
        ((TextView) E0().m.r).setTypeface(s4.c.v);
        E0().f5608b.setOnClickListener(new o(7));
        final int i3 = 4;
        E0().l.p.setOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9195b;

            {
                this.f9195b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                LoginActivity loginActivity = this.f9195b;
                switch (i32) {
                    case 0:
                        int i8 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i10 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f7 = UptodownApp.G;
                        loginActivity.startActivity(intent, n4.e.a(loginActivity));
                        return;
                    case 2:
                        int i11 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f9195b;
                        loginActivity2.G0();
                        l2 F0 = loginActivity2.F0();
                        String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        F0.getClass();
                        obj.getClass();
                        boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                        l2 F02 = loginActivity2.F0();
                        String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                        String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                        F02.getClass();
                        obj2.getClass();
                        obj3.getClass();
                        obj4.getClass();
                        if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            l2 F03 = loginActivity2.F0();
                            F03.getClass();
                            obj5.getClass();
                            obj6.getClass();
                            obj7.getClass();
                            ?? obj8 = new Object();
                            ?? obj9 = new Object();
                            ?? obj10 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                            return;
                        }
                        if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                            string.getClass();
                            loginActivity2.A(string);
                            return;
                        }
                        if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                            String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            loginActivity2.A(string2);
                            return;
                        } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                            String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            loginActivity2.A(string3);
                            return;
                        } else if (!matches) {
                            String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                            string4.getClass();
                            loginActivity2.A(string4);
                            return;
                        } else {
                            String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                            string5.getClass();
                            loginActivity2.A(string5);
                            return;
                        }
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        return;
                    case 4:
                        int i12 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                            ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                            return;
                        }
                        return;
                    default:
                        int i13 = LoginActivity.W;
                        loginActivity.H0();
                        return;
                }
            }
        });
        E0().l.f5477n.setTypeface(s4.c.u);
        final int i8 = 5;
        E0().l.f5477n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9195b;

            {
                this.f9195b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                LoginActivity loginActivity = this.f9195b;
                switch (i32) {
                    case 0:
                        int i82 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i10 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f7 = UptodownApp.G;
                        loginActivity.startActivity(intent, n4.e.a(loginActivity));
                        return;
                    case 2:
                        int i11 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f9195b;
                        loginActivity2.G0();
                        l2 F0 = loginActivity2.F0();
                        String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        F0.getClass();
                        obj.getClass();
                        boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                        l2 F02 = loginActivity2.F0();
                        String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                        String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                        F02.getClass();
                        obj2.getClass();
                        obj3.getClass();
                        obj4.getClass();
                        if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            l2 F03 = loginActivity2.F0();
                            F03.getClass();
                            obj5.getClass();
                            obj6.getClass();
                            obj7.getClass();
                            ?? obj8 = new Object();
                            ?? obj9 = new Object();
                            ?? obj10 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                            return;
                        }
                        if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                            string.getClass();
                            loginActivity2.A(string);
                            return;
                        }
                        if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                            String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            loginActivity2.A(string2);
                            return;
                        } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                            String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            loginActivity2.A(string3);
                            return;
                        } else if (!matches) {
                            String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                            string4.getClass();
                            loginActivity2.A(string4);
                            return;
                        } else {
                            String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                            string5.getClass();
                            loginActivity2.A(string5);
                            return;
                        }
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        return;
                    case 4:
                        int i12 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                            ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                            return;
                        }
                        return;
                    default:
                        int i13 = LoginActivity.W;
                        loginActivity.H0();
                        return;
                }
            }
        });
        ((EditText) E0().l.r).setTypeface(s4.c.v);
        final int i10 = 3;
        ((EditText) E0().l.r).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.x1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9228b;

            {
                this.f9228b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i11 = i10;
                LoginActivity loginActivity = this.f9228b;
                switch (i11) {
                    case 0:
                        int i12 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.o).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.o).setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
                            return;
                        }
                    case 1:
                        int i13 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.m).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.m).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    case 2:
                        int i14 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.f4596n).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.f4596n).setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                    case 3:
                        int i15 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().l.r).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().l.r).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i16 = LoginActivity.W;
                        if (z10) {
                            loginActivity.E0().l.f5476b.setHint("");
                            return;
                        } else {
                            loginActivity.E0().l.f5476b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                }
            }
        });
        E0().l.f5476b.setTypeface(s4.c.v);
        E0().l.f5476b.setImeOptions(6);
        E0().l.f5476b.setOnEditorActionListener(new y1(this, i));
        E0().l.f5476b.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.x1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9228b;

            {
                this.f9228b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i11 = i3;
                LoginActivity loginActivity = this.f9228b;
                switch (i11) {
                    case 0:
                        int i12 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.o).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.o).setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
                            return;
                        }
                    case 1:
                        int i13 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.m).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.m).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    case 2:
                        int i14 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.f4596n).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.f4596n).setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                    case 3:
                        int i15 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().l.r).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().l.r).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i16 = LoginActivity.W;
                        if (z10) {
                            loginActivity.E0().l.f5476b.setHint("");
                            return;
                        } else {
                            loginActivity.E0().l.f5476b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                }
            }
        });
        Drawable[] compoundDrawables = E0().l.f5476b.getCompoundDrawables();
        compoundDrawables.getClass();
        Drawable drawable2 = compoundDrawables[0];
        if (drawable2 != null) {
            drawable2.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
        }
        TextView textView = (TextView) findViewById(R.id.tv_pass_forget_login);
        final int i11 = 1;
        if (textView != null) {
            textView.setTypeface(s4.c.u);
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LoginActivity f9195b;

                {
                    this.f9195b = this;
                }

                /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i11;
                    LoginActivity loginActivity = this.f9195b;
                    switch (i32) {
                        case 0:
                            int i82 = LoginActivity.W;
                            loginActivity.getOnBackPressedDispatcher().onBackPressed();
                            return;
                        case 1:
                            int i102 = LoginActivity.W;
                            Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                            float f7 = UptodownApp.G;
                            loginActivity.startActivity(intent, n4.e.a(loginActivity));
                            return;
                        case 2:
                            int i112 = LoginActivity.W;
                            LoginActivity loginActivity2 = this.f9195b;
                            loginActivity2.G0();
                            l2 F0 = loginActivity2.F0();
                            String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            F0.getClass();
                            obj.getClass();
                            boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                            l2 F02 = loginActivity2.F0();
                            String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            F02.getClass();
                            obj2.getClass();
                            obj3.getClass();
                            obj4.getClass();
                            if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                                String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                                String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                                String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                                l2 F03 = loginActivity2.F0();
                                F03.getClass();
                                obj5.getClass();
                                obj6.getClass();
                                obj7.getClass();
                                ?? obj8 = new Object();
                                ?? obj9 = new Object();
                                ?? obj10 = new Object();
                                c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                                j8.e eVar = c8.p0.f3588a;
                                c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                                return;
                            }
                            if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                                String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                                string.getClass();
                                loginActivity2.A(string);
                                return;
                            }
                            if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                                String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                                string2.getClass();
                                loginActivity2.A(string2);
                                return;
                            } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                                String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                loginActivity2.A(string3);
                                return;
                            } else if (!matches) {
                                String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                                string4.getClass();
                                loginActivity2.A(string4);
                                return;
                            } else {
                                String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                                string5.getClass();
                                loginActivity2.A(string5);
                                return;
                            }
                        case 3:
                            loginActivity.V.handleOnBackPressed();
                            return;
                        case 4:
                            int i12 = LoginActivity.W;
                            if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                                alphaAnimation.setDuration(200L);
                                alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                                ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                                return;
                            }
                            return;
                        default:
                            int i13 = LoginActivity.W;
                            loginActivity.H0();
                            return;
                    }
                }
            });
        }
        ((TextView) E0().m.t).setTypeface(s4.c.u);
        final int i12 = 2;
        ((TextView) E0().m.t).setOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9195b;

            {
                this.f9195b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i12;
                LoginActivity loginActivity = this.f9195b;
                switch (i32) {
                    case 0:
                        int i82 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i102 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f7 = UptodownApp.G;
                        loginActivity.startActivity(intent, n4.e.a(loginActivity));
                        return;
                    case 2:
                        int i112 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f9195b;
                        loginActivity2.G0();
                        l2 F0 = loginActivity2.F0();
                        String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        F0.getClass();
                        obj.getClass();
                        boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                        l2 F02 = loginActivity2.F0();
                        String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                        String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                        F02.getClass();
                        obj2.getClass();
                        obj3.getClass();
                        obj4.getClass();
                        if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            l2 F03 = loginActivity2.F0();
                            F03.getClass();
                            obj5.getClass();
                            obj6.getClass();
                            obj7.getClass();
                            ?? obj8 = new Object();
                            ?? obj9 = new Object();
                            ?? obj10 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                            return;
                        }
                        if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                            string.getClass();
                            loginActivity2.A(string);
                            return;
                        }
                        if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                            String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            loginActivity2.A(string2);
                            return;
                        } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                            String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            loginActivity2.A(string3);
                            return;
                        } else if (!matches) {
                            String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                            string4.getClass();
                            loginActivity2.A(string4);
                            return;
                        } else {
                            String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                            string5.getClass();
                            loginActivity2.A(string5);
                            return;
                        }
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        return;
                    case 4:
                        int i122 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                            ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                            return;
                        }
                        return;
                    default:
                        int i13 = LoginActivity.W;
                        loginActivity.H0();
                        return;
                }
            }
        });
        ((EditText) E0().m.o).setTypeface(s4.c.v);
        ((EditText) E0().m.o).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.x1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9228b;

            {
                this.f9228b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i112 = i;
                LoginActivity loginActivity = this.f9228b;
                switch (i112) {
                    case 0:
                        int i122 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.o).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.o).setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
                            return;
                        }
                    case 1:
                        int i13 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.m).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.m).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    case 2:
                        int i14 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.f4596n).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.f4596n).setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                    case 3:
                        int i15 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().l.r).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().l.r).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i16 = LoginActivity.W;
                        if (z10) {
                            loginActivity.E0().l.f5476b.setHint("");
                            return;
                        } else {
                            loginActivity.E0().l.f5476b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                }
            }
        });
        ((TextView) E0().m.q).setTypeface(s4.c.u);
        ((TextView) E0().m.q).setOnClickListener(new View.OnClickListener(this) { // from class: o4.w1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9195b;

            {
                this.f9195b = this;
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i10;
                LoginActivity loginActivity = this.f9195b;
                switch (i32) {
                    case 0:
                        int i82 = LoginActivity.W;
                        loginActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i102 = LoginActivity.W;
                        Intent intent = new Intent(loginActivity.getApplicationContext(), (Class<?>) PasswordRecoveryActivity.class);
                        float f7 = UptodownApp.G;
                        loginActivity.startActivity(intent, n4.e.a(loginActivity));
                        return;
                    case 2:
                        int i112 = LoginActivity.W;
                        LoginActivity loginActivity2 = this.f9195b;
                        loginActivity2.G0();
                        l2 F0 = loginActivity2.F0();
                        String obj = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        F0.getClass();
                        obj.getClass();
                        boolean matches = Pattern.compile("^(([^<>()\\[\\]\\\\.,;:\\s@“]+(\\.[^<>()\\[\\]\\\\.,;:\\s@“]+)*)|(“.+“))@((\\[\\d{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(obj).matches();
                        l2 F02 = loginActivity2.F0();
                        String obj2 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                        String obj3 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                        String obj4 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                        F02.getClass();
                        obj2.getClass();
                        obj3.getClass();
                        obj4.getClass();
                        if (obj2.length() > 0 && obj3.length() > 0 && obj4.length() > 5 && matches && ((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String obj5 = ((EditText) loginActivity2.E0().m.o).getText().toString();
                            String obj6 = ((EditText) loginActivity2.E0().m.m).getText().toString();
                            String obj7 = ((EditText) loginActivity2.E0().m.f4596n).getText().toString();
                            l2 F03 = loginActivity2.F0();
                            F03.getClass();
                            obj5.getClass();
                            obj6.getClass();
                            obj7.getClass();
                            ?? obj8 = new Object();
                            ?? obj9 = new Object();
                            ?? obj10 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(F03);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k2(F03, loginActivity2, obj5, obj7, obj6, (kotlin.jvm.internal.f0) obj9, (kotlin.jvm.internal.h0) obj8, (kotlin.jvm.internal.h0) obj10, (g7.c) null), 2);
                            return;
                        }
                        if (!((CheckBox) loginActivity2.E0().m.l).isChecked()) {
                            String string = loginActivity2.getString(R.string.falta_condiciones_uso);
                            string.getClass();
                            loginActivity2.A(string);
                            return;
                        }
                        if (((EditText) loginActivity2.E0().m.f4596n).length() < 6) {
                            String string2 = loginActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            loginActivity2.A(string2);
                            return;
                        } else if (((EditText) loginActivity2.E0().m.f4596n).length() > 99) {
                            String string3 = loginActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            loginActivity2.A(string3);
                            return;
                        } else if (!matches) {
                            String string4 = loginActivity2.getString(R.string.error_email_not_valid);
                            string4.getClass();
                            loginActivity2.A(string4);
                            return;
                        } else {
                            String string5 = loginActivity2.getString(R.string.faltan_datos_registro);
                            string5.getClass();
                            loginActivity2.A(string5);
                            return;
                        }
                    case 3:
                        loginActivity.V.handleOnBackPressed();
                        return;
                    case 4:
                        int i122 = LoginActivity.W;
                        if (((LinearLayout) loginActivity.E0().m.f4595b).getVisibility() != 0) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setInterpolator(new AccelerateInterpolator());
                            alphaAnimation.setDuration(200L);
                            alphaAnimation.setAnimationListener(new z1(loginActivity, 0));
                            ((LinearLayout) loginActivity.E0().l.q).startAnimation(alphaAnimation);
                            return;
                        }
                        return;
                    default:
                        int i13 = LoginActivity.W;
                        loginActivity.H0();
                        return;
                }
            }
        });
        ((EditText) E0().m.m).setTypeface(s4.c.v);
        ((EditText) E0().m.m).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.x1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9228b;

            {
                this.f9228b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i112 = i11;
                LoginActivity loginActivity = this.f9228b;
                switch (i112) {
                    case 0:
                        int i122 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.o).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.o).setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
                            return;
                        }
                    case 1:
                        int i13 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.m).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.m).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    case 2:
                        int i14 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.f4596n).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.f4596n).setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                    case 3:
                        int i15 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().l.r).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().l.r).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i16 = LoginActivity.W;
                        if (z10) {
                            loginActivity.E0().l.f5476b.setHint("");
                            return;
                        } else {
                            loginActivity.E0().l.f5476b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                }
            }
        });
        ((EditText) E0().m.f4596n).setTypeface(s4.c.v);
        ((EditText) E0().m.f4596n).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: o4.x1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f9228b;

            {
                this.f9228b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i112 = i12;
                LoginActivity loginActivity = this.f9228b;
                switch (i112) {
                    case 0:
                        int i122 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.o).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.o).setHint(loginActivity.getString(R.string.hint_nombre_usuario_login_registro));
                            return;
                        }
                    case 1:
                        int i13 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.m).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.m).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    case 2:
                        int i14 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().m.f4596n).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().m.f4596n).setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                    case 3:
                        int i15 = LoginActivity.W;
                        if (z10) {
                            ((EditText) loginActivity.E0().l.r).setHint("");
                            return;
                        } else {
                            ((EditText) loginActivity.E0().l.r).setHint(loginActivity.getString(R.string.hint_email_registro));
                            return;
                        }
                    default:
                        int i16 = LoginActivity.W;
                        if (z10) {
                            loginActivity.E0().l.f5476b.setHint("");
                            return;
                        } else {
                            loginActivity.E0().l.f5476b.setHint(loginActivity.getString(R.string.hint_pass_login_registro));
                            return;
                        }
                }
            }
        });
        Drawable[] compoundDrawables2 = ((EditText) E0().m.f4596n).getCompoundDrawables();
        compoundDrawables2.getClass();
        Drawable drawable3 = compoundDrawables2[0];
        if (drawable3 != null) {
            drawable3.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP);
        }
        ((CheckBox) E0().m.l).setTypeface(s4.c.v);
        ((CheckBox) E0().m.l).setMovementMethod(LinkMovementMethod.getInstance());
        v E0 = E0();
        E0.getClass();
        h hVar = E0.l;
        hVar.o.setTypeface(s4.c.u);
        int i13 = 11;
        hVar.l.setOnClickListener(new u(this, i13));
        d0.h hVar2 = E0.m;
        ((TextView) hVar2.s).setTypeface(s4.c.u);
        ((RelativeLayout) hVar2.p).setOnClickListener(new u(this, i13));
        ((TextView) findViewById(R.id.tv_title_download_benefit)).setTypeface(s4.c.u);
        ((TextView) findViewById(R.id.tv_desc_download_benefit)).setTypeface(s4.c.v);
        ((TextView) findViewById(R.id.tv_title_discover_benefit)).setTypeface(s4.c.u);
        ((TextView) findViewById(R.id.tv_desc_discover_benefit)).setTypeface(s4.c.v);
        ((TextView) findViewById(R.id.tv_title_share_benefit)).setTypeface(s4.c.u);
        ((TextView) findViewById(R.id.tv_desc_share_benefit)).setTypeface(s4.c.v);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar = h8.n.f6148a;
        c cVar2 = null;
        c8.f0.z(lifecycleScope, cVar, null, new b2(this, cVar2, i), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new b2(this, cVar2, i11), 2);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Drawable drawable = this.U;
        if (drawable != null) {
            drawable.getClass();
            DrawableCompat.setTintList(drawable, null);
        }
        getWindow().getDecorView().setSystemUiVisibility(0);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        String str;
        SharedPreferences sharedPreferences;
        super.onResume();
        G0();
        boolean z10 = false;
        SharedPreferences sharedPreferences2 = getSharedPreferences("SharedPreferencesUser", 0);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (sharedPreferences.contains("UTOKEN")) {
            str = sharedPreferences.getString("UTOKEN", null);
            if (str == null || sharedPreferences2.getString("is_turbo", null) != null) {
                z10 = true;
            }
            if (!z10) {
                finish();
                return;
            }
            return;
        }
        str = null;
        if (str == null) {
        }
        z10 = true;
        if (!z10) {
        }
    }

    @Override // o4.h2
    public final void w0() {
        E0().f5608b.setVisibility(8);
    }
}
