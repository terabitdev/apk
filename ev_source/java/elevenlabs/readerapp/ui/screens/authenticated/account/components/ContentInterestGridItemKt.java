package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import i1.w2;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.RemoteIconKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.x;
import q2.j7;
import r1.p;
import r1.p2;
import r1.s;
import r1.w;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "selected", "", "title", "iconUrl", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "ContentInterestGridItem", "(ZLjava/lang/String;Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_ContentInterestGridItem", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ContentInterestGridItemKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContentInterestGridItem(boolean z6, final String str, final String str2, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z10;
        t tVar3;
        r1 r10;
        t tVar4;
        long septenaryAlpha;
        boolean z11;
        String R;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1536407783);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        int i19 = i11 & 16;
        if (i19 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 9363) == 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i14 & 1, z10)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                EchoThemeShapes shapes = echoTheme.getShapes(qVar, i20);
                int i21 = EchoThemeShapes.$stable;
                t c5 = m3.h.c(tVar4, shapes.getXl(qVar, i21));
                float f10 = 1;
                if (z6) {
                    qVar.X(980885150);
                    septenaryAlpha = echoTheme.getColors(qVar, i20).getBorder().getHeavy(qVar, EchoThemeColors.Border.$stable);
                } else {
                    qVar.X(980886279);
                    septenaryAlpha = echoTheme.getColors(qVar, i20).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable);
                }
                qVar.p(false);
                t h10 = n.h(n.j(f10, ((x) w2.a(septenaryAlpha, null, null, qVar, 0, 14).getValue()).f26440a, c5, echoTheme.getShapes(qVar, i20).getXl(qVar, i21)), echoTheme.getColors(qVar, i20).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), echoTheme.getShapes(qVar, i20).getXl(qVar, i21));
                if (z6) {
                    qVar.X(980896222);
                    R = kj.c.R(qVar, R.string.accessibility_chip_selected);
                    z11 = false;
                } else {
                    z11 = false;
                    qVar.X(980898646);
                    R = kj.c.R(qVar, R.string.accessibility_chip_unselected);
                }
                qVar.p(z11);
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, h10, echoTheme.getColors(qVar, i20).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), false, 1, R, false, null, k.d(940224253, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.components.i
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        z ContentInterestGridItem$lambda$0;
                        int intValue = ((Integer) obj3).intValue();
                        ContentInterestGridItem$lambda$0 = ContentInterestGridItemKt.ContentInterestGridItem$lambda$0(str, str2, (s) obj, (m) obj2, intValue);
                        return ContentInterestGridItem$lambda$0;
                    }
                }, qVar), qVar, ((i14 >> 3) & 14) | 805306368 | ((i14 >> 6) & 112), 400);
                qVar = qVar;
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new j(z6, str, str2, aVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((i14 & 9363) == 9362) {
        }
        if (!qVar.O(i14 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ContentInterestGridItem$lambda$0(String str, String str2, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t e11 = ib.i.e(echoTheme, qVar, i11, e10);
            r1.x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e11, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            t o6 = p2.o(qVar2, 24);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(o6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            if (str2 != null) {
                qVar.X(-62907227);
                RemoteIconKt.m1870RemoteIconFNF3uiM(str2, p2.d(qVar2, 1.0f), echoTheme.getColors(qVar, i11).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, 48, 0);
                qVar.p(false);
            } else {
                qVar.X(-62688119);
                qVar.p(false);
            }
            qVar.p(true);
            r1.d.g(p2.o(qVar2, echoTheme.getSpacings(qVar, i11).getX3()), qVar);
            j7.d(str, null, echoTheme.getColors(qVar, i11).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 2, 2, null, echoTheme.getTypography(qVar, i11).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 221568, 77818);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ContentInterestGridItem$lambda$1(boolean z6, String str, String str2, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        ContentInterestGridItem(z6, str, str2, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ContentInterestGridItem(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-840028399);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ContentInterestGridItemKt.INSTANCE.getLambda$799511287$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 26);
        }
    }

    public static final z Preview_ContentInterestGridItem$lambda$0(int i10, m mVar, int i11) {
        Preview_ContentInterestGridItem(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
