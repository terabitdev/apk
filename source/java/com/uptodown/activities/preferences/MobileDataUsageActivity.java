package com.uptodown.activities.preferences;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c7.n;
import c8.f0;
import com.google.android.material.chip.a;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import g5.w;
import kotlin.jvm.internal.i0;
import n4.e;
import o4.a0;
import o4.b0;
import o4.b1;
import o4.ec;
import o4.g6;
import q4.s;
import q4.t;
import q4.u;
import q4.y;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MobileDataUsageActivity extends b0 {
    public static final /* synthetic */ int Q = 0;
    public final n O = new n(new ec(this, 6));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(y.class), new u(this, 0), new t(this), new u(this, 1));

    public final void A0(String str, String str2, String str3) {
        Bundle f7 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
        if (str2 != null) {
            f7.putString("connectionType", str2);
        }
        if (str3 != null) {
            f7.putString("new_value", str3);
        }
        a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.u(f7, "settings_data_usage");
        }
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        float f7 = UptodownApp.G;
        int i = 0;
        if (e.m(this)) {
            setRequestedOrientation(0);
        }
        RelativeLayout relativeLayout = y0().f5613a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        y0().f5615n.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
        y0().f5615n.setNavigationContentDescription(getString(R.string.back));
        y0().f5615n.setNavigationOnClickListener(new s(this, 5));
        y0().F.setTypeface(c.u);
        y0().G.setTypeface(c.u);
        y0().G.setOnClickListener(new s(this, 10));
        y0().M.setTypeface(c.u);
        y0().M.setOnClickListener(new s(this, 11));
        y0().f5618y.setTypeface(c.u);
        y0().f5618y.setOnClickListener(new s(this, 12));
        y0().u.setTypeface(c.v);
        y0().f5616w.setTypeface(c.v);
        y0().r.setTypeface(c.v);
        y0().J.setTypeface(c.v);
        y0().q.setTypeface(c.u);
        y0().p.setTypeface(c.v);
        y0().A.setTypeface(c.u);
        y0().A.setOnClickListener(new s(this, 13));
        y0().f5617x.setTypeface(c.u);
        y0().f5617x.setOnClickListener(new s(this, i));
        y0().N.setTypeface(c.u);
        y0().N.setOnClickListener(new s(this, 1));
        y0().L.setTypeface(c.u);
        y0().I.setTypeface(c.v);
        y0().K.setTypeface(c.u);
        int i3 = 2;
        y0().K.setOnClickListener(new s(this, i3));
        y0().H.setTypeface(c.u);
        y0().H.setOnClickListener(new s(this, 3));
        y0().o.setTypeface(c.u);
        y0().m.setOnCheckedChangeListener(new a(this, i3));
        y0().t.setTypeface(c.u);
        y0().s.setTypeface(c.v);
        y0().v.setTypeface(c.u);
        y0().v.setOnClickListener(new s(this, 6));
        y0().f5619z.setTypeface(c.u);
        y0().f5619z.setOnClickListener(new s(this, 7));
        y0().E.setTypeface(c.u);
        y0().C.setTypeface(c.v);
        y0().D.setTypeface(c.u);
        y0().D.setOnClickListener(new s(this, 8));
        y0().B.setTypeface(c.u);
        int i8 = 9;
        y0().B.setOnClickListener(new s(this, i8));
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new g6(this, null, i8), 2);
        z0().a(this);
    }

    public final void w0(TextView textView, TextView textView2) {
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        textView.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.blue_primary));
        textView2.setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_stroke_blue_primary));
    }

    public final void x0(TextView textView, TextView textView2, TextView textView3) {
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        textView.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_bg_blue_primary));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.text_secundary));
        textView2.setBackground(null);
        textView3.setTextColor(ContextCompat.getColor(this, R.color.text_secundary));
        textView3.setBackground(null);
    }

    public final w y0() {
        return (w) this.O.getValue();
    }

    public final y z0() {
        return (y) this.P.getValue();
    }
}
