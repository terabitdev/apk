package com.uptodown.activities;

import a5.h;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import c7.n;
import com.uptodown.R;
import com.uptodown.activities.PasswordEditActivity;
import kotlin.jvm.internal.i0;
import o4.a6;
import o4.b0;
import o4.b6;
import o4.e6;
import o4.f0;
import o4.y5;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PasswordEditActivity extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final ViewModelLazy O = new ViewModelLazy(i0.a(e6.class), new b6(this, 0), new a6(this), new b6(this, 1));
    public final n P = new n(new f0(this, 16));

    public static final void w0(PasswordEditActivity passwordEditActivity, String str) {
        if (str.length() > 0 && str.length() >= 6) {
            passwordEditActivity.x0().s.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            passwordEditActivity.x0().s.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.length() > 0 && str.length() <= 99) {
            passwordEditActivity.x0().r.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            passwordEditActivity.x0().r.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (str.equals(passwordEditActivity.x0().f5457b.getText().toString())) {
            passwordEditActivity.x0().q.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_checked), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            passwordEditActivity.x0().q.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(passwordEditActivity, R.drawable.vector_unchecked), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = x0().f5456a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        RelativeLayout relativeLayout2 = x0().f5456a;
        relativeLayout2.getClass();
        setContentView(relativeLayout2);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        final int i = 0;
        if (drawable != null) {
            x0().p.setNavigationIcon(drawable);
            x0().p.setNavigationContentDescription(getString(R.string.back));
            x0().p.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.x5

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PasswordEditActivity f9236b;

                {
                    this.f9236b = this;
                }

                /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    PasswordEditActivity passwordEditActivity = this.f9236b;
                    switch (i3) {
                        case 0:
                            int i8 = PasswordEditActivity.Q;
                            passwordEditActivity.getOnBackPressedDispatcher().onBackPressed();
                            return;
                        case 1:
                            int i10 = PasswordEditActivity.Q;
                            passwordEditActivity.y0(passwordEditActivity.x0().l, passwordEditActivity.x0().f5458n);
                            return;
                        case 2:
                            int i11 = PasswordEditActivity.Q;
                            passwordEditActivity.y0(passwordEditActivity.x0().f5457b, passwordEditActivity.x0().m);
                            return;
                        default:
                            int i12 = PasswordEditActivity.Q;
                            Activity activity = s4.c.o;
                            PasswordEditActivity passwordEditActivity2 = this.f9236b;
                            z1.b.r(passwordEditActivity2, passwordEditActivity2.x0().l);
                            if (passwordEditActivity2.x0().l.getText().toString().length() == 0 || passwordEditActivity2.x0().f5457b.getText().toString().length() == 0) {
                                String string = passwordEditActivity2.getString(R.string.error_email_vacio_recuperar_pass);
                                string.getClass();
                                passwordEditActivity2.A(string);
                                return;
                            }
                            if (passwordEditActivity2.x0().l.getText().toString().length() < 6) {
                                String string2 = passwordEditActivity2.getString(R.string.validation_six_chars_min);
                                string2.getClass();
                                passwordEditActivity2.A(string2);
                                return;
                            }
                            if (passwordEditActivity2.x0().l.getText().toString().length() > 99) {
                                String string3 = passwordEditActivity2.getString(R.string.validation_hundred_chars_max);
                                string3.getClass();
                                passwordEditActivity2.A(string3);
                                return;
                            }
                            if (!kotlin.jvm.internal.p.b(passwordEditActivity2.x0().l.getText().toString(), passwordEditActivity2.x0().f5457b.getText().toString())) {
                                String string4 = passwordEditActivity2.getString(R.string.password_edit_not_match);
                                string4.getClass();
                                passwordEditActivity2.A(string4);
                                return;
                            }
                            e6 e6Var = (e6) passwordEditActivity2.O.getValue();
                            String obj = passwordEditActivity2.x0().l.getText().toString();
                            String obj2 = passwordEditActivity2.x0().f5457b.getText().toString();
                            e6Var.getClass();
                            obj.getClass();
                            obj2.getClass();
                            ?? obj3 = new Object();
                            ?? obj4 = new Object();
                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(e6Var);
                            j8.e eVar = c8.p0.f3588a;
                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new d6(e6Var, passwordEditActivity2, obj, obj2, obj4, obj3, null), 2);
                            return;
                    }
                }
            });
        }
        x0().u.setTypeface(c.u);
        x0().l.setTypeface(c.v);
        x0().f5457b.setTypeface(c.v);
        x0().t.setTypeface(c.u);
        x0().s.setTypeface(c.v);
        x0().r.setTypeface(c.v);
        x0().q.setTypeface(c.v);
        final int i3 = 1;
        x0().f5458n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.x5

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordEditActivity f9236b;

            {
                this.f9236b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                PasswordEditActivity passwordEditActivity = this.f9236b;
                switch (i32) {
                    case 0:
                        int i8 = PasswordEditActivity.Q;
                        passwordEditActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i10 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().l, passwordEditActivity.x0().f5458n);
                        return;
                    case 2:
                        int i11 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().f5457b, passwordEditActivity.x0().m);
                        return;
                    default:
                        int i12 = PasswordEditActivity.Q;
                        Activity activity = s4.c.o;
                        PasswordEditActivity passwordEditActivity2 = this.f9236b;
                        z1.b.r(passwordEditActivity2, passwordEditActivity2.x0().l);
                        if (passwordEditActivity2.x0().l.getText().toString().length() == 0 || passwordEditActivity2.x0().f5457b.getText().toString().length() == 0) {
                            String string = passwordEditActivity2.getString(R.string.error_email_vacio_recuperar_pass);
                            string.getClass();
                            passwordEditActivity2.A(string);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() < 6) {
                            String string2 = passwordEditActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            passwordEditActivity2.A(string2);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() > 99) {
                            String string3 = passwordEditActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            passwordEditActivity2.A(string3);
                            return;
                        }
                        if (!kotlin.jvm.internal.p.b(passwordEditActivity2.x0().l.getText().toString(), passwordEditActivity2.x0().f5457b.getText().toString())) {
                            String string4 = passwordEditActivity2.getString(R.string.password_edit_not_match);
                            string4.getClass();
                            passwordEditActivity2.A(string4);
                            return;
                        }
                        e6 e6Var = (e6) passwordEditActivity2.O.getValue();
                        String obj = passwordEditActivity2.x0().l.getText().toString();
                        String obj2 = passwordEditActivity2.x0().f5457b.getText().toString();
                        e6Var.getClass();
                        obj.getClass();
                        obj2.getClass();
                        ?? obj3 = new Object();
                        ?? obj4 = new Object();
                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(e6Var);
                        j8.e eVar = c8.p0.f3588a;
                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new d6(e6Var, passwordEditActivity2, obj, obj2, obj4, obj3, null), 2);
                        return;
                }
            }
        });
        final int i8 = 2;
        x0().m.setOnClickListener(new View.OnClickListener(this) { // from class: o4.x5

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordEditActivity f9236b;

            {
                this.f9236b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                PasswordEditActivity passwordEditActivity = this.f9236b;
                switch (i32) {
                    case 0:
                        int i82 = PasswordEditActivity.Q;
                        passwordEditActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i10 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().l, passwordEditActivity.x0().f5458n);
                        return;
                    case 2:
                        int i11 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().f5457b, passwordEditActivity.x0().m);
                        return;
                    default:
                        int i12 = PasswordEditActivity.Q;
                        Activity activity = s4.c.o;
                        PasswordEditActivity passwordEditActivity2 = this.f9236b;
                        z1.b.r(passwordEditActivity2, passwordEditActivity2.x0().l);
                        if (passwordEditActivity2.x0().l.getText().toString().length() == 0 || passwordEditActivity2.x0().f5457b.getText().toString().length() == 0) {
                            String string = passwordEditActivity2.getString(R.string.error_email_vacio_recuperar_pass);
                            string.getClass();
                            passwordEditActivity2.A(string);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() < 6) {
                            String string2 = passwordEditActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            passwordEditActivity2.A(string2);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() > 99) {
                            String string3 = passwordEditActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            passwordEditActivity2.A(string3);
                            return;
                        }
                        if (!kotlin.jvm.internal.p.b(passwordEditActivity2.x0().l.getText().toString(), passwordEditActivity2.x0().f5457b.getText().toString())) {
                            String string4 = passwordEditActivity2.getString(R.string.password_edit_not_match);
                            string4.getClass();
                            passwordEditActivity2.A(string4);
                            return;
                        }
                        e6 e6Var = (e6) passwordEditActivity2.O.getValue();
                        String obj = passwordEditActivity2.x0().l.getText().toString();
                        String obj2 = passwordEditActivity2.x0().f5457b.getText().toString();
                        e6Var.getClass();
                        obj.getClass();
                        obj2.getClass();
                        ?? obj3 = new Object();
                        ?? obj4 = new Object();
                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(e6Var);
                        j8.e eVar = c8.p0.f3588a;
                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new d6(e6Var, passwordEditActivity2, obj, obj2, obj4, obj3, null), 2);
                        return;
                }
            }
        });
        x0().l.addTextChangedListener(new y5(this, i));
        x0().f5457b.addTextChangedListener(new y5(this, i3));
        final int i10 = 3;
        x0().t.setOnClickListener(new View.OnClickListener(this) { // from class: o4.x5

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasswordEditActivity f9236b;

            {
                this.f9236b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i10;
                PasswordEditActivity passwordEditActivity = this.f9236b;
                switch (i32) {
                    case 0:
                        int i82 = PasswordEditActivity.Q;
                        passwordEditActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    case 1:
                        int i102 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().l, passwordEditActivity.x0().f5458n);
                        return;
                    case 2:
                        int i11 = PasswordEditActivity.Q;
                        passwordEditActivity.y0(passwordEditActivity.x0().f5457b, passwordEditActivity.x0().m);
                        return;
                    default:
                        int i12 = PasswordEditActivity.Q;
                        Activity activity = s4.c.o;
                        PasswordEditActivity passwordEditActivity2 = this.f9236b;
                        z1.b.r(passwordEditActivity2, passwordEditActivity2.x0().l);
                        if (passwordEditActivity2.x0().l.getText().toString().length() == 0 || passwordEditActivity2.x0().f5457b.getText().toString().length() == 0) {
                            String string = passwordEditActivity2.getString(R.string.error_email_vacio_recuperar_pass);
                            string.getClass();
                            passwordEditActivity2.A(string);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() < 6) {
                            String string2 = passwordEditActivity2.getString(R.string.validation_six_chars_min);
                            string2.getClass();
                            passwordEditActivity2.A(string2);
                            return;
                        }
                        if (passwordEditActivity2.x0().l.getText().toString().length() > 99) {
                            String string3 = passwordEditActivity2.getString(R.string.validation_hundred_chars_max);
                            string3.getClass();
                            passwordEditActivity2.A(string3);
                            return;
                        }
                        if (!kotlin.jvm.internal.p.b(passwordEditActivity2.x0().l.getText().toString(), passwordEditActivity2.x0().f5457b.getText().toString())) {
                            String string4 = passwordEditActivity2.getString(R.string.password_edit_not_match);
                            string4.getClass();
                            passwordEditActivity2.A(string4);
                            return;
                        }
                        e6 e6Var = (e6) passwordEditActivity2.O.getValue();
                        String obj = passwordEditActivity2.x0().l.getText().toString();
                        String obj2 = passwordEditActivity2.x0().f5457b.getText().toString();
                        e6Var.getClass();
                        obj.getClass();
                        obj2.getClass();
                        ?? obj3 = new Object();
                        ?? obj4 = new Object();
                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(e6Var);
                        j8.e eVar = c8.p0.f3588a;
                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new d6(e6Var, passwordEditActivity2, obj, obj2, obj4, obj3, null), 2);
                        return;
                }
            }
        });
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new h(this, (g7.c) null, 29), 2);
    }

    public final g5.f0 x0() {
        return (g5.f0) this.P.getValue();
    }

    public final void y0(EditText editText, ImageView imageView) {
        if (editText.getInputType() == 129) {
            editText.setInputType(145);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_password_visible));
            editText.setSelection(editText.length());
        } else {
            editText.setInputType(129);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_password_hidden));
            editText.setSelection(editText.length());
        }
    }
}
