package com.uptodown.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import g5.l0;
import g7.c;
import j8.d;
import j8.e;
import k5.t2;
import k5.v2;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import m4.a0;
import m4.e0;
import o4.b0;
import o4.b7;
import o4.c7;
import o4.d7;
import o4.f0;
import o4.f7;
import o4.i7;
import o4.j6;
import o4.t6;
import o4.u6;
import o4.v6;
import o4.y6;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class PublicProfileActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public final n O = new n(new f0(this, 19));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(i7.class), new d7(this, 0), new c7(this), new d7(this, 1));
    public final ActivityResultLauncher Q;

    public PublicProfileActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 1));
        registerForActivityResult.getClass();
        this.Q = registerForActivityResult;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        ?? obj = new Object();
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user")) {
            obj.f7675a = extras.getParcelable("user");
        }
        Object obj2 = obj.f7675a;
        int i = 1;
        int i3 = 0;
        int i8 = 2;
        c cVar = null;
        if (obj2 != null) {
            v2 v2Var = (v2) obj2;
            RelativeLayout relativeLayout = w0().f5531a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            w0().u.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.vector_arrow_left_white));
            w0().u.setNavigationContentDescription(getString(R.string.back));
            w0().u.setNavigationOnClickListener(new t6(this, i3));
            w0().t.getViewTreeObserver().addOnScrollChangedListener(new u6(this, i3));
            w0().G.setTypeface(s4.c.u);
            w0().C.setTypeface(s4.c.u);
            w0().D.setTypeface(s4.c.v);
            w0().v.setTypeface(s4.c.u);
            w0().f5535x.setTypeface(s4.c.u);
            w0().A.setTypeface(s4.c.v);
            w0().B.setTypeface(s4.c.u);
            w0().E.setTypeface(s4.c.v);
            w0().F.setTypeface(s4.c.u);
            w0().f5536y.setTypeface(s4.c.v);
            w0().f5537z.setTypeface(s4.c.u);
            ((TextView) w0().r.q).setTypeface(s4.c.u);
            ((TextView) w0().r.o).setTypeface(s4.c.u);
            ((TextView) w0().r.p).setTypeface(s4.c.v);
            ((TextView) w0().H.q).setTypeface(s4.c.u);
            ((TextView) w0().H.o).setTypeface(s4.c.u);
            ((TextView) w0().H.p).setTypeface(s4.c.v);
            ((TextView) w0().s.q).setTypeface(s4.c.u);
            ((TextView) w0().s.o).setTypeface(s4.c.u);
            ((TextView) w0().s.p).setTypeface(s4.c.v);
            z0(v2Var);
            ((RecyclerView) w0().r.f9891n).setLayoutManager(new LinearLayoutManager(this, 0, false));
            ((RecyclerView) w0().r.f9891n).setItemAnimator(null);
            ((RecyclerView) w0().s.f9891n).setLayoutManager(new LinearLayoutManager(this, 0, false));
            w0().f5533n.setOnClickListener(new v6(this, v2Var, i3));
            w0().o.setOnClickListener(new v6(this, v2Var, i));
            w0().p.setOnClickListener(new v6(this, v2Var, i8));
            v2 h = t2.h(this);
            String str2 = v2Var.f7542a;
            if (h != null) {
                str = h.f7542a;
            } else {
                str = null;
            }
            if (p.b(str2, str)) {
                ((RecyclerView) w0().H.f9891n).setLayoutManager(new LinearLayoutManager(this, 0, false));
                ((RecyclerView) w0().H.f9891n).setItemAnimator(null);
                ((TextView) w0().H.q).setText(getString(R.string.my_wishlist));
                ((TextView) w0().H.q).setText(getString(R.string.my_wishlist));
                ((TextView) w0().r.q).setText(getString(R.string.my_recommended_apps));
                ((TextView) w0().s.p).setText(getString(R.string.my_profile_no_review));
                ((TextView) w0().s.q).setText(getString(R.string.public_profile_my_reviews));
                w0().v.setVisibility(0);
                w0().v.setOnClickListener(new v6(h, this));
                w0().l.setOnClickListener(new v6(this, v2Var, 4));
                w0().f5534w.setTypeface(s4.c.u);
                w0().f5534w.setVisibility(0);
                w0().f5534w.setOnClickListener(new t6(this, i));
                w0().f5535x.setVisibility(8);
            } else {
                w0().v.setVisibility(8);
                w0().f5535x.setOnClickListener(new v6(this, v2Var, 5));
                ((TextView) w0().r.q).setText(getString(R.string.recommended_apps));
                ((TextView) w0().s.q).setText(getString(R.string.public_profile_activity_reviews_any_user_title));
            }
            i7 x02 = x0();
            String valueOf = String.valueOf(((v2) obj.f7675a).f7542a);
            v2 v2Var2 = (v2) obj.f7675a;
            int i10 = v2Var2.r;
            int i11 = v2Var2.s;
            x02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new f7(x02, i11, this, valueOf, i10, null), 2);
        }
        v2 h10 = t2.h(this);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new y6(this, obj, h10, cVar, 0), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new y6(this, obj, h10, cVar, 1), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new b7(this, cVar, i3), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new b7(this, cVar, i), 2);
    }

    public final l0 w0() {
        return (l0) this.O.getValue();
    }

    public final i7 x0() {
        return (i7) this.P.getValue();
    }

    public final void y0(int i, String str, String str2) {
        if (S()) {
            Intent intent = new Intent(this, (Class<?>) FollowListActivity.class);
            intent.putExtra(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, i);
            intent.putExtra(HintConstants.AUTOFILL_HINT_USERNAME, str);
            intent.putExtra("userID", str2);
            float f7 = UptodownApp.G;
            startActivity(intent, n4.e.a(this));
        }
    }

    public final void z0(v2 v2Var) {
        String str;
        int i = UsernameTextView.s;
        b.i(w0().C, v2Var.d(), v2Var.o);
        w0().C.setText(v2Var.m);
        v2 h = t2.h(this);
        String str2 = v2Var.f7542a;
        if (h != null) {
            str = h.f7542a;
        } else {
            str = null;
        }
        if (p.b(str2, str)) {
            w0().G.setText(getString(R.string.my_profile));
        } else {
            w0().G.setText(v2Var.m);
        }
        w0().D.setText(v2Var.u);
        String str3 = v2Var.p;
        if (str3 != null && str3.length() != 0 && w0().f5532b.getDrawable() == null) {
            e0 e10 = a0.d().e(v2Var.p);
            e10.f7845c = true;
            e10.e(w0().f5532b, null);
        }
        String a10 = v2Var.a();
        if (a10 != null && a10.length() != 0) {
            e0 e11 = a0.d().e(t2.e(v2Var.l));
            float f7 = UptodownApp.G;
            e11.h(n4.e.w(this));
            e11.e(w0().l, null);
            w0().l.setBackground(ContextCompat.getDrawable(this, R.drawable.shadow_user_icon));
        }
        if (v2Var.d()) {
            ImageView imageView = w0().l;
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
            w0().m.setVisibility(0);
        }
        w0().B.setText(w5.c.c(v2Var.t));
        w0().F.setText(String.valueOf(v2Var.q));
    }
}
