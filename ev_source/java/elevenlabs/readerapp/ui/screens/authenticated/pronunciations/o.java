package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import a2.a3;
import a2.b2;
import a2.k2;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.b0;
import c4.v;
import f4.r1;
import f4.s1;
import fr.d0;
import fr.g0;
import fr.k1;
import g1.h0;
import g3.s;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareOption;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareViewModel;
import io.elevenlabs.ui.components.MenuKt;
import j1.v1;
import ja.c1;
import ja.h3;
import kotlin.jvm.internal.a0;
import l2.k0;
import l2.r0;
import n1.d4;
import n1.g3;
import n1.h2;
import n1.i3;
import n1.o2;
import n1.x;
import p3.i0;
import p4.y;
import q2.l7;
import q2.p4;
import q2.s3;
import q2.t7;
import q2.u5;
import q2.z7;
import r1.z1;
import s4.x0;
import sn.z;
import t1.t;
import t2.u;
import u2.s2;
import u2.z0;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16610d;

    public /* synthetic */ o(b0 b0Var, o7.d dVar, ho.l lVar) {
        this.f16607a = 13;
        this.f16608b = b0Var;
        this.f16610d = dVar;
        this.f16609c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.io.Serializable] */
    @Override // ho.l
    public final Object invoke(Object obj) {
        z PronunciationsListScreenUI$lambda$1$0$1$0;
        HoursLowState purchaseProduct$lambda$0;
        z UsageSectionList$lambda$1$0;
        PurchaseHoursState purchaseProduct$lambda$02;
        AddSharedReadState ownerAndRead$lambda$0;
        z ImportFileScreen$lambda$1$0;
        ReadLinkShareState read$lambda$0;
        z DropdownMenuContent$lambda$6$0;
        b2 b2Var;
        Object[] objArr;
        boolean z6;
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i10 = this.f16607a;
        int i11 = 3;
        ma.g gVar = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        final int i12 = 2;
        boolean z12 = false;
        z zVar = z.f31622a;
        int i13 = 1;
        Object obj2 = this.f16610d;
        Object obj3 = this.f16609c;
        Object obj4 = this.f16608b;
        switch (i10) {
            case 0:
                PronunciationsListScreenUI$lambda$1$0$1$0 = PronunciationsListScreenKt.PronunciationsListScreenUI$lambda$1$0$1$0((PronunciationsListState) obj4, (ho.l) obj3, (ho.l) obj2, (t) obj);
                return PronunciationsListScreenUI$lambda$1$0$1$0;
            case 1:
                purchaseProduct$lambda$0 = HoursLowViewModel.purchaseProduct$lambda$0((HoursLowViewModel) obj4, (OneTimeCreditsProduct) obj3, (Activity) obj2, (HoursLowState) obj);
                return purchaseProduct$lambda$0;
            case 2:
                UsageSectionList$lambda$1$0 = HoursHistoryScreenKt.UsageSectionList$lambda$1$0((HoursHistoryState) obj4, (ho.l) obj3, (ho.a) obj2, (t) obj);
                return UsageSectionList$lambda$1$0;
            case 3:
                purchaseProduct$lambda$02 = PurchaseHoursViewModel.purchaseProduct$lambda$0((PurchaseHoursViewModel) obj4, (OneTimeCreditsProduct) obj3, (Activity) obj2, (PurchaseHoursState) obj);
                return purchaseProduct$lambda$02;
            case 4:
                ownerAndRead$lambda$0 = AddSharedReadViewModel.setOwnerAndRead$lambda$0((AddSharedReadViewModel) obj4, (String) obj3, (String) obj2, (AddSharedReadState) obj);
                return ownerAndRead$lambda$0;
            case 5:
                ImportFileScreen$lambda$1$0 = ImportFileScreenKt.ImportFileScreen$lambda$1$0((ImportFileViewModel) obj4, (ImportFileState) obj3, (ho.a) obj2, (Uri) obj);
                return ImportFileScreen$lambda$1$0;
            case 6:
                read$lambda$0 = ReadLinkShareViewModel.setRead$lambda$0((ReadLinkShareViewModel) obj4, (ReadMeta) obj3, (ReadLinkShareOption) obj2, (ReadLinkShareState) obj);
                return read$lambda$0;
            case 7:
                DropdownMenuContent$lambda$6$0 = MenuKt.DropdownMenuContent$lambda$6$0((z0) obj4, (s2) obj3, (s2) obj2, (i0) obj);
                return DropdownMenuContent$lambda$6$0;
            case 8:
                c4.h hVar = (c4.h) obj4;
                h3 h3Var = (h3) obj3;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) obj2;
                v vVar = (v) obj;
                long j4 = vVar.f4757c;
                r0 r0Var = (r0) hVar.f4688d;
                if (r0Var.k() && r0Var.n().f38321a.f31041b.length() != 0 && (b2Var = r0Var.f21232d) != null && b2Var.d() != null) {
                    hVar.r(r0Var.n(), j4, false, h3Var);
                    z12 = true;
                }
                if (z12) {
                    vVar.a();
                    zVar2.f20568a = true;
                }
                return zVar;
            case 9:
                final r0 r0Var2 = (r0) obj4;
                d0 d0Var = (d0) obj3;
                Context context = (Context) obj2;
                c2.a aVar = (c2.a) obj;
                h0 h0Var = aVar.f4584a;
                h0 h0Var2 = aVar.f4584a;
                d2.f fVar = d2.f.f7439b;
                h0Var.a(fVar);
                k2 k2Var = k2.f958d;
                if (!x0.c(r0Var2.n().f38322b) && r0Var2.j() && r0Var2.f21235g != null) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c cVar = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c(d0Var, new k0(r0Var2, objArr8 == true ? 1 : 0, i13));
                Resources resources = context.getResources();
                int i14 = 7;
                v1 v1Var = new v1(cVar, objArr7 == true ? 1 : 0, i14);
                if (objArr != false) {
                    h0Var2.a(new d2.d(d2.e.f7434a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, v1Var));
                }
                k2 k2Var2 = k2.f958d;
                if (!x0.c(r0Var2.n().f38322b) && r0Var2.f21235g != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c cVar2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c(d0Var, new k0(r0Var2, objArr6 == true ? 1 : 0, i12));
                Resources resources2 = context.getResources();
                v1 v1Var2 = new v1(cVar2, objArr5 == true ? 1 : 0, i14);
                if (z6) {
                    h0Var2.a(new d2.d(d2.e.f7435b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, v1Var2));
                }
                k2 k2Var3 = k2.f958d;
                if (r0Var2.j() && ((Boolean) r0Var2.f21250w.getValue()).booleanValue() && r0Var2.f21235g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c cVar3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c(d0Var, new k0(r0Var2, objArr4 == true ? 1 : 0, i11));
                Resources resources3 = context.getResources();
                v1 v1Var3 = new v1(cVar3, objArr3 == true ? 1 : 0, i14);
                if (z10) {
                    h0Var2.a(new d2.d(d2.e.f7436c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, v1Var3));
                }
                k2 k2Var4 = k2.f958d;
                if (x0.d(r0Var2.n().f38322b) != r0Var2.n().f38321a.f31041b.length()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                final int i15 = 0;
                ho.a aVar2 = new ho.a() { // from class: l2.v0
                    @Override // ho.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return Boolean.valueOf(!r0Var2.A);
                            case 1:
                                r0 r0Var3 = r0Var2;
                                y4.w e10 = r0.e(s4.t.b(0, r0Var3.n().f38321a.f31041b.length()), r0Var3.n().f38321a);
                                r0Var3.f21231c.invoke(e10);
                                long j10 = e10.f38322b;
                                r0Var3.f21249v = new s4.x0(j10);
                                r0Var3.f21247t = y4.w.b(r0Var3.f21247t, null, j10, 5);
                                r0Var3.h(true);
                                return sn.z.f31622a;
                            default:
                                ho.a aVar3 = r0Var2.f21234f;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                }
                                return sn.z.f31622a;
                        }
                    }
                };
                final int i16 = 1;
                ho.a aVar3 = new ho.a() { // from class: l2.v0
                    @Override // ho.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return Boolean.valueOf(!r0Var2.A);
                            case 1:
                                r0 r0Var3 = r0Var2;
                                y4.w e10 = r0.e(s4.t.b(0, r0Var3.n().f38321a.f31041b.length()), r0Var3.n().f38321a);
                                r0Var3.f21231c.invoke(e10);
                                long j10 = e10.f38322b;
                                r0Var3.f21249v = new s4.x0(j10);
                                r0Var3.f21247t = y4.w.b(r0Var3.f21247t, null, j10, 5);
                                r0Var3.h(true);
                                return sn.z.f31622a;
                            default:
                                ho.a aVar32 = r0Var2.f21234f;
                                if (aVar32 != null) {
                                    aVar32.invoke();
                                }
                                return sn.z.f31622a;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                v1 v1Var4 = new v1(aVar3, aVar2, i14);
                if (z11) {
                    h0Var2.a(new d2.d(d2.e.f7437d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, v1Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    k2 k2Var5 = k2.f958d;
                    if (r0Var2.j() && x0.c(r0Var2.n().f38322b)) {
                        i15 = 1;
                    }
                    ho.a aVar4 = new ho.a() { // from class: l2.v0
                        @Override // ho.a
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    return Boolean.valueOf(!r0Var2.A);
                                case 1:
                                    r0 r0Var3 = r0Var2;
                                    y4.w e10 = r0.e(s4.t.b(0, r0Var3.n().f38321a.f31041b.length()), r0Var3.n().f38321a);
                                    r0Var3.f21231c.invoke(e10);
                                    long j10 = e10.f38322b;
                                    r0Var3.f21249v = new s4.x0(j10);
                                    r0Var3.f21247t = y4.w.b(r0Var3.f21247t, null, j10, 5);
                                    r0Var3.h(true);
                                    return sn.z.f31622a;
                                default:
                                    ho.a aVar32 = r0Var2.f21234f;
                                    if (aVar32 != null) {
                                        aVar32.invoke();
                                    }
                                    return sn.z.f31622a;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    v1 v1Var5 = new v1(aVar4, objArr2 == true ? 1 : 0, i14);
                    if (i15 != 0) {
                        h0Var2.a(new d2.d(k2Var5.f960a, resources5.getString(k2Var5.f961b), k2Var5.f962c, v1Var5));
                    }
                }
                h0Var2.a(fVar);
                return zVar;
            case 10:
                h1 h1Var = (h1) obj4;
                ho.l lVar = (ho.l) obj3;
                View view = (View) obj2;
                ((u2.i0) obj).getClass();
                if (h1Var != null) {
                    gVar = new ma.g(lVar, view);
                    h1Var.addListener(gVar);
                }
                return new a3(gVar, h1Var, 10);
            case 11:
                x xVar = (x) obj4;
                k1 k1Var = (k1) obj3;
                g3 g3Var = (g3) obj2;
                float floatValue = ((Float) obj).floatValue();
                if (xVar.f24014c) {
                    f10 = 1.0f;
                } else {
                    f10 = -1.0f;
                }
                i3 i3Var = xVar.f24013b;
                long e10 = i3Var.e(i3Var.h(f10 * floatValue));
                i3 i3Var2 = g3Var.f23762a;
                float g10 = i3Var.g(i3Var.e(i3Var2.c(i3Var2.f23801k, e10, 1))) * f10;
                if (Math.abs(g10) < Math.abs(floatValue)) {
                    k1Var.cancel(g0.a("Scroll animation cancelled because scroll was not consumed (" + g10 + " < " + floatValue + ')', null));
                }
                return zVar;
            case 12:
                a0 a0Var = (a0) obj4;
                j1.j jVar = (j1.j) obj;
                float floatValue2 = ((Number) jVar.f18273e.getValue()).floatValue() - a0Var.f20555a;
                float e11 = ((o2) obj3).e(floatValue2);
                a0Var.f20555a = ((Number) jVar.f18273e.getValue()).floatValue();
                ((a0) obj2).f20555a = ((Number) jVar.b()).floatValue();
                if (Math.abs(floatValue2 - e11) > 0.5f) {
                    jVar.a();
                }
                return zVar;
            case 13:
                b0 b0Var = (b0) obj4;
                ?? obj5 = new Object();
                k6.l lVar2 = new k6.l(i13, obj5, (o7.d) obj2, (ho.l) obj3);
                b0Var.getLifecycle().addObserver(lVar2);
                return new f3.e(b0Var, lVar2, obj5, i12);
            case 14:
                s sVar = (s) obj4;
                na.j jVar2 = (na.j) obj3;
                sVar.add(jVar2);
                return new f3.e((oa.m) obj2, jVar2, sVar, i11);
            case 15:
                a0 a0Var2 = (a0) obj4;
                z7 z7Var = (z7) obj3;
                j1.j jVar3 = (j1.j) obj;
                float floatValue3 = ((Number) jVar3.f18273e.getValue()).floatValue() - a0Var2.f20555a;
                float h10 = z7Var.f27985c.h();
                z7Var.b(h10 + floatValue3);
                float abs = Math.abs(h10 - z7Var.f27985c.h());
                a0Var2.f20555a = ((Number) jVar3.f18273e.getValue()).floatValue();
                ((a0) obj2).f20555a = ((Number) jVar3.b()).floatValue();
                if (Math.abs(floatValue3 - abs) > 0.5f) {
                    jVar3.a();
                }
                return zVar;
            case 16:
                u5 u5Var = (u5) obj3;
                g0.D((d0) obj4, null, null, new l7(u5Var, ((Float) obj).floatValue(), objArr9 == true ? 1 : 0, i12), 3).invokeOnCompletion(new s3(u5Var, (ho.a) obj2, i13));
                return zVar;
            case 17:
                z1 z1Var = (z1) obj3;
                i3.e eVar = (i3.e) obj2;
                r3.c cVar4 = (r3.c) obj;
                long j10 = ((o3.e) ((s2.x0) obj4).invoke()).f24778a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                if (intBitsToFloat > u.P) {
                    h4.k0 k0Var = (h4.k0) cVar4;
                    float d02 = k0Var.d0(p4.f27534a);
                    r3.b bVar = k0Var.f11967a;
                    float a10 = eVar.a(jo.a.y(intBitsToFloat), jo.a.y((Float.intBitsToFloat((int) (bVar.b() >> 32)) - r13) - k0Var.d0(z1Var.b(k0Var.getLayoutDirection()))), k0Var.getLayoutDirection()) + k0Var.d0(z1Var.c(k0Var.getLayoutDirection()));
                    float f15 = 2;
                    float f16 = intBitsToFloat / f15;
                    float f17 = a10 + f16;
                    float f18 = (f17 - f16) - d02;
                    if (f18 < u.P) {
                        f11 = 0.0f;
                    } else {
                        f11 = f18;
                    }
                    float f19 = f17 + f16 + d02;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.b() >> 32));
                    if (f19 > intBitsToFloat2) {
                        f12 = intBitsToFloat2;
                    } else {
                        f12 = f19;
                    }
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                    float f20 = (-intBitsToFloat3) / f15;
                    float f21 = intBitsToFloat3 / f15;
                    c1 c1Var = bVar.f29421b;
                    long L = c1Var.L();
                    c1Var.y().o();
                    try {
                        ((j8.g) c1Var.f18786b).O(f11, f20, f12, f21, 0);
                        k0Var.a();
                    } finally {
                        com.google.android.gms.internal.play_billing.b.v(c1Var, L);
                    }
                } else {
                    ((h4.k0) cVar4).a();
                }
                return zVar;
            case 18:
                u3.c cVar5 = (u3.c) obj4;
                u3.c cVar6 = (u3.c) obj3;
                u3.c cVar7 = (u3.c) obj2;
                qc.g gVar2 = (qc.g) obj;
                if (gVar2 instanceof qc.e) {
                    if (cVar5 != null) {
                        return new qc.e(cVar5);
                    }
                    return (qc.e) gVar2;
                }
                if (gVar2 instanceof qc.d) {
                    qc.d dVar = (qc.d) gVar2;
                    ad.e eVar2 = dVar.f28207b;
                    if (eVar2.f1783c instanceof ad.l) {
                        if (cVar6 != null) {
                            return new qc.d(cVar6, eVar2);
                        }
                        return dVar;
                    }
                    if (cVar7 != null) {
                        return new qc.d(cVar7, eVar2);
                    }
                    return dVar;
                }
                return gVar2;
            case 19:
                io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c cVar8 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.c((d0) obj3, (t7) obj2, 22);
                oo.u[] uVarArr = y.f26563a;
                ((p4.b0) obj).b(p4.n.f26493c, new p4.a((String) obj4, cVar8));
                return zVar;
            default:
                s2.g0 g0Var = (s2.g0) obj3;
                s1 s1Var = (s1) obj2;
                r1 r1Var = (r1) obj;
                boolean t10 = ((f4.h1) obj4).t();
                s2.n nVar = g0Var.f30764a;
                if (t10) {
                    f13 = nVar.d().d(g0Var.f30764a.f30817h.getValue());
                } else {
                    f13 = nVar.f();
                }
                h2 h2Var = g0Var.f30766c;
                if (h2Var == h2.f23778b) {
                    f14 = f13;
                } else {
                    f14 = 0.0f;
                }
                if (h2Var != h2.f23777a) {
                    f13 = 0.0f;
                }
                r1Var.f8856a = true;
                r1Var.k(s1Var, jo.a.y(f14), jo.a.y(f13), u.P);
                r1Var.f8856a = false;
                return zVar;
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        this.f16607a = i10;
        this.f16608b = obj;
        this.f16609c = obj2;
        this.f16610d = obj3;
    }

    public /* synthetic */ o(a0 a0Var, o2 o2Var, a0 a0Var2, n1.b0 b0Var) {
        this.f16607a = 12;
        this.f16608b = a0Var;
        this.f16609c = o2Var;
        this.f16610d = a0Var2;
    }

    public /* synthetic */ o(x xVar, d4 d4Var, k1 k1Var, g3 g3Var) {
        this.f16607a = 11;
        this.f16608b = xVar;
        this.f16609c = k1Var;
        this.f16610d = g3Var;
    }
}
