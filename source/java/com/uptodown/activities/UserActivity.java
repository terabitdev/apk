package com.uptodown.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.gestures.x;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import g5.y0;
import j8.d;
import j8.e;
import k5.t2;
import k5.v2;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.p;
import m4.a0;
import m4.e0;
import o4.b0;
import o4.f0;
import o4.ic;
import o4.jc;
import o4.qa;
import o4.ra;
import o4.wa;
import o4.xa;
import o4.ya;
import s4.c;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserActivity extends b0 {
    public static final /* synthetic */ int W = 0;
    public final n O = new n(new f0(this, 25));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(jc.class), new ya(this, 0), new xa(this), new ya(this, 1));
    public String Q;
    public final ActivityResultLauncher R;
    public final ActivityResultLauncher S;
    public final ActivityResultLauncher T;
    public final ActivityResultLauncher U;
    public final ActivityResultLauncher V;

    public UserActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ra(this, 1));
        registerForActivityResult.getClass();
        this.R = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ra(this, 2));
        registerForActivityResult2.getClass();
        this.S = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ra(this, 3));
        registerForActivityResult3.getClass();
        this.T = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ra(this, 4));
        registerForActivityResult4.getClass();
        this.U = registerForActivityResult4;
        ActivityResultLauncher registerForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ra(this, 5));
        registerForActivityResult5.getClass();
        this.V = registerForActivityResult5;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = x0().f5659a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            x0().A.setNavigationIcon(drawable);
            x0().A.setNavigationContentDescription(getString(R.string.back));
        }
        int i = 0;
        x0().A.setNavigationOnClickListener(new qa(this, i));
        x0().A.inflateMenu(R.menu.toolbar_menu_user);
        x0().A.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        x0().A.setOnMenuItemClickListener(new ra(this, i));
        x0().P.setTypeface(c.u);
        x0().T.setTypeface(c.u);
        x0().M.setTypeface(c.u);
        x0().F.setTypeface(c.u);
        x0().S.setTypeface(c.u);
        x0().J.setTypeface(c.u);
        x0().B.setTypeface(c.u);
        x0().I.setTypeface(c.u);
        x0().K.setTypeface(c.u);
        x0().C.setTypeface(c.u);
        x0().O.setTypeface(c.u);
        x0().D.setTypeface(c.u);
        x0().L.setTypeface(c.u);
        x0().R.setTypeface(c.u);
        x0().v.setVisibility(8);
        x0().Q.setTypeface(c.v);
        x0().G.setTypeface(c.v);
        x0().N.setTypeface(c.v);
        x0().H.setTypeface(c.v);
        x0().U.setTypeface(c.v);
        x0().E.setTypeface(c.v);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = p0.f3588a;
        d8.c cVar = h8.n.f6148a;
        g7.c cVar2 = null;
        int i3 = 2;
        c8.f0.z(lifecycleScope, cVar, null, new wa(this, cVar2, i), 2);
        int i8 = 1;
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new wa(this, cVar2, i8), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new wa(this, cVar2, i3), 2);
        jc y02 = y0();
        y02.getClass();
        c8.f0.z(ViewModelKt.getViewModelScope(y02), d.f7053a, null, new ic(this, y02, cVar2, i), 2);
        x0().l.setOnClickListener(new qa(this, i8));
        x0().f5665z.setOnClickListener(new qa(this, i3));
        x0().M.setOnClickListener(new qa(this, 3));
        x0().f5664y.setOnClickListener(new qa(this, 4));
        x0().o.setOnClickListener(new qa(this, 5));
        x0().f5663x.setOnClickListener(new qa(this, 6));
        x0().s.setOnClickListener(new qa(this, 7));
        x0().r.setOnClickListener(new qa(this, 8));
        x0().m.setOnClickListener(new qa(this, 9));
        x0().f5661n.setOnClickListener(new qa(this, 10));
        x0().u.setOnClickListener(new qa(this, 11));
        x0().f5662w.setOnClickListener(new qa(this, 12));
        x0().p.setOnClickListener(new qa(this, 13));
        x0().q.setOnClickListener(new qa(this, 14));
        x0().t.setOnClickListener(new qa(this, 15));
        x0().U.setOnClickListener(new qa(this, 16));
        x0().E.setOnClickListener(new qa(this, 17));
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        MenuItem menuItem;
        String str;
        String str2;
        super.onResume();
        jc y02 = y0();
        y02.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(y02);
        e eVar = p0.f3588a;
        d dVar = d.f7053a;
        g7.c cVar = null;
        c8.f0.z(viewModelScope, dVar, null, new ic(this, y02, cVar, 0), 2);
        Menu menu = x0().A.getMenu();
        if (menu != null) {
            menuItem = menu.findItem(R.id.action_dark_mode);
        } else {
            menuItem = null;
        }
        if ((getResources().getConfiguration().uiMode & 48) == 16) {
            if (menuItem != null) {
                menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.vector_moon));
            }
        } else if (menuItem != null) {
            menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.vector_sun));
        }
        v2 h = t2.h(this);
        if (h != null) {
            str = h.f7542a;
        } else {
            str = null;
        }
        if (str != null && t2.g(this)) {
            if (h.a() != null) {
                a0 d10 = a0.d();
                String str3 = h.l;
                if (str3 != null) {
                    str2 = x.m(str3, UptodownApp.I, ":webp");
                } else {
                    str2 = null;
                }
                e0 e10 = d10.e(str2);
                float f7 = UptodownApp.G;
                e10.h(n4.e.v(this));
                e10.e(x0().l, null);
                x0().l.setBackground(ContextCompat.getDrawable(this, R.drawable.shadow_user_icon));
            } else {
                x0().l.setImageResource(R.drawable.vector_user_profile);
            }
            x0().l.setPadding(0, 0, 0, 0);
            x0().T.setText(h.m);
            if (h.d() && !p.b(h.o, "type0")) {
                int i = UsernameTextView.s;
                b.i(x0().T, h.d(), h.o);
            } else {
                int i3 = UsernameTextView.s;
                b.G(x0().T);
            }
            if (h.d()) {
                x0().f5660b.setVisibility(0);
                ImageView imageView = x0().l;
                int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
                imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
                imageView.setPadding(dimension, dimension, dimension, dimension);
                x0().R.setText(getString(R.string.turbo_welcome_popup_manage_subscription));
            } else {
                x0().R.setText(getString(R.string.subscribe_to_uptodown_turbo));
            }
            x0().E.setVisibility(0);
            if (h.d()) {
                if (this.Q == null) {
                    jc y03 = y0();
                    y03.getClass();
                    c8.f0.z(ViewModelKt.getViewModelScope(y03), dVar, null, new ic(this, y03, cVar, 1), 2);
                } else {
                    x0().v.setVisibility(0);
                }
            } else {
                x0().v.setVisibility(8);
            }
            x0().M.setVisibility(0);
            float f10 = UptodownApp.G;
            n4.e.y(this);
            n4.e.x(this);
            return;
        }
        w0(this);
    }

    public final void w0(Context context) {
        jc y02 = y0();
        y02.getClass();
        context.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(y02);
        e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new f5.b(context, null, 1), 2);
        x0().l.setImageResource(R.drawable.vector_user_login);
        ImageView imageView = x0().l;
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        imageView.setPadding(dimension, dimension, dimension, dimension);
        x0().l.setForeground(null);
        x0().l.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_user_avatar_bg));
        x0().T.setText(getString(R.string.sign_in_sign_up));
        int i = UsernameTextView.s;
        b.G(x0().T);
        x0().T.setTextColor(ContextCompat.getColor(this, R.color.text_terciary));
        x0().R.setText(getString(R.string.subscribe_to_uptodown_turbo));
        x0().M.setVisibility(8);
        x0().E.setVisibility(8);
        x0().v.setVisibility(8);
        this.Q = null;
        x0().f5660b.setVisibility(8);
    }

    public final y0 x0() {
        return (y0) this.O.getValue();
    }

    public final jc y0() {
        return (jc) this.P.getValue();
    }

    public final void z0() {
        if (S()) {
            Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
            float f7 = UptodownApp.G;
            this.R.launch(intent, n4.e.b(this));
        }
    }
}
