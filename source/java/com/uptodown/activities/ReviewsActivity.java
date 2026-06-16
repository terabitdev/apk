package com.uptodown.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.ReviewsActivity;
import f8.l1;
import g5.q0;
import g7.c;
import h5.o;
import j8.d;
import j8.e;
import k5.g;
import k5.j2;
import m4.a0;
import m4.e0;
import o4.b0;
import o4.b1;
import o4.f0;
import o4.h3;
import o4.i8;
import o4.k8;
import o4.l8;
import o4.m8;
import o4.q2;
import o4.q8;
import r0.i;
import r4.i0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ReviewsActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public i0 Q;
    public final ActivityResultLauncher S;
    public final n O = new n(new f0(this, 21));
    public final ViewModelLazy P = new ViewModelLazy(kotlin.jvm.internal.i0.a(q8.class), new m8(this, 0), new l8(this), new m8(this, 1));
    public final i R = new i((Object) this, 26);

    public ReviewsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new i8(this));
        registerForActivityResult.getClass();
        this.S = registerForActivityResult;
    }

    public final void A0(String str) {
        int intValue = ((Number) y0().l.getValue()).intValue();
        if (1 <= intValue && intValue < 6) {
            q8 y02 = y0();
            y02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(y02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new a5.e(this, str, y02, null, 19), 2);
            return;
        }
        String string = getString(R.string.error_review_no_valoration);
        string.getClass();
        A(string);
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5577a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        c cVar = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appInfo")) {
                l1 l1Var = y0().i;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable2 = extras.getParcelable("appInfo");
                }
                parcelable2.getClass();
                l1Var.getClass();
                l1Var.j(null, parcelable2);
            }
            if (extras.containsKey("myReview")) {
                l1 l1Var2 = y0().j;
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("myReview", j2.class);
                } else {
                    parcelable = extras.getParcelable("myReview");
                }
                l1Var2.i(parcelable);
                if (y0().j.getValue() != null) {
                    l1 l1Var3 = y0().l;
                    Object value = y0().j.getValue();
                    value.getClass();
                    b1.i(((j2) value).p, l1Var3, null);
                }
            }
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().f5580w.setNavigationIcon(drawable);
            w0().f5580w.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 3;
        w0().f5580w.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.h8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8730b;

            {
                this.f8730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                String str5 = null;
                ReviewsActivity reviewsActivity = this.f8730b;
                switch (i3) {
                    case 0:
                        int i8 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "date")) {
                            f8.l1 l1Var4 = reviewsActivity.y0().f9024k;
                            l1Var4.getClass();
                            l1Var4.j(null, "date");
                            s7.a.J(reviewsActivity.w0().C);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 1:
                        int i10 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "best")) {
                            f8.l1 l1Var5 = reviewsActivity.y0().f9024k;
                            l1Var5.getClass();
                            l1Var5.j(null, "best");
                            s7.a.J(reviewsActivity.w0().B);
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "most")) {
                            f8.l1 l1Var6 = reviewsActivity.y0().f9024k;
                            l1Var6.getClass();
                            l1Var6.j(null, "most");
                            s7.a.J(reviewsActivity.w0().D);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = ReviewsActivity.T;
                        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i13 = ReviewsActivity.T;
                        Object systemService = reviewsActivity.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.w0().f5578b.getWindowToken(), 0);
                        reviewsActivity.w0().f5578b.clearFocus();
                        k5.v2 h = k5.t2.h(reviewsActivity);
                        if (h != null) {
                            str5 = h.f7542a;
                        }
                        if (str5 != null && str5.length() != 0) {
                            Editable text = reviewsActivity.w0().f5578b.getText();
                            text.getClass();
                            reviewsActivity.A0(z7.n.G0(text).toString());
                            return;
                        } else {
                            Intent intent2 = new Intent(reviewsActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = reviewsActivity.S;
                            float f7 = UptodownApp.G;
                            activityResultLauncher.launch(intent2, n4.e.b(reviewsActivity));
                            return;
                        }
                }
            }
        });
        a0 d10 = a0.d();
        g gVar = (g) y0().i.getValue();
        if (gVar != null) {
            str = gVar.i();
        } else {
            str = null;
        }
        e0 e10 = d10.e(str);
        float f7 = UptodownApp.G;
        e10.g(n4.e.g(this));
        e10.h(n4.e.v(this));
        e10.e(w0().l, null);
        w0().E.setTypeface(s4.c.u);
        w0().f5582y.setTypeface(s4.c.u);
        TextView textView = w0().f5582y;
        g gVar2 = (g) y0().i.getValue();
        if (gVar2 != null) {
            str2 = gVar2.f7358b;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        w0().f5583z.setTypeface(s4.c.v);
        TextView textView2 = w0().f5583z;
        g gVar3 = (g) y0().i.getValue();
        if (gVar3 != null) {
            str3 = gVar3.l;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        w0().f5581x.setTypeface(s4.c.v);
        TextView textView3 = w0().f5581x;
        g gVar4 = (g) y0().i.getValue();
        if (gVar4 != null) {
            str4 = gVar4.f7379w;
        } else {
            str4 = null;
        }
        textView3.setText(str4);
        w0().A.setTypeface(s4.c.v);
        w0().f5578b.setTypeface(s4.c.v);
        final int i3 = 4;
        w0().m.setOnClickListener(new View.OnClickListener(this) { // from class: o4.h8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8730b;

            {
                this.f8730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                String str5 = null;
                ReviewsActivity reviewsActivity = this.f8730b;
                switch (i32) {
                    case 0:
                        int i8 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "date")) {
                            f8.l1 l1Var4 = reviewsActivity.y0().f9024k;
                            l1Var4.getClass();
                            l1Var4.j(null, "date");
                            s7.a.J(reviewsActivity.w0().C);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 1:
                        int i10 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "best")) {
                            f8.l1 l1Var5 = reviewsActivity.y0().f9024k;
                            l1Var5.getClass();
                            l1Var5.j(null, "best");
                            s7.a.J(reviewsActivity.w0().B);
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "most")) {
                            f8.l1 l1Var6 = reviewsActivity.y0().f9024k;
                            l1Var6.getClass();
                            l1Var6.j(null, "most");
                            s7.a.J(reviewsActivity.w0().D);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = ReviewsActivity.T;
                        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i13 = ReviewsActivity.T;
                        Object systemService = reviewsActivity.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.w0().f5578b.getWindowToken(), 0);
                        reviewsActivity.w0().f5578b.clearFocus();
                        k5.v2 h = k5.t2.h(reviewsActivity);
                        if (h != null) {
                            str5 = h.f7542a;
                        }
                        if (str5 != null && str5.length() != 0) {
                            Editable text = reviewsActivity.w0().f5578b.getText();
                            text.getClass();
                            reviewsActivity.A0(z7.n.G0(text).toString());
                            return;
                        } else {
                            Intent intent2 = new Intent(reviewsActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = reviewsActivity.S;
                            float f72 = UptodownApp.G;
                            activityResultLauncher.launch(intent2, n4.e.b(reviewsActivity));
                            return;
                        }
                }
            }
        });
        final Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_star_on);
        final Drawable drawable3 = ContextCompat.getDrawable(this, R.drawable.vector_star_off);
        final int i8 = 1;
        final int i10 = 2;
        if (y0().j.getValue() != null) {
            Object value2 = y0().j.getValue();
            value2.getClass();
            if (((j2) value2).p >= 1) {
                w0().f5579n.setImageDrawable(drawable2);
            }
            Object value3 = y0().j.getValue();
            value3.getClass();
            if (((j2) value3).p >= 2) {
                w0().o.setImageDrawable(drawable2);
            }
            Object value4 = y0().j.getValue();
            value4.getClass();
            if (((j2) value4).p >= 3) {
                w0().p.setImageDrawable(drawable2);
            }
            Object value5 = y0().j.getValue();
            value5.getClass();
            if (((j2) value5).p >= 4) {
                w0().q.setImageDrawable(drawable2);
            }
            Object value6 = y0().j.getValue();
            value6.getClass();
            if (((j2) value6).p == 5) {
                w0().r.setImageDrawable(drawable2);
            }
            Object value7 = y0().j.getValue();
            value7.getClass();
            String str5 = ((j2) value7).o;
            if (str5 != null && str5.length() != 0) {
                EditText editText = w0().f5578b;
                Object value8 = y0().j.getValue();
                value8.getClass();
                editText.setText(String.valueOf(((j2) value8).o));
            }
        }
        w0().f5579n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.g8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8703b;

            {
                this.f8703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                Drawable drawable4 = drawable3;
                Drawable drawable5 = drawable2;
                ReviewsActivity reviewsActivity = this.f8703b;
                switch (i11) {
                    case 0:
                        int i12 = ReviewsActivity.T;
                        float f10 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var4 = reviewsActivity.y0().l;
                            l1Var4.getClass();
                            l1Var4.j(null, 3);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 1:
                        int i13 = ReviewsActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var5 = reviewsActivity.y0().l;
                            l1Var5.getClass();
                            l1Var5.j(null, 4);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable5);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 2:
                        int i14 = ReviewsActivity.T;
                        float f12 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var6 = reviewsActivity.y0().l;
                            l1Var6.getClass();
                            l1Var6.j(null, 1);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable4);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    default:
                        int i15 = ReviewsActivity.T;
                        float f13 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var7 = reviewsActivity.y0().l;
                            l1Var7.getClass();
                            l1Var7.j(null, 2);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                }
            }
        });
        w0().o.setOnClickListener(new View.OnClickListener(this) { // from class: o4.g8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8703b;

            {
                this.f8703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i;
                Drawable drawable4 = drawable3;
                Drawable drawable5 = drawable2;
                ReviewsActivity reviewsActivity = this.f8703b;
                switch (i11) {
                    case 0:
                        int i12 = ReviewsActivity.T;
                        float f10 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var4 = reviewsActivity.y0().l;
                            l1Var4.getClass();
                            l1Var4.j(null, 3);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 1:
                        int i13 = ReviewsActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var5 = reviewsActivity.y0().l;
                            l1Var5.getClass();
                            l1Var5.j(null, 4);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable5);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 2:
                        int i14 = ReviewsActivity.T;
                        float f12 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var6 = reviewsActivity.y0().l;
                            l1Var6.getClass();
                            l1Var6.j(null, 1);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable4);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    default:
                        int i15 = ReviewsActivity.T;
                        float f13 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var7 = reviewsActivity.y0().l;
                            l1Var7.getClass();
                            l1Var7.j(null, 2);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 0;
        w0().p.setOnClickListener(new View.OnClickListener(this) { // from class: o4.g8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8703b;

            {
                this.f8703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                Drawable drawable4 = drawable3;
                Drawable drawable5 = drawable2;
                ReviewsActivity reviewsActivity = this.f8703b;
                switch (i112) {
                    case 0:
                        int i12 = ReviewsActivity.T;
                        float f10 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var4 = reviewsActivity.y0().l;
                            l1Var4.getClass();
                            l1Var4.j(null, 3);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 1:
                        int i13 = ReviewsActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var5 = reviewsActivity.y0().l;
                            l1Var5.getClass();
                            l1Var5.j(null, 4);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable5);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 2:
                        int i14 = ReviewsActivity.T;
                        float f12 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var6 = reviewsActivity.y0().l;
                            l1Var6.getClass();
                            l1Var6.j(null, 1);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable4);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    default:
                        int i15 = ReviewsActivity.T;
                        float f13 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var7 = reviewsActivity.y0().l;
                            l1Var7.getClass();
                            l1Var7.j(null, 2);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                }
            }
        });
        w0().q.setOnClickListener(new View.OnClickListener(this) { // from class: o4.g8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8703b;

            {
                this.f8703b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i8;
                Drawable drawable4 = drawable3;
                Drawable drawable5 = drawable2;
                ReviewsActivity reviewsActivity = this.f8703b;
                switch (i112) {
                    case 0:
                        int i12 = ReviewsActivity.T;
                        float f10 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var4 = reviewsActivity.y0().l;
                            l1Var4.getClass();
                            l1Var4.j(null, 3);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 1:
                        int i13 = ReviewsActivity.T;
                        float f11 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var5 = reviewsActivity.y0().l;
                            l1Var5.getClass();
                            l1Var5.j(null, 4);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable5);
                            reviewsActivity.w0().q.setImageDrawable(drawable5);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    case 2:
                        int i14 = ReviewsActivity.T;
                        float f12 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var6 = reviewsActivity.y0().l;
                            l1Var6.getClass();
                            l1Var6.j(null, 1);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable4);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                    default:
                        int i15 = ReviewsActivity.T;
                        float f13 = UptodownApp.G;
                        if (n4.e.s()) {
                            f8.l1 l1Var7 = reviewsActivity.y0().l;
                            l1Var7.getClass();
                            l1Var7.j(null, 2);
                            reviewsActivity.w0().f5579n.setImageDrawable(drawable5);
                            reviewsActivity.w0().o.setImageDrawable(drawable5);
                            reviewsActivity.w0().p.setImageDrawable(drawable4);
                            reviewsActivity.w0().q.setImageDrawable(drawable4);
                            reviewsActivity.w0().r.setImageDrawable(drawable4);
                            return;
                        }
                        return;
                }
            }
        });
        w0().r.setOnClickListener(new q2(9, this, drawable2));
        w0().C.setTypeface(s4.c.u);
        w0().C.setOnClickListener(new View.OnClickListener(this) { // from class: o4.h8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8730b;

            {
                this.f8730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i11;
                String str52 = null;
                ReviewsActivity reviewsActivity = this.f8730b;
                switch (i32) {
                    case 0:
                        int i82 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "date")) {
                            f8.l1 l1Var4 = reviewsActivity.y0().f9024k;
                            l1Var4.getClass();
                            l1Var4.j(null, "date");
                            s7.a.J(reviewsActivity.w0().C);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 1:
                        int i102 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "best")) {
                            f8.l1 l1Var5 = reviewsActivity.y0().f9024k;
                            l1Var5.getClass();
                            l1Var5.j(null, "best");
                            s7.a.J(reviewsActivity.w0().B);
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 2:
                        int i112 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "most")) {
                            f8.l1 l1Var6 = reviewsActivity.y0().f9024k;
                            l1Var6.getClass();
                            l1Var6.j(null, "most");
                            s7.a.J(reviewsActivity.w0().D);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = ReviewsActivity.T;
                        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i13 = ReviewsActivity.T;
                        Object systemService = reviewsActivity.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.w0().f5578b.getWindowToken(), 0);
                        reviewsActivity.w0().f5578b.clearFocus();
                        k5.v2 h = k5.t2.h(reviewsActivity);
                        if (h != null) {
                            str52 = h.f7542a;
                        }
                        if (str52 != null && str52.length() != 0) {
                            Editable text = reviewsActivity.w0().f5578b.getText();
                            text.getClass();
                            reviewsActivity.A0(z7.n.G0(text).toString());
                            return;
                        } else {
                            Intent intent2 = new Intent(reviewsActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = reviewsActivity.S;
                            float f72 = UptodownApp.G;
                            activityResultLauncher.launch(intent2, n4.e.b(reviewsActivity));
                            return;
                        }
                }
            }
        });
        w0().B.setTypeface(s4.c.u);
        w0().B.setOnClickListener(new View.OnClickListener(this) { // from class: o4.h8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8730b;

            {
                this.f8730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                String str52 = null;
                ReviewsActivity reviewsActivity = this.f8730b;
                switch (i32) {
                    case 0:
                        int i82 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "date")) {
                            f8.l1 l1Var4 = reviewsActivity.y0().f9024k;
                            l1Var4.getClass();
                            l1Var4.j(null, "date");
                            s7.a.J(reviewsActivity.w0().C);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 1:
                        int i102 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "best")) {
                            f8.l1 l1Var5 = reviewsActivity.y0().f9024k;
                            l1Var5.getClass();
                            l1Var5.j(null, "best");
                            s7.a.J(reviewsActivity.w0().B);
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 2:
                        int i112 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "most")) {
                            f8.l1 l1Var6 = reviewsActivity.y0().f9024k;
                            l1Var6.getClass();
                            l1Var6.j(null, "most");
                            s7.a.J(reviewsActivity.w0().D);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = ReviewsActivity.T;
                        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i13 = ReviewsActivity.T;
                        Object systemService = reviewsActivity.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.w0().f5578b.getWindowToken(), 0);
                        reviewsActivity.w0().f5578b.clearFocus();
                        k5.v2 h = k5.t2.h(reviewsActivity);
                        if (h != null) {
                            str52 = h.f7542a;
                        }
                        if (str52 != null && str52.length() != 0) {
                            Editable text = reviewsActivity.w0().f5578b.getText();
                            text.getClass();
                            reviewsActivity.A0(z7.n.G0(text).toString());
                            return;
                        } else {
                            Intent intent2 = new Intent(reviewsActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = reviewsActivity.S;
                            float f72 = UptodownApp.G;
                            activityResultLauncher.launch(intent2, n4.e.b(reviewsActivity));
                            return;
                        }
                }
            }
        });
        w0().D.setTypeface(s4.c.u);
        w0().D.setOnClickListener(new View.OnClickListener(this) { // from class: o4.h8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReviewsActivity f8730b;

            {
                this.f8730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i10;
                String str52 = null;
                ReviewsActivity reviewsActivity = this.f8730b;
                switch (i32) {
                    case 0:
                        int i82 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "date")) {
                            f8.l1 l1Var4 = reviewsActivity.y0().f9024k;
                            l1Var4.getClass();
                            l1Var4.j(null, "date");
                            s7.a.J(reviewsActivity.w0().C);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 1:
                        int i102 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "best")) {
                            f8.l1 l1Var5 = reviewsActivity.y0().f9024k;
                            l1Var5.getClass();
                            l1Var5.j(null, "best");
                            s7.a.J(reviewsActivity.w0().B);
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().D.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().D.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 2:
                        int i112 = ReviewsActivity.T;
                        if (!kotlin.jvm.internal.p.b(reviewsActivity.y0().f9024k.getValue(), "most")) {
                            f8.l1 l1Var6 = reviewsActivity.y0().f9024k;
                            l1Var6.getClass();
                            l1Var6.j(null, "most");
                            s7.a.J(reviewsActivity.w0().D);
                            reviewsActivity.w0().B.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().B.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.w0().C.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
                            reviewsActivity.w0().C.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
                            reviewsActivity.z0();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = ReviewsActivity.T;
                        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
                        return;
                    default:
                        int i13 = ReviewsActivity.T;
                        Object systemService = reviewsActivity.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.w0().f5578b.getWindowToken(), 0);
                        reviewsActivity.w0().f5578b.clearFocus();
                        k5.v2 h = k5.t2.h(reviewsActivity);
                        if (h != null) {
                            str52 = h.f7542a;
                        }
                        if (str52 != null && str52.length() != 0) {
                            Editable text = reviewsActivity.w0().f5578b.getText();
                            text.getClass();
                            reviewsActivity.A0(z7.n.G0(text).toString());
                            return;
                        } else {
                            Intent intent2 = new Intent(reviewsActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = reviewsActivity.S;
                            float f72 = UptodownApp.G;
                            activityResultLauncher.launch(intent2, n4.e.b(reviewsActivity));
                            return;
                        }
                }
            }
        });
        w0().v.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        w0().v.addItemDecoration(new y5.i(dimension, dimension, dimension, dimension));
        w0().u.setOnScrollChangeListener(new i8(this));
        w0().t.setOnClickListener(new o(19));
        ViewCompat.setOnApplyWindowInsetsListener(w0().f5577a, new i8(this));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new k8(this, cVar, i11), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new k8(this, cVar, i8), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new k8(this, cVar, i10), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new k8(this, cVar, i), 2);
        x0();
    }

    public final q0 w0() {
        return (q0) this.O.getValue();
    }

    public final void x0() {
        if (y0().m) {
            q8 y02 = y0();
            y02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(y02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new h3(y02, this, null, 15), 2);
        }
    }

    public final q8 y0() {
        return (q8) this.P.getValue();
    }

    public final void z0() {
        w0().v.setAdapter(null);
        this.Q = null;
        y0().m = true;
        y0().o = 0;
        x0();
    }
}
