package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c7.n;
import com.uptodown.R;
import com.uptodown.activities.UserAvatarActivity;
import g5.z0;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.t2;
import k5.v2;
import kotlin.jvm.internal.i0;
import o4.ab;
import o4.b0;
import o4.cb;
import o4.db;
import o4.f0;
import o4.fb;
import r0.i;
import r4.a1;
import s4.c;
import y5.l;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserAvatarActivity extends b0 {
    public static final /* synthetic */ int V = 0;
    public a1 Q;
    public a1 R;
    public int S;
    public final n O = new n(new f0(this, 26));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(fb.class), new db(this, 0), new cb(this), new db(this, 1));
    public final AtomicBoolean T = new AtomicBoolean(false);
    public final i U = new i((Object) this, 28);

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5669a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        x0().f8676e.i(t2.h(this));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        z0 w02 = w0();
        if (drawable != null) {
            w02.p.setNavigationIcon(drawable);
            w02.p.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = w02.p;
        RecyclerView recyclerView = w02.f5671n;
        TextView textView = w02.r;
        RecyclerView recyclerView2 = w02.o;
        final int i = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.za

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserAvatarActivity f9309b;

            {
                this.f9309b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                g7.c cVar = null;
                UserAvatarActivity userAvatarActivity = this.f9309b;
                switch (i3) {
                    case 0:
                        int i8 = UserAvatarActivity.V;
                        userAvatarActivity.finish();
                        return;
                    case 1:
                        int i10 = UserAvatarActivity.V;
                        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(userAvatarActivity), null, null, new ab(userAvatarActivity, cVar, 0), 3);
                        return;
                    default:
                        int i11 = UserAvatarActivity.V;
                        w5.c.e(userAvatarActivity, f1.g.C(userAvatarActivity), null);
                        return;
                }
            }
        });
        w02.t.setTypeface(c.u);
        w02.s.setTypeface(c.u);
        textView.setTypeface(c.u);
        w02.q.setTypeface(c.u);
        w02.u.setTypeface(c.u);
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: o4.za

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserAvatarActivity f9309b;

            {
                this.f9309b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                g7.c cVar = null;
                UserAvatarActivity userAvatarActivity = this.f9309b;
                switch (i32) {
                    case 0:
                        int i8 = UserAvatarActivity.V;
                        userAvatarActivity.finish();
                        return;
                    case 1:
                        int i10 = UserAvatarActivity.V;
                        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(userAvatarActivity), null, null, new ab(userAvatarActivity, cVar, 0), 3);
                        return;
                    default:
                        int i11 = UserAvatarActivity.V;
                        w5.c.e(userAvatarActivity, f1.g.C(userAvatarActivity), null);
                        return;
                }
            }
        });
        final int i8 = 2;
        if (x0().f8676e.getValue() != null) {
            Object value = x0().f8676e.getValue();
            value.getClass();
            if (((v2) value).d()) {
                w02.f5670b.setOnClickListener(new View.OnClickListener(this) { // from class: o4.za

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UserAvatarActivity f9309b;

                    {
                        this.f9309b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32 = i8;
                        g7.c cVar = null;
                        UserAvatarActivity userAvatarActivity = this.f9309b;
                        switch (i32) {
                            case 0:
                                int i82 = UserAvatarActivity.V;
                                userAvatarActivity.finish();
                                return;
                            case 1:
                                int i10 = UserAvatarActivity.V;
                                c8.f0.z(LifecycleOwnerKt.getLifecycleScope(userAvatarActivity), null, null, new ab(userAvatarActivity, cVar, 0), 3);
                                return;
                            default:
                                int i11 = UserAvatarActivity.V;
                                w5.c.e(userAvatarActivity, f1.g.C(userAvatarActivity), null);
                                return;
                        }
                    }
                });
            }
        }
        int i10 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_m);
        int i11 = 6;
        while (true) {
            if ((i10 - ((i11 + 1) * dimensionPixelSize)) / i11 > getResources().getDimensionPixelSize(R.dimen.icon_size_l)) {
                break;
            }
            i11--;
            if (i11 <= 0) {
                i11 = 1;
                break;
            }
        }
        this.S = (i10 - ((i11 + 1) * dimensionPixelSize)) / i11;
        recyclerView.setLayoutManager(new GridLayoutManager(this, i11));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, 0, false));
        recyclerView2.addItemDecoration(new l(this));
        recyclerView2.setItemAnimator(defaultItemAnimator);
        g7.c cVar = null;
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a5.i0(this, cVar, 23), 3);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new ab(this, cVar, i3), 2);
    }

    public final z0 w0() {
        return (z0) this.O.getValue();
    }

    public final fb x0() {
        return (fb) this.P.getValue();
    }
}
