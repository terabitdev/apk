package com.uptodown.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.b;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.d;
import c7.n;
import c7.z;
import c8.c0;
import c8.p0;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import h5.o;
import h5.u;
import h7.a;
import java.io.File;
import java.util.List;
import k5.s1;
import kotlin.jvm.internal.i0;
import m3.c;
import n4.e;
import o4.b0;
import o4.b3;
import o4.e5;
import o4.f0;
import o4.f5;
import o4.g5;
import o4.h5;
import o4.i5;
import o4.k5;
import o4.l5;
import r4.q;
import y5.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class NotificationsRegistryActivity extends b0 {
    public static final /* synthetic */ int T = 0;
    public q R;
    public final n O = new n(new f0(this, 13));
    public final ViewModelLazy P = new ViewModelLazy(i0.a(l5.class), new h5(this, 0), new g5(this), new h5(this, 1));
    public boolean Q = true;
    public final c S = new c(this, 20);

    public static final void w0(NotificationsRegistryActivity notificationsRegistryActivity, int i, int i3) {
        q qVar = notificationsRegistryActivity.R;
        if (qVar != null && qVar.f10196a.size() > i) {
            q qVar2 = notificationsRegistryActivity.R;
            qVar2.getClass();
            Object obj = qVar2.f10196a.get(i);
            obj.getClass();
            s1 s1Var = (s1) obj;
            String str = s1Var.f7516e;
            if (str != null) {
                List A0 = z7.n.A0(str, new String[]{";"});
                if (A0.size() > i3) {
                    String str2 = (String) A0.get(i3);
                    String str3 = s1Var.f7517f;
                    switch (str2.hashCode()) {
                        case -1569440520:
                            if (str2.equals("positive_apps")) {
                                Intent intent = new Intent(notificationsRegistryActivity, (Class<?>) SecurityActivity.class);
                                float f7 = UptodownApp.G;
                                notificationsRegistryActivity.startActivity(intent, e.a(notificationsRegistryActivity));
                                return;
                            }
                            break;
                        case -1335458389:
                            if (str2.equals("delete")) {
                                if (str3 != null) {
                                    File file = new File(str3);
                                    String string = notificationsRegistryActivity.getString(R.string.dialog_delete_download_msg, file.getName());
                                    string.getClass();
                                    notificationsRegistryActivity.I(string, new e5(file, notificationsRegistryActivity, i, 0));
                                    return;
                                }
                                String string2 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                                string2.getClass();
                                notificationsRegistryActivity.A(string2);
                                return;
                            }
                            break;
                        case -504325460:
                            if (str2.equals("open_app")) {
                                if (str3 != null) {
                                    try {
                                        Intent launchIntentForPackage = notificationsRegistryActivity.getPackageManager().getLaunchIntentForPackage(str3);
                                        if (launchIntentForPackage != null) {
                                            notificationsRegistryActivity.startActivity(launchIntentForPackage);
                                            return;
                                        }
                                        String string3 = notificationsRegistryActivity.getString(R.string.app_detail_not_found);
                                        string3.getClass();
                                        notificationsRegistryActivity.A(string3);
                                        return;
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        String string4 = notificationsRegistryActivity.getString(R.string.app_detail_not_found);
                                        string4.getClass();
                                        notificationsRegistryActivity.A(string4);
                                        return;
                                    }
                                }
                                String string5 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                                string5.getClass();
                                notificationsRegistryActivity.A(string5);
                                return;
                            }
                            break;
                        case -234430262:
                            if (str2.equals("updates")) {
                                Intent intent2 = new Intent(notificationsRegistryActivity, (Class<?>) Updates.class);
                                float f10 = UptodownApp.G;
                                notificationsRegistryActivity.startActivity(intent2, e.a(notificationsRegistryActivity));
                                return;
                            }
                            break;
                        case 1085191854:
                            if (str2.equals("update_uptodown")) {
                                if (str3 != null) {
                                    File file2 = new File(str3);
                                    if (file2.exists()) {
                                        float f11 = UptodownApp.G;
                                        e.q(notificationsRegistryActivity, file2);
                                        return;
                                    } else {
                                        String string6 = notificationsRegistryActivity.getString(R.string.installable_files_not_found);
                                        string6.getClass();
                                        notificationsRegistryActivity.A(string6);
                                        return;
                                    }
                                }
                                String string7 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                                string7.getClass();
                                notificationsRegistryActivity.A(string7);
                                return;
                            }
                            break;
                        case 1117687366:
                            if (str2.equals("preregister")) {
                                if (str3 != null) {
                                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(notificationsRegistryActivity);
                                    j8.e eVar = p0.f3588a;
                                    c8.f0.z(lifecycleScope, h8.n.f6148a, null, new b3(notificationsRegistryActivity, str3, (g7.c) null, 7), 2);
                                    return;
                                } else {
                                    String string8 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                                    string8.getClass();
                                    notificationsRegistryActivity.A(string8);
                                    return;
                                }
                            }
                            break;
                        case 1312704747:
                            if (str2.equals("downloads")) {
                                Intent intent3 = new Intent(notificationsRegistryActivity, (Class<?>) MyDownloads.class);
                                float f12 = UptodownApp.G;
                                notificationsRegistryActivity.startActivity(intent3, e.a(notificationsRegistryActivity));
                                return;
                            }
                            break;
                        case 1957569947:
                            if (str2.equals("install")) {
                                if (str3 != null) {
                                    File file3 = new File(str3);
                                    if (file3.exists()) {
                                        float f13 = UptodownApp.G;
                                        e.q(notificationsRegistryActivity, file3);
                                        return;
                                    } else {
                                        String string9 = notificationsRegistryActivity.getString(R.string.installable_files_not_found);
                                        string9.getClass();
                                        notificationsRegistryActivity.A(string9);
                                        return;
                                    }
                                }
                                String string10 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                                string10.getClass();
                                notificationsRegistryActivity.A(string10);
                                return;
                            }
                            break;
                    }
                    String string11 = notificationsRegistryActivity.getString(R.string.msg_no_action_available);
                    string11.getClass();
                    notificationsRegistryActivity.A(string11);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (c8.f0.K(r8, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (c8.f0.K(r8, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x0(NotificationsRegistryActivity notificationsRegistryActivity, int i, i7.c cVar) {
        i5 i5Var;
        int i3;
        if (cVar instanceof i5) {
            i5Var = (i5) cVar;
            int i8 = i5Var.m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                i5Var.m = i8 - Integer.MIN_VALUE;
                Object obj = i5Var.f8751b;
                i3 = i5Var.m;
                g7.c cVar2 = null;
                int i10 = 2;
                int i11 = 1;
                a aVar = a.f6117a;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = i5Var.f8750a;
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    j8.e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    f5 f5Var = new f5(notificationsRegistryActivity, i, cVar2, i11);
                    i5Var.f8750a = i;
                    i5Var.m = 1;
                }
                j8.e eVar2 = p0.f3588a;
                d8.c cVar3 = h8.n.f6148a;
                f5 f5Var2 = new f5(notificationsRegistryActivity, i, cVar2, i10);
                i5Var.f8750a = i;
                i5Var.m = 2;
            }
        }
        i5Var = new i5(notificationsRegistryActivity, cVar);
        Object obj2 = i5Var.f8751b;
        i3 = i5Var.m;
        g7.c cVar22 = null;
        int i102 = 2;
        int i112 = 1;
        a aVar2 = a.f6117a;
        if (i3 == 0) {
        }
        j8.e eVar22 = p0.f3588a;
        d8.c cVar32 = h8.n.f6148a;
        f5 f5Var22 = new f5(notificationsRegistryActivity, i, cVar22, i102);
        i5Var.f8750a = i;
        i5Var.m = 2;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f5398a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().m.setNavigationIcon(drawable);
            y0().m.setNavigationContentDescription(getString(R.string.back));
        }
        y0().m.setNavigationOnClickListener(new u(this, 14));
        y0().m.inflateMenu(R.menu.menu_notifications_registry);
        y0().m.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        y0().m.setOnMenuItemClickListener(new b(this, 29));
        y0().o.setTypeface(s4.c.u);
        y0().f5400n.setTypeface(s4.c.v);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        y0().l.addItemDecoration(new f(dimension, dimension));
        y0().l.setLayoutManager(linearLayoutManager);
        y0().l.setItemAnimator(new DefaultItemAnimator());
        y0().f5399b.setOnClickListener(new o(14));
        c8.f0.z(LifecycleOwnerKt.getLifecycleScope(this), h8.n.f6148a, null, new f5(this, null), 2);
    }

    @Override // o4.b0, t4.n0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.Q) {
            l5 z0 = z0();
            z0.getClass();
            c0 viewModelScope = ViewModelKt.getViewModelScope(z0);
            j8.e eVar = p0.f3588a;
            c8.f0.z(viewModelScope, j8.d.f7053a, null, new k5(this, z0, null, 1), 2);
        }
    }

    public final g5.c0 y0() {
        return (g5.c0) this.O.getValue();
    }

    public final l5 z0() {
        return (l5) this.P.getValue();
    }
}
