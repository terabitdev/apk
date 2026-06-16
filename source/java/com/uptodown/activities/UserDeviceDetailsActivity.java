package com.uptodown.activities;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBindings;
import c7.n;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.activities.UserDeviceDetailsActivity;
import f8.l1;
import g7.c;
import j8.d;
import j8.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k5.y2;
import kotlin.jvm.internal.i0;
import o4.b;
import o4.b0;
import o4.f0;
import o4.ob;
import o4.rb;
import o4.sb;
import o4.tb;
import o4.yb;
import r0.i;
import r4.c1;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserDeviceDetailsActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public c1 Q;
    public final n O = new n(new f0(this, 28));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(yb.class), new tb(this, 0), new sb(this), new tb(this, 1));
    public final i R = new i((Object) this, 29);
    public final b S = new b(this, 6);

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        String format;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5401a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        getOnBackPressedDispatcher().addCallback(this.S);
        final int i = 1;
        final int i3 = 0;
        int i8 = 2;
        c cVar = null;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user_device")) {
            l1 l1Var = x0().f9275a;
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) extras.getParcelable("user_device", y2.class);
            } else {
                parcelable = extras.getParcelable("user_device");
            }
            parcelable.getClass();
            l1Var.getClass();
            l1Var.j(null, parcelable);
            final y2 y2Var = (y2) x0().f9275a.getValue();
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            if (drawable != null) {
                w0().t.setNavigationIcon(drawable);
                w0().t.setNavigationContentDescription(getString(R.string.back));
            }
            w0().t.setNavigationOnClickListener(new ob(this, i3));
            w0().G.setTypeface(s4.c.u);
            w0().t.setNavigationOnClickListener(new ob(this, i));
            w0().f5405x.setTypeface(s4.c.u);
            w0().C.setTypeface(s4.c.v);
            w0().D.setTypeface(s4.c.v);
            w0().u.setTypeface(s4.c.v);
            w0().v.setTypeface(s4.c.v);
            w0().A.setTypeface(s4.c.v);
            w0().B.setTypeface(s4.c.v);
            w0().f5406y.setTypeface(s4.c.v);
            w0().f5407z.setTypeface(s4.c.v);
            w0().F.setTypeface(s4.c.v);
            w0().E.setTypeface(s4.c.u);
            w0().f5404w.setTypeface(s4.c.u);
            w0().p.setTypeface(s4.c.v);
            w0().q.setTypeface(s4.c.v);
            w0().E.setOnClickListener(new View.OnClickListener(this) { // from class: o4.pb

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserDeviceDetailsActivity f8992b;

                {
                    this.f8992b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = i3;
                    k5.y2 y2Var2 = y2Var;
                    UserDeviceDetailsActivity userDeviceDetailsActivity = this.f8992b;
                    switch (i10) {
                        case 0:
                            int i11 = UserDeviceDetailsActivity.T;
                            String string = userDeviceDetailsActivity.getString(R.string.unlink_device_confirmation);
                            string.getClass();
                            userDeviceDetailsActivity.I(string, new androidx.compose.animation.core.b(18, userDeviceDetailsActivity, y2Var2));
                            return;
                        default:
                            int i12 = UserDeviceDetailsActivity.T;
                            if (!userDeviceDetailsActivity.isFinishing()) {
                                AlertDialog alertDialog = userDeviceDetailsActivity.F;
                                if (alertDialog != null) {
                                    alertDialog.dismiss();
                                }
                                AlertDialog.Builder builder = new AlertDialog.Builder(userDeviceDetailsActivity);
                                View inflate = userDeviceDetailsActivity.getLayoutInflater().inflate(R.layout.dialog_rename, (ViewGroup) null, false);
                                int i13 = R.id.et_dialog_rename;
                                EditText editText = (EditText) ViewBindings.findChildViewById(inflate, R.id.et_dialog_rename);
                                if (editText != null) {
                                    i13 = R.id.tv_cancel;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_cancel);
                                    if (textView != null) {
                                        i13 = R.id.tv_ok;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_ok);
                                        if (textView2 != null) {
                                            i13 = R.id.tv_title_dialog_rename;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_title_dialog_rename);
                                            if (textView3 != null) {
                                                LinearLayout linearLayout = (LinearLayout) inflate;
                                                a5.z zVar = new a5.z(linearLayout, editText, textView, textView2, textView3);
                                                textView3.setTypeface(s4.c.u);
                                                textView2.setTypeface(s4.c.u);
                                                textView2.setOnClickListener(new a6.c(userDeviceDetailsActivity, y2Var2, zVar, 13));
                                                textView.setTypeface(s4.c.u);
                                                textView.setOnClickListener(new ob(userDeviceDetailsActivity, 3));
                                                builder.setView(linearLayout);
                                                userDeviceDetailsActivity.F = builder.create();
                                                if (!userDeviceDetailsActivity.isFinishing() && userDeviceDetailsActivity.F != null) {
                                                    userDeviceDetailsActivity.s0();
                                                    editText.postDelayed(new androidx.work.impl.c(y2Var2, zVar, userDeviceDetailsActivity, 5), 100L);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                                o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i13)));
                                return;
                            }
                            return;
                    }
                }
            });
            w0().f5402b.setOnClickListener(new View.OnClickListener(this) { // from class: o4.pb

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserDeviceDetailsActivity f8992b;

                {
                    this.f8992b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = i;
                    k5.y2 y2Var2 = y2Var;
                    UserDeviceDetailsActivity userDeviceDetailsActivity = this.f8992b;
                    switch (i10) {
                        case 0:
                            int i11 = UserDeviceDetailsActivity.T;
                            String string = userDeviceDetailsActivity.getString(R.string.unlink_device_confirmation);
                            string.getClass();
                            userDeviceDetailsActivity.I(string, new androidx.compose.animation.core.b(18, userDeviceDetailsActivity, y2Var2));
                            return;
                        default:
                            int i12 = UserDeviceDetailsActivity.T;
                            if (!userDeviceDetailsActivity.isFinishing()) {
                                AlertDialog alertDialog = userDeviceDetailsActivity.F;
                                if (alertDialog != null) {
                                    alertDialog.dismiss();
                                }
                                AlertDialog.Builder builder = new AlertDialog.Builder(userDeviceDetailsActivity);
                                View inflate = userDeviceDetailsActivity.getLayoutInflater().inflate(R.layout.dialog_rename, (ViewGroup) null, false);
                                int i13 = R.id.et_dialog_rename;
                                EditText editText = (EditText) ViewBindings.findChildViewById(inflate, R.id.et_dialog_rename);
                                if (editText != null) {
                                    i13 = R.id.tv_cancel;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_cancel);
                                    if (textView != null) {
                                        i13 = R.id.tv_ok;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_ok);
                                        if (textView2 != null) {
                                            i13 = R.id.tv_title_dialog_rename;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.tv_title_dialog_rename);
                                            if (textView3 != null) {
                                                LinearLayout linearLayout = (LinearLayout) inflate;
                                                a5.z zVar = new a5.z(linearLayout, editText, textView, textView2, textView3);
                                                textView3.setTypeface(s4.c.u);
                                                textView2.setTypeface(s4.c.u);
                                                textView2.setOnClickListener(new a6.c(userDeviceDetailsActivity, y2Var2, zVar, 13));
                                                textView.setTypeface(s4.c.u);
                                                textView.setOnClickListener(new ob(userDeviceDetailsActivity, 3));
                                                builder.setView(linearLayout);
                                                userDeviceDetailsActivity.F = builder.create();
                                                if (!userDeviceDetailsActivity.isFinishing() && userDeviceDetailsActivity.F != null) {
                                                    userDeviceDetailsActivity.s0();
                                                    editText.postDelayed(new androidx.work.impl.c(y2Var2, zVar, userDeviceDetailsActivity, 5), 100L);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                                o2.a.h("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i13)));
                                return;
                            }
                            return;
                    }
                }
            });
            w0().l.setOnClickListener(new ob(this, i8));
            w0().f5405x.setText(y2Var.l);
            w0().D.setText(y2Var.p);
            w0().v.setText(y2Var.m);
            w0().B.setText(y2Var.f7574n);
            TextView textView = w0().f5407z;
            long j = y2Var.q;
            if (j <= 0) {
                format = null;
            } else {
                format = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j));
            }
            textView.setText(format);
            w0().s.setLayoutManager(new LinearLayoutManager(this, 1, false));
            w0().s.setItemAnimator(new DefaultItemAnimator());
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            w0().s.addItemDecoration(new f(dimension, dimension));
            yb x02 = x0();
            x02.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(x02);
            e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, d.f7053a, null, new a5.e(this, y2Var, x02, cVar, 21), 2);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        d8.c cVar2 = h8.n.f6148a;
        c8.f0.z(lifecycleScope, cVar2, null, new rb(this, cVar, i3), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new rb(this, cVar, i), 2);
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new rb(this, cVar, i8), 2);
    }

    public final g5.c1 w0() {
        return (g5.c1) this.O.getValue();
    }

    public final yb x0() {
        return (yb) this.P.getValue();
    }
}
