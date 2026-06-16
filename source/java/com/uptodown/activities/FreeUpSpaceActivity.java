package com.uptodown.activities;

import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import c7.n;
import c7.z;
import c8.c0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.uptodown.R;
import h5.o;
import h5.u;
import h7.a;
import i7.j;
import j8.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k5.g;
import kotlin.jvm.internal.i0;
import m3.c;
import o4.b0;
import o4.f0;
import o4.t0;
import o4.v0;
import o4.w0;
import o4.y0;
import o4.z0;
import r4.e;
import y5.f;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FreeUpSpaceActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public e Q;
    public g R;
    public final n O = new n(new f0(this, 2));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(z0.class), new w0(this, 0), new v0(this), new w0(this, 1));
    public final c S = new c(this, 16);

    public static final int w0(FreeUpSpaceActivity freeUpSpaceActivity, String str) {
        ArrayList arrayList;
        e eVar = freeUpSpaceActivity.Q;
        ArrayList arrayList2 = null;
        if (eVar != null) {
            arrayList = eVar.a();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            e eVar2 = freeUpSpaceActivity.Q;
            if (eVar2 != null) {
                arrayList2 = eVar2.a();
            }
            arrayList2.getClass();
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i3 = i + 1;
                if (v.a0(((k5.e) it.next()).l, str, true)) {
                    return i;
                }
                i = i3;
            }
            return -1;
        }
        return -1;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = 1;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
            Intent intent2 = getIntent();
            intent2.getClass();
            Bundle extras2 = intent2.getExtras();
            extras2.getClass();
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) extras2.getParcelable("appInfo", g.class);
            } else {
                parcelable = extras2.getParcelable("appInfo");
            }
            this.R = (g) parcelable;
        }
        RelativeLayout relativeLayout = y0().f5544a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().f5546n.setNavigationIcon(drawable);
            y0().f5546n.setNavigationContentDescription(getString(R.string.back));
        }
        y0().f5546n.setNavigationOnClickListener(new u(this, 9));
        y0().o.setTypeface(s4.c.u);
        ((TextView) y0().f5545b.l).setTypeface(s4.c.v);
        ((TextView) y0().f5545b.m).setTypeface(s4.c.v);
        ((TextView) y0().f5545b.f5483b).setTypeface(s4.c.u);
        ((TextView) y0().f5545b.f5483b).setVisibility(8);
        z0();
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        y0().m.addItemDecoration(new f(dimension, dimension));
        y0().m.setLayoutManager(new LinearLayoutManager(this, 1, false));
        y0().m.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) y0().m.getItemAnimator();
        simpleItemAnimator.getClass();
        simpleItemAnimator.setSupportsChangeAnimations(false);
        y0().l.setOnClickListener(new o(4));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t0(this, null, i), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 82) {
            y0().f5546n.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        z0 z0Var = (z0) this.P.getValue();
        z0Var.getClass();
        c0 viewModelScope = ViewModelKt.getViewModelScope(z0Var);
        j8.e eVar = p0.f3588a;
        c8.f0.z(viewModelScope, d.f7053a, null, new y0(true, z0Var, this, null, 0), 2);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
    }

    public final Object x0(String str, String str2, j jVar) {
        j8.e eVar = p0.f3588a;
        Object K = c8.f0.K(h8.n.f6148a, new a5.e(this, str2, str, null, 12), jVar);
        if (K == a.f6117a) {
            return K;
        }
        return z.f3538a;
    }

    public final g5.n y0() {
        return (g5.n) this.O.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        long j;
        File file;
        u4.a aVar;
        File externalFilesDir;
        long A;
        long j10;
        String str;
        g gVar = this.R;
        if (gVar != null && (str = gVar.p) != null) {
            try {
                str.getClass();
                j = Long.parseLong(str);
            } catch (Exception unused) {
            }
            aVar = new u4.a(this);
            if (!aVar.d()) {
                File[] externalFilesDirs = getExternalFilesDirs(null);
                if (externalFilesDirs.length > 1) {
                    externalFilesDir = externalFilesDirs[1];
                } else {
                    File externalFilesDir2 = getExternalFilesDir(null);
                    aVar.g();
                    aVar.f();
                    externalFilesDir = externalFilesDir2;
                }
            } else {
                externalFilesDir = getExternalFilesDir(null);
            }
            file = new File(externalFilesDir, "Apps");
            if (!file.exists()) {
                file.mkdirs();
            }
            A = b.A(this, file);
            long totalSpace = file.getTotalSpace();
            j10 = (long) (j * 2.25d);
            long j11 = totalSpace - A;
            long j12 = (100 * j11) / totalSpace;
            long j13 = totalSpace - ((9 * totalSpace) / 10);
            if (j10 <= A) {
                String x5 = a4.x(this, j10 - A);
                ((ProgressBar) y0().f5545b.f5484n).setProgress((int) j12);
                ((ProgressBar) y0().f5545b.p).setVisibility(8);
                ((ProgressBar) y0().f5545b.f5484n).setVisibility(0);
                ((TextView) y0().f5545b.l).setText(getString(R.string.error_not_enough_space));
                ((TextView) y0().f5545b.m).setText(getString(R.string.no_storage_text, x5));
                return;
            }
            if (A < j13) {
                ((ProgressBar) y0().f5545b.f5484n).setProgress((int) j12);
                ((ProgressBar) y0().f5545b.p).setVisibility(8);
                ((ProgressBar) y0().f5545b.f5484n).setVisibility(0);
                ((TextView) y0().f5545b.l).setText(getString(R.string.error_not_enough_space));
                ((TextView) y0().f5545b.m).setText(getString(R.string.enough_storage_text, a4.x(this, j11), a4.x(this, totalSpace)));
                return;
            }
            ((ProgressBar) y0().f5545b.p).setProgress((int) j12);
            ((ProgressBar) y0().f5545b.f5484n).setVisibility(8);
            ((ProgressBar) y0().f5545b.p).setVisibility(0);
            ((TextView) y0().f5545b.l).setText(getString(R.string.enough_storage_title));
            ((TextView) y0().f5545b.m).setText(getString(R.string.enough_storage_text, a4.x(this, j11), a4.x(this, totalSpace)));
            return;
        }
        j = 0;
        aVar = new u4.a(this);
        if (!aVar.d()) {
        }
        file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
        }
        A = b.A(this, file);
        long totalSpace2 = file.getTotalSpace();
        j10 = (long) (j * 2.25d);
        long j112 = totalSpace2 - A;
        long j122 = (100 * j112) / totalSpace2;
        long j132 = totalSpace2 - ((9 * totalSpace2) / 10);
        if (j10 <= A) {
        }
    }
}
