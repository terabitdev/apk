package com.uptodown.activities;

import a5.e0;
import a5.q;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import b.d;
import c7.n;
import c7.z;
import c8.p0;
import com.uptodown.R;
import com.uptodown.activities.PasswordRecoveryActivity;
import g5.g0;
import h5.o;
import h7.a;
import i7.c;
import j8.e;
import kotlin.jvm.internal.h0;
import o4.b0;
import o4.f0;
import o4.h6;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PasswordRecoveryActivity extends b0 {
    public static final /* synthetic */ int P = 0;
    public final n O = new n(new f0(this, 17));

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (c8.f0.K(r0, r2, r1) != r12) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(PasswordRecoveryActivity passwordRecoveryActivity, c cVar) {
        h6 h6Var;
        int i;
        kotlin.jvm.internal.f0 f0Var;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        if (cVar instanceof h6) {
            h6Var = (h6) cVar;
            int i3 = h6Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h6Var.p = i3 - Integer.MIN_VALUE;
                Object obj = h6Var.f8726n;
                i = h6Var.p;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h0 h0Var4 = h6Var.m;
                    h0Var = h6Var.l;
                    h0 h0Var5 = h6Var.f8725b;
                    kotlin.jvm.internal.f0 f0Var2 = h6Var.f8724a;
                    c7.a.e(obj);
                    f0Var = f0Var2;
                    h0Var3 = h0Var5;
                    h0Var2 = h0Var4;
                } else {
                    c7.a.e(obj);
                    ?? obj2 = new Object();
                    ?? obj3 = new Object();
                    ?? obj4 = new Object();
                    ?? obj5 = new Object();
                    e eVar = p0.f3588a;
                    d8.c cVar2 = h8.n.f6148a;
                    q qVar = new q(obj3, passwordRecoveryActivity, obj4, obj5, null, 10);
                    h6Var.f8724a = obj2;
                    h6Var.f8725b = obj3;
                    h6Var.l = obj4;
                    h6Var.m = obj5;
                    h6Var.p = 1;
                    if (c8.f0.K(cVar2, qVar, h6Var) != aVar) {
                        f0Var = obj2;
                        h0Var = obj4;
                        h0Var2 = obj5;
                        h0Var3 = obj3;
                    }
                    return aVar;
                }
                e eVar2 = p0.f3588a;
                j8.d dVar = j8.d.f7053a;
                e0 e0Var = new e0(passwordRecoveryActivity, h0Var, h0Var2, h0Var3, f0Var, (g7.c) null);
                h6Var.f8724a = null;
                h6Var.f8725b = null;
                h6Var.l = null;
                h6Var.m = null;
                h6Var.p = 2;
            }
        }
        h6Var = new h6(passwordRecoveryActivity, cVar);
        Object obj6 = h6Var.f8726n;
        i = h6Var.p;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        j8.d dVar2 = j8.d.f7053a;
        e0 e0Var2 = new e0(passwordRecoveryActivity, h0Var, h0Var2, h0Var3, f0Var, (g7.c) null);
        h6Var.f8724a = null;
        h6Var.f8725b = null;
        h6Var.l = null;
        h6Var.m = null;
        h6Var.p = 2;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = x0().f5465a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_password_recovery);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
                final int i = 0;
                toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.f6

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PasswordRecoveryActivity f8657b;

                    {
                        this.f8657b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        PasswordRecoveryActivity passwordRecoveryActivity = this.f8657b;
                        switch (i3) {
                            case 0:
                                int i8 = PasswordRecoveryActivity.P;
                                passwordRecoveryActivity.getOnBackPressedDispatcher().onBackPressed();
                                return;
                            default:
                                int i10 = PasswordRecoveryActivity.P;
                                if (!z7.v.a0(passwordRecoveryActivity.x0().l.getText().toString(), "", true) && !z7.v.a0(passwordRecoveryActivity.x0().f5466b.getText().toString(), "", true)) {
                                    if (!z7.v.a0(passwordRecoveryActivity.x0().l.getText().toString(), passwordRecoveryActivity.x0().f5466b.getText().toString(), true)) {
                                        String string = passwordRecoveryActivity.getString(R.string.error_emails_no_coinciden);
                                        if (string != null) {
                                            passwordRecoveryActivity.A(string);
                                            return;
                                        }
                                        return;
                                    }
                                    c8.f0.z(LifecycleOwnerKt.getLifecycleScope(passwordRecoveryActivity), null, null, new g6(passwordRecoveryActivity, null, 0), 3);
                                    return;
                                }
                                String string2 = passwordRecoveryActivity.getString(R.string.error_email_vacio_recuperar_pass);
                                if (string2 != null) {
                                    passwordRecoveryActivity.A(string2);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            TextView textView = (TextView) findViewById(R.id.tv_title_toolbar_password_recovery);
            if (textView != null) {
                textView.setTypeface(s4.c.u);
            }
        }
        x0().l.setTypeface(s4.c.v);
        x0().f5466b.setTypeface(s4.c.v);
        x0().f5467n.setTypeface(s4.c.u);
        final int i3 = 1;
        x0().f5467n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.f6

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordRecoveryActivity f8657b;

            {
                this.f8657b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                PasswordRecoveryActivity passwordRecoveryActivity = this.f8657b;
                switch (i32) {
                    case 0:
                        int i8 = PasswordRecoveryActivity.P;
                        passwordRecoveryActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i10 = PasswordRecoveryActivity.P;
                        if (!z7.v.a0(passwordRecoveryActivity.x0().l.getText().toString(), "", true) && !z7.v.a0(passwordRecoveryActivity.x0().f5466b.getText().toString(), "", true)) {
                            if (!z7.v.a0(passwordRecoveryActivity.x0().l.getText().toString(), passwordRecoveryActivity.x0().f5466b.getText().toString(), true)) {
                                String string = passwordRecoveryActivity.getString(R.string.error_emails_no_coinciden);
                                if (string != null) {
                                    passwordRecoveryActivity.A(string);
                                    return;
                                }
                                return;
                            }
                            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(passwordRecoveryActivity), null, null, new g6(passwordRecoveryActivity, null, 0), 3);
                            return;
                        }
                        String string2 = passwordRecoveryActivity.getString(R.string.error_email_vacio_recuperar_pass);
                        if (string2 != null) {
                            passwordRecoveryActivity.A(string2);
                            return;
                        }
                        return;
                }
            }
        });
        x0().m.setOnClickListener(new o(16));
    }

    public final g0 x0() {
        return (g0) this.O.getValue();
    }
}
