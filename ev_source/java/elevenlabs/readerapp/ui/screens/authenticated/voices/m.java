package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import android.gov.nist.core.Separators;
import androidx.work.impl.WorkDatabase;
import ap.s0;
import com.google.android.gms.common.api.internal.i1;
import dc.e0;
import dc.v;
import fr.d0;
import fr.g0;
import h4.h1;
import i4.o1;
import i4.q2;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.DownloadAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import j1.v1;
import java.util.List;
import java.util.UUID;
import n1.d4;
import n1.x;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import q2.t3;
import q2.t7;
import q2.u5;
import q2.v5;
import sn.z;
import u2.f0;
import u2.f2;
import u2.j2;
import u2.v0;
import u2.z0;
import v2.j0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17137d;

    public /* synthetic */ m(ho.a aVar, z0 z0Var, z0 z0Var2) {
        this.f17134a = 13;
        this.f17136c = z0Var;
        this.f17137d = z0Var2;
        this.f17135b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0212, code lost:
    
        if (r1.Y == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0214, code lost:
    
        r2 = (o3.c) r1.f24016e.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021d, code lost:
    
        if (r2 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0228, code lost:
    
        if (n1.x.s0(r1, r2, 0, 0, 3) != true) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022c, code lost:
    
        if (r11 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022e, code lost:
    
        r1.Y = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0230, code lost:
    
        r0.f23704e = n1.x.r0(r1, r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
    
        return r10;
     */
    @Override // ho.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        z VoiceActionButtons$lambda$1$4$0;
        z AuthorProfileSortButton$lambda$0$5$0$0$0;
        z SheetMenuItemDownload$lambda$0$0;
        z PlayerActionsSheet$lambda$3$0$0$19$0;
        z PlayerActionsSheet$lambda$3$0$0$4$0;
        boolean s02;
        switch (this.f17134a) {
            case 0:
                VoiceActionButtons$lambda$1$4$0 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$1$4$0((VoiceDetailsState) this.f17137d, (ho.l) this.f17135b, (z0) this.f17136c);
                return VoiceActionButtons$lambda$1$4$0;
            case 1:
                AuthorProfileSortButton$lambda$0$5$0$0$0 = AuthorProfileSortRowKt.AuthorProfileSortButton$lambda$0$5$0$0$0((ho.l) this.f17135b, (String) this.f17137d, (z0) this.f17136c);
                return AuthorProfileSortButton$lambda$0$5$0$0$0;
            case 2:
                SheetMenuItemDownload$lambda$0$0 = PlayerActionsSheetKt.SheetMenuItemDownload$lambda$0$0((ho.a) this.f17137d, (ho.p) this.f17135b, (DownloadAction) this.f17136c);
                return SheetMenuItemDownload$lambda$0$0;
            case 3:
                PlayerActionsSheet$lambda$3$0$0$19$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$19$0((BottomSheetControl) this.f17137d, (ho.p) this.f17135b, (String) this.f17136c);
                return PlayerActionsSheet$lambda$3$0$0$19$0;
            case 4:
                PlayerActionsSheet$lambda$3$0$0$4$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$4$0((BottomSheetControl) this.f17137d, (ho.p) this.f17135b, (PlayerDisplayMode) this.f17136c);
                return PlayerActionsSheet$lambda$3$0$0$4$0;
            case 5:
                mc.n nVar = (mc.n) this.f17137d;
                UUID uuid = (UUID) this.f17135b;
                dc.h hVar = (dc.h) this.f17136c;
                nVar.getClass();
                String uuid2 = uuid.toString();
                v e10 = v.e();
                String str = mc.n.f23129c;
                e10.a(str, "Updating progress for " + uuid + " (" + hVar + Separators.RPAREN);
                WorkDatabase workDatabase = nVar.f23130a;
                workDatabase.beginTransaction();
                try {
                    lc.o c5 = workDatabase.g().c(uuid2);
                    if (c5 != null) {
                        if (c5.f21674b == e0.f7872b) {
                            lc.l lVar = new lc.l(uuid2, hVar);
                            lc.m f10 = workDatabase.f();
                            f10.getClass();
                            us.g.C(f10.f21668a, false, true, new v1(f10, lVar, 12));
                        } else {
                            v.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                        }
                        workDatabase.setTransactionSuccessful();
                        workDatabase.endTransaction();
                        return null;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th) {
                    try {
                        v.e().d(str, "Error updating Worker progress", th);
                        throw th;
                    } catch (Throwable th2) {
                        workDatabase.endTransaction();
                        throw th2;
                    }
                }
            case 6:
                x xVar = (x) this.f17137d;
                d4 d4Var = (d4) this.f17135b;
                n1.s sVar = (n1.s) this.f17136c;
                o1 o1Var = xVar.f24017f;
                while (true) {
                    w2.b bVar = (w2.b) o1Var.f13189b;
                    int i10 = bVar.f36081c;
                    z zVar = z.f31622a;
                    boolean z6 = true;
                    if (i10 == 0) {
                        break;
                    } else if (i10 != 0) {
                        o3.c cVar = (o3.c) ((n1.v) bVar.f36079a[i10 - 1]).f23975a.invoke();
                        if (cVar == null) {
                            s02 = true;
                        } else {
                            s02 = x.s0(xVar, cVar, 0L, 0L, 3);
                        }
                        if (!s02) {
                            break;
                        } else {
                            w2.b bVar2 = (w2.b) o1Var.f13189b;
                            ((n1.v) bVar2.k(bVar2.f36081c - 1)).f23976b.resumeWith(zVar);
                        }
                    } else {
                        wq.a.h("MutableVector is empty.");
                        return null;
                    }
                }
            case 7:
                CertificatePinner certificatePinner = (CertificatePinner) this.f17137d;
                Handshake handshake = (Handshake) this.f17135b;
                Address address = (Address) this.f17136c;
                CertificateChainCleaner certificateChainCleaner = certificatePinner.f25234b;
                certificateChainCleaner.getClass();
                return certificateChainCleaner.a(address.f25183h.f25307d, handshake.a());
            case 8:
                u5 u5Var = (u5) this.f17137d;
                d0 d0Var = (d0) this.f17135b;
                u5 u5Var2 = (u5) this.f17136c;
                if (((Boolean) u5Var.f27767d.f30813d.invoke(v5.f27805b)).booleanValue()) {
                    g0.D(d0Var, null, null, new t3(u5Var2, null, 6), 3);
                }
                return Boolean.TRUE;
            case 9:
                t7 t7Var = (t7) this.f17137d;
                d0 d0Var2 = (d0) this.f17135b;
                z0 z0Var = (z0) this.f17136c;
                if (t7Var.b()) {
                    g0.D(d0Var2, null, null, new l2.k(t7Var, null, 3), 3);
                    z0Var.setValue(Boolean.FALSE);
                }
                return z.f31622a;
            case 10:
                f0 f0Var = (f0) this.f17137d;
                t1.z zVar2 = (t1.z) this.f17135b;
                t1.c cVar2 = (t1.c) this.f17136c;
                t1.i iVar = (t1.i) f0Var.getValue();
                return new t1.k(zVar2, iVar, cVar2, new i1((no.g) zVar2.f31876e.f31856f.getValue(), iVar));
            case 11:
                u2.q qVar = (u2.q) this.f17137d;
                v2.a aVar = (v2.a) this.f17135b;
                f2 f2Var = (f2) this.f17136c;
                v2.b bVar3 = qVar.M;
                v2.a aVar2 = bVar3.f34971b;
                try {
                    bVar3.f34971b = aVar;
                    f2 f2Var2 = qVar.G;
                    int[] iArr = qVar.f33983o;
                    g1.x xVar2 = qVar.f33989v;
                    qVar.f33983o = null;
                    qVar.f33989v = null;
                    try {
                        qVar.G = f2Var;
                        boolean z10 = bVar3.f34974e;
                        try {
                            bVar3.f34974e = false;
                            throw null;
                        } catch (Throwable th3) {
                            bVar3.f34974e = z10;
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        qVar.G = f2Var2;
                        qVar.f33983o = iArr;
                        qVar.f33989v = xVar2;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar3.f34971b = aVar2;
                    throw th5;
                }
            case 12:
                u2.a aVar3 = (u2.a) this.f17137d;
                j2 j2Var = (j2) this.f17135b;
                j0 j0Var = (j0) this.f17136c;
                if (aVar3 != null) {
                    j2Var.a(j2Var.c(aVar3) - j2Var.f33899t);
                }
                Integer num = null;
                List k4 = n0.l.k(j2Var, null, j2Var.f33899t, null);
                h3.c cVar3 = (h3.c) tn.o.H0(k4);
                if (cVar3 != null) {
                    num = cVar3.f11821b;
                }
                List u6 = j0Var.u(num);
                if (num != null && !u6.isEmpty()) {
                    u6 = tn.o.O0(tn.o.q0(u6, 1), ig.f.H(new h3.c(((h3.c) tn.o.w0(u6)).f11820a, null, num)));
                }
                return new h3.a(tn.o.O0(u6, k4));
            case 13:
                return new w1.s((ho.r) ((z0) this.f17136c).getValue(), (ho.l) ((z0) this.f17137d).getValue(), ((Number) ((ho.a) this.f17135b).invoke()).intValue());
            case 14:
                x1.g gVar = (x1.g) this.f17137d;
                o3.c r02 = x1.g.r0(gVar, (h1) this.f17135b, (s0) this.f17136c);
                if (r02 != null) {
                    x xVar3 = gVar.f37544a;
                    if (h5.l.b(xVar3.Z, 0L)) {
                        q1.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                    }
                    return r02.j(xVar3.u0(r02, xVar3.Z, 0L) ^ (-9223372034707292160L));
                }
                return null;
            default:
                ho.l lVar2 = (ho.l) this.f17135b;
                vj.f fVar = (vj.f) this.f17137d;
                String str2 = fVar.f35618b;
                q2 q2Var = (q2) this.f17136c;
                if (lVar2 != null) {
                    lVar2.invoke(fVar);
                } else {
                    try {
                        q2Var.openUri(str2);
                    } catch (Throwable th6) {
                        System.out.println((Object) defpackage.f.k("Failed to open funding url: ", str2, " // ", th6.getMessage()));
                    }
                }
                return z.f31622a;
        }
    }

    public /* synthetic */ m(ho.l lVar, Object obj, Object obj2, int i10) {
        this.f17134a = i10;
        this.f17135b = lVar;
        this.f17137d = obj;
        this.f17136c = obj2;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.f17134a = i10;
        this.f17137d = obj;
        this.f17135b = obj2;
        this.f17136c = obj3;
    }

    public /* synthetic */ m(u2.q qVar, v2.a aVar, f2 f2Var, v0 v0Var) {
        this.f17134a = 11;
        this.f17137d = qVar;
        this.f17135b = aVar;
        this.f17136c = f2Var;
    }
}
