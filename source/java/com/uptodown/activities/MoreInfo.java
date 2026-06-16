package com.uptodown.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import b.d;
import c7.n;
import c7.z;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MoreInfo;
import g5.r;
import g5.x;
import h5.k2;
import h5.o;
import h5.u;
import h7.a;
import i7.c;
import j8.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import k5.g;
import k5.j;
import k5.v1;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.p;
import o4.b0;
import o4.f0;
import o4.j3;
import o4.m3;
import o4.n3;
import o4.o3;
import o4.p3;
import o4.q3;
import o4.r3;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MoreInfo extends b0 {
    public static final /* synthetic */ int V = 0;
    public g Q;
    public ArrayList R;
    public ArrayList S;
    public ArrayList T;
    public final LifecycleCoroutineScope O = LifecycleOwnerKt.getLifecycleScope(this);
    public final n P = new n(new f0(this, 10));
    public final int U = 2;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (c8.f0.K(r8, r3, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (c8.f0.K(r8, r6, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(MoreInfo moreInfo, c cVar) {
        o3 o3Var;
        int i;
        h0 w6;
        if (cVar instanceof o3) {
            o3Var = (o3) cVar;
            int i3 = o3Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o3Var.m = i3 - Integer.MIN_VALUE;
                Object obj = o3Var.f8941b;
                i = o3Var.m;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w6 = o3Var.f8940a;
                    c7.a.e(obj);
                } else {
                    w6 = m.w(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    p3 p3Var = new p3(moreInfo, w6, (g7.c) null);
                    o3Var.f8940a = w6;
                    o3Var.m = 1;
                }
                e eVar2 = p0.f3588a;
                d8.c cVar2 = h8.n.f6148a;
                p3 p3Var2 = new p3(w6, moreInfo, (g7.c) null);
                o3Var.f8940a = null;
                o3Var.m = 2;
            }
        }
        o3Var = new o3(moreInfo, cVar);
        Object obj2 = o3Var.f8941b;
        i = o3Var.m;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        d8.c cVar22 = h8.n.f6148a;
        p3 p3Var22 = new p3(w6, moreInfo, (g7.c) null);
        o3Var.f8940a = null;
        o3Var.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (c8.f0.K(r9, r3, r0) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (c8.f0.K(r9, r4, r0) != r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x0(MoreInfo moreInfo, c cVar) {
        q3 q3Var;
        int i;
        kotlin.jvm.internal.f0 f0Var;
        if (cVar instanceof q3) {
            q3Var = (q3) cVar;
            int i3 = q3Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q3Var.m = i3 - Integer.MIN_VALUE;
                Object obj = q3Var.f9006b;
                i = q3Var.m;
                int i8 = 1;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c7.a.e(obj);
                                return z.f3538a;
                            }
                            d.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f0Var = q3Var.f9005a;
                        c7.a.e(obj);
                        e eVar = p0.f3588a;
                        d8.c cVar3 = h8.n.f6148a;
                        r3 r3Var = new r3(f0Var, moreInfo, (g7.c) null);
                        q3Var.f9005a = null;
                        q3Var.m = 3;
                    } else {
                        f0Var = q3Var.f9005a;
                        c7.a.e(obj);
                    }
                } else {
                    c7.a.e(obj);
                    ?? obj2 = new Object();
                    e eVar2 = p0.f3588a;
                    d8.c cVar4 = h8.n.f6148a;
                    m3 m3Var = new m3(moreInfo, cVar2, i8);
                    q3Var.f9005a = obj2;
                    q3Var.m = 1;
                    if (c8.f0.K(cVar4, m3Var, q3Var) != aVar) {
                        f0Var = obj2;
                    }
                    return aVar;
                }
                e eVar3 = p0.f3588a;
                j8.d dVar = j8.d.f7053a;
                r3 r3Var2 = new r3(moreInfo, f0Var, (g7.c) null);
                q3Var.f9005a = f0Var;
                q3Var.m = 2;
            }
        }
        q3Var = new q3(moreInfo, cVar);
        Object obj3 = q3Var.f9006b;
        i = q3Var.m;
        int i82 = 1;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar32 = p0.f3588a;
        j8.d dVar2 = j8.d.f7053a;
        r3 r3Var22 = new r3(moreInfo, f0Var, (g7.c) null);
        q3Var.f9005a = f0Var;
        q3Var.m = 2;
    }

    public static final void y0(MoreInfo moreInfo, ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        arrayList.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = ((v1) arrayList.get(i)).f7540a;
            if (str != null && str.length() != 0) {
                r a10 = r.a(LayoutInflater.from(moreInfo.getApplicationContext()));
                View view = a10.f5585b;
                TextView textView = a10.l;
                view.setLayoutParams(layoutParams);
                textView.setTypeface(s4.c.v);
                textView.setText(((v1) arrayList.get(i)).f7540a);
                textView.setOnClickListener(new u(a10, 12));
                linearLayout.addView(view);
            }
        }
    }

    public final void A0(j jVar) {
        jVar.getClass();
        if (S()) {
            k2 k2Var = new k2();
            k2Var.m = jVar;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            float f7 = UptodownApp.G;
            beginTransaction.getClass();
            n4.e.A(beginTransaction, this);
            beginTransaction.add(z0().D.getId(), k2Var, (String) null).addToBackStack(String.valueOf(jVar.f7407a)).commit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x045b, code lost:
    
        if (r0.equals("in") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0464, code lost:
    
        if (r0.equals("id") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0470, code lost:
    
        if (r0.equals("fr") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0477, code lost:
    
        if (r0.equals("es") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0483, code lost:
    
        if (r0.equals("de") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x048c, code lost:
    
        if (r0.equals("cn") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0495, code lost:
    
        if (r0.equals("ar") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03fc, code lost:
    
        if (r0.equals("zh") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0400, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0409, code lost:
    
        if (r0.equals("vi") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x040d, code lost:
    
        r13 = ".";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0417, code lost:
    
        if (r0.equals("tr") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0428, code lost:
    
        if (r0.equals("ru") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x042c, code lost:
    
        r13 = " ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0436, code lost:
    
        if (r0.equals("ro") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0440, code lost:
    
        if (r0.equals("pt") == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0452, code lost:
    
        if (r0.equals("it") == false) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04a8 A[LOOP:0: B:183:0x04a2->B:185:0x04a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e9  */
    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        g gVar;
        String str2;
        String str3;
        g gVar2;
        String str4;
        String str5;
        g gVar3;
        g gVar4;
        String str6;
        g gVar5;
        String str7;
        String str8;
        String str9;
        g gVar6;
        HashMap hashMap;
        String str10;
        String str11;
        String valueOf;
        String str12;
        String str13;
        String str14;
        String str15;
        SharedPreferences sharedPreferences;
        String str16;
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = z0().f5623a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) extras.getParcelable("appInfo", g.class);
            } else {
                parcelable = extras.getParcelable("appInfo");
            }
            this.Q = (g) parcelable;
        }
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            z0().N.setNavigationIcon(drawable);
            z0().N.setNavigationContentDescription(getString(R.string.back));
        }
        int i = 2;
        z0().N.setNavigationOnClickListener(new j3(this, i));
        x z0 = z0();
        z0.V.setTypeface(s4.c.u);
        z0.f5651y0.setTypeface(s4.c.u);
        z0.f5628d0.setTypeface(s4.c.u);
        z0.F0.setTypeface(s4.c.u);
        z0.m0.setTypeface(s4.c.v);
        z0.S.setTypeface(s4.c.u);
        z0.Y.setTypeface(s4.c.v);
        z0.f5644u0.setTypeface(s4.c.u);
        z0.f5637n0.setTypeface(s4.c.v);
        z0.G0.setTypeface(s4.c.u);
        z0.f5645v0.setTypeface(s4.c.u);
        z0.t.setOnClickListener(new o(9));
        if (this.Q != null) {
            z0().f5638o0.setTypeface(s4.c.u);
            g gVar7 = this.Q;
            gVar7.getClass();
            String str17 = gVar7.F;
            int i3 = 3;
            int i8 = 8;
            if (str17 != null && str17.length() != 0) {
                g gVar8 = this.Q;
                gVar8.getClass();
                if (!p.b(gVar8.W, "ReadingMode")) {
                    z0().f5639p0.setTypeface(s4.c.v);
                    TextView textView = z0().f5639p0;
                    g gVar9 = this.Q;
                    gVar9.getClass();
                    textView.setText(gVar9.F);
                    z0().f5625b.setOnClickListener(new j3(this, i3));
                    g gVar10 = this.Q;
                    gVar10.getClass();
                    str = gVar10.l;
                    if (str == null && str.length() != 0) {
                        z0().H0.setTypeface(s4.c.u);
                        z0().I0.setTypeface(s4.c.v);
                        TextView textView2 = z0().I0;
                        g gVar11 = this.Q;
                        gVar11.getClass();
                        textView2.setText(gVar11.l);
                    } else {
                        z0().L.setVisibility(8);
                    }
                    gVar = this.Q;
                    gVar.getClass();
                    g7.c cVar = null;
                    if (gVar.G != null) {
                        g gVar12 = this.Q;
                        gVar12.getClass();
                        j jVar = gVar12.G;
                        if (jVar != null) {
                            str16 = jVar.f7408b;
                        } else {
                            str16 = null;
                        }
                        if (str16 != null && str16.length() != 0) {
                            z0().W.setTypeface(s4.c.u);
                            z0().X.setTypeface(s4.c.u);
                            TextView textView3 = z0().X;
                            g gVar13 = this.Q;
                            gVar13.getClass();
                            j jVar2 = gVar13.G;
                            jVar2.getClass();
                            textView3.setText(jVar2.f7408b);
                            z0().X.setTextColor(ContextCompat.getColor(this, R.color.main_blue));
                            z0().X.setPaintFlags(z0().X.getPaintFlags() | 8);
                            z0().X.setOnClickListener(new j3(this, 4));
                            g gVar14 = this.Q;
                            gVar14.getClass();
                            str2 = gVar14.f7379w;
                            if (str2 == null && str2.length() != 0) {
                                z0().T.setTypeface(s4.c.u);
                                z0().U.setTypeface(s4.c.u);
                                TextView textView4 = z0().U;
                                g gVar15 = this.Q;
                                gVar15.getClass();
                                textView4.setText(gVar15.f7379w);
                                g gVar16 = this.Q;
                                gVar16.getClass();
                                String str18 = gVar16.V;
                                if (str18 != null && str18.length() != 0) {
                                    z0().U.setTextColor(ContextCompat.getColor(this, R.color.main_blue));
                                    z0().U.setPaintFlags(z0().U.getPaintFlags() | 8);
                                    z0().v.setOnClickListener(new j3(this, 5));
                                }
                            } else {
                                z0().v.setVisibility(8);
                            }
                            g gVar17 = this.Q;
                            gVar17.getClass();
                            str3 = gVar17.t;
                            if (str3 != null || str3.length() == 0) {
                                gVar2 = this.Q;
                                gVar2.getClass();
                                if (gVar2.l()) {
                                    z0().f5648x.setVisibility(8);
                                    g gVar18 = this.Q;
                                    gVar18.getClass();
                                    str4 = gVar18.O;
                                    int i10 = 0;
                                    int i11 = 1;
                                    if (str4 == null && str4.length() != 0) {
                                        z0().f5640q0.setTypeface(s4.c.u);
                                        z0().f5641r0.setTypeface(s4.c.v);
                                        g gVar19 = this.Q;
                                        gVar19.getClass();
                                        String str19 = gVar19.O;
                                        str19.getClass();
                                        if (v.f0(10, str19) != null) {
                                            TextView textView5 = z0().f5641r0;
                                            g gVar20 = this.Q;
                                            gVar20.getClass();
                                            textView5.setText(getString(R.string.pegi_plus, gVar20.O));
                                        } else {
                                            TextView textView6 = z0().f5641r0;
                                            g gVar21 = this.Q;
                                            gVar21.getClass();
                                            textView6.setText(gVar21.O);
                                        }
                                    } else {
                                        z0().F.setVisibility(8);
                                    }
                                    g gVar22 = this.Q;
                                    gVar22.getClass();
                                    str5 = gVar22.R;
                                    if (str5 == null && str5.length() != 0) {
                                        z0().f5647w0.setTypeface(s4.c.u);
                                        z0().f5649x0.setTypeface(s4.c.v);
                                        TextView textView7 = z0().f5649x0;
                                        g gVar23 = this.Q;
                                        gVar23.getClass();
                                        textView7.setText(gVar23.R);
                                        final TextView textView8 = z0().f5649x0;
                                        final View view = z0().J0;
                                        textView8.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o4.k3
                                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                            public final void onGlobalLayout() {
                                                int i12 = MoreInfo.V;
                                                TextView textView9 = textView8;
                                                if (n2.t1.D(textView9)) {
                                                    textView9.setOnClickListener(new a6.c(this, textView9, view, 7));
                                                }
                                            }
                                        });
                                    } else {
                                        z0().H.setVisibility(8);
                                    }
                                    gVar3 = this.Q;
                                    gVar3.getClass();
                                    if (!p.b(gVar3.W, "ReadingMode")) {
                                        g gVar24 = this.Q;
                                        gVar24.getClass();
                                        if (!gVar24.l()) {
                                            z0().f5629e0.setTypeface(s4.c.u);
                                            z0().f5630f0.setTypeface(s4.c.v);
                                            TextView textView9 = z0().f5630f0;
                                            g gVar25 = this.Q;
                                            gVar25.getClass();
                                            int i12 = gVar25.r;
                                            try {
                                                sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
                                            } catch (Exception e10) {
                                                e10.printStackTrace();
                                            }
                                            if (sharedPreferences.contains("Language")) {
                                                str11 = sharedPreferences.getString("Language", null);
                                                valueOf = String.valueOf(i12);
                                                String str20 = ",";
                                                String str21 = "";
                                                if (str11 != null) {
                                                    switch (str11.hashCode()) {
                                                        case 3121:
                                                            break;
                                                        case 3179:
                                                            break;
                                                        case 3201:
                                                            break;
                                                        case 3241:
                                                            str15 = "en";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3246:
                                                            break;
                                                        case 3276:
                                                            break;
                                                        case 3329:
                                                            str15 = "hi";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3355:
                                                            break;
                                                        case 3365:
                                                            break;
                                                        case 3371:
                                                            break;
                                                        case 3383:
                                                            str15 = "ja";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3428:
                                                            str15 = "ko";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3431:
                                                            str15 = "kr";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3588:
                                                            break;
                                                        case 3645:
                                                            break;
                                                        case 3651:
                                                            break;
                                                        case 3700:
                                                            str15 = "th";
                                                            str11.equals(str15);
                                                            break;
                                                        case 3710:
                                                            break;
                                                        case 3763:
                                                            break;
                                                        case 3886:
                                                            break;
                                                    }
                                                }
                                                if (v.a0(str11, "es", true) || i12 >= 10000) {
                                                    while (valueOf.length() > 3) {
                                                        str21 = String.format(str20.concat("%s%s"), Arrays.copyOf(new Object[]{valueOf.substring(valueOf.length() - 3), str21}, 2));
                                                        valueOf = valueOf.substring(0, valueOf.length() - 3);
                                                    }
                                                    if (valueOf.length() <= 0) {
                                                        valueOf = valueOf.concat(str21);
                                                    } else {
                                                        valueOf = str21;
                                                    }
                                                }
                                                textView9.setText(valueOf);
                                                g gVar26 = this.Q;
                                                gVar26.getClass();
                                                str12 = gVar26.P;
                                                if (str12 == null && str12.length() != 0) {
                                                    z0().z0.setTypeface(s4.c.u);
                                                    z0().A0.setTypeface(s4.c.v);
                                                    TextView textView10 = z0().A0;
                                                    g gVar27 = this.Q;
                                                    gVar27.getClass();
                                                    textView10.setText(gVar27.P);
                                                    z0().l.setOnClickListener(new j3(this, 6));
                                                } else {
                                                    z0().I.setVisibility(8);
                                                }
                                                g gVar28 = this.Q;
                                                gVar28.getClass();
                                                str13 = gVar28.p;
                                                if (str13 == null && str13.length() != 0) {
                                                    z0().D0.setTypeface(s4.c.u);
                                                    z0().E0.setTypeface(s4.c.v);
                                                    TextView textView11 = z0().E0;
                                                    g gVar29 = this.Q;
                                                    gVar29.getClass();
                                                    String str22 = gVar29.p;
                                                    str22.getClass();
                                                    textView11.setText(a4.x(this, Long.parseLong(str22)));
                                                } else {
                                                    z0().K.setVisibility(8);
                                                }
                                                g gVar30 = this.Q;
                                                gVar30.getClass();
                                                str14 = gVar30.q;
                                                if (str14 == null && str14.length() != 0) {
                                                    z0().f5634k0.setTypeface(s4.c.u);
                                                    z0().f5635l0.setTypeface(s4.c.v);
                                                    TextView textView12 = z0().f5635l0;
                                                    g gVar31 = this.Q;
                                                    gVar31.getClass();
                                                    textView12.setText(gVar31.q);
                                                } else {
                                                    z0().C.setVisibility(8);
                                                }
                                                z0().f5642s0.setTypeface(s4.c.u);
                                                z0().f5643t0.setTypeface(s4.c.v);
                                                gVar4 = this.Q;
                                                gVar4.getClass();
                                                if (gVar4.H != 1) {
                                                    z0().f5643t0.setText(getString(R.string.see_1_permission));
                                                } else {
                                                    TextView textView13 = z0().f5643t0;
                                                    g gVar32 = this.Q;
                                                    gVar32.getClass();
                                                    textView13.setText(getString(R.string.see_x_permissions, Integer.valueOf(gVar32.H)));
                                                }
                                                z0().G.setOnClickListener(new j3(this, 7));
                                                g gVar33 = this.Q;
                                                gVar33.getClass();
                                                str6 = gVar33.f7364g0;
                                                if (str6 != null && str6.length() != 0) {
                                                    z0().f5650y.setVisibility(0);
                                                    g gVar34 = this.Q;
                                                    gVar34.getClass();
                                                    hashMap = gVar34.f7376t0;
                                                    if (hashMap == null) {
                                                        str10 = (String) hashMap.get("supportedDevice");
                                                    } else {
                                                        str10 = null;
                                                    }
                                                    if (str10 != null && str10.length() != 0) {
                                                        z0().f5626b0.setTypeface(s4.c.u);
                                                        z0().f5626b0.setText(str10);
                                                    }
                                                    z0().f5627c0.setTypeface(s4.c.v);
                                                    TextView textView14 = z0().f5627c0;
                                                    g gVar35 = this.Q;
                                                    gVar35.getClass();
                                                    textView14.setText(gVar35.f7364g0);
                                                }
                                                z0().Q.setTypeface(s4.c.u);
                                                z0().R.setTypeface(s4.c.v);
                                                gVar5 = this.Q;
                                                gVar5.getClass();
                                                if (gVar5.f7384y0 != 1) {
                                                    z0().R.setText(getString(R.string.contains_ads));
                                                } else {
                                                    z0().R.setText(getString(R.string.contains_ads_no_specified));
                                                }
                                                g gVar36 = this.Q;
                                                gVar36.getClass();
                                                str7 = gVar36.M;
                                                if (str7 == null && str7.length() != 0) {
                                                    z0().B0.setTypeface(s4.c.u);
                                                    z0().C0.setTypeface(s4.c.v);
                                                    TextView textView15 = z0().C0;
                                                    g gVar37 = this.Q;
                                                    gVar37.getClass();
                                                    textView15.setText(gVar37.M);
                                                    z0().m.setOnClickListener(new j3(this, i8));
                                                } else {
                                                    z0().J.setVisibility(8);
                                                }
                                                g gVar38 = this.Q;
                                                gVar38.getClass();
                                                str8 = gVar38.p;
                                                if (str8 != null && str8.length() != 0) {
                                                    z0().G0.setOnClickListener(new j3(this, i10));
                                                }
                                                g gVar39 = this.Q;
                                                gVar39.getClass();
                                                str9 = gVar39.H0;
                                                if (str9 == null && str9.length() != 0) {
                                                    z0().f5631g0.setTypeface(s4.c.u);
                                                    z0().h0.setTypeface(s4.c.v);
                                                    TextView textView16 = z0().h0;
                                                    g gVar40 = this.Q;
                                                    gVar40.getClass();
                                                    String str23 = gVar40.H0;
                                                    str23.getClass();
                                                    String upperCase = str23.toUpperCase(Locale.ROOT);
                                                    upperCase.getClass();
                                                    textView16.setText(upperCase);
                                                } else {
                                                    z0().A.setVisibility(8);
                                                }
                                                z0().f5645v0.setOnClickListener(new j3(this, i11));
                                                gVar6 = this.Q;
                                                gVar6.getClass();
                                                if (p.b(gVar6.W, "ReadingMode")) {
                                                    n3 n3Var = new n3(this, cVar, i11);
                                                    LifecycleCoroutineScope lifecycleCoroutineScope = this.O;
                                                    c8.f0.z(lifecycleCoroutineScope, null, null, n3Var, 3);
                                                    c8.f0.z(lifecycleCoroutineScope, null, null, new n3(this, cVar, i), 3);
                                                    c8.f0.z(lifecycleCoroutineScope, null, null, new n3(this, cVar, i3), 3);
                                                    return;
                                                }
                                                z0().u.setVisibility(8);
                                                z0().G.setVisibility(8);
                                                z0().B.setVisibility(8);
                                                return;
                                            }
                                            str11 = null;
                                            valueOf = String.valueOf(i12);
                                            String str202 = ",";
                                            String str212 = "";
                                            if (str11 != null) {
                                            }
                                            if (v.a0(str11, "es", true)) {
                                            }
                                            while (valueOf.length() > 3) {
                                            }
                                            if (valueOf.length() <= 0) {
                                            }
                                            textView9.setText(valueOf);
                                            g gVar262 = this.Q;
                                            gVar262.getClass();
                                            str12 = gVar262.P;
                                            if (str12 == null) {
                                            }
                                            z0().I.setVisibility(8);
                                            g gVar282 = this.Q;
                                            gVar282.getClass();
                                            str13 = gVar282.p;
                                            if (str13 == null) {
                                            }
                                            z0().K.setVisibility(8);
                                            g gVar302 = this.Q;
                                            gVar302.getClass();
                                            str14 = gVar302.q;
                                            if (str14 == null) {
                                            }
                                            z0().C.setVisibility(8);
                                            z0().f5642s0.setTypeface(s4.c.u);
                                            z0().f5643t0.setTypeface(s4.c.v);
                                            gVar4 = this.Q;
                                            gVar4.getClass();
                                            if (gVar4.H != 1) {
                                            }
                                            z0().G.setOnClickListener(new j3(this, 7));
                                            g gVar332 = this.Q;
                                            gVar332.getClass();
                                            str6 = gVar332.f7364g0;
                                            if (str6 != null) {
                                                z0().f5650y.setVisibility(0);
                                                g gVar342 = this.Q;
                                                gVar342.getClass();
                                                hashMap = gVar342.f7376t0;
                                                if (hashMap == null) {
                                                }
                                                if (str10 != null) {
                                                    z0().f5626b0.setTypeface(s4.c.u);
                                                    z0().f5626b0.setText(str10);
                                                }
                                                z0().f5627c0.setTypeface(s4.c.v);
                                                TextView textView142 = z0().f5627c0;
                                                g gVar352 = this.Q;
                                                gVar352.getClass();
                                                textView142.setText(gVar352.f7364g0);
                                            }
                                            z0().Q.setTypeface(s4.c.u);
                                            z0().R.setTypeface(s4.c.v);
                                            gVar5 = this.Q;
                                            gVar5.getClass();
                                            if (gVar5.f7384y0 != 1) {
                                            }
                                            g gVar362 = this.Q;
                                            gVar362.getClass();
                                            str7 = gVar362.M;
                                            if (str7 == null) {
                                            }
                                            z0().J.setVisibility(8);
                                            g gVar382 = this.Q;
                                            gVar382.getClass();
                                            str8 = gVar382.p;
                                            if (str8 != null) {
                                                z0().G0.setOnClickListener(new j3(this, i10));
                                            }
                                            g gVar392 = this.Q;
                                            gVar392.getClass();
                                            str9 = gVar392.H0;
                                            if (str9 == null) {
                                            }
                                            z0().A.setVisibility(8);
                                            z0().f5645v0.setOnClickListener(new j3(this, i11));
                                            gVar6 = this.Q;
                                            gVar6.getClass();
                                            if (p.b(gVar6.W, "ReadingMode")) {
                                            }
                                        }
                                    }
                                    z0().f5652z.setVisibility(8);
                                    z0().I.setVisibility(8);
                                    z0().K.setVisibility(8);
                                    z0().C.setVisibility(8);
                                    z0().f5642s0.setTypeface(s4.c.u);
                                    z0().f5643t0.setTypeface(s4.c.v);
                                    gVar4 = this.Q;
                                    gVar4.getClass();
                                    if (gVar4.H != 1) {
                                    }
                                    z0().G.setOnClickListener(new j3(this, 7));
                                    g gVar3322 = this.Q;
                                    gVar3322.getClass();
                                    str6 = gVar3322.f7364g0;
                                    if (str6 != null) {
                                    }
                                    z0().Q.setTypeface(s4.c.u);
                                    z0().R.setTypeface(s4.c.v);
                                    gVar5 = this.Q;
                                    gVar5.getClass();
                                    if (gVar5.f7384y0 != 1) {
                                    }
                                    g gVar3622 = this.Q;
                                    gVar3622.getClass();
                                    str7 = gVar3622.M;
                                    if (str7 == null) {
                                    }
                                    z0().J.setVisibility(8);
                                    g gVar3822 = this.Q;
                                    gVar3822.getClass();
                                    str8 = gVar3822.p;
                                    if (str8 != null) {
                                    }
                                    g gVar3922 = this.Q;
                                    gVar3922.getClass();
                                    str9 = gVar3922.H0;
                                    if (str9 == null) {
                                    }
                                    z0().A.setVisibility(8);
                                    z0().f5645v0.setOnClickListener(new j3(this, i11));
                                    gVar6 = this.Q;
                                    gVar6.getClass();
                                    if (p.b(gVar6.W, "ReadingMode")) {
                                    }
                                }
                            }
                            z0().Z.setTypeface(s4.c.u);
                            z0().f5624a0.setTypeface(s4.c.v);
                            TextView textView17 = z0().f5624a0;
                            g gVar41 = this.Q;
                            gVar41.getClass();
                            textView17.setText(gVar41.t);
                            g gVar182 = this.Q;
                            gVar182.getClass();
                            str4 = gVar182.O;
                            int i102 = 0;
                            int i112 = 1;
                            if (str4 == null) {
                            }
                            z0().F.setVisibility(8);
                            g gVar222 = this.Q;
                            gVar222.getClass();
                            str5 = gVar222.R;
                            if (str5 == null) {
                            }
                            z0().H.setVisibility(8);
                            gVar3 = this.Q;
                            gVar3.getClass();
                            if (!p.b(gVar3.W, "ReadingMode")) {
                            }
                            z0().f5652z.setVisibility(8);
                            z0().I.setVisibility(8);
                            z0().K.setVisibility(8);
                            z0().C.setVisibility(8);
                            z0().f5642s0.setTypeface(s4.c.u);
                            z0().f5643t0.setTypeface(s4.c.v);
                            gVar4 = this.Q;
                            gVar4.getClass();
                            if (gVar4.H != 1) {
                            }
                            z0().G.setOnClickListener(new j3(this, 7));
                            g gVar33222 = this.Q;
                            gVar33222.getClass();
                            str6 = gVar33222.f7364g0;
                            if (str6 != null) {
                            }
                            z0().Q.setTypeface(s4.c.u);
                            z0().R.setTypeface(s4.c.v);
                            gVar5 = this.Q;
                            gVar5.getClass();
                            if (gVar5.f7384y0 != 1) {
                            }
                            g gVar36222 = this.Q;
                            gVar36222.getClass();
                            str7 = gVar36222.M;
                            if (str7 == null) {
                            }
                            z0().J.setVisibility(8);
                            g gVar38222 = this.Q;
                            gVar38222.getClass();
                            str8 = gVar38222.p;
                            if (str8 != null) {
                            }
                            g gVar39222 = this.Q;
                            gVar39222.getClass();
                            str9 = gVar39222.H0;
                            if (str9 == null) {
                            }
                            z0().A.setVisibility(8);
                            z0().f5645v0.setOnClickListener(new j3(this, i112));
                            gVar6 = this.Q;
                            gVar6.getClass();
                            if (p.b(gVar6.W, "ReadingMode")) {
                            }
                        }
                    }
                    z0().f5646w.setVisibility(8);
                    g gVar142 = this.Q;
                    gVar142.getClass();
                    str2 = gVar142.f7379w;
                    if (str2 == null) {
                    }
                    z0().v.setVisibility(8);
                    g gVar172 = this.Q;
                    gVar172.getClass();
                    str3 = gVar172.t;
                    if (str3 != null) {
                    }
                    gVar2 = this.Q;
                    gVar2.getClass();
                    if (gVar2.l()) {
                    }
                    z0().Z.setTypeface(s4.c.u);
                    z0().f5624a0.setTypeface(s4.c.v);
                    TextView textView172 = z0().f5624a0;
                    g gVar412 = this.Q;
                    gVar412.getClass();
                    textView172.setText(gVar412.t);
                    g gVar1822 = this.Q;
                    gVar1822.getClass();
                    str4 = gVar1822.O;
                    int i1022 = 0;
                    int i1122 = 1;
                    if (str4 == null) {
                    }
                    z0().F.setVisibility(8);
                    g gVar2222 = this.Q;
                    gVar2222.getClass();
                    str5 = gVar2222.R;
                    if (str5 == null) {
                    }
                    z0().H.setVisibility(8);
                    gVar3 = this.Q;
                    gVar3.getClass();
                    if (!p.b(gVar3.W, "ReadingMode")) {
                    }
                    z0().f5652z.setVisibility(8);
                    z0().I.setVisibility(8);
                    z0().K.setVisibility(8);
                    z0().C.setVisibility(8);
                    z0().f5642s0.setTypeface(s4.c.u);
                    z0().f5643t0.setTypeface(s4.c.v);
                    gVar4 = this.Q;
                    gVar4.getClass();
                    if (gVar4.H != 1) {
                    }
                    z0().G.setOnClickListener(new j3(this, 7));
                    g gVar332222 = this.Q;
                    gVar332222.getClass();
                    str6 = gVar332222.f7364g0;
                    if (str6 != null) {
                    }
                    z0().Q.setTypeface(s4.c.u);
                    z0().R.setTypeface(s4.c.v);
                    gVar5 = this.Q;
                    gVar5.getClass();
                    if (gVar5.f7384y0 != 1) {
                    }
                    g gVar362222 = this.Q;
                    gVar362222.getClass();
                    str7 = gVar362222.M;
                    if (str7 == null) {
                    }
                    z0().J.setVisibility(8);
                    g gVar382222 = this.Q;
                    gVar382222.getClass();
                    str8 = gVar382222.p;
                    if (str8 != null) {
                    }
                    g gVar392222 = this.Q;
                    gVar392222.getClass();
                    str9 = gVar392222.H0;
                    if (str9 == null) {
                    }
                    z0().A.setVisibility(8);
                    z0().f5645v0.setOnClickListener(new j3(this, i1122));
                    gVar6 = this.Q;
                    gVar6.getClass();
                    if (p.b(gVar6.W, "ReadingMode")) {
                    }
                }
            }
            z0().E.setVisibility(8);
            g gVar102 = this.Q;
            gVar102.getClass();
            str = gVar102.l;
            if (str == null) {
            }
            z0().L.setVisibility(8);
            gVar = this.Q;
            gVar.getClass();
            g7.c cVar2 = null;
            if (gVar.G != null) {
            }
            z0().f5646w.setVisibility(8);
            g gVar1422 = this.Q;
            gVar1422.getClass();
            str2 = gVar1422.f7379w;
            if (str2 == null) {
            }
            z0().v.setVisibility(8);
            g gVar1722 = this.Q;
            gVar1722.getClass();
            str3 = gVar1722.t;
            if (str3 != null) {
            }
            gVar2 = this.Q;
            gVar2.getClass();
            if (gVar2.l()) {
            }
            z0().Z.setTypeface(s4.c.u);
            z0().f5624a0.setTypeface(s4.c.v);
            TextView textView1722 = z0().f5624a0;
            g gVar4122 = this.Q;
            gVar4122.getClass();
            textView1722.setText(gVar4122.t);
            g gVar18222 = this.Q;
            gVar18222.getClass();
            str4 = gVar18222.O;
            int i10222 = 0;
            int i11222 = 1;
            if (str4 == null) {
            }
            z0().F.setVisibility(8);
            g gVar22222 = this.Q;
            gVar22222.getClass();
            str5 = gVar22222.R;
            if (str5 == null) {
            }
            z0().H.setVisibility(8);
            gVar3 = this.Q;
            gVar3.getClass();
            if (!p.b(gVar3.W, "ReadingMode")) {
            }
            z0().f5652z.setVisibility(8);
            z0().I.setVisibility(8);
            z0().K.setVisibility(8);
            z0().C.setVisibility(8);
            z0().f5642s0.setTypeface(s4.c.u);
            z0().f5643t0.setTypeface(s4.c.v);
            gVar4 = this.Q;
            gVar4.getClass();
            if (gVar4.H != 1) {
            }
            z0().G.setOnClickListener(new j3(this, 7));
            g gVar3322222 = this.Q;
            gVar3322222.getClass();
            str6 = gVar3322222.f7364g0;
            if (str6 != null) {
            }
            z0().Q.setTypeface(s4.c.u);
            z0().R.setTypeface(s4.c.v);
            gVar5 = this.Q;
            gVar5.getClass();
            if (gVar5.f7384y0 != 1) {
            }
            g gVar3622222 = this.Q;
            gVar3622222.getClass();
            str7 = gVar3622222.M;
            if (str7 == null) {
            }
            z0().J.setVisibility(8);
            g gVar3822222 = this.Q;
            gVar3822222.getClass();
            str8 = gVar3822222.p;
            if (str8 != null) {
            }
            g gVar3922222 = this.Q;
            gVar3922222.getClass();
            str9 = gVar3922222.H0;
            if (str9 == null) {
            }
            z0().A.setVisibility(8);
            z0().f5645v0.setOnClickListener(new j3(this, i11222));
            gVar6 = this.Q;
            gVar6.getClass();
            if (p.b(gVar6.W, "ReadingMode")) {
            }
        }
    }

    public final x z0() {
        return (x) this.P.getValue();
    }
}
