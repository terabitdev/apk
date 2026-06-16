package com.uptodown.activities;

import a6.g;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.multiprocess.RemoteWorkManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.util.views.UsernameTextView;
import f8.l1;
import g5.n0;
import h5.w0;
import j8.d;
import k5.j2;
import k5.t2;
import k5.v2;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import m3.c;
import m4.a0;
import m4.e0;
import n4.e;
import o4.a8;
import o4.b0;
import o4.b3;
import o4.f0;
import o4.f8;
import o4.j6;
import o4.t7;
import o4.u6;
import o4.x7;
import o4.y1;
import o4.z7;
import r4.h0;
import s7.a;
import w5.q;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class RepliesActivity extends b0 {
    public static final /* synthetic */ int S = 0;
    public h0 Q;
    public final n O = new n(new f0(this, 20));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(f8.class), new a8(this, 0), new z7(this), new a8(this, 1));
    public final c R = new c(this, 24);

    public final void A0(String str) {
        float f7 = UptodownApp.G;
        if (e.s() && S() && str != null && str.length() != 0) {
            c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b3(this, str, (g7.c) null, 11), 3);
        }
    }

    public final void B0(final j2 j2Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean b10 = j2Var.b();
        int i = j2Var.q;
        final int i3 = 5;
        final int i8 = 4;
        final int i10 = 3;
        final int i11 = 2;
        final int i12 = 0;
        final int i13 = 1;
        if (b10) {
            if (i > 0) {
                w0().t.A.setTypeface(s4.c.v);
                if (j2Var.q == 1) {
                    w0().t.A.setText(getString(R.string.replies_counter_single));
                } else {
                    w0().t.A.setText(getString(R.string.replies_counter_multiple, String.valueOf(j2Var.q)));
                }
            } else {
                w0().t.v.setVisibility(8);
            }
            w0().t.u.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f9147b;

                {
                    this.f9147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i12;
                    k5.j2 j2Var2 = j2Var;
                    RepliesActivity repliesActivity = this.f9147b;
                    switch (i14) {
                        case 0:
                            int i15 = RepliesActivity.S;
                            float f7 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity2 = this.f9147b;
                                if (k5.t2.h(repliesActivity2) != null) {
                                    new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                    k5.j2 j2Var3 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                        f8 x02 = repliesActivity2.x0();
                                        x02.getClass();
                                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                        j8.e eVar = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                        repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string = repliesActivity2.getString(R.string.login_required_like_title);
                                string.getClass();
                                String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                string2.getClass();
                                s7.a.t(repliesActivity2, string, string2);
                                return;
                            }
                            return;
                        case 1:
                            int i16 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 2:
                            int i17 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 3:
                            int i18 = RepliesActivity.S;
                            float f10 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity3 = this.f9147b;
                                if (k5.t2.h(repliesActivity3) != null) {
                                    new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                    k5.j2 j2Var4 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                        f8 x03 = repliesActivity3.x0();
                                        x03.getClass();
                                        c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                        j8.e eVar2 = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                        repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                string3.getClass();
                                String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                string4.getClass();
                                s7.a.t(repliesActivity3, string3, string4);
                                return;
                            }
                            return;
                        case 4:
                            int i19 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        default:
                            int i20 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                    }
                }
            });
            if (q.f11212b.contains(Long.valueOf(j2Var.f7415a))) {
                w0().t.f5569n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
            }
            w0().t.f5572y.setTypeface(s4.c.v);
            w0().t.f5572y.setText(String.valueOf(j2Var.s));
            w0().t.o.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            w0().t.p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            w0().t.q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            w0().t.r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            w0().t.s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            if (j2Var.p >= 2) {
                w0().t.p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (j2Var.p >= 3) {
                w0().t.q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (j2Var.p >= 4) {
                w0().t.r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (j2Var.p == 5) {
                w0().t.s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            final v2 h = t2.h(this);
            if (h != null && p.b(h.f7542a, j2Var.f7416b)) {
                w0().t.m.setVisibility(8);
            } else {
                w0().t.m.setVisibility(0);
                if (j2Var.f7419x == 1) {
                    w0().t.m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_following));
                } else {
                    w0().t.m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_follow));
                }
            }
            w0().t.m.setOnClickListener(new View.OnClickListener() { // from class: o4.v7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i12;
                    RepliesActivity repliesActivity = this;
                    k5.v2 v2Var = h;
                    switch (i14) {
                        case 0:
                            if (v2Var != null) {
                                repliesActivity.R.C(-1);
                                return;
                            } else {
                                int i15 = RepliesActivity.S;
                                repliesActivity.z0();
                                return;
                            }
                        default:
                            if (v2Var != null) {
                                repliesActivity.R.C(-1);
                                return;
                            } else {
                                int i16 = RepliesActivity.S;
                                repliesActivity.z0();
                                return;
                            }
                    }
                }
            });
            w0().t.C.setTypeface(s4.c.u);
            w0().t.f5571x.setTypeface(s4.c.v);
            w0().t.f5570w.setTypeface(s4.c.v);
            w0().t.f5573z.setTypeface(s4.c.v);
            CharSequence charSequence4 = (CharSequence) x0().o.getValue();
            if (charSequence4 != null && charSequence4.length() != 0) {
                e0 e10 = a0.d().e(t2.e((String) x0().o.getValue()));
                float f7 = UptodownApp.G;
                e10.h(e.v(this));
                e10.e(w0().t.l, null);
            } else {
                String e11 = t2.e(j2Var.m);
                if (e11 != null && e11.length() != 0) {
                    e0 e12 = a0.d().e(t2.e(j2Var.m));
                    float f10 = UptodownApp.G;
                    e12.h(e.v(this));
                    e12.e(w0().t.l, null);
                } else {
                    e0 f11 = a0.d().f();
                    float f12 = UptodownApp.G;
                    f11.h(e.v(this));
                    f11.e(w0().t.l, null);
                }
            }
            String str = j2Var.l;
            if (str != null && str.length() != 0) {
                w0().t.C.setText(j2Var.l);
                int i14 = UsernameTextView.s;
                b.i(w0().t.C, j2Var.b(), j2Var.f7418w);
            } else {
                CharSequence charSequence5 = (CharSequence) x0().l.getValue();
                if (charSequence5 != null && charSequence5.length() != 0) {
                    w0().t.C.setText((CharSequence) x0().l.getValue());
                    int i15 = UsernameTextView.s;
                    b.i(w0().t.C, j2Var.b(), j2Var.f7418w);
                }
            }
            String str2 = j2Var.r;
            if (str2 != null && str2.length() != 0) {
                w0().t.f5571x.setText(j2Var.r);
            }
            String str3 = j2Var.o;
            if (str3 != null && str3.length() != 0) {
                w0().t.f5570w.setMaxLines(Integer.MAX_VALUE);
                TextView textView = w0().t.f5570w;
                Spanned a10 = j2Var.a();
                if (a10 != null) {
                    charSequence3 = z7.n.G0(a10);
                } else {
                    charSequence3 = null;
                }
                textView.setText(charSequence3);
                if (j2Var.q > 1) {
                    w0().t.f5573z.setText(String.valueOf(j2Var.q));
                }
            } else {
                w0().t.f5570w.setVisibility(8);
            }
            if (j2Var.t == 1) {
                w0().t.f5568b.setVisibility(0);
            }
            String str4 = j2Var.f7416b;
            if (str4 != null && str4.length() != 0) {
                w0().t.C.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RepliesActivity f9147b;

                    {
                        this.f9147b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i142 = i13;
                        k5.j2 j2Var2 = j2Var;
                        RepliesActivity repliesActivity = this.f9147b;
                        switch (i142) {
                            case 0:
                                int i152 = RepliesActivity.S;
                                float f72 = UptodownApp.G;
                                if (n4.e.s()) {
                                    RepliesActivity repliesActivity2 = this.f9147b;
                                    if (k5.t2.h(repliesActivity2) != null) {
                                        new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                        k5.j2 j2Var3 = j2Var;
                                        if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                            f8 x02 = repliesActivity2.x0();
                                            x02.getClass();
                                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                            j8.e eVar = c8.p0.f3588a;
                                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                            repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                            return;
                                        }
                                        return;
                                    }
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    s7.a.t(repliesActivity2, string, string2);
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            case 2:
                                int i17 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            case 3:
                                int i18 = RepliesActivity.S;
                                float f102 = UptodownApp.G;
                                if (n4.e.s()) {
                                    RepliesActivity repliesActivity3 = this.f9147b;
                                    if (k5.t2.h(repliesActivity3) != null) {
                                        new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                        k5.j2 j2Var4 = j2Var;
                                        if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                            f8 x03 = repliesActivity3.x0();
                                            x03.getClass();
                                            c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                            j8.e eVar2 = c8.p0.f3588a;
                                            c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                            repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                            return;
                                        }
                                        return;
                                    }
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    s7.a.t(repliesActivity3, string3, string4);
                                    return;
                                }
                                return;
                            case 4:
                                int i19 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            default:
                                int i20 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                        }
                    }
                });
                w0().t.l.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ RepliesActivity f9147b;

                    {
                        this.f9147b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i142 = i11;
                        k5.j2 j2Var2 = j2Var;
                        RepliesActivity repliesActivity = this.f9147b;
                        switch (i142) {
                            case 0:
                                int i152 = RepliesActivity.S;
                                float f72 = UptodownApp.G;
                                if (n4.e.s()) {
                                    RepliesActivity repliesActivity2 = this.f9147b;
                                    if (k5.t2.h(repliesActivity2) != null) {
                                        new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                        k5.j2 j2Var3 = j2Var;
                                        if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                            f8 x02 = repliesActivity2.x0();
                                            x02.getClass();
                                            c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                            j8.e eVar = c8.p0.f3588a;
                                            c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                            repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                            return;
                                        }
                                        return;
                                    }
                                    String string = repliesActivity2.getString(R.string.login_required_like_title);
                                    string.getClass();
                                    String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                    string2.getClass();
                                    s7.a.t(repliesActivity2, string, string2);
                                    return;
                                }
                                return;
                            case 1:
                                int i16 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            case 2:
                                int i17 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            case 3:
                                int i18 = RepliesActivity.S;
                                float f102 = UptodownApp.G;
                                if (n4.e.s()) {
                                    RepliesActivity repliesActivity3 = this.f9147b;
                                    if (k5.t2.h(repliesActivity3) != null) {
                                        new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                        k5.j2 j2Var4 = j2Var;
                                        if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                            f8 x03 = repliesActivity3.x0();
                                            x03.getClass();
                                            c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                            j8.e eVar2 = c8.p0.f3588a;
                                            c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                            repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                            return;
                                        }
                                        return;
                                    }
                                    String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                    string3.getClass();
                                    String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                    string4.getClass();
                                    s7.a.t(repliesActivity3, string3, string4);
                                    return;
                                }
                                return;
                            case 4:
                                int i19 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                            default:
                                int i20 = RepliesActivity.S;
                                repliesActivity.A0(j2Var2.f7416b);
                                return;
                        }
                    }
                });
            }
            w0().t.t.setOnClickListener(new t7(this, i8));
            w0().t.t.setVisibility(0);
            ImageView imageView = w0().t.l;
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
            w0().t.f5567a.setVisibility(0);
            w0().s.f5557a.setVisibility(8);
            return;
        }
        if (i > 0) {
            w0().s.f5563z.setTypeface(s4.c.v);
            if (j2Var.q == 1) {
                w0().s.f5563z.setText(getString(R.string.replies_counter_single));
            } else {
                w0().s.f5563z.setText(getString(R.string.replies_counter_multiple, String.valueOf(j2Var.q)));
            }
        } else {
            w0().s.u.setVisibility(8);
        }
        w0().s.u.setVisibility(8);
        w0().s.t.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RepliesActivity f9147b;

            {
                this.f9147b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i10;
                k5.j2 j2Var2 = j2Var;
                RepliesActivity repliesActivity = this.f9147b;
                switch (i142) {
                    case 0:
                        int i152 = RepliesActivity.S;
                        float f72 = UptodownApp.G;
                        if (n4.e.s()) {
                            RepliesActivity repliesActivity2 = this.f9147b;
                            if (k5.t2.h(repliesActivity2) != null) {
                                new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                k5.j2 j2Var3 = j2Var;
                                if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                    f8 x02 = repliesActivity2.x0();
                                    x02.getClass();
                                    c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                    j8.e eVar = c8.p0.f3588a;
                                    c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                    repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                    return;
                                }
                                return;
                            }
                            String string = repliesActivity2.getString(R.string.login_required_like_title);
                            string.getClass();
                            String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                            string2.getClass();
                            s7.a.t(repliesActivity2, string, string2);
                            return;
                        }
                        return;
                    case 1:
                        int i16 = RepliesActivity.S;
                        repliesActivity.A0(j2Var2.f7416b);
                        return;
                    case 2:
                        int i17 = RepliesActivity.S;
                        repliesActivity.A0(j2Var2.f7416b);
                        return;
                    case 3:
                        int i18 = RepliesActivity.S;
                        float f102 = UptodownApp.G;
                        if (n4.e.s()) {
                            RepliesActivity repliesActivity3 = this.f9147b;
                            if (k5.t2.h(repliesActivity3) != null) {
                                new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                k5.j2 j2Var4 = j2Var;
                                if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                    f8 x03 = repliesActivity3.x0();
                                    x03.getClass();
                                    c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                    j8.e eVar2 = c8.p0.f3588a;
                                    c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                    repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                    return;
                                }
                                return;
                            }
                            String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                            string3.getClass();
                            String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                            string4.getClass();
                            s7.a.t(repliesActivity3, string3, string4);
                            return;
                        }
                        return;
                    case 4:
                        int i19 = RepliesActivity.S;
                        repliesActivity.A0(j2Var2.f7416b);
                        return;
                    default:
                        int i20 = RepliesActivity.S;
                        repliesActivity.A0(j2Var2.f7416b);
                        return;
                }
            }
        });
        if (q.f11212b.contains(Long.valueOf(j2Var.f7415a))) {
            w0().s.f5559n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
        }
        w0().s.f5561x.setTypeface(s4.c.v);
        w0().s.f5561x.setText(String.valueOf(j2Var.s));
        w0().s.o.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        w0().s.p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        w0().s.q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        w0().s.r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        w0().s.s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        if (j2Var.p >= 2) {
            w0().s.p.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (j2Var.p >= 3) {
            w0().s.q.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (j2Var.p >= 4) {
            w0().s.r.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (j2Var.p == 5) {
            w0().s.s.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        final v2 h10 = t2.h(this);
        if (h10 != null && p.b(h10.f7542a, j2Var.f7416b)) {
            w0().s.m.setVisibility(8);
        } else {
            w0().s.m.setVisibility(0);
            if (j2Var.f7419x == 1) {
                w0().s.m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_following));
            } else {
                w0().s.m.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_follow));
            }
        }
        w0().s.m.setOnClickListener(new View.OnClickListener() { // from class: o4.v7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i13;
                RepliesActivity repliesActivity = this;
                k5.v2 v2Var = h10;
                switch (i142) {
                    case 0:
                        if (v2Var != null) {
                            repliesActivity.R.C(-1);
                            return;
                        } else {
                            int i152 = RepliesActivity.S;
                            repliesActivity.z0();
                            return;
                        }
                    default:
                        if (v2Var != null) {
                            repliesActivity.R.C(-1);
                            return;
                        } else {
                            int i16 = RepliesActivity.S;
                            repliesActivity.z0();
                            return;
                        }
                }
            }
        });
        w0().s.B.setTypeface(s4.c.u);
        w0().s.f5560w.setTypeface(s4.c.v);
        w0().s.v.setTypeface(s4.c.v);
        w0().s.f5562y.setTypeface(s4.c.v);
        CharSequence charSequence6 = (CharSequence) x0().o.getValue();
        if (charSequence6 != null && charSequence6.length() != 0) {
            e0 e13 = a0.d().e(t2.e((String) x0().o.getValue()));
            float f13 = UptodownApp.G;
            e13.h(e.v(this));
            charSequence = null;
            e13.e(w0().s.l, null);
        } else {
            String e14 = t2.e(j2Var.m);
            if (e14 == null || e14.length() == 0) {
                charSequence = null;
                e0 f14 = a0.d().f();
                float f15 = UptodownApp.G;
                f14.h(e.v(this));
                f14.e(w0().s.l, null);
            } else {
                e0 e15 = a0.d().e(t2.e(j2Var.m));
                float f16 = UptodownApp.G;
                e15.h(e.v(this));
                charSequence = null;
                e15.e(w0().s.l, null);
            }
        }
        String str5 = j2Var.l;
        if (str5 != null && str5.length() != 0) {
            w0().s.B.setText(j2Var.l);
            int i16 = UsernameTextView.s;
            b.i(w0().s.B, j2Var.b(), j2Var.f7418w);
        } else {
            CharSequence charSequence7 = (CharSequence) x0().l.getValue();
            if (charSequence7 != null && charSequence7.length() != 0) {
                w0().s.B.setText((CharSequence) x0().l.getValue());
                int i17 = UsernameTextView.s;
                b.i(w0().s.B, j2Var.b(), j2Var.f7418w);
            }
        }
        String str6 = j2Var.r;
        if (str6 != null && str6.length() != 0) {
            w0().s.f5560w.setText(j2Var.r);
        }
        String str7 = j2Var.o;
        if (str7 != null && str7.length() != 0) {
            w0().s.v.setMaxLines(Integer.MAX_VALUE);
            TextView textView2 = w0().s.v;
            Spanned a11 = j2Var.a();
            if (a11 != null) {
                charSequence2 = z7.n.G0(a11);
            } else {
                charSequence2 = charSequence;
            }
            textView2.setText(charSequence2);
            if (j2Var.q > 0) {
                w0().s.f5562y.setText(String.valueOf(j2Var.q));
            }
        } else {
            w0().s.v.setVisibility(8);
        }
        if (j2Var.t == 1) {
            w0().s.f5558b.setVisibility(0);
        }
        String str8 = j2Var.f7416b;
        if (str8 != null && str8.length() != 0) {
            w0().s.B.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f9147b;

                {
                    this.f9147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i8;
                    k5.j2 j2Var2 = j2Var;
                    RepliesActivity repliesActivity = this.f9147b;
                    switch (i142) {
                        case 0:
                            int i152 = RepliesActivity.S;
                            float f72 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity2 = this.f9147b;
                                if (k5.t2.h(repliesActivity2) != null) {
                                    new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                    k5.j2 j2Var3 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                        f8 x02 = repliesActivity2.x0();
                                        x02.getClass();
                                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                        j8.e eVar = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                        repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string = repliesActivity2.getString(R.string.login_required_like_title);
                                string.getClass();
                                String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                string2.getClass();
                                s7.a.t(repliesActivity2, string, string2);
                                return;
                            }
                            return;
                        case 1:
                            int i162 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 2:
                            int i172 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 3:
                            int i18 = RepliesActivity.S;
                            float f102 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity3 = this.f9147b;
                                if (k5.t2.h(repliesActivity3) != null) {
                                    new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                    k5.j2 j2Var4 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                        f8 x03 = repliesActivity3.x0();
                                        x03.getClass();
                                        c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                        j8.e eVar2 = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                        repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                string3.getClass();
                                String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                string4.getClass();
                                s7.a.t(repliesActivity3, string3, string4);
                                return;
                            }
                            return;
                        case 4:
                            int i19 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        default:
                            int i20 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                    }
                }
            });
            w0().s.l.setOnClickListener(new View.OnClickListener(this) { // from class: o4.u7

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RepliesActivity f9147b;

                {
                    this.f9147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i3;
                    k5.j2 j2Var2 = j2Var;
                    RepliesActivity repliesActivity = this.f9147b;
                    switch (i142) {
                        case 0:
                            int i152 = RepliesActivity.S;
                            float f72 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity2 = this.f9147b;
                                if (k5.t2.h(repliesActivity2) != null) {
                                    new a6.s(repliesActivity2).d(repliesActivity2.w0().t.f5569n);
                                    k5.j2 j2Var3 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var3.f7415a))) {
                                        f8 x02 = repliesActivity2.x0();
                                        x02.getClass();
                                        c8.c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                                        j8.e eVar = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope, j8.d.f7053a, null, new a5.k(j2Var3, repliesActivity2, x02, (g7.c) null, 17), 2);
                                        repliesActivity2.w0().t.f5572y.setText(String.valueOf(j2Var3.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string = repliesActivity2.getString(R.string.login_required_like_title);
                                string.getClass();
                                String string2 = repliesActivity2.getString(R.string.login_required_like_msg);
                                string2.getClass();
                                s7.a.t(repliesActivity2, string, string2);
                                return;
                            }
                            return;
                        case 1:
                            int i162 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 2:
                            int i172 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        case 3:
                            int i18 = RepliesActivity.S;
                            float f102 = UptodownApp.G;
                            if (n4.e.s()) {
                                RepliesActivity repliesActivity3 = this.f9147b;
                                if (k5.t2.h(repliesActivity3) != null) {
                                    new a6.s(repliesActivity3).d(repliesActivity3.w0().s.f5559n);
                                    k5.j2 j2Var4 = j2Var;
                                    if (!w5.q.f11212b.contains(Long.valueOf(j2Var4.f7415a))) {
                                        f8 x03 = repliesActivity3.x0();
                                        x03.getClass();
                                        c8.c0 viewModelScope2 = ViewModelKt.getViewModelScope(x03);
                                        j8.e eVar2 = c8.p0.f3588a;
                                        c8.f0.z(viewModelScope2, j8.d.f7053a, null, new a5.k(j2Var4, repliesActivity3, x03, (g7.c) null, 17), 2);
                                        repliesActivity3.w0().s.f5561x.setText(String.valueOf(j2Var4.s + 1));
                                        return;
                                    }
                                    return;
                                }
                                String string3 = repliesActivity3.getString(R.string.login_required_like_title);
                                string3.getClass();
                                String string4 = repliesActivity3.getString(R.string.login_required_like_msg);
                                string4.getClass();
                                s7.a.t(repliesActivity3, string3, string4);
                                return;
                            }
                            return;
                        case 4:
                            int i19 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                        default:
                            int i20 = RepliesActivity.S;
                            repliesActivity.A0(j2Var2.f7416b);
                            return;
                    }
                }
            });
        }
    }

    public final void C0() {
        String str;
        v2 h = t2.h(this);
        if (h != null) {
            str = h.l;
        } else {
            str = null;
        }
        if (str != null) {
            e0 e10 = a0.d().e(t2.e(h.l));
            float f7 = UptodownApp.G;
            e10.g(e.g(this));
            e10.h(e.v(this));
            e10.e(w0().f5549n, null);
            if (h.d()) {
                ImageView imageView = w0().f5549n;
                int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
                imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_small_avatar_turbo));
                imageView.setPadding(dimension, dimension, dimension, dimension);
                return;
            }
            return;
        }
        w0().f5549n.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_user_default));
    }

    public final void D0() {
        String str;
        v2 h = t2.h(this);
        if (h != null) {
            str = h.f7542a;
        } else {
            str = null;
        }
        if (str != null) {
            String str2 = h.f7542a;
            str2.getClass();
            if (str2.length() > 0) {
                w0().q.setVisibility(8);
                return;
            }
        }
        w0().q.setVisibility(0);
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5547a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        g7.c cVar = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("review")) {
                l1 l1Var = x0().m;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("review", j2.class);
                } else {
                    parcelable = extras.getParcelable("review");
                }
                l1Var.i(parcelable);
            }
            if (extras.containsKey("appName")) {
                x0().f8667k.i(extras.getString("appName"));
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                x0().l.i(extras.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
            if (extras.containsKey("appIconUrl")) {
                x0().f8668n.i(extras.getString("appIconUrl"));
            }
            if (extras.containsKey("userAvatarUrl")) {
                x0().o.i(extras.getString("userAvatarUrl"));
            }
            if (extras.containsKey("appId")) {
                l1 l1Var2 = x0().p;
                Long valueOf = Long.valueOf(extras.getLong("appId"));
                l1Var2.getClass();
                l1Var2.j(null, valueOf);
            }
            if (extras.containsKey("appUrl")) {
                x0().q.i(extras.getString("appUrl"));
            }
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5550w.setNavigationIcon(drawable);
            w0().f5550w.setNavigationContentDescription(getString(R.string.back));
        }
        int i = 0;
        w0().f5550w.setNavigationOnClickListener(new t7(this, i));
        w0().A.setTypeface(s4.c.u);
        w0().f5551x.setTypeface(s4.c.v);
        w0().f5552y.setTypeface(s4.c.u);
        w0().f5552y.setText((CharSequence) x0().f8667k.getValue());
        e0 e10 = a0.d().e((String) x0().f8668n.getValue());
        float f7 = UptodownApp.G;
        e10.g(e.g(this));
        e10.h(e.v(this));
        e10.e(w0().l, null);
        w0().o.setVisibility(0);
        int i3 = 1;
        w0().o.setOnClickListener(new t7(this, i3));
        w0().f5553z.setTypeface(s4.c.v);
        C0();
        int i8 = 2;
        w0().m.setOnClickListener(new t7(this, i8));
        int i10 = 3;
        w0().q.setOnClickListener(new t7(this, i10));
        w0().f5548b.setTypeface(s4.c.v);
        w0().f5548b.setOnEditorActionListener(new y1(this, i3));
        D0();
        w0().v.setLayoutManager(new LinearLayoutManager(this, 1, false));
        w0().v.setItemAnimator(new DefaultItemAnimator());
        w0().r.getViewTreeObserver().addOnScrollChangedListener(new u6(this, i3));
        ViewCompat.setOnApplyWindowInsetsListener(w0().f5547a, new j6(this, i8));
        if (x0().m.getValue() != null) {
            Object value = x0().m.getValue();
            value.getClass();
            long j = ((j2) value).f7415a;
            f8 x02 = x0();
            x02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
            j8.e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new g(x02, this, j, null), 2);
            Object value2 = x0().m.getValue();
            value2.getClass();
            B0((j2) value2);
        } else {
            finish();
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new x7(this, cVar, i), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new x7(this, cVar, i3), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new x7(this, cVar, i8), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new x7(this, cVar, i10), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new x7(this, cVar, 4), 2);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        D0();
        C0();
    }

    public final n0 w0() {
        return (n0) this.O.getValue();
    }

    public final f8 x0() {
        return (f8) this.P.getValue();
    }

    public final void y0() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(w0().f5548b.getWindowToken(), 0);
        if (S()) {
            if (w0().f5548b.getText() != null && z7.n.G0(w0().f5548b.getText().toString()).toString().length() > 0) {
                String obj = w0().f5548b.getText().toString();
                String z10 = a.z(this, "last_review_text");
                String z11 = a.z(this, "last_review_timestamp");
                if (z11 == null) {
                    z11 = "0";
                }
                if (obj != null && obj.equalsIgnoreCase(z10) && System.currentTimeMillis() - Long.parseLong(z11) < RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS) {
                    w0().f5548b.setText("");
                    return;
                }
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                String obj2 = w0().f5548b.getText().toString();
                obj2.getClass();
                a.S(applicationContext, "last_review_text", obj2);
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                String valueOf = String.valueOf(System.currentTimeMillis());
                valueOf.getClass();
                a.S(applicationContext2, "last_review_timestamp", valueOf);
                f8 x02 = x0();
                String obj3 = w0().f5548b.getText().toString();
                Object value = x0().m.getValue();
                value.getClass();
                long j = ((j2) value).f7415a;
                x02.getClass();
                obj3.getClass();
                c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
                j8.e eVar = p0.f3588a;
                c8.f0.z(viewModelScope, d.f7053a, null, new w0(this, obj3, j, x02, null, 2), 2);
                return;
            }
            if (z7.n.G0(w0().f5548b.getText().toString()).toString().length() == 0) {
                String string = getString(R.string.empty_answer_error);
                string.getClass();
                A(string);
            }
        }
    }

    public final void z0() {
        if (!isFinishing()) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) LoginActivity.class);
            float f7 = UptodownApp.G;
            startActivity(intent, e.a(this));
        }
    }
}
