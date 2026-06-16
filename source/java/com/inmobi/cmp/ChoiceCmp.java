package com.inmobi.cmp;

import a5.k;
import a5.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import b.f;
import b.h;
import b.i;
import b.o;
import b.r;
import c8.c0;
import c8.c1;
import c8.f0;
import c8.p0;
import c8.z;
import com.google.android.gms.internal.measurement.l5;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.inmobi.cmp.model.Regulations;
import com.inmobi.cmp.presentation.components.CmpActivity;
import f1.g;
import g7.a;
import g7.c;
import i7.j;
import j8.d;
import j8.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.p;
import x9.l;
import x9.s;
import x9.w;
import z8.n;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ChoiceCmp {

    /* renamed from: a */
    public static ChoiceCmpCallback f4357a = null;

    /* renamed from: b */
    public static String f4358b = "";

    /* renamed from: c */
    public static String f4359c = "";

    /* renamed from: d */
    public static boolean f4360d;

    /* renamed from: e */
    public static UUID f4361e;

    /* renamed from: f */
    public static long f4362f;
    public static i g;
    public static c0 h;
    public static boolean j;
    public static final ChoiceCmp INSTANCE = new ChoiceCmp();
    public static final r i = new a(z.f3618a);

    /* renamed from: k */
    public static final Pattern f4363k = Pattern.compile("^(p-)?([a-zA-Z0-9_-]{13})$");

    public static final /* synthetic */ i access$getViewModel$p() {
        return g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object access$handleBrandingLogo(ChoiceCmp choiceCmp, c cVar) {
        choiceCmp.getClass();
        i iVar = g;
        Object obj = null;
        Object[] objArr = 0;
        if (iVar != null) {
            Context applicationContext = aa.c.b().getApplicationContext();
            applicationContext.getClass();
            if (iVar.p.v.length() != 0) {
                e eVar = p0.f3588a;
                obj = f0.K(d.f7053a, new m((Object) applicationContext, (Object) iVar, (c) (objArr == true ? 1 : 0), 4), cVar);
            }
            if (obj == h7.a.f6117a) {
                return obj;
            }
            return c7.z.f3538a;
        }
        p.i("viewModel");
        throw null;
    }

    public static final Object access$handleFonts(ChoiceCmp choiceCmp, z8.e eVar, c cVar) {
        choiceCmp.getClass();
        c7.z zVar = c7.z.f3538a;
        if (eVar != null) {
            Object k10 = f0.k(new k(aa.c.b(), eVar, null), cVar);
            h7.a aVar = h7.a.f6117a;
            if (k10 != aVar) {
                k10 = zVar;
            }
            if (k10 == aVar) {
                return k10;
            }
            return zVar;
        }
        g.h(null, "No font found", null, 5);
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleGBC(ChoiceCmp choiceCmp, n nVar, c cVar) {
        b.c cVar2;
        int i3;
        i iVar;
        choiceCmp.getClass();
        if (cVar instanceof b.c) {
            cVar2 = (b.c) cVar;
            int i8 = cVar2.l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar2.l = i8 - Integer.MIN_VALUE;
                Object obj = cVar2.f3218a;
                i3 = cVar2.l;
                c7.z zVar = c7.z.f3538a;
                c cVar3 = null;
                if (i3 == 0) {
                    if (i3 == 1) {
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    if (!nVar.q.f11761a) {
                        return zVar;
                    }
                    i iVar2 = g;
                    if (iVar2 != null) {
                        cVar2.l = 1;
                        e eVar = p0.f3588a;
                        obj = f0.K(d.f7053a, new b.a(iVar2, cVar3, 3), cVar2);
                        h7.a aVar = h7.a.f6117a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        p.i("viewModel");
                        throw null;
                    }
                }
                x6.c cVar4 = (x6.c) obj;
                Application application = aa.c.f406a;
                cVar4.getClass();
                aa.c.g = cVar4;
                iVar = g;
                if (iVar == null) {
                    boolean z10 = x.g.f11254a;
                    x.g.f11254a = iVar.p.q.f11761a;
                    return zVar;
                }
                p.i("viewModel");
                throw null;
            }
        }
        cVar2 = new b.c(choiceCmp, cVar);
        Object obj2 = cVar2.f3218a;
        i3 = cVar2.l;
        c7.z zVar2 = c7.z.f3538a;
        c cVar32 = null;
        if (i3 == 0) {
        }
        x6.c cVar42 = (x6.c) obj2;
        Application application2 = aa.c.f406a;
        cVar42.getClass();
        aa.c.g = cVar42;
        iVar = g;
        if (iVar == null) {
        }
    }

    public static final Object access$handleGDPR(ChoiceCmp choiceCmp, boolean z10, c cVar) {
        choiceCmp.getClass();
        Object k10 = f0.k(new b.g(z10, null), cVar);
        if (k10 == h7.a.f6117a) {
            return k10;
        }
        return c7.z.f3538a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleMSPA(ChoiceCmp choiceCmp, n nVar, c cVar) {
        h hVar;
        int i3;
        choiceCmp.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i8 = hVar.l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.l = i8 - Integer.MIN_VALUE;
                Object obj = hVar.f3228a;
                i3 = hVar.l;
                c cVar2 = null;
                c7.z zVar = c7.z.f3538a;
                if (i3 == 0) {
                    if (i3 == 1) {
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    if (!nVar.f11790a.contains(Regulations.MSPA)) {
                        return zVar;
                    }
                    x8.e.f11310e = aa.c.e();
                    z9.a aVar = (z9.a) aa.c.v.getValue();
                    aVar.getClass();
                    x8.e.f11311f = aVar;
                    i iVar = g;
                    if (iVar != null) {
                        hVar.l = 1;
                        e eVar = p0.f3588a;
                        obj = f0.K(d.f7053a, new f(iVar, cVar2, 0), hVar);
                        h7.a aVar2 = h7.a.f6117a;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        p.i("viewModel");
                        throw null;
                    }
                }
                x8.a aVar3 = (x8.a) obj;
                Application application = aa.c.f406a;
                aVar3.getClass();
                aa.c.h = aVar3;
                return zVar;
            }
        }
        hVar = new h(choiceCmp, cVar);
        Object obj2 = hVar.f3228a;
        i3 = hVar.l;
        c cVar22 = null;
        c7.z zVar2 = c7.z.f3538a;
        if (i3 == 0) {
        }
        x8.a aVar32 = (x8.a) obj2;
        Application application2 = aa.c.f406a;
        aVar32.getClass();
        aa.c.h = aVar32;
        return zVar2;
    }

    public static final Object access$loadCmpInfo(ChoiceCmp choiceCmp, ChoiceStyle choiceStyle, c cVar) {
        choiceCmp.getClass();
        Object k10 = f0.k(new m(choiceStyle, null, 3), cVar);
        if (k10 == h7.a.f6117a) {
            return k10;
        }
        return c7.z.f3538a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadCmpList(ChoiceCmp choiceCmp, c cVar) {
        o oVar;
        int i3;
        i iVar;
        choiceCmp.getClass();
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i8 = oVar.l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.l = i8 - Integer.MIN_VALUE;
                Object obj = oVar.f3249a;
                i3 = oVar.l;
                c cVar2 = null;
                if (i3 == 0) {
                    if (i3 == 1) {
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    i iVar2 = g;
                    if (iVar2 != null) {
                        oVar.l = 1;
                        e eVar = p0.f3588a;
                        obj = f0.K(d.f7053a, new b.a(iVar2, cVar2, 0), oVar);
                        h7.a aVar = h7.a.f6117a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        p.i("viewModel");
                        throw null;
                    }
                }
                h6.f fVar = (h6.f) obj;
                iVar = g;
                if (iVar == null) {
                    fVar.getClass();
                    iVar.o = fVar;
                    return c7.z.f3538a;
                }
                p.i("viewModel");
                throw null;
            }
        }
        oVar = new o(choiceCmp, cVar);
        Object obj2 = oVar.f3249a;
        i3 = oVar.l;
        c cVar22 = null;
        if (i3 == 0) {
        }
        h6.f fVar2 = (h6.f) obj2;
        iVar = g;
        if (iVar == null) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 605
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static final void access$loadDefaultValues(com.inmobi.cmp.ChoiceCmp r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 2766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadDefaultValues(com.inmobi.cmp.ChoiceCmp, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadPortalConfigAndInitialize(ChoiceCmp choiceCmp, c cVar) {
        b.p pVar;
        int i3;
        String str;
        String str2;
        choiceCmp.getClass();
        if (cVar instanceof b.p) {
            pVar = (b.p) cVar;
            int i8 = pVar.l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                pVar.l = i8 - Integer.MIN_VALUE;
                Object obj = pVar.f3251a;
                i3 = pVar.l;
                c cVar2 = null;
                if (i3 == 0) {
                    if (i3 == 1) {
                        c7.a.e(obj);
                    } else {
                        b.d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    i iVar = g;
                    if (iVar != null) {
                        pVar.l = 1;
                        e eVar = p0.f3588a;
                        obj = f0.K(d.f7053a, new b.a(iVar, cVar2, 2), pVar);
                        h7.a aVar = h7.a.f6117a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        p.i("viewModel");
                        throw null;
                    }
                }
                n nVar = (n) obj;
                str = nVar.f11792c;
                a7.a aVar2 = nVar.j;
                z8.i iVar2 = nVar.f11797n;
                if (!z7.n.r0(str)) {
                    return null;
                }
                aa.c.f411f = nVar;
                i iVar3 = g;
                if (iVar3 != null) {
                    z9.a aVar3 = iVar3.f3230a;
                    iVar3.p = nVar;
                    x9.f fVar = iVar3.f3235f;
                    fVar.getClass();
                    fVar.h = iVar2.s;
                    fVar.g = nVar.r;
                    h6.h hVar = iVar3.f3231b.G;
                    Object obj2 = iVar2.q;
                    hVar.getClass();
                    obj2.getClass();
                    hVar.f6085a = obj2;
                    Object obj3 = iVar2.r;
                    obj3.getClass();
                    hVar.f6086b = obj3;
                    aVar3.g(32, iVar2.f11764b);
                    if (iVar3.j()) {
                        str2 = "en";
                    } else {
                        str2 = nVar.f11795f;
                    }
                    aVar3.f(33, str2);
                    f4362f = System.currentTimeMillis();
                    i iVar4 = g;
                    if (iVar4 != null) {
                        iVar4.m = aVar2;
                        g.f4968d = aVar2.f250b;
                        g.f4969e = aVar2.f249a;
                        return nVar;
                    }
                    p.i("viewModel");
                    throw null;
                }
                p.i("viewModel");
                throw null;
            }
        }
        pVar = new b.p(choiceCmp, cVar);
        Object obj4 = pVar.f3251a;
        i3 = pVar.l;
        c cVar22 = null;
        if (i3 == 0) {
        }
        n nVar2 = (n) obj4;
        str = nVar2.f11792c;
        a7.a aVar22 = nVar2.j;
        z8.i iVar22 = nVar2.f11797n;
        if (!z7.n.r0(str)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q7.e, i7.j] */
    public static final Object access$showCMP(ChoiceCmp choiceCmp, c cVar) {
        choiceCmp.getClass();
        if (l5.f3883a && aa.c.f406a != null) {
            e eVar = p0.f3588a;
            Object K = f0.K(h8.n.f6148a.m, new j(2, null), cVar);
            if (K == h7.a.f6117a) {
                return K;
            }
        }
        return c7.z.f3538a;
    }

    public static final void access$startLoadCmpInfo(ChoiceCmp choiceCmp, ChoiceStyle choiceStyle) {
        choiceCmp.getClass();
        c0 c0Var = h;
        if (c0Var == null) {
            c0Var = f0.b(f0.d());
        }
        h = c0Var;
        f0.z(c0Var, i, null, new a5.h(choiceStyle, (c) null, 2), 2);
    }

    public static final void forceDisplayUI(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            i iVar = g;
            if (iVar != null) {
                if (iVar.p.f11790a.contains(Regulations.GDPR)) {
                    choiceCmp.a(activity, true);
                    return;
                }
                ChoiceCmpCallback choiceCmpCallback = f4357a;
                if (choiceCmpCallback != null) {
                    choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "GDPR not applicable", Regulations.NA, false, 8, null));
                }
                g.h(null, ChoiceError.GDPR_NA.getMessage(), null, 5);
                return;
            }
            p.i("viewModel");
            throw null;
        }
        ChoiceCmpCallback choiceCmpCallback2 = f4357a;
        if (choiceCmpCallback2 == null) {
            return;
        }
        choiceCmpCallback2.onCmpError(ChoiceError.MISSING_INITIALIZATION);
    }

    public static final GDPRData getGDPRData(Set<Integer> set) {
        if (INSTANCE.isViewModelAvailable$app_release()) {
            return new GDPRData(set);
        }
        return null;
    }

    public static /* synthetic */ GDPRData getGDPRData$default(Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            set = null;
        }
        return getGDPRData(set);
    }

    public static final NonIABData getNonIABData(Set<Integer> set) {
        boolean z10;
        Map<Integer, Boolean> map;
        if (!INSTANCE.isViewModelAvailable$app_release()) {
            return null;
        }
        i iVar = g;
        if (iVar != null) {
            z9.a aVar = iVar.f3230a;
            aVar.getClass();
            if (aVar.f11814a.getInt("IABTCF_gdprApplies", 0) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            String j10 = aVar.j(34);
            Map<Integer, Boolean> map2 = iVar.f3231b.A.getMap();
            if (set == null) {
                map = map2;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, Boolean> entry : map2.entrySet()) {
                    if (set.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                map = linkedHashMap;
            }
            return new NonIABData(z10, false, false, j10, map);
        }
        p.i("viewModel");
        throw null;
    }

    public static /* synthetic */ NonIABData getNonIABData$default(Set set, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            set = null;
        }
        return getNonIABData(set);
    }

    public static final String getSDKVersion() {
        return "2.4.1";
    }

    public static final void setUserSubscriptionStatus(boolean z10) {
        j = false;
        f4360d = z10;
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release() && g.s() && choiceCmp.isViewModelAvailable$app_release()) {
            a();
            if (l5.f3883a && aa.c.f406a != null && !f4360d) {
                choiceCmp.a(aa.c.b());
            }
        }
    }

    @c7.c
    public static final void showCCPAScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            i iVar = g;
            if (iVar != null) {
                Regulations regulations = Regulations.USP;
                regulations.getClass();
                if (iVar.p.f11790a.contains(regulations)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_ACTION", "ACTION_SHOW_CCPA_SCREEN");
                    choiceCmp.startCMPActivity$app_release(activity, bundle);
                    return;
                }
            } else {
                p.i("viewModel");
                throw null;
            }
        }
        ChoiceCmpCallback choiceCmpCallback = f4357a;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "CCPA not applicable", Regulations.NA, false, 8, null));
        }
        g.h(null, ChoiceError.US_PRIVACY_NOT_APPLICABLE.getMessage(), null, 5);
    }

    public static final void showGBCScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            if (x.g.f11254a) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_ACTION", "ACTION_SHOW_GBC_SCREEN");
                choiceCmp.startCMPActivity$app_release(activity, bundle);
                return;
            } else {
                ChoiceCmpCallback choiceCmpCallback = f4357a;
                if (choiceCmpCallback != null) {
                    choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "GBC not applicable", Regulations.NA, false, 8, null));
                }
                g.h(null, ChoiceError.GBC_NOT_APPLICABLE.getMessage(), null, 5);
                return;
            }
        }
        ChoiceCmpCallback choiceCmpCallback2 = f4357a;
        if (choiceCmpCallback2 == null) {
            return;
        }
        choiceCmpCallback2.onCmpError(ChoiceError.MISSING_INITIALIZATION);
    }

    public static final void showUSRegulationScreen(Activity activity) {
        activity.getClass();
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            i iVar = g;
            if (iVar != null) {
                List list = iVar.p.f11790a;
                Regulations regulations = Regulations.MSPA;
                if (list.contains(regulations) || iVar.p.f11790a.contains(Regulations.USP)) {
                    i iVar2 = g;
                    if (iVar2 != null) {
                        regulations.getClass();
                        if (iVar2.p.f11790a.contains(regulations)) {
                            x8.e.g(aa.c.d());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN");
                        bundle.putBoolean("EXTRA_FORCE", true);
                        choiceCmp.startCMPActivity$app_release(activity, bundle);
                        return;
                    }
                    p.i("viewModel");
                    throw null;
                }
            } else {
                p.i("viewModel");
                throw null;
            }
        }
        ChoiceCmpCallback choiceCmpCallback = f4357a;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "US regulations not applicable", Regulations.NA, false, 8, null));
        }
        g.h(null, ChoiceError.US_PRIVACY_NOT_APPLICABLE.getMessage(), null, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public static final void startChoice(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle) {
        String str3;
        application.getClass();
        str.getClass();
        str2.getClass();
        choiceCmpCallback.getClass();
        choiceStyle.getClass();
        f4357a = choiceCmpCallback;
        f4358b = str;
        INSTANCE.getClass();
        Matcher matcher = f4363k.matcher(str2);
        c cVar = null;
        if (matcher.matches()) {
            str3 = matcher.group(2);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            ChoiceCmpCallback choiceCmpCallback2 = f4357a;
            if (choiceCmpCallback2 != null) {
                choiceCmpCallback2.onCmpError(ChoiceError.INVALID_PCODE);
            }
            str3 = null;
        }
        if (str3 == null) {
            str3 = null;
        }
        if (str3 == null) {
            return;
        }
        f4359c = str3;
        aa.c.f406a = application;
        if (g == null) {
            g = new i((z9.a) aa.c.v.getValue(), aa.c.f(), (s) aa.c.m.getValue(), (x9.e) aa.c.o.getValue(), (w) aa.c.q.getValue(), (x9.f) aa.c.r.getValue(), (x9.n) aa.c.s.getValue(), (l) aa.c.t.getValue(), (x9.h) aa.c.f413n.getValue(), (x9.j) aa.c.p.getValue());
            c0 c0Var = h;
            if (c0Var == null) {
                c0Var = f0.b(f0.d());
            }
            h = c0Var;
            f0.z(c0Var, i, null, new a5.h(choiceStyle, cVar, 2), 2);
        }
        application.registerActivityLifecycleCallbacks(new aa.a(new r0.i(choiceStyle, 4)));
        application.registerActivityLifecycleCallbacks(new Object());
    }

    public static /* synthetic */ void startChoice$default(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            choiceStyle = new ChoiceStyle();
        }
        startChoice(application, str, str2, choiceCmpCallback, choiceStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0103, code lost:
    
        if (r8.equals(s7.a.j(r12.toString())) == false) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context) {
        ChoiceCmpCallback callback;
        boolean z10;
        i iVar;
        ChoiceError choiceError;
        i iVar2 = g;
        if (iVar2 != null) {
            if (iVar2.j()) {
                i iVar3 = g;
                if (iVar3 != null) {
                    Regulations regulations = Regulations.MSPA;
                    regulations.getClass();
                    boolean contains = iVar3.p.f11790a.contains(regulations);
                    c1 c1Var = c1.f3545a;
                    if (contains) {
                        int h10 = x8.e.h();
                        int b10 = x8.e.b(x8.e.f().j(70));
                        boolean z11 = true;
                        if ((!x8.e.j() || x8.e.j != 1) && ((!x8.e.j() || x8.e.j != 2 || h10 != 16) && ((!x8.e.f().j(69).equals("STATE_AND_NATIONAL") || x8.e.j != 1 || b10 != 16) && ((!x8.e.f().j(69).equals("STATE_AND_NATIONAL") || x8.e.j != 2 || b10 != h10) && ((x8.e.f().j(69).equals("STATE_AND_NATIONAL") || x8.e.j()) && (callback = INSTANCE.getCallback()) != null))))) {
                            callback.onUserMovedToOtherState();
                        }
                        i iVar4 = g;
                        if (iVar4 != null) {
                            z9.a aVar = iVar4.f3230a;
                            z8.k kVar = iVar4.p.o;
                            kVar.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) kVar.f11775a);
                            sb.append(kVar.f11779e);
                            sb.append(kVar.f11780f);
                            if (s7.a.j(sb.toString()).equals(aVar.j(66))) {
                                if (x.g.f11254a) {
                                    String j10 = aVar.j(39);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(iVar4.p.q.f11762b);
                                    sb2.append(iVar4.p.q.f11761a);
                                }
                                z10 = false;
                                iVar = g;
                                if (iVar == null) {
                                    boolean z12 = iVar.p.o.f11778d;
                                    if (!z10 || !z12) {
                                        z11 = false;
                                    }
                                    UUID uuid = t9.p.f10785a;
                                    i iVar5 = g;
                                    if (iVar5 != null) {
                                        z9.a aVar2 = iVar5.f3230a;
                                        t9.c cVar = t9.c.MSPA;
                                        String d10 = g.d(cVar, aVar2);
                                        e eVar = p0.f3588a;
                                        f0.z(c1Var, d.f7053a, null, new b.g(d10, cVar, z11, (c) null), 2);
                                        x8.e.g(aa.c.d());
                                        if (z12 && z10) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN");
                                            bundle.putBoolean("EXTRA_FORCE", false);
                                            startCMPActivity$app_release(context, bundle);
                                            return;
                                        }
                                        if (!z10) {
                                            choiceError = ChoiceError.US_REGULATION_NO_RE_TRIGGER;
                                            ChoiceCmpCallback choiceCmpCallback = f4357a;
                                            if (choiceCmpCallback != null) {
                                                choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "MSPA is applicable but no need to re-trigger the screen", Regulations.NA, false, 8, null));
                                            }
                                        } else {
                                            choiceError = ChoiceError.AUTO_POPUP_DISABLED;
                                            ChoiceCmpCallback choiceCmpCallback2 = f4357a;
                                            if (choiceCmpCallback2 != null) {
                                                choiceCmpCallback2.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "Auto pop-up is disabled so no dialog will be shown", Regulations.NA, false, 8, null));
                                            }
                                        }
                                        g.h(null, choiceError.getMessage(), null, 5);
                                        return;
                                    }
                                    p.i("viewModel");
                                    throw null;
                                }
                                p.i("viewModel");
                                throw null;
                            }
                            if (x.g.f11254a) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(iVar4.p.q.f11762b);
                                sb3.append(iVar4.p.q.f11761a);
                                aVar.f(39, s7.a.j(sb3.toString()));
                            }
                            z8.k kVar2 = iVar4.p.o;
                            kVar2.getClass();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append((Object) kVar2.f11775a);
                            sb4.append(kVar2.f11779e);
                            sb4.append(kVar2.f11780f);
                            aVar.f(66, s7.a.j(sb4.toString()));
                            aVar.b(71);
                            aVar.b(72);
                            z10 = true;
                            iVar = g;
                            if (iVar == null) {
                            }
                        } else {
                            p.i("viewModel");
                            throw null;
                        }
                    } else {
                        i iVar6 = g;
                        if (iVar6 != null) {
                            Regulations regulations2 = Regulations.USP;
                            regulations2.getClass();
                            if (iVar6.p.f11790a.contains(regulations2)) {
                                i iVar7 = g;
                                if (iVar7 != null) {
                                    if (iVar7.p.f11796k.f11748a.equals(Boolean.TRUE)) {
                                        i iVar8 = g;
                                        if (iVar8 != null) {
                                            if (iVar8.o()) {
                                                UUID uuid2 = t9.p.f10785a;
                                                i iVar9 = g;
                                                if (iVar9 != null) {
                                                    z9.a aVar3 = iVar9.f3230a;
                                                    t9.c cVar2 = t9.c.USP;
                                                    String d11 = g.d(cVar2, aVar3);
                                                    e eVar2 = p0.f3588a;
                                                    f0.z(c1Var, d.f7053a, null, new b.g(d11, cVar2, false, (c) null), 2);
                                                } else {
                                                    p.i("viewModel");
                                                    throw null;
                                                }
                                            }
                                        } else {
                                            p.i("viewModel");
                                            throw null;
                                        }
                                    }
                                    ChoiceCmpCallback choiceCmpCallback3 = f4357a;
                                    if (choiceCmpCallback3 != null) {
                                        choiceCmpCallback3.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "Auto pop-up is not applicable for this region as CCPA is enabled", regulations2, false, 8, null));
                                    }
                                    g.h(null, ChoiceError.AUTO_POP_NOT_APPLICABLE.getMessage(), null, 5);
                                    return;
                                }
                                p.i("viewModel");
                                throw null;
                            }
                            b();
                            return;
                        }
                        p.i("viewModel");
                        throw null;
                    }
                } else {
                    p.i("viewModel");
                    throw null;
                }
            } else {
                i iVar10 = g;
                if (iVar10 != null) {
                    Regulations regulations3 = Regulations.GDPR;
                    regulations3.getClass();
                    if (iVar10.p.f11790a.contains(regulations3)) {
                        a(context, false);
                        return;
                    } else {
                        b();
                        return;
                    }
                }
                p.i("viewModel");
                throw null;
            }
        } else {
            p.i("viewModel");
            throw null;
        }
    }

    public final void b() {
        i iVar = g;
        if (iVar != null) {
            if (iVar.p.f11796k.f11748a.equals(Boolean.TRUE)) {
                i iVar2 = g;
                if (iVar2 != null) {
                    if (iVar2.o()) {
                        sendNRVisitEvent$app_release();
                    }
                } else {
                    p.i("viewModel");
                    throw null;
                }
            }
            ChoiceCmpCallback choiceCmpCallback = f4357a;
            if (choiceCmpCallback != null) {
                choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "No regulations applicable", Regulations.NA, false, 8, null));
            }
            g.h(null, "No regulations applicable", null, 5);
            return;
        }
        p.i("viewModel");
        throw null;
    }

    public final String getAppPackageId() {
        return f4358b;
    }

    public final ChoiceCmpCallback getCallback() {
        return f4357a;
    }

    public final UUID getCurrentSessionId() {
        return f4361e;
    }

    public final h6.d getGoogleVendorList$app_release() {
        i iVar = g;
        if (iVar != null) {
            return iVar.l;
        }
        p.i("viewModel");
        throw null;
    }

    public final String getPCode() {
        return f4359c;
    }

    public final h6.m getTcModel$app_release() {
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        i iVar = g;
        if (iVar != null) {
            return iVar.f3231b;
        }
        p.i("viewModel");
        throw null;
    }

    public final boolean getUserSubscribed() {
        return f4360d;
    }

    public final boolean isViewModelAvailable$app_release() {
        i iVar = g;
        if (iVar != null && iVar.f3236k) {
            return true;
        }
        return false;
    }

    public final void onAppClosing() {
        i iVar = g;
        if (iVar != null) {
            long j10 = f4362f;
            iVar.f3230a.d(79, (System.currentTimeMillis() - j10) + iVar.p.m);
            return;
        }
        p.i("viewModel");
        throw null;
    }

    public final PingReturn ping$app_release(boolean z10, CmpStatus cmpStatus, DisplayStatus displayStatus) {
        Integer valueOf;
        Integer valueOf2;
        Integer num;
        int intValue;
        boolean z11;
        cmpStatus.getClass();
        displayStatus.getClass();
        if (g != null) {
            i iVar = g;
            if (iVar != null) {
                Boolean valueOf3 = Boolean.valueOf(iVar.p.f11790a.contains(Regulations.GDPR));
                h6.m tcModel$app_release = getTcModel$app_release();
                if (tcModel$app_release == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(tcModel$app_release.f6106n);
                }
                String valueOf4 = String.valueOf(valueOf);
                h6.m tcModel$app_release2 = getTcModel$app_release();
                if (tcModel$app_release2 == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(tcModel$app_release2.m);
                }
                i iVar2 = g;
                if (iVar2 != null) {
                    Integer valueOf5 = Integer.valueOf(iVar2.i());
                    i iVar3 = g;
                    if (iVar3 != null) {
                        v8.c cVar = iVar3.f3231b.f6099a;
                        if (cVar == null) {
                            num = null;
                        } else {
                            num = cVar.f10922c;
                        }
                        if (num == null) {
                            intValue = iVar3.h();
                        } else {
                            intValue = num.intValue();
                        }
                        Integer valueOf6 = Integer.valueOf(intValue);
                        i iVar4 = g;
                        if (iVar4 != null) {
                            if (iVar4.p.f11790a.contains(Regulations.MSPA) || iVar4.p.f11790a.contains(Regulations.USP)) {
                                i iVar5 = g;
                                if (iVar5 != null) {
                                    if (iVar5.j()) {
                                        z11 = true;
                                        return new PingReturn(valueOf3, z10, cmpStatus, displayStatus, "2.0", valueOf4, valueOf2, valueOf5, valueOf6, Boolean.valueOf(z11));
                                    }
                                } else {
                                    p.i("viewModel");
                                    throw null;
                                }
                            }
                            z11 = false;
                            return new PingReturn(valueOf3, z10, cmpStatus, displayStatus, "2.0", valueOf4, valueOf2, valueOf5, valueOf6, Boolean.valueOf(z11));
                        }
                        p.i("viewModel");
                        throw null;
                    }
                    p.i("viewModel");
                    throw null;
                }
                p.i("viewModel");
                throw null;
            }
            p.i("viewModel");
            throw null;
        }
        ChoiceCmpCallback choiceCmpCallback = f4357a;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCmpError(ChoiceError.MISSING_INITIALIZATION);
        }
        return new PingReturn(null, false, CmpStatus.ERROR, DisplayStatus.HIDDEN, "2.0", null, null, null, null, null, 512, null);
    }

    public final void sendNRVisitEvent$app_release() {
        if (x.g.f11254a) {
            UUID uuid = t9.p.f10785a;
            e eVar = p0.f3588a;
            f0.z(c1.f3545a, d.f7053a, null, new b.g((String) null, t9.c.NR, false, (c) null), 2);
        }
    }

    public final void setAppPackageId(String str) {
        str.getClass();
        f4358b = str;
    }

    public final void setCallback(ChoiceCmpCallback choiceCmpCallback) {
        f4357a = choiceCmpCallback;
    }

    public final void setCurrentSessionId(UUID uuid) {
        f4361e = uuid;
    }

    public final void setLoginProcessStart() {
        j = true;
    }

    public final void setPCode(String str) {
        str.getClass();
        f4359c = str;
    }

    public final void setUserSubscribed(boolean z10) {
        f4360d = z10;
    }

    @VisibleForTesting
    public final void startCMPActivity$app_release(Context context, Bundle bundle) {
        context.getClass();
        bundle.getClass();
        context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(GroupFlagsKt.IsMovableContentFlag).addFlags(67108864).putExtras(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, boolean z10) {
        boolean z11;
        i iVar = g;
        if (iVar != null) {
            if (iVar.p()) {
                i iVar2 = g;
                if (iVar2 == null) {
                    p.i("viewModel");
                    throw null;
                }
                if (!iVar2.j()) {
                    z11 = true;
                    if (!z10) {
                        i iVar3 = g;
                        if (iVar3 != null) {
                            if (iVar3.p.f11796k.f11748a.equals(Boolean.TRUE)) {
                                i iVar4 = g;
                                if (iVar4 == null) {
                                    p.i("viewModel");
                                    throw null;
                                }
                                if (iVar4.o()) {
                                    UUID uuid = t9.p.f10785a;
                                    i iVar5 = g;
                                    if (iVar5 != null) {
                                        z9.a aVar = iVar5.f3230a;
                                        t9.c cVar = t9.c.GDPR;
                                        String d10 = g.d(cVar, aVar);
                                        e eVar = p0.f3588a;
                                        f0.z(c1.f3545a, d.f7053a, null, new b.g(d10, cVar, z11, (c) null), 2);
                                    } else {
                                        p.i("viewModel");
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            p.i("viewModel");
                            throw null;
                        }
                    }
                    if (z11 && !z10) {
                        ChoiceCmpCallback choiceCmpCallback = f4357a;
                        if (choiceCmpCallback == null) {
                            return;
                        }
                        choiceCmpCallback.onCMPUIStatusChanged(new DisplayInfo(DisplayStatus.HIDDEN, "GDPR is applicable but no need to re-trigger the screen", Regulations.GDPR, false, 8, null));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("EXTRA_ACTION", "ACTION_SHOW_CMP_DIALOG");
                    bundle.putBoolean("EXTRA_FORCE", z10);
                    startCMPActivity$app_release(context, bundle);
                    return;
                }
            }
            z11 = false;
            if (!z10) {
            }
            if (z11) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("EXTRA_ACTION", "ACTION_SHOW_CMP_DIALOG");
            bundle2.putBoolean("EXTRA_FORCE", z10);
            startCMPActivity$app_release(context, bundle2);
            return;
        }
        p.i("viewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (r11 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r13 = com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode.GPP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        if (r11.equals(r13.getValue()) != true) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        r8.b(r13, true, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (x.g.f11254a == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r8 = new java.lang.StringBuilder();
        r8.append(r0.p.q.f11762b);
        r8.append(r0.p.q.f11761a);
        r9.f(39, s7.a.j(r8.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        r0.j.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
    
        if (r10 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c5, code lost:
    
        r0 = aa.c.v;
        r12 = ((z9.a) r0.getValue()).j(8);
        r13 = ((z9.a) r0.getValue()).j(63);
        r14 = ((z9.a) r0.getValue()).j(34);
        r0 = c8.p0.f3588a;
        c8.f0.z(c8.c1.f3545a, j8.d.f7053a, null, new a5.k(r12, r13, r14, r15, 25), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fa, code lost:
    
        r9.b(81);
        r9.b(82);
        r9.b(83);
        r9.b(84);
        r9.b(85);
        r0.c(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r11 = r0.p.f11797n.f11763a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r11 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r13 = com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode.TCF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r11.equals(r13.getValue()) != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r8.b(r13, true, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r8.b(com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode.TCF_AND_GPP, true, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        kotlin.jvm.internal.p.i("viewModel");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003c, code lost:
    
        if (r0.p() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r0.j(76).equals("Reject") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        r0 = com.inmobi.cmp.ChoiceCmp.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r8 = r0.i;
        r9 = r0.f3230a;
        r10 = java.lang.String.valueOf(com.inmobi.cmp.ChoiceCmp.f4361e);
        r11 = t9.p.f10785a.toString();
        r11.getClass();
        r10 = r10.equals(r11);
        r0.f3231b.f();
        r11 = r0.p.f11797n.f11763a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a() {
        c cVar = null;
        if (f4360d) {
            i iVar = g;
            if (iVar != null) {
                z9.a aVar = iVar.f3230a;
                aVar.getClass();
            } else {
                p.i("viewModel");
                throw null;
            }
        }
        if (f4360d) {
            i iVar2 = g;
            if (iVar2 == null) {
                p.i("viewModel");
                throw null;
            }
        }
        if (f4360d) {
            return;
        }
        i iVar3 = g;
        if (iVar3 != null) {
            z9.a aVar2 = iVar3.f3230a;
            aVar2.getClass();
            if (aVar2.j(76).equals("Reject")) {
                i iVar4 = g;
                if (iVar4 != null) {
                    z9.a aVar3 = iVar4.f3230a;
                    iVar4.f();
                    aa.c.c().b(2);
                    iVar4.b();
                    aVar3.b(81);
                    aVar3.b(82);
                    aVar3.b(83);
                    aVar3.b(84);
                    aVar3.b(85);
                    String c10 = aa.c.c().c();
                    c10.getClass();
                    aVar3.f(63, c10);
                    i iVar5 = g;
                    if (iVar5 != null) {
                        iVar5.f3230a.b(40);
                        i iVar6 = g;
                        if (iVar6 != null) {
                            iVar6.c(false);
                            return;
                        } else {
                            p.i("viewModel");
                            throw null;
                        }
                    }
                    p.i("viewModel");
                    throw null;
                }
                p.i("viewModel");
                throw null;
            }
            return;
        }
        p.i("viewModel");
        throw null;
    }
}
